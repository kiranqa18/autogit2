package inque;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\SeleniumProjects\\test.txt");
		
		
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while((str =br.readLine())!=null) {
			
		//While(br.readLine()!=null){
			
			System.out.println(str);
			
			
		}
		
		br.close();
		
		
		
		
	}

}
