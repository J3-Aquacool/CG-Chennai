package com.demo.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student 
{
	private String name;
	private int rollno;
	private String grade;
	public Student(String name, int rollno, String grade) {
	
		this.name = name;
		this.rollno = rollno;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", grade=" + grade + "]";
	}
	}

// lets create a utilitlty/ helper class to sort by name

class sortbyname implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
	
}


class sortbyrollno implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
	
		if(o1.getRollno() > o2.getRollno())
		{
			return 1;
		}

		else if(o1.getRollno() < o2.getRollno())
		{
			return -1;
		}
		
		else 
		{
			return 0;
		}
		
	}
	
	
}


public class CollDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Lets create a couple of STudent objects and store it into arraylist
		
		
		
		/*
		 * Student st=new Student("Shajina",101,"A"); Student st1=new
		 * Student("Thanmaya",102,"A"); Student st2=new Student("Sushmitha",103,"A");
		 */		

		ArrayList<Student> arrayList=new ArrayList<Student>();
		
		arrayList.add(new Student("Shajina",101,"A"));
		arrayList.add(new  Student("Thanmaya",7,"A"));
		arrayList.add(new Student("Sushmitha",103,"A"));
	
		System.out.println("Display teh Array List :"+arrayList);
		System.out.println("************************");
		System.out.println("Index Access:"+arrayList.get(1));
		System.out.println("************************");
		
		
		// Lets Display only the name of the Students
		
		Iterator<Student> it=arrayList.iterator();
		
		while(it.hasNext())
		{
			
		Student ref=it.next();
			
			
System.out.println(ref.getName() +" Marks" +ref.getRollno());
		}
		
		// Lets try to sort
					
		System.out.println("**************************");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(99);
		al.add(07);
		al.add(1);
		
		
		Collections.sort(al);
		System.out.println("Sorted List:"+ al);
		
		
		
		
		// lets sort the userdefined object
		
		System.out.println("**************************");
		
		
		
		Collections.sort(arrayList,new sortbyrollno());
		System.out.println("Sorted Student List:"+ arrayList);
		
		
		Iterator <Student> sort=arrayList.iterator();
		while(sort.hasNext())
		{
			Student ref=sort.next();
			System.out.println(ref.getName());
		}
		
			
	}

}
