package inheritence;

public class admin extends developer {
	

    
    public void manage()
    {
    	super.read();
    	write();
    	System.out.println("manage code");
    }
}
