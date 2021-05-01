package com.vti.frontend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.backend.InvalidAgeInputingException;
import com.vti.entity.Department;
import com.vti.entity.Group;

public class Exercise2 {
	Scanner sc = new Scanner(System.in);
	public static String[] departments = { "a", "b", "c" };

	public static void question1() {
		try {
			float resul = divide(7, 0);
			System.out.println(resul);
		} catch (Exception e) {
			System.out.println("cannot divide 0");

		}
	}

	public static void question2() {
		try {
			float resul = divide(7, 0);
			System.out.println(resul);
		} catch (Exception e) {
			System.out.println("cannot divide 0");

		} finally {
			System.out.println(" divide completed");
		}
	}

	public static void question3() {
		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println(numbers[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("phan tu khong chinh xac");
		}

	}

	public static void question4() {

		try {
			System.out.println("nhap vao depid");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			System.out.println(getIndex(i));
		} catch (Exception e) {
			System.out.println("phan tu khong hop le");
		}
	}

	public static void question5() {
		while (true) {
			try {
				System.out.println("nhap vao tuoi");
				Scanner sc = new Scanner(System.in);
				String a = sc.next();
				int i = Integer.parseInt(a);
				if (i < 0) {
					System.out.println("Wrong inputing! The age must be greater than 0, please input again");

				} else {
					System.out.println("tuoi cua ban la " + i);
					break;
				}
			} catch (Exception e) {
				System.err.println("wrong inputing! Please input an age as int, input again");

			}
		}
	}

	public static void question6() {

	}

	public static void question7() {

	}

	public static void question8() {

	}

	public static void question9() {
		ArrayList<Department> deplist = new ArrayList<Department>();
		Department dep1 = new Department();
		System.out.println(dep1.toString());
		Department dep2 = new Department();
		Department dep3 = new Department();
		deplist.add(dep1);
		deplist.add(dep2);
		deplist.add(dep3);
		for (Department department : deplist) {
			System.out.println(department.toString());
		}
	}

	public static void question10() throws Exception {
		System.out.println("Tạo group: ");
		Group gp = new Group();
		gp.printInforGroup();
	}
	public void question11() {
		
	}
public static void question12() throws InvalidAgeInputingException {
	AccountQues11 accQues11 = new AccountQues11(); 
	 	System.out.println(accQues11.toString()); 

	}

	private static float divide(int i, int j) {
		// TODO Auto-generated method stub
		return i / j;
	}

	public static String getIndex(int index) {
		return departments[index];
	}
}
