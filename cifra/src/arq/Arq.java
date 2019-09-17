package arq;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Arq {
	public static String read (String filename) throws IOException {
		StringBuilder arq = new StringBuilder ();
		
		BufferedReader br = new BufferedReader(new FileReader(filename));
		while(br.ready()){
			arq.append(br.readLine());
		}
		br.close();
		return arq.toString();
	}

	public static void write (String filename, String txt) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(filename));
        buffWrite.append(txt);
        buffWrite.close();
    }

	
}
