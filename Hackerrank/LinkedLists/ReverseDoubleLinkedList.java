   /*
   You’re given the pointer to the head node of a doubly linked list. 
   Reverse the order of the nodes in the list. The head node might be NULL to indicate that the list is empty. 
   Change the next and prev pointers of all the nodes so that the direction of the list is reversed. 
   Return a reference to the head node of the reversed list.
   */
   
   static DoublyLinkedListNode reverse(DoublyLinkedListNode head)
    {
        DoublyLinkedListNode temp = null;
        while(head != null)
        {
            temp = head.next;
            head.next = head.prev;
            head.prev = temp;
            
            //If we are a single node linked list, or we are done iterating through
            // all of our nodes.
            if(head.prev == null)
            {
                return head;
            }
            head = head.prev;

        }
        return head;
    }
