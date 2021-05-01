package com.vti.entity;

import java.time.LocalDate;
import java.util.Scanner;

import com.vti.backend.InvalidAgeInputingException;
import com.vti.ultis.ScannerUltis;

public class Account {
	public static int COUNT = 0;
	private int id;
	private String email;
	private String userName;
	private String fullName;
	private int age;

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName +",age ="+age+ "]";
	}

	public Account() throws InvalidAgeInputingException{
		super();
		System.out.println("Nhập thông tin Account: ");
		COUNT++;
		this.id = COUNT;
		System.out.println("Nhập tên Email: ");
		this.email = ScannerUltis.inputString();
		System.out.println("Nhập tên userName: ");
		this.userName=ScannerUltis.inputString();
		System.out.println("nhap tuoi");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		if (i<=0) {
			throw new InvalidAgeInputingException("The age must be greater than 0");
		} else {
			this.age=i;
		}
		

	}
}
