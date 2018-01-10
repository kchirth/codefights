char firstNotRepeatingCharacter(std::string s) {
    
    int a[26][2] = {0};   // 1st col - letter appears, 2nd col - indice letter appears
    int charToIndex;      // converts char to index
    std::vector<char> b;
    int lowestIndex = 100001;

    
    // Store how many times each letter appears and last place it appears
    for(int i = 0; i < s.size(); i++) {
        charToIndex = (int) s[i] - 97;
        
        a[charToIndex][0]++;
        a[charToIndex][1] = i;
        
    }
    
    // Go through all and try to find character that appears once and keep track of lowest index
    for(int j = 0; j < 26; j++) {
        
        if(a[j][0] == 1 && a[j][1] < lowestIndex) {
            lowestIndex = a[j][1];
        }
    }
    
    // find character that has lowest index and return
    for(int k = 0; k < 26; k++) {
        
        if(a[k][1] == lowestIndex) {
            return s[lowestIndex];
        }
    }
    
    
     return '_';

}
