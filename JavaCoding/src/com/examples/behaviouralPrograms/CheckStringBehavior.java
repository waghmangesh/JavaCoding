package com.examples.behaviouralPrograms;

public class CheckStringBehavior {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		Emp e = new Emp("hello");
		Emp e1 = new Emp("hello");
		
		System.out.println(e.s.equals(e1.s));
		System.out.println(e.s == e1.s);
	}

}

class Emp{
    String s;
    Emp(String s){
        this.s = new String(s);
    }
}