//Evan Gniadek period 3 cp3
//The purpose of the code is to understand linkedList and cerating custom data structures 

public class MyLLTester
{
  public static void main(String [] args)
  {
    MyLinkedList testList = new MyLinkedList(); 
    testList.add("Tamerlane");
    testList.addLast("Malinowski");
    testList.addFirst("Napoleon");
    testList.add("Goku");
    System.out.println("the contents of the list are \n" + testList.toString()); 
    for(int i = 0; i < 6; i++ )
        testList.add("Evil horse " + i);
    System.out.println("the contents of the list are \n" + testList.toString()); 
    System.out.println("The current size is " + testList.size()); 
    testList.set(5, "Luffy"); System.out.println("The sixth element is now " + testList.get(5) );
    System.out.println(testList.toString()); 
    System.out.println("The first element is" + testList.get(0));
    testList.removeFirst(); System.out.println("The first element was removed");
    System.out.println(testList.toString());
    testList.remove(6); System.out.println("The sixth element was removed");
    System.out.println(testList.toString()); 
    testList.removeLast(); System.out.println("The last element was removed");
    System.out.println(testList.toString()); 


    System.out.println("Is the list empty? " + testList.isEmpty());
    System.out.println("How long is this LinkedList? "  + testList.size() + " Elements");
  } // end of main methid
  
} // end of tester class
