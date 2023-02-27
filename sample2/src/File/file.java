package File;

import java.io.File;
import java.io.IOException;

public class file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fl=new File("E:\\java\\program.txt");
		try
		{
			if(fl.createNewFile())
			{
				System.out.println("File is created");
			}
			else
			{
				System.out.println("File is not created");
			}
		}
		catch(IOException ex) {
			System.out.println(ex);
		}

	}

}
