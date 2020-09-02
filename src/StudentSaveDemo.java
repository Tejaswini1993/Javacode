import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSaveDemo {
    
	public static void main(String[] args) throws IOException  {
    	Student s = new Student();
    	s.name="Rahul";
    	s.dept="CS";
    	s.per=85.3;
    	FileOutputStream fos=new FileOutputStream("SData.txt");
    	ObjectOutputStream ops=new ObjectOutputStream(fos);
    	ops.writeObject(s);
    	ops.close();
    	System.out.println("APP END");
		

	}
}
