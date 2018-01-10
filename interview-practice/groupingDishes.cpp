std::vector<std::vector<std::string>> groupingDishes(std::vector<std::vector<std::string>> dishes) {

    std::vector<std::vector<std::string>> hashTable;
    int cols = dishes[0].size();
    int rows = dishes.size();
    
    for(std::string s: dishes[1:]) {
        for(int i = 0; i < rows; i++) {
            for(int j = 1; j < cols; j++) {
                
            }
        }
    }
    
    return hashTable;
}
