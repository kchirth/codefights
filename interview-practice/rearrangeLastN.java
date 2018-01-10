// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> rearrangeLastN(ListNode<Integer> l, int n) {
    
    ListNode<Integer> head = l;
    ListNode<Integer> it1 = l;
    ListNode<Integer> it2 = l;
    int size = 0;
    int count = 0;
    
    if(n == 0) {
        return l;
    }
    
    while(it1 != null) {
        it1 = it1.next;
        size++;
    }
    
    if(n == size) {
        return l;
    }
    
    
    it1 = l;
    
    while(count < (size - n - 1)) {
        it1 = it1.next;
        count++;
    }
    
    count = 0;
    while(count < (size - n)) {
        it2 = it2.next;
        count++;
    }
    
    head = it2;
    
    while(it2.next != null) {
        it2 = it2.next;
    }
    
    it2.next = l;
    it1.next = null;
    
    
    
    return head;
}
