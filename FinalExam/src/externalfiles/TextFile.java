package externalfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFile {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\rozar\\OneDrive\\Documents\\Filereader.txt";
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);

		}

		try {
			f = File.createTempFile("filereader", ".txt");
			boolean FileExist = f.exists();
			System.out.println("  ");
			System.out.println("Filereader exists:  " + FileExist);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
