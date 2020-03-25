import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class TodoList implements Serializable{
	public String task;
	public String projectname;
	public LocalDate Cdate,Edate;
	public String status;
	
	
	public String getTask() { 
		return task;
	}
	public void  setTask(String s) {
		task= s;
		
	}
	
	public String getProjectName() {
		return projectname ;
	}
	public void setProjectName(String s) {
		projectname= s;
	
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String s) {
		status= s;
	}
	public void setTaskCreatedByDate()
	{
	  LocalDateTime currentTime = LocalDateTime.now();
	  Cdate = currentTime.toLocalDate();
	}
	public LocalDate getTaskCreatedByDate()
	{
	 return Cdate;
	}
	public void setTaskEndDate(int y,int m,int d)
	{
		Month m_name;
		switch(m) {
	      case 1:
	    	  m_name=Month.JANUARY;
	         break;
	      case 2:
	    	  m_name=Month.FEBRUARY;
		      break;
	      case 3:
	    	  m_name=Month.MARCH;
		      break;
	      case 4:
	    	  m_name=Month.APRIL;
		      break;
	      case 5:
	    	  m_name=Month.MAY;
	         break;
	      case 6:
	    	  m_name=Month.JUNE;
		      break;
	      case 7:
	    	  m_name=Month.JULY;
		      break;
	      case 8:
	    	  m_name=Month.AUGUST;
		      break;    
	      case 9:
	    	  m_name=Month.SEPTEMBER;
	         break;
	      case 10:
	    	  m_name=Month.OCTOBER;
		      break;
	      case 11:
	    	  m_name=Month.NOVEMBER;
		      break;
	      case 12:
	    	  m_name=Month.DECEMBER;
		      break;    
		  default:
			  m_name=Month.JANUARY;

			  
	   }
		
		 Edate = LocalDate.of(y,m_name, d);
	}
	public LocalDate getTaskEndDate()
	{
		 return Edate;
	}
	
}
