package File;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//file
//FileInputStream and FileOutputStream, write ope and Read ope
public class filebuffer {

	public static void main(String[] args)throws IOException//Exception if file not available content not avaiable....
	{
		File file1=new File("e://java//program.txt");//source file i want to open
		try(FileInputStream fis=new FileInputStream(file1))//catch the file content
		{
			byte b[]=new byte[(int)file1.length()];//catch huge content length
			fis.read(b);//read the huge file content
			File file2=new File("e://java//newfile.txt");//i catch destination
			try(FileOutputStream fos=new FileOutputStream(file2))//catch the file by using of stream
			{
				fos.write(b);//write the content to the destination 
				fos.flush();//clear the content 
			}
		}
		System.out.println("Data copied to another file");
		
	}

}



