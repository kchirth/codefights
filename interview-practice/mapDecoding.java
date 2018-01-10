int mapDecoding(String message) {
    int prev = 0, curr = 1, count = 0;
    
    for(int i = 0; i < message.length(); i++) {
        int digit = message.charAt(i) - 48;
        int num = 0;
        if(i > 0) {
            num = (message.charAt(i-1)-48) * 10 + digit; 
        }
        if(digit > 0) { 
            count = curr;   
        }
        if(num <= 26 && num > 9) count += prev;
        
        prev = curr;
        
        curr = count % 1000000007;
        count = 0;
        
    }
    
    return curr;
}
