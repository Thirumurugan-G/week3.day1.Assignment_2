package org.college;

public class Student extends Department
{
	public void studentName()
	{
		System.out.println("Name : Thirumurugan");
	}
	public void studentDept()
	{
		deptName();
	}
	public void studentId()
	{
		System.out.println("ID : 7");
	}
	public static void main(String[] args) 
	{
		Student details=new Student();
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
		details.studentName();
		details.studentDept();
		details.studentId();
	}
}
