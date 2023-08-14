package com.gl.skyscrapers;

import java.util.Collections;
import java.util.PriorityQueue;

public class FloorFactory {
	public void skyscraperConstruction(int[] floor) {

		// Initializing two priority queues 'queue' and 'queue1'

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> queue1 = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i = 0; i < floor.length; i++) {
			queue.add(floor[i]);
		}

		System.out.println("The order of construction is as follows : ");

		for (int i = 0; i < floor.length; i++) {

			if (floor[i] == queue.peek()) {

				System.out.println("Day: " + (i + 1));

				System.out.print(queue.remove() + " ");

				while (!queue1.isEmpty()) {

					int x = queue.peek();

					if (x == queue1.peek()) {

						System.out.print(queue1.remove() + " ");
						queue.remove();
					} else {
						break;
					}
				}
				System.out.println();
			} else {
				System.out.println("Day: " + (i + 1));
				System.out.println(" ");
				queue1.add(floor[i]);

			}
		}
	}
}