package IO;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.*;
public class write {
public void Write() {
	File directory = new File(".");
	String filename="src.txt";
    String path = null;
    try {
        path = directory.getCanonicalPath();
    } catch (IOException e) {
        e.printStackTrace();
    } 
    File file=new File(path);  
    if (!file.exists()) {  
        file.mkdirs();  
    }  
    File file2=new File(directory,filename);  
    if (!file2.exists()) {  
        try {  
            file2.createNewFile();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
    try{
    	File writename=new File(".\\src.txt");
    	writename.createNewFile();
    	BufferedWriter out =new BufferedWriter(new FileWriter(writename));
    	String info="";
    	System.out.print("请输入存入src中的信息:");
    	 Scanner sc = new Scanner(System.in);
    	 info = sc.nextLine();
    	 out.write(info+"\r\n");
    	out.flush();
    	out.close();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
}
}
