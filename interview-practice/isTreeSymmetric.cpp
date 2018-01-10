//
// Definition for binary tree:
// template<typename T>
// struct Tree {
//   Tree(const T &v) : value(v), left(nullptr), right(nullptr) {}
//   T value;
//   Tree *left;
//   Tree *right;
// };
bool isTreeSymmetric(Tree<int> * t) {
   
    return isMirror(t,t);
}

bool isMirror(Tree<int> * root1, Tree<int> * root2) {
    
    if(root1 == NULL && root2 == NULL) {
        return true;
    }
    
    if(root1 != NULL && root2 != NULL && root1->value == root2->value) {
        return isMirror(root1->left, root2->right) && isMirror(root1->right, root2->left);
    }
    
    return false;
    
}
