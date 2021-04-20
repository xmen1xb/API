package com.vti.entity;

public class Answer {
	public Answer(int id, String content, Question question, Boolean isCorrect) {
		super();
		this.id = id;
		this.content = content;
		this.question = question;
		this.isCorrect = isCorrect;
	}
	public int id;
	public String content;
	public Question question;
	public Boolean isCorrect;
}
