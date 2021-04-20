package com.vti.entity;

public class CategoryQuestion {
	public CategoryQuestion(int id, categoryname name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int id;
	public categoryname name;
	public enum categoryname{JAVA ,NET, SQL, POSTMAN, RUBY}
}
