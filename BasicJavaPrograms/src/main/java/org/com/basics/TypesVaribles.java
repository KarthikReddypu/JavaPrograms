package org.com.basics;

public class TypesVaribles {

	int intance1;
	static int static1;
	static Integer static3;
	 String  static2;
	public void method1(){
		int local1 =1;
		System.out.println("Local varible value is: " +local1);
		System.out.println("Instance varible int defeault value is: " +intance1);
		System.out.println("Static varible value is: " +static1);

	}
	public static void main(String[] args) {
		TypesVaribles obj = new TypesVaribles();
		//Case. 1: Checking initialization  means If I declare instance and static variable it will take default values of the data types
		   obj.method1();
		   System.out.println("Instance varible value is: " +obj.intance1);
		   System.out.println("Static varible Integer default value is: " +static3);
		   System.out.println("non primitives or refernce types default value is: " +obj.static2);
		   
		   System.out.println("Application excution code: "+ProgramStatusCode.SUCCES_CODE);
		  System.exit(ProgramStatusCode.SUCCES_CODE);
		  System.out.println("After system exit check I am excecuting or not");


	}

	
	
}
