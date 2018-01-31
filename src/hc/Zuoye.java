package hc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Zuoye {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     File file=new File("F:/Cat.java");
     InputStream is=new FileInputStream(file);
     byte[] b=new byte[(int) file.length()];
     File file1=new File("E:/Cat.java");
     file1.createNewFile();     
     OutputStream os=new FileOutputStream(file1);
     int len=is.read(b);
     while(len!=-1){
    	os.write(b,0,len);
    	os.flush();
    	len=is.read(b);
     }
    
     os.close();
     is.close();	
     System.out.println("¸´ÖÆÍê³É");
	}
}
