package inque;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntotextFile {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\SeleniumProjects\\Test123.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Selenium With Java");
		
		bw.write("Selenium With python");
		
		System.out.println("Writing FInshed...");
		
		
		bw.close();
	}

}
