std::vector<std::vector<int>> rotateImage(std::vector<std::vector<int>> a) {
    
    std::vector<std::vector<int>> b = a;  // copy matrix

    for(int j = 0; j < a.size(); j++) {
        
        for(int i = 0; i < a.size(); i++) {

            b[i][a.size() - j - 1] = a[j][i]; 
            
        }
    }
    
    return b;
}
