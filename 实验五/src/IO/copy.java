package IO;
import java.io.*;
import java.util.*;
public class copy {
public void Copy() {
 	File directory = new File(".");
 	String filename="dest.txt";
 	String line="";
     String path = null;
     try {
         path = directory.getCanonicalPath();
     } catch (IOException e) {
         e.printStackTrace();
     } 
     File file1=new File(path);  
     if (!file1.exists()) {  
         file1.mkdirs();  
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
			File file = new File(".\\src.txt");
			InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
			BufferedReader br = new BufferedReader(reader);
			File writename=new File(".\\dest.txt");
	     	writename.createNewFile();
	     	BufferedWriter out =new BufferedWriter(new FileWriter(writename));
	     	System.out.println("以下是dest中的信息:");
			while((line=br.readLine())!=null) {
				out.write(line+"\r\n");
				System.out.println(line);
			}
			br.close();
			out.flush();
	     	out.close();
		}catch(Exception e){
			e.printStackTrace();
		}
         
     
}
}
