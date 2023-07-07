package mypackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		LinkedList<String> ll = new LinkedList<String>();
		
		//Adding elements to Linked List
		ll.add("One");
		ll.add("Two");
		ll.add("Three");
		ll.add("Four");
		ll.add("Five");
		ll.add("Three");
		ll.add("Four");
		ll.add("Five");
		ll.add("Three");
		ll.add("Four");
		ll.add("Four");
		
		System.out.println("\nElements in Linnked List: "+ll);
		
		Iterator it = ll.iterator();
		//Printing Elements from Linked List
		System.out.println("\nPrinting each elements from linked list");
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		//Printing elements in reverse order
		it = ll.descendingIterator();
		System.out.println("Printing each element in reverse order from Linked List");
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Remove first element from the linked list
		System.out.println("\nElements in linked list: "+ll);
		ll.removeFirst();
		System.out.println("After removing first element: "+ll);
		
		//Remove last element from the linked list
		System.out.println("\nElements in linked list: "+ll);
		ll.removeLast();
		System.out.println("After removing last element: "+ll);
		
		//Remove first occurrence of element from the linked list
		System.out.println("\nElements in linked list: "+ll);
		ll.removeFirstOccurrence("Four");
		System.out.println("After removing first occurrence of element: "+ll);
		
		//Remove Last occurrence of element from the linked list
		System.out.println("\nElements in linked list: "+ll);
		ll.removeLastOccurrence("Three");
		System.out.println("After removing Last occurrence of element: "+ll);
		
		//Clearing the LinkedList
		ll.clear();
		System.out.println("\nElements in Linked List: "+ll);
	}

}
