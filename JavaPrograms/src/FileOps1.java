import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
public class FileOps1 {
	public static void main(String[] args) throws IOException{
		String path1 = "D:\\FileProgs\\Input.txt";
		String path2 = "D:\\FileProgs\\Output.txt";
		
		FileInputStream fis = new FileInputStream(path1);
		int temp;
		FileOutputStream fos = new FileOutputStream(path2);
		
		while((temp=fis.read())!=-1) {
			fos.write(temp);
		}
		fos.close();
		fis.close();
		
	}
}
*/
/*
public class FileOps1 {
	public static void main(String[] args) throws IOException{
		String path1 = "D:\\FileProgs\\In1.txt";
		String path2 = "D:\\FileProgs\\Op1.txt";
		
		FileReader fr = new FileReader(path1);
		int temp;
		FileWriter fw = new FileWriter(path2);
		
		while((temp=fr.read())!=-1) 
		{
			fw.write(temp);
		}
		fw.flush();
		fr.close();
	}
}

*/
/*
public class FileOps1 {
	public static void main(String[] args) throws IOException{
		String path1 = "D:\\FileProgs\\In2.txt";
		String path2 = "D:\\FileProgs\\op3.txt";
		
		FileReader fr = new FileReader(path1);
		BufferedReader br = new BufferedReader(fr);
		String temp;
		FileWriter fw = new FileWriter(path2);
		BufferedWriter bw = new BufferedWriter(fw);
		
		while((temp=br.readLine())!=null) 
		{
			bw.write(temp);
		}
		bw.flush();
		fw.flush();
		br.close();
		fr.close();
	}
}
*/
public class FileOps1 {
	public static void main(String[] args) throws IOException{
		String path1 = "D:\\FileProgs\\In2.txt";
		String path2 = "D:\\FileProgs\\op4.txt";
		
		FileInputStream fr = new FileInputStream(path1);
		BufferedInputStream br = new BufferedInputStream(fr);
		int temp;
		FileOutputStream fw = new FileOutputStream(path2);
		BufferedOutputStream bw = new BufferedOutputStream(fw);
		
		while((temp=br.read())!=-1) 
		{
			bw.write(temp);
		}
		bw.flush();
		fw.close();
		br.close();
		fr.close();
	}
}
*/



