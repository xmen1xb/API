package com.vti.entity;

import java.util.Scanner;

public class lungtung {
	public static void devide(int a,int b) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao sos thu 1");
		a=sc.nextInt();
		System.out.println("nhap mvao so thu hai");
		b=sc.nextInt();
		try {
			System.out.println("thuong hai so la"+a/b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("tiep theo");
}
}