package new2024;
import java.util.Scanner;
public class new12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정숫값 : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("%d의 제곱은 %d입니다.\n", i, i*i);
		}
		sc.close();
	}

}
