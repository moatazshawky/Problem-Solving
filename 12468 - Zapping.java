

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder answer = new StringBuilder();
		int startChannel, endChannel, way1, way2;
		while ((startChannel = in.nextInt()) != -1 && (endChannel = in.nextInt()) != -1) {
			if (startChannel < endChannel) {
				way1 = Math.abs(startChannel - endChannel);
				way2 = startChannel + 99 - endChannel + 1;
			} else {
				way1 = startChannel - endChannel;
				way2 = 99 - startChannel + endChannel + 1;
			}

			answer.append(Math.min(way1, way2)).append("\n");
		}
		System.out.print(answer.toString());
		in.close();

	}

}
