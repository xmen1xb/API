package com.vti.entity;

import java.util.Scanner;

import com.vti.ultis.ScannerUltis;

public class Department {
	private int id;
	private String name;
	private static int count=0;
	public Department() {
		count++;
		this.id = count;
		this.name = inputName();
	}
	private String inputName() {
		System.out.println("nhap ten phong  ban");
		String a=ScannerUltis.inputString();
		return a;
	
		
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	}
	



