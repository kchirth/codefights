// Definition for singly-linked list:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> reverseNodesInKGroups(ListNode<Integer> l, int k) {
    
    ListNode<Integer> result = new ListNode<Integer>(0);
    ListNode<Integer> head = result;
    
    ListNode<Integer> temp = l;
    int size = 0;
    int count = 0;
    
   
    while(temp != null) {
        temp = temp.next;
        size++;
    }
    
    temp = new ListNode<Integer>(0);
    head = temp;
    for(int i = 0; i < size; i++) {
        temp.next = new ListNode<Integer>(l.value);
        count++;
            
        if(count % k == 0) {
            temp = reverseList(head.next);
            //printList(result);
            result = mergeLists(result, temp);
            temp = new ListNode<Integer>(0);
            head = temp;
           
        } else if((count / k) == (size/k)) {
            result = mergeLists(result, new ListNode<Integer>(l.value));
            
        } else {
        temp = temp.next;
        }
        l = l.next;  
    }
    
    
    
    return result.next;
   
}

ListNode<Integer> reverseList(ListNode<Integer> head) {
    ListNode<Integer> prev = null;
    
    while(head != null) {
        ListNode<Integer> temp = head.next;
        head.next = prev;
        prev = head;
        head = temp;
    }
    
    return prev;
}

ListNode<Integer> mergeLists(ListNode<Integer> first, ListNode<Integer> second) {
    
    ListNode<Integer> it = first;
    
    while(it.next != null) {
        it = it.next;
    }
    
    it.next = second;
    
    return first;
}

// for testing
void printList(ListNode<Integer> head) {
    System.out.printf("[");
    while(head != null) {
        System.out.printf("%d, ", head.value);
        head = head.next;
    }
    System.out.printf("]");
}
