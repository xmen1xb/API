package com.vti.entity;

import java.util.ArrayList;
import java.util.Collection;

import com.vti.entity.Person.Gender;

public class Student1 extends Person {
	public int maSinhVien;
	public double diemTrungBinh;
	public String Email;

	public Student1(String ten, Gender gioi_tinh, String ngaysinh, String dia_chi, int maSinhVien, double diemTrungBinh,
			String email) {
		super(ten, gioi_tinh, ngaysinh, dia_chi);
		this.maSinhVien = maSinhVien;
		this.diemTrungBinh = diemTrungBinh;
		Email = email;
	}

	

	public Student1() {
		
	}

	@Override
	public void inputInfor() {
		
		System.out.println("nhap ten");
		String ten1 = sc.next();
		System.out.println("nhap gioi tinh 1.nam 2.nu 3.bede");
		Gender gioitinh = null;
		int gt = sc.nextInt();
		switch (gt) {
		case 1:
			gioitinh = Gender.NAM;

			break;
		case 2:
			gioitinh = Gender.NU;
			break;
		case 3:
			gioitinh = Gender.BEDE;

		default:
			break;
		}
		System.out.println("nhap ngay sinh");
		String ns = sc.next();
		System.out.println("nhap dia chi");
		String dc = sc.next();
		System.out.println("nhap ma sinh vien");
		int ms = sc.nextInt();
		System.out.println("nhap diem trung binh");
		double dtb = sc.nextDouble();
		System.out.println("nhap email");
		String email = sc.next();
		Person ps1 = new Student1(ten1, gioitinh, ns, dc, ms, dtb, email);
		persons.add(ps1);
	}

	@Override
	public void showInfo() {
		for (Person person : persons) {
			if (person instanceof Student1) {

				System.out.println(person.toString());
			}
		}

	}
	public void xemhocbong() {
		for (Person person : persons) {
			if (((Student1) person).diemTrungBinh>8.0) {
				System.out.println(((Student1) person).toString());
			}
			
		}
	}

	@Override
	public String toString() {
		return "Student1 [maSinhVien=" + maSinhVien + ", diemTrungBinh=" + diemTrungBinh + ", Email=" + Email + "]";
	}
}
