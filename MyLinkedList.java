public class MyLinkedList
{
    private ListNode head;
    
    public MyLinkedList()
    {
        head = null;
    }

    public int size()
    {
        ListNode temp = head;
        int count = 0;
        while (temp != null)
        {
	        temp = temp.getNext();
            count++;
        }
        return count;
    }

    public boolean isEmpty()
    {
        if(head != null)
            return false;
        return true;
    } //end of isempty

    public boolean add(Object ob)
    {
        if(head == null){
            head = new ListNode(ob, null);
            return true;
        }
        ListNode temp = head;
        while (temp.getNext() != null)
        {
	        temp = temp.getNext();
        }
        ListNode here =  new ListNode(ob, null);
        temp.setNext(here);
        return true;
    } //end of add method 

    public boolean addFirst(Object first)
    {
        ListNode here = new ListNode(first, head);
        head = here;
        return true;
    }

    public boolean addLast(Object ob)
    {
        return this.add(ob);
    }

    public Object set(int i, Object ob)
    {
        ListNode temp = head;
        int j = 0;
        while( j != i -1  && temp.getNext() != null)
        {
	        temp = temp.getNext();            
        }//end of while 
        temp.setValue(ob);
        return ob;
    }
    
    public Object get(int i)
    {
        ListNode temp = head;
        int j = 0;
        while( j != i - 1 && temp.getNext() != null)
        {
	        temp = temp.getNext();            
        }//end of while 
        return temp.getValue();
        
    }

    public Object remove(int i)
    {
        ListNode temp = head;
        int j = 0;
        while( j < i - 2 && temp.getNext() != null)
        {
	        temp = temp.getNext();        
            j++;
        }//end of while 
        Object value = temp.getNext().getValue();
        temp.setNext(temp.getNext().getNext());
        return value;
    }

    public Object removeLast()
    {
        ListNode temp = head;
        while (temp.getNext().getNext() != null)
        {
	        temp = temp.getNext();
        }
        ListNode value = new ListNode(temp.getNext().getValue(), null);
        temp.setNext(null);
        return value;
    }

    public Object removeFirst()
    {
        Object temp = head.getValue();
        head = head.getNext();
        return temp;

    }

    public String toString(){
        ListNode temp = head;
        int count = 1;
        String willBe = "";
        while (temp != null)
        {
	        willBe = willBe + count + ": " + temp.getValue().toString() + " ";
            temp = temp.getNext();
            count++;
        }
        return willBe;
    }

}//end of class
