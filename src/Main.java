
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException  {
		System.out.println("Welcome to ToDoList");
		System.out.println("Pick an option");
		System.out.println("1 for Show Task List");
		System.out.println("2 for Add Task");
		System.out.println("3 for Edit Task");
		System.out.println("4 for Save & Quit");
		while(true){
			System.out.printf("> ");
		Scanner s = new Scanner(System.in);
	     int number = s.nextInt();
	     TodoLogic t1 = new TodoLogic();
		   switch(number) {
		      case 1:
		    	  
		  	       t1.View();
		  	
		         break;
		      case 2:
		    	    t1.add();
			      break;
		      case 3:
		    	  t1.edit();
			      break;
		      case 4:
		    	  System.out.println("4 for Save&Quit tasklist");
		    	  return;
		default:
				  System.out.print("you should enter the number between 1 to 4");

				  
		   }
		   	
		
	 }
	}
	

	
	
}