package Update_Sort;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputValidation;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.w3c.dom.ls.LSSerializer;

class Student implements Serializable{
	int id ;
	String name ;
	int salary;
	 public Student(int id,String name ,int salary) {
		// TODO Auto-generated constructor stub
		 this.id = id;
		 this.name = name;
		 this.salary = salary;
	}
	 public String toString() {
		 return id+" "+name+" "+salary;
	 }

}
public class FileInputOutputScreen {

		public static void main(String[] args) throws Exception {
				 Scanner s = new Scanner(System.in);
				 Scanner s1 = new Scanner(System.in);
				 ObjectInputStream ois=null ;
				 ObjectOutputStream oos=null;
				 
				 File file = new File("Student.txt");
				 if (file!=null) {
					 
				 }
			     int id=0 ;
			     String name= "" ;
			     int salary=0;
			     int choice;
			     ArrayList<Student> list = new ArrayList<Student>();
			     System.out.println("\t1/. Insert ");
			     System.out.println("\t2/. Display ");
			     do {
				     System.out.println("______________________________________");
				     System.out.println("Choose Option :");
				     choice = s.nextInt(); 	
				     switch(choice) {
				     case 1:
			    	  System.out.println("Please input number of imployee :");
			    	  int n = s.nextInt();
			    	  for (int i =0;i<n;i++) {
			    		  System.out.print("Input ID     :");
			    		  id = s.nextInt();
			    		  System.out.print("Input Name   :");
			    		  name = s1.nextLine();
			    		  System.out.print("Input Salary :");
			    		  salary = s.nextInt();
			    		  list.add(new Student(id,name,salary));
			    		  
			    		  
			    	  }
						
					  oos = new ObjectOutputStream(new FileOutputStream(file)) ;
			    	  oos .writeObject(list);
			    	  oos.close();
			    	 break;
				     case 2:{
				    	 System.out.println(list.toString());
				     }break; 
			    	  
				     }
			     }while (choice !=0);
	
		}

}
