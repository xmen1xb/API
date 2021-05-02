package com.vti.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	public Person(String ten, Gender gioi_tinh, String ngaysinh, String dia_chi) {
		super();
		this.ten = ten;
		this.gioi_tinh = gioi_tinh;
		this.ngay_sinh = ngaysinh;
		
		this.dia_chi = dia_chi;
	}
	@Override
	public String toString() {
		return "Person [ten=" + ten + ", gioi_tinh=" + gioi_tinh + ", ngay_sinh=" + ngay_sinh + ", dia_chi=" + dia_chi
				+ "]";
	}
	public String ten;
	public Gender gioi_tinh;
	public String ngay_sinh;
	public String dia_chi;
	public enum Gender{
		NAM,NU,BEDE
	}

	Scanner sc = new Scanner(System.in);
	public ArrayList<Person> persons;

	public Person() {
		persons = new ArrayList<Person>();

	}

	String ngaysinh = null;

	public  void inputInfor() {
	}

	public void showInfo() {
	}
	
	
	
}
