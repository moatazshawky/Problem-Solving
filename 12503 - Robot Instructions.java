

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = Integer.parseInt(in.nextLine());
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(in.nextLine()), p = 0;
			String[] instructionList = new String[N];
			for (int n = 0; n < N; n++) {
				String instruction = in.nextLine();
				instructionList[n] = instruction;
				if (instruction.equals("LEFT"))
					p--;
				else if (instruction.equals("RIGHT"))
					p++;
				else {
					while (!instruction.equals("LEFT") && !instruction.equals("RIGHT")) {
						int i = Integer.parseInt(instruction.substring(8));
						instruction = instructionList[i - 1];
					}
					if (instruction.equals("LEFT"))
						p--;
					else if (instruction.equals("RIGHT"))
						p++;
				}

			}
			System.out.println(p);
		}

		in.close();

	}

}
