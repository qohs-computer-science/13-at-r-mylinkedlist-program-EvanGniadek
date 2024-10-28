public class MyLinkedList
{
    private ListNode head;
    
    public MyLinkedList()
    {
        head = null;
    }//end of constructor 

    public int size()
    {
        ListNode temp = head;
        int count = 0;
        while (temp != null)
        {
	        temp = temp.getNext();
            count++;
        }//end of while 
        return count;
    }//end of size method 

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
        }//end of if
        ListNode temp = head;
        while (temp.getNext() != null)
        {
	        temp = temp.getNext();
        }//end of while 
        ListNode here =  new ListNode(ob, null);
        temp.setNext(here);
        return true;
    } //end of add method 

    public boolean addFirst(Object first)
    {
        ListNode here = new ListNode(first, head);
        head = here;
        return true;
    }//end of addFist

    public boolean addLast(Object ob)
    {
        return this.add(ob);
    }//end of addLast

    public Object set(int i, Object ob)
    {
        ListNode temp = head;
        int j = 0;
        while( j < i  && temp.getNext() != null)
        {
	        temp = temp.getNext();  
            j++;          
        }//end of while 
        temp.setValue(ob);
        return ob;
    }//end of set 
    
    public Object get(int i)
    {
        ListNode temp = head;
        int j = 0;
        while( j < i && temp.getNext() != null)
        {
	        temp = temp.getNext();   
            j++;         
        }//end of while 
        return temp.getValue();
        
    }//end of get 

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
    }//end of remove method 

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
    }//end of remove last 

    public Object removeFirst()
    {
        Object temp = head.getValue();
        head = head.getNext();
        return temp;

    }//end of remove first 

    public String toString(){
        ListNode temp = head;
        int count = 1;
        String willBe = " ";
        while (temp != null)
        {
	        willBe = willBe + count + ": " + temp.getValue().toString() + "\n ";
            temp = temp.getNext();
            count++;
        }//end of while 
        return willBe;
    }//end of toString 

}//end of class
