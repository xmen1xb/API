package com.vti.entity;

public class Position {
	public Position(int id, PositionName name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int id;
	public PositionName name;
	public enum PositionName {
		DEV, TEST, SCRUM_MASTER, PM}
}
