package Collection3;

import java.io.*;
import java.util.*;
public class LaunchProperties {

	public static void main(String[] args) throws Exception{
		Properties p = new Properties();
		
		 FileInputStream fis= new FileInputStream("C:\\Users\\LENOVO\\Desktop/database.properties");
		 
		 p.load(fis);
		 
		 System.out.println(p);
		 
		 p.setProperty("Favourite", "learning");
		 
		 System.out.println(p);
		 
		 FileOutputStream fos=new FileOutputStream("C:\\Users\\LENOVO\\Desktop/database.properties");
		 
		 p.store(fos, "This is a comment");
		 
		 
		 

	}

}
