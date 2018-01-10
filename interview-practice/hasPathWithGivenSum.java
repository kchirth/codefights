//
// Definition for binary tree:
// class Tree<T> {
//   Tree(T x) {
//     value = x;
//   }
//   T value;
//   Tree<T> left;
//   Tree<T> right;
// }
// 
boolean answer = false;

boolean hasPathWithGivenSum(Tree<Integer> t, Integer s) {
    if(t != null) {
        sumRoutes(t,0,s);
        return answer;
    } else if(s == 0) {
        return true;
    } else {
        return false;
    }
   
    


}

void sumRoutes(Tree<Integer> t, Integer sum, Integer s) {
    if(t.left == null && t.right == null) {

        System.out.println(sum + t.value);
        if((sum + t.value) == s) {
            answer = true;
        } 
    }
    if(t.left != null){
        sumRoutes(t.left, sum + t.value, s); 
    } 
    if(t.right != null) {
        sumRoutes(t.right, sum + t.value, s);
    }
       
}
