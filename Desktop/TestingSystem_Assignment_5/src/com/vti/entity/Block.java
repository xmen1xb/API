package com.vti.entity;

public class Block {
	private int id;
	private String name;
	private String subject;
	public static int COUNT=0;
	
	public Block(String name) {
		COUNT++;
		this.id = COUNT;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		switch (this.name) {
		case "A":
			this.subject="Toan,Ly,Hoa";
			break;
		case "B":
			this.subject="Toan,Hoa,Sinh";
			break;
		case "C":
			this.subject="Van,Su,Dia";
			break;
		default:
			break;
		}
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	

}
