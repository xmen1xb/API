package com.vti.entity;

import java.time.LocalDate;

public class Account {
	public Account(int id, String email, String username, String fullname, Department department, Position position,
			LocalDate creatdate, Group[] groups) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = fullname;
		this.department = department;
		this.position = position;
		this.creatdate = creatdate;
		this.groups = groups;
	}
	public int id;
	public String email;
	public String username;
	public String fullname;
	public Department department;
	public Position position;
	public LocalDate creatdate;
	public Group[] groups;
}
