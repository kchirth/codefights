#include <cmath>

bool isCryptSolution(std::vector<std::string> crypt, std::vector<std::vector<char>> solution) {
    
    string first = crypt[0];
    long firstNum = 0;
    string second = crypt[1];
    long secondNum = 0;
    string result = crypt[2];
    long resultNum = 0;
    
    for(int i = 0; i < result.size(); i++) {
        
        for(int j = 0; j < solution.size(); j++) {
            if(result[i] == solution[j][0]) {
                resultNum += ((long) solution[j][1] - '0') * std::pow(10, result.size() - 1 - i);
                if(resultNum == 0 && result.size() > 1) {
                    return false;
                }
             }
        }
    }
    
    for(int i = 0; i < first.size(); i++) {
        for(int j = 0; j < solution.size(); j++) {
            if(first[i] == solution[j][0]) {
                firstNum += ((long) solution[j][1] - '0') * pow(10, first.size() - 1 - i);
                cout << firstNum << " ";
                if(firstNum == 0 && first.size() > 1) {
                    return false;
                }
             }
        }
    }
    
    for(int i = 0; i < second.size(); i++) {
        for(int j = 0; j < solution.size(); j++) {
            if(second[i] == solution[j][0]) {
                secondNum += ((long) solution[j][1] - '0') * pow(10, second.size() - 1 - i);
                if(secondNum == 0 && second.size() > 1) {
                    return false;
                }
             }
        }
    }
    
    
   if(firstNum + secondNum == resultNum) {
       return true;
   } else {
       return false;
   }
}
