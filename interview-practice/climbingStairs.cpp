

int climbingStairs(int n) {
   int * memo = new int [n+1];
    
    for(int i = 0; i <= n; i++) {
        memo[i] = -1;
    }
    memo[0] = 1;
    memo[1] = 1;
    
    
    climbingStairsRec(n, memo);
}

int climbingStairsRec(int n, int * memo) {
    if(memo[n] == -1) {
        memo[n] = climbingStairsRec(n-1, memo) + climbingStairsRec(n-2, memo);
       
    }
    return memo[n];
}
