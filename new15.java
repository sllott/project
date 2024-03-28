package new2024;
import java.util.Scanner;
public class new15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("단수는? : ");
		int n = sc.nextInt();
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 표기합니다.");
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
		
		sc.close();
	}

}
