package com.collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

	public static void main(String[] args) {
		
		// since linked List is a Class which implements multiple Interface i.e List & Queue
		// Eg: ticket system : First in First out
		
		Queue<Integer> queue = new LinkedList<>();
		
		// alternate method instead of offer is : add but if operation is not success 
		// it will throw exception
		queue.offer(12);
		queue.offer(24);
		queue.offer(36);
		
		System.out.println(queue);
		
		System.err.println("element to be removed "+queue.poll());
		System.out.println("After poll : "+queue);
		
		// poll : add element in queue
		// alternate method instead of poll is : remove() but if queue is empty  
		// it will throw exception
		
		System.err.println("next element for removable : "+queue.peek());
		// peek : return head of queue 
		// alternate method instead of peek is : element() but if queue is empty 
		// it will throw exception
		
		System.out.println("After peek  : "+queue);
		System.out.println("check if queue is empty / not : "+queue.isEmpty());
		
		

	}

}
