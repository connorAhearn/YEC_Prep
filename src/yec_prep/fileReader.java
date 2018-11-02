package yec_prep;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileReader {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner reader = new Scanner(new File("input.txt"));
		
		while(reader.hasNext()) System.out.println(reader.nextLine());
		reader.close();
	}
}
