package new2024;
import java.util.Scanner;
public class new10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		int result = 0;
		for (int i=1; i<=n; i++) {
			System.out.printf("%d ", i);
			result+=i;
			
			if(i==n) {
				System.out.printf("= %d \n", result);
				break;
			}
			System.out.print("+ ");
		}
		sc.close();
	}

}
