package com.vti.entity;

import java.util.Scanner;

public class HinhChuNhat implements Tinhtoan {
	public int a;
	public int b;

	public HinhChuNhat() {

	}

	@Override
	public int tinhChuVi() {
		System.out.println("Tính chu vi theo Hình Chữ Nhật");
		return (a + b) * 2;

	}

	public HinhChuNhat(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public int tinhDienTich() {
		System.out.println("Tính diện tích theo Hình Chữ Nhật");
		return a * b;

	}

}
