// Definition for singly-linked list:
// template<typename T>
// struct ListNode {
//   ListNode(const T &v) : value(v), next(nullptr) {}
//   T value;
//   ListNode *next;
// };
//

ListNode<int> * removeKFromList(ListNode<int> * l, int k) {
    
    ListNode<int> head;
    
    head.next = l;
    l = &head;
    
    while(l->next) {
        if(l->next->value == k) {
            l->next = l->next->next;
        } else {
            l = l->next;
        }
    
    }
    
    return head.next;
    
}
