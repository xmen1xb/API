package com.vti.frontend;

import java.time.LocalDate;
import com.vti.entity.Account;
import com.vti.entity.Answer;
import com.vti.entity.CategoryQuestion;
import com.vti.entity.CategoryQuestion.categoryname;
import com.vti.entity.Department;
import com.vti.entity.Exam;
import com.vti.entity.Group;
import com.vti.entity.Position;
import com.vti.entity.Position.PositionName;
import com.vti.entity.Question;
import com.vti.entity.TypeQuestion;
import com.vti.entity.TypeQuestion.typeName;


public class Demo_Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("HELLO VTI!!!!");
		Department dep1 = new Department();
		dep1.id = 1;
		dep1.name = "Marketing";
		Department dep2 = new Department();
		dep2.id = 2;
		dep2.name = "Sale";
		Department dep3 = new Department();
		dep3.id = 3;
		dep3.name = "Nhansu";

		Position pos1 = new Position();
		pos1.id = 1;
		pos1.name = PositionName.DEV;
		Position pos2 = new Position();
		pos2.id = 2;
		pos2.name = PositionName.PM;
		Position pos3 = new Position();
		pos3.id = 3;
		pos3.name = PositionName.TEST;

		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "xmen1xb@gmail.com";
		acc1.fullname = "nguyen van tan";
		acc1.username = "xmen1xb";
		acc1.department = dep1;
		acc1.position = pos1;
		acc1.creatdate = LocalDate.of(2021, 11, 01);
		Account acc2 = new Account();
		acc2.id = 2;
		acc2.email = "daonq.gmail.com";
		acc2.fullname = "nguyen quang dao";
		acc2.username = "daonq";
		acc2.department = dep2;
		acc2.position = pos2;
		acc2.creatdate = LocalDate.of(2021, 12, 23);
		Account acc3 = new Account();
		acc3.id = 3;
		acc3.email = "abc@gmail.com";
		acc3.fullname = "nguyen thi ha";
		acc3.username = "abc";
		acc3.department = dep1;
		acc3.position = pos2;
		acc3.creatdate = LocalDate.of(2021, 12, 23);

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Group1";
		group1.creator = acc1;
		group1.createdate = LocalDate.of(2021, 04, 12);
		group1.accounts = new Account[] { acc1, acc2 };
		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Group2";
		group2.creator = acc3;
		group2.createdate = LocalDate.of(2021, 04, 12);
		group2.accounts = new Account[] { acc1, acc3 };
		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Group3";
		group3.creator = acc2;
		group3.createdate = LocalDate.of(2021, 04, 12);
		group3.accounts = new Account[] { acc3, acc2 };
		
		
		TypeQuestion type1= new TypeQuestion();
		type1.id=1;
		type1.name= typeName.ESSAY;
		TypeQuestion type2= new TypeQuestion();
		type1.id=2;
		type1.name= typeName.MULTIPLE_CHOISE;
		
		CategoryQuestion cate1=new CategoryQuestion();
		cate1.id=1;
		cate1.name=categoryname.JAVA;
		CategoryQuestion cate2=new CategoryQuestion();
		cate2.id=2;
		cate2.name=categoryname.NET;
		CategoryQuestion cate3=new CategoryQuestion();
		cate3.id=3;
		cate3.name=categoryname.POSTMAN;
		CategoryQuestion cate4=new CategoryQuestion();
		cate4.id=4;
		cate4.name=categoryname.SQL;
		
		Question ques1=new Question();
		ques1.id=1;
		ques1.content="conten1";
		ques1.category= cate1;
		ques1.type=type1;
		ques1.creator=acc2;
		ques1.createDate=LocalDate.of(2020, 03, 02);
		Question ques2=new Question();
		ques2.id=2;
		ques2.content="conten2";
		ques2.category= cate2;
		ques2.type=type2;
		ques2.creator=acc1;
		ques2.createDate=LocalDate.of(2020, 12, 29);
		Question ques3=new Question();
		ques3.id=3;
		ques3.content="conten3";
		ques3.category= cate4;
		ques3.type=type2;
		ques3.creator=acc3;
		ques3.createDate=LocalDate.of(2021, 02, 28);
		
		Answer an1=new Answer();
		an1.id=1;
		an1.content="content1";
		an1.question=ques2;
		an1.isCorrect=true;
		Answer an2=new Answer();
		an2.id=2;
		an2.content="content2";
		an2.question=ques1;
		an2.isCorrect=false;
		Answer an3=new Answer();
		an3.id=3;
		an3.content="content3";
		an3.question=ques3;
		an3.isCorrect=true;
		
		Exam ex1=new Exam();
		ex1.id=1;
		ex1.code="abc123";
		ex1.title="title1";
		ex1.category=cate1;
		ex1.duration=45;
		ex1.creator=acc2;
		ex1.createDate=LocalDate.of(2021, 12, 11);
		ex1.questions= new Question[] {ques1,ques2};
		Exam ex2=new Exam();
		ex2.id=2;
		ex2.code="abcd234";
		ex2.title="title2";
		ex2.category=cate2;
		ex2.duration=60;
		ex2.creator=acc1;
		ex2.createDate=LocalDate.of(2021, 12, 11);
		ex2.questions= new Question[] {ques2,ques3};
		Exam ex3=new Exam();
		ex3.id=3;
		ex3.code="abcde123";
		ex3.title="title3";
		ex3.category=cate1;
		ex3.duration=45;
		ex3.creator=acc3;
		ex3.createDate=LocalDate.of(2021, 12, 11);
		ex3.questions=new Question[] {ques1,ques3};
		
		

		System.out.println("phong so 1:");
		System.out.println("ID: " + dep1.id);
		System.out.println("Name: " + dep1.name);
		System.out.println("phong so 2:");
		System.out.println("ID" + dep2.id);
		System.out.println("Name" + dep2.name);
		System.out.println("tai khoan so 1");
		System.out.println("ID:" + acc1);
		System.out.println("Email:" + acc1.email);
		System.out.println("ten day du:" + acc1.fullname);
		System.out.println("ten nguoi dung: " + acc1.username);
		System.out.println("thuoc phong:" + acc1.department.name);
		System.out.println("vi tri:" + acc1.position.name);
		System.out.println("ngay tao:" + acc1.creatdate);
//question1
		if (acc2.department == null) {
			System.out.println("nhan vien chua co phong ban");

		} else {
			System.out.println("phong ban cua nhan nien nay la " + acc2.department.name);
//question2
		}
		if (acc2.groups == null) {
			System.out.println("nhan vien nay chua co group");

		} else if (acc2.groups.length == 1 || acc2.groups.length == 2) {
			System.out.println("group cua nhan vien nay la: " + acc2.groups);

		} else if (acc2.groups.length == 3) {
			System.out.println("nhan vien nay la nguoi quan trong,tham gia nhieu group");

		} else if (acc2.groups.length>=4) {
			System.out.println("nhan vien nay la nguoi hong chuyen, tham gia tat ca group");
			
		};
//question3
//question4
		
		if ((acc1.position.name).toString() == "DEV") {
			System.out.println("Đây là Developer");
		} else {System.out.println("Người này không phải là Developer");

		};
		System.out.println(acc1.position.name);
	
		
		

}
}