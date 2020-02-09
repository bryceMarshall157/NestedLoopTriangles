
public class Triangle {

	public static void main(String[] args) {
		for (int i = 10; i > 0; i--) {
			int j = 1;
			while (j < i) {
				System.out.print(" ");
				j++;
			}
			int k = 10;
			while (k >= i) {
				System.out.print("* ");
				k--;
			}
			System.out.print("\n");
		}

		for (int i = 10; i > 0; i--) {
			int j = 0;
			while (j < i) {
				System.out.print("* ");
				j++;
			}
			System.out.print("\n");
			int k = 10;
			while (k >= i) {
				System.out.print(" ");
				k--;
			}
		}
	}
}
