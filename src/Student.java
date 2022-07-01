/*

public class Student {

	
       int roll;                //class variables
       String Name;             //class variables
       
       
    Student(int roll,String Name)    // Parametrised Constructor
       {
    	   this.roll=roll;           //this operator is used because parameter name and global variable name are same 
    	   this.Name=Name;
       }

	public void display()     // Method 
	{ 
		
		System.out.println( +this.roll);
		System.out.println( this.Name);
		
	}
	
	
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

	  
	Student s=new Student(20,"Akash");
			s.display();
		
	}

}

*/
public class Student {

	 int roll;                //class variables
     String Name;  
     Boolean b;                   //class variables

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		Student s=new Student();  //here student(); is a default constructor
		
		System.out.println(s.roll);
		System.out.println(s.Name);
		System.out.println(s.b);

}
	}