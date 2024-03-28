package new2024;
import java.util.Scanner;
public class new1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	// 3자리의 양의 정숫값(100~999)을 읽는 프로그램을 작성하라((입력한 값이 3자리 양의 정숫값이 아니면 다시 입력하게 할것).
		int a = 0;
		
		while (!(a >= 100 && a <= 999)) {
			System.out.print("세 자리의 정숫값: ");
			a = sc.nextInt();
		}
		System.out.printf("입력한 값은 %d입니다.\n", a);
		sc.close();
	}

}
