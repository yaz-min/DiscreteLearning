package dlearning;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Shell{

  private String executeCommand(String command) {

		StringBuilder output = new StringBuilder();

		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader =
                            new BufferedReader(new InputStreamReader(p.getInputStream()));

      String line = "";
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return output.toString();

	}

  public static void main(String[] args) {

		Shell obj = new Shell();


		//in unix
		String command = "./dlv.x86-64-linux-elf-static.bin";

		//in windows
		//String command = "ping -n 3 " + domainName;

		String output = obj.executeCommand(command);

		System.out.println(output);

	}
}