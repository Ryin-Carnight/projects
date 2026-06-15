public class Main {
	public static void main(String[] args) {
		
	}

	private static void lineOutput(int y) {
		for (int x = 1; x < 10; x++) {
			int n = x * y;
			// 1桁の時の追加処理
			if (n < 10)
				System.out.print(" 0" + n);
			else
				System.out.print(" " + n);
		}
	}
}
