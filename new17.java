package new2024;
import java.util.Scanner;
public class new17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 피라미드를 표시합니다.");
		System.out.print("단수는 : ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; ++i) {
			String munja = Integer.toString(i % 10);
			String answer = "";
			answer += " ".repeat(n-i);
			answer += munja.repeat(2*(i-1)+1);
			System.out.println(answer);
		}
		sc.close();
	}

}
