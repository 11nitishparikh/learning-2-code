package learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StarLikePrint {

	/*public static void main(String[] args) throws InterruptedException, IOException{
		
		List<String> inputByLine = new ArrayList<String>();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String line= br.readLine();
		for (int i = 1; i <= Integer.parseInt(line); i++) {
			for (int j = 1; j <= i; j++) {
				if (j % 2 == 1) {
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}*/
	
	
public static void main(String[] args) throws InterruptedException, IOException{
		
		//List<String> inputByLine = new ArrayList<String>();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		StringBuilder str = new StringBuilder();
		String line= br.readLine();
		String[] tokens = line.split("\\.");
		str.append(tokens[0].trim());
		String[] tok = tokens[1].trim().split("\"");
		if(tok[0].trim().length() <= 1) {
			str.append(".");
			str.append(tokens[1].trim());
			str.append("0");
		} else if(tok[0].trim().length() > 1) {
			str.append(".");
			str.append(tokens[1].trim());
		}

		System.out.println(str.toString());
	}

}
