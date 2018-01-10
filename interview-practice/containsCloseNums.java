boolean containsCloseNums(int[] nums, int k) {
    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
    Integer check1;
    Integer check2;
    
    // create hash table with chaining
    for(int i = 0; i < nums.length; i++) {
        if(map.containsKey(nums[i])) {
            ArrayList<Integer> positions = map.get(nums[i]);
            positions.add(i);
            map.put(nums[i],positions);
        } else {
            ArrayList<Integer> position = new ArrayList<>();
            position.add(i);
            map.put(nums[i], position);
        }
    }
    
    for(Integer x : nums) {
        ArrayList<Integer> positions = map.get(x);
        if(positions.size() > 1) {
            for(int j = 0; j < positions.size(); j++) {
                check1 = positions.get(j);
                for(int y = j + 1; y < positions.size(); y++) {
                    check2 = positions.get(y);
                    
                    if(check2 - check1 <= k) {
                        return true;
                    }
                }
            }
        }
    }
    return false;
}
