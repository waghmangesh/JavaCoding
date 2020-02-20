package com.examples.behaviouralPrograms;

public class CheckFinallyTestCases {
	
	public static int checkFinallyBehaviour(){
		try {
			System.out.println("try is called");
			
			throw new Exception();
			
		}catch(Exception e) {
			System.out.println("exception is called");
			System.exit(0);
			return 10;
		} finally{
			System.out.println("finally is called");
		}
		}

	public static void main(String[] args) {
		checkFinallyBehaviour();
	}
}
