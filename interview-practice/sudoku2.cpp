bool sudoku2(std::vector<std::vector<char>> grid) {
    
    int count;
    
    // check rows
    for(int i = 0; i < grid.size(); i++) {
        for(int j = 1; j <= 9; j++) {
            count = 0;
            for(int k = 0; k < grid.size(); k++) {
                if ((int) grid[i][k] - '0' == j){
                    count++;
                }
            }
            
            if(count > 1) {
                return false;
            }
           
        } 
    }
    
    // check columns
    for(int i = 0; i < grid.size(); i++) {
        for(int j = 1; j <= 9; j++) {
            count = 0;
            for(int k = 0; k < grid.size(); k++) {
                if ((int) grid[k][i] - '0' == j){
                    count++;
                    
                }
            }
            
            if(count > 1) {
                return false;
            }
           
        } 
    }

    // check squares
    for(int i = 0; i < grid.size(); i += 3) {
        for(int j = 0; j < grid.size(); j += 3) {
            for(int k = 1; k <= 9; k++) {
                count = 0;
                for(int x = i; x < i + 3; x++) {
                    for(int y = j; y < j + 3; y++) {
                         if ((int) grid[x][y] - '0' == k){
                             count++;
                         }

                    }
                }
                if(count > 1) {
                    return false;
                }
            }
        }
    }
    
    return true;
}
