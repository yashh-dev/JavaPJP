package EmployeeManagementSystem;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class EmployeeManagementSystem {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Menu\n1. Add an Employee\n2. Display All\n3. Exit");
		Scanner sc=new Scanner(System.in);
		
		FileOutputStream fileOut =
		         new FileOutputStream("data");
		         ObjectOutputStream out = new ObjectOutputStream(fileOut);
		FileInputStream Filein=new FileInputStream("data");
		          ObjectInputStream in=new ObjectInputStream(Filein);
		          out.close();
		ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream("data",true)) {
		              protected void writeStreamHeader() throws IOException {
		                  reset();
		              }
		          };
		boolean flag=true;
		while(flag) {
			int choice =sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:out1 = new ObjectOutputStream(new FileOutputStream("data",true)) {
	              protected void writeStreamHeader() throws IOException {
	                  reset();
	              }
	          };	
				System.out.print("Enter the Name of the Employee :");
					String name=sc.nextLine();
					System.out.print("Enter Designation :");
					String des=sc.nextLine();
					System.out.print("Enter Department :");
					String dep=sc.nextLine();
					System.out.print("Enter Salary :");
					Double salary =sc.nextDouble();
					sc.nextLine();
					Employee emp=new Employee(name,LocalDate.now(),dep,des,salary);
					out1.writeObject(emp);
					out1.close();
					break;
			case 2:
		          	while(Filein.available()>0){
		            Employee employee=(Employee) in.readObject();
		            System.out.println(employee);
		          	}
					break;
			case 3:flag=false;
				
				in.close();
				fileOut.close();
				Filein.close();
				sc.close();
					break;
			default:System.out.println("Invalid");
			}
		}
	}
}
