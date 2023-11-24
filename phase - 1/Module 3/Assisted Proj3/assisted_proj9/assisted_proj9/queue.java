package assisted_proj9;

import java.util.LinkedList;
import java.util.Queue;

public class queue
{
public static void main(String[] args) 
{
        		Queue<String> locationsQueue = new LinkedList<>();
locationsQueue.add("Bengaluru");
        		locationsQueue.add("Shivamogga");
        		locationsQueue.add("Tumakuru");
        		locationsQueue.add("Hubli");
        		locationsQueue.add("Dharwad");
System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of State : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of state : " + locationsQueue);
        		System.out.println("Size of State : " + locationsQueue.size());
    	}
}
