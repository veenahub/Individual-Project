import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.swing.JCheckBox;

public class TodoLogic {
	
	
	public void View() throws ClassNotFoundException
	{
	
	 try{
         FileInputStream fis= new FileInputStream("TaskListFile.txt");
         ObjectInputStream ois= new ObjectInputStream(fis);
         
         SortedMap<String, TodoList> maptasks = (SortedMap<String, TodoList>) ois.readObject();
         for (String code : maptasks.keySet()) {
        	   TodoList tl= maptasks.get(code);
        	   System.out.println("ProjectName  "+tl.getProjectName() + "  Due date "+tl.getTaskEndDate());
        	   System.out.println(tl.getTask());
        	   System.out.println(tl.getTaskCreatedByDate());
        	 //  System.out.println(tl.getTaskEndDate());
        	}
         ois.close();
         fis.close();
       }catch(IOException ioe){
            ioe.printStackTrace();
}}

	
	
	public void save(String key,TodoList value) throws ClassNotFoundException 
	{
	
	   try{
		    FileInputStream fis= new FileInputStream("TaskListFile.txt");
            ObjectInputStream ois= new ObjectInputStream(fis);
            SortedMap<String, TodoList> maptasks = (SortedMap<String, TodoList>)ois.readObject();	
         
            FileOutputStream fos= new FileOutputStream("TaskListFile.txt");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            maptasks.put(key, value);
            oos.writeObject(maptasks);
            oos.close();
            fos.close();
          }
	     catch(IOException ioe){
            ioe.printStackTrace();
                               }
	}
	
	
public static void add() throws ClassNotFoundException {
		
		System.out.println("Enter Task details ");
		System.out.println("Name> ");
		Scanner s = new Scanner(System.in);
		String tname=s.nextLine();
		
		TodoList tl = new TodoList();
		
		System.out.println("projectName> ");
		String pname=s.nextLine();
		
		System.out.println("EndDate(yyyy/mm/dd)> ");
		String edatee=s.nextLine();
		String[] edate = edatee.split("/");
	     tl.setTask(tname);	
	     tl.setProjectName(pname);
	     tl.setTaskCreatedByDate();
	    tl.setTaskEndDate( Integer.parseInt(edate[0]),Integer.parseInt(edate[1]),  Integer.parseInt(edate[2]));
	    TodoLogic t1 = new TodoLogic();
	    t1.save(tname,tl);
	
	}
	
public static void edit() throws ClassNotFoundException {
		
		System.out.println("Enter Task name to edit ");
		System.out.println("Name> ");
		Scanner s = new Scanner(System.in);
		String tname=s.nextLine();
		
		TodoList tl = new TodoList();
		
		System.out.println("projectName> ");
		String pname=s.nextLine();
		
		System.out.println("EndDate(yyyy/mm/dd)> ");
		String edatee=s.nextLine();
		String[] edate = edatee.split("/");
		
    
	     tl.setTask(tname);
	      
	     tl.setProjectName(pname);
	     tl.setTaskCreatedByDate();
	    tl.setTaskEndDate( Integer.parseInt(edate[0]),Integer.parseInt(edate[1]),  Integer.parseInt(edate[2]));
	    TodoLogic t1 = new TodoLogic();
	    t1.save(tname,tl);
	
	}
}
