package com.vti.entity;

import java.time.LocalDate;

public class Group {

	public Group(int id, String name, Account creator, LocalDate createdate, Account[] accounts) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createdate = createdate;
		this.accounts = accounts;
	}

	public int id;
	public String name;
	public Account creator;
	public LocalDate createdate;
	
	public Account[] accounts;
}
