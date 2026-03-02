package com.collection.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    // operation : offer , poll , peek
	
	public static void main(String[] args) {
		
		// internally use Max heap
		
		Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
		
		queue.offer(10);
		queue.offer(13);
		queue.offer(20);
		queue.offer(10);
		queue.offer(13);
		queue.offer(20);
		
		System.out.println(queue);
		
		System.out.println(queue.peek());
		
		
		queue.poll();
		
		System.out.println(queue);

	}

}
