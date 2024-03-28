package new2024;
import java.util.Scanner;
public class new16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("피라미드를 표시합니다. ");
		System.out.print("단수는 ? : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i-1)*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		} sc.close();
	}

}
