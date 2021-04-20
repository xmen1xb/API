package com.vti.entity;

import java.time.LocalDate;

public class Question {
	public int id;
	public String content;
	public CategoryQuestion category;
	public TypeQuestion type;
	public Account creator;
	public LocalDate createDate;
	public Question(int id, String content, CategoryQuestion category, TypeQuestion type, Account creator,
			LocalDate createDate) {
		super();
		this.id = id;
		this.content = content;
		this.category = category;
		this.type = type;
		this.creator = creator;
		this.createDate = createDate;
	}
}
