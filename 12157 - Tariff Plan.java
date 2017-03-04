import java.util.Scanner;

public class TariffPlan_12157 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int t = 0; t < T; t++) {
			int N = in.nextInt();
			int mile = 0, juice = 0;
			for (int n = 0; n < N; n++) {
				int callDuration = in.nextInt();
				mile += ((int) Math.floor(callDuration / 30) + 1) * 10;
				juice += ((int) Math.floor(callDuration / 60) + 1) * 15;
			}
			System.out.printf("Case %d: %s %d\n", t + 1, mile < juice ? "Mile" : mile == juice ? "Mile Juice" : "Juice",
					Math.min(mile, juice));
		}

		in.close();

	}

}
