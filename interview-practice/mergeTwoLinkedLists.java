// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> mergeTwoLinkedLists(ListNode<Integer> l1, ListNode<Integer> l2) {

    ListNode<Integer> result = new ListNode<Integer>(0);
    ListNode<Integer> head = result;
    
    int smallest = -1000000000; 
    
    while(l1 != null || l2 != null) {
        if(l1 != null && l2 != null) {
            
            if(l1.value < l2.value) {
                head.next = new ListNode<Integer>(l1.value);
                l1 = l1.next;
            } else {
                head.next = new ListNode<Integer>(l2.value);
                l2 = l2.next;
            }
            
        } else if(l1 != null) {
            head.next = new ListNode<Integer>(l1.value);
            l1 = l1.next;
        } else {
            head.next = new ListNode<Integer>(l2.value);
            l2 = l2.next;
        }
        head = head.next;
    }
    
    return result.next;
}
