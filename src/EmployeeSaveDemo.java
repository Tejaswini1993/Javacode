import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeSaveDemo
 {
	public static void main(String[] args)
	{
		Employee e = new Employee();
		e.name="Rahul";
		e.profile="HR";
		e.salary=1200;
		e.comm=500.00;
		try 
		{
			FileOutputStream fos= new FileOutputStream("Data.txt");
			ObjectOutputStream ops =new ObjectOutputStream(fos);
			ops.writeObject(e);
			ops.close();
			
	    } 
		catch (Exception e2)
		      {
		         e2.printStackTrace();
		         
		      }
		
		} 
	}


