package com.vti.entity;

import java.time.LocalDate;

public class Exam {
	public Exam(int id, String code, String title, CategoryQuestion category, int duration, Account creator,
			LocalDate createDate, Question[] questions) {
		super();
		this.id = id;
		this.code = code;
		this.title = title;
		this.category = category;
		this.duration = duration;
		this.creator = creator;
		this.createDate = createDate;
		this.questions = questions;
	}
	public int id;
	public String code;
	public String title;
	public CategoryQuestion category;
	public int duration;
	public Account creator;
	public LocalDate createDate;
	public Question[] questions;
}
