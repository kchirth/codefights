int steal[] = new int[101];

int houseRobber(int [] nums) {
    if(nums.length == 0) {
        return 0;
    } else if (nums.length == 1) {
        return nums[0];
    }
    
    int n = nums.length;
    
    for( int i = 0; i < n; i++) {
        steal[i] = 0;
    }
    steal[n-1] = nums[n-1];
    steal[n-2] = nums[n-2] > nums[n-1] ? nums[n-2] : nums[n-1];
    
    houseCalc(nums, n-3);
    
    return steal[0];
}

void houseCalc(int [] nums, int i) {

    while(i != -1) {
        steal[i] = nums[i] + steal[i+2] > steal[i+1] ? nums[i] + steal[i+2] : steal[i+1];
        i--;
    }
    
}
