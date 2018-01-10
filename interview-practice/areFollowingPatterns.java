boolean areFollowingPatterns(String[] strings, String[] patterns) {
    
    HashMap<String,String> map = new HashMap<String, String>();
    String check;
    String check2;
    
    // puts all keys in hashmap, if the answer will be false some info
    // will be overwritten
    for(int i = 0; i < strings.length; i++) {
        map.put(patterns[i], strings[i]);
    }
    
    boolean found = false;
    
    for(int i = 0; i < strings.length; i++) {
        
        found = false; 
        
        for(int j = 0; j < strings.length; j++) {
            check = map.get(patterns[j]);
            if(check.equals(strings[i])) {
                found = true;
                break;
            }
        }
        
        if(found == false) {
            return false;
        }
    }
    
    for(int k = 0; k < strings.length; k++) {
        check = map.get(patterns[k]);
        for(int x = k + 1; x < strings.length; x++) {
            check2 = map.get(patterns[x]);
            if(Objects.equals(check, check2) && !Objects.equals(patterns[x],patterns[k] )) {
             
                return false;
                
            } else if(!Objects.equals(check,check2) && Objects.equals(patterns[x],patterns[k])) {
                return false;
            }
        }
    }
    
    
    return true;
}
