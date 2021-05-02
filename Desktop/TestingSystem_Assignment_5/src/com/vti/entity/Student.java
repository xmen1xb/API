package com.vti.entity;

import java.util.ArrayList;
import java.util.Random;

public class Student implements IStudent {
	public int id;
	public String name;
	public int group;

	public Student(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}

	public ArrayList<Student> students;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", group=" + group + "]";
	}

	public Student() {
		students = new ArrayList<Student>();
		String[] asd = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "K" };
		Random rd = new Random();
		int x = rd.nextInt(asd.length);
		System.out.println(x);
		for (int i = 0; i < x; i++) {
			Student student = new Student(i + 1, ("Nguyen Van ".concat(asd[i])), 1);
			students.add(student);
		}
		for (int i = 0; i < asd.length - x; i++) {
			Student student = new Student(i + 1 + x, ("Nguyen Van ".concat(asd[i])), 2);
			students.add(student);
		}

	};

	@Override
	public void diemdanh() {

		for (Student student : students) {
			System.out.println(student.name + " diem danh");
		}
	}

	@Override
	public void hocBai() {
		for (Student student : students) {
			if (student.group == 1) {
				System.out.println(student.name + " hoc bai");
			}
		}

	}

	@Override
	public void didonvesinh() {
		for (Student student : students) {
			if (student.group == 2) {
				System.out.println(student.name + " di don ve sinh");
			}
		}

	}

}
