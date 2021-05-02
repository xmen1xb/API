package com.vti.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class Tuyensinh implements ITuyenSinh {
	
	public ArrayList<Contestant> contestants;

	public Tuyensinh() {
		
		contestants = new ArrayList<Contestant>();
	}

	@Override
	public void addContestant() {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhap vao ten thi sinh");
		String name1 = sc.next();
		System.out.println("nhap vao dia chi thi sinh");
		String address1 = sc.next();
		System.out.println("nhap vao muc uu tien thi sinh");
		int level1 = sc.nextInt();
		System.out.println("nhap vao khoi thi sinh chon A,B,C");
		String khoi1 = sc.next();
		Contestant ct1=new Contestant(name1, address1, level1,new Block(khoi1));
		contestants.add(ct1);
	}

	@Override
	public void showContesttant() {
		for (Contestant contestant : contestants) {
			System.out.println(contestant.toString());
			System.out.println("========================================================================");
			
		}
		

	}

	@Override
	public void findContestant() {
		System.out.println("nhap vap sbd");
		Scanner sc=new Scanner(System.in);
		int sbd1=sc.nextInt();
		for (Contestant contestant : contestants) {
			if (contestant.sbd==sbd1) {
				System.out.println(contestant.toString());
			}
		}

	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub

	}

}
