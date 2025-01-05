package inputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		try {
			printWriter();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void copyCharFile() throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
		BufferedWriter writer= new BufferedWriter(new FileWriter("copy_char.txt"));
		
		String  value;
		while((value = reader.readLine()) != null) {
			writer.write(value+"\n");
			System.out.println(value);
		}
		reader.close();
		writer.flush();
		writer.close();
	}
	public static void copyByteFile() throws IOException{
		BufferedInputStream reader = new BufferedInputStream(new FileInputStream("file.txt"));
		BufferedOutputStream writer= new BufferedOutputStream(new FileOutputStream("copy char.txt"));
		
		int  value;
		while((value = reader.read()) != -1) {
			writer.write(value);
			System.out.println((char)value);
		}
		reader.close();
		writer.flush();
		writer.close();
	}
	public static void printWriter() throws IOException {
//		PrintWriter writer = new PrintWriter("print_writer.txt");
		PrintWriter writer = new PrintWriter(System.out,true);
		writer.write("Hello, i am a developer!\n");
		writer.printf("I have %d rs and i have %.2f on esewa.", 1500,500.5);
//		writer.flush();
		writer.close();
	}
}
