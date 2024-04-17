package com.chainsys.day9;

import java.util.Scanner;

public class ClassB extends ClassA {
	
	public void review() {
		System.out.println("\nBAD REVIEWS");
		System.out.println("=> As a beginner, this book was ery dry and hard to understand.");
		System.out.println("=> If you are into philosophy this book may be good but as a fiction lover i hated this book.");
		Scanner sc=new Scanner(System.in);{
			System.out.println("Your 5 star rating: ");
			float rating=sc.nextFloat();
			if(rating>0 && rating<6) {
				System.out.println("STAR RATING OUT OF 5: "+rating);
			}
			else {
				System.out.println("INVALID INPUT! TRY AGAIN");
			}
		
		}
	}

}
