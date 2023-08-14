package com.gl.skyscrapers;

import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			FloorFactory fc = new FloorFactory();

			System.out.println("Enter the total number of floors in a building : ");
			int N = sc.nextInt();

			int[] floor = new int[N];

			for (int i = 0; i < N; i++) {
				System.out.println("Enter the floor size given on day " + (i + 1) + ":");
				floor[i] = sc.nextInt();
			}
			System.out.println();

			fc.skyscraperConstruction(floor);

			sc.close();
		}

	}

}
