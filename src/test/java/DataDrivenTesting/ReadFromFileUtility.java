package DataDrivenTesting;

import java.io.IOException;

import com.crm.fileUtility.ReadProperties;

public class ReadFromFileUtility {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
     String username = ReadProperties.property("username");
     String password = ReadProperties.property("password");
     
     System.out.println(username);
     System.out.println(password);
     
	}

}
