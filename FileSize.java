import java.io.File;
import java.util.Scanner;

import com.sun.tools.javac.code.Attribute.Array;
import com.sun.tools.javac.util.List;

public class FileSize {
	/*
	 * 
	 * 
	 * 
	 * 
	 */
	public static long getSize(File file) {
		long size = 0;
		if( file.isDirectory()) {
			File[] files = file.listFiles();
			List<File> xFiles = new LinkedList<>(Array.asList(files));
			for(File f: xFiles) {
				size += getSize(f);
			}
		}	else {
				size += file.length();
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please give me a directory");
		String str = input.nextLine();
		System.out.println("The size is: " + getSize(new File));
	}

}
