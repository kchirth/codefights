// Definition for singly-linked list:
// template<typename T>
// struct ListNode {
//   ListNode(const T &v) : value(v), next(nullptr) {}
//   T value;
//   ListNode *next;
// };
//

void printList(ListNode<int> * l) {
    cout << "{ ";
    while(l) {
        cout << l->value << ", ";
        l = l->next;
    }
    cout << "}";
}
bool isListPalindrome(ListNode<int> * l) {
    
    ListNode<int> head;
    head.next = l;
    l = &head;
    int size = 0;
    std::vector<int> stack;
    
    if(head.next == NULL) {
        return true;
    }
    
    // get size
    while(l->next) {
        l = l->next;
        size++;
    }
    if(size == 1) {
        return true;
    }
    
    l = head.next;
    
    // add elements to array
    for(int i = 0; i < (size/2); i++) {
        stack.push_back(l->value);
        l = l->next;
    }
    
    // different for even vs odd number of elements in list
    if(size % 2 == 0) {
        for(int j = 0; j < (size/2); j++) {
            if(stack[(size/2)-1-j] != l->value) {
                return false;
            }
            l = l->next;
        }
    } else {
        l = l->next;
        for(int j = 0; j < (size/2); j++) {
            if(stack[(size/2)-1-j] != l->value) {
                return false;
            }
            l = l->next;
        }
    }
    
    return true;

}
