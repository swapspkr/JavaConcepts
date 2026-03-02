package com.collection.Queue;

import java.util.ArrayDeque;

public class LearnArrayDeque {

	// ArrayDeque : double ended queue : insertion (offer) can be done from both end
   //  operation : offer , poll , peek , offerFirst , offerLast , PollFirst , pollLast 
  // peekFirst ,peekLast
	
	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		adq.offerLast(85);
		adq.offer(10);
		adq.offer(10);
		adq.offerFirst(25);
		adq.offerLast(65);
		adq.offerLast(75);
		System.out.println(adq);
		
		System.out.println("Peek : "+adq.peek());
		
		System.out.println("Peek first : "+adq.peekFirst());

		System.out.println(adq);
		
		System.out.println(adq.poll());
		
		System.out.println("After poll : "+adq);
		
		System.out.println(adq.pollLast());
		
		System.out.println("After pollLast : "+adq);
	}

}
