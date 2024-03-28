package new2024;
import java.util.Scanner;
public class new11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 cm부터 : ");
		int start = sc.nextInt();
		System.out.print("몇 cm까지 : ");
		int end = sc.nextInt();
		System.out.print("몇 cm 단위 : ");
		int add = sc.nextInt();
		System.out.println("신장 표준 체중\n-----------");
		
		for(int i=start; i<=end; i+=add) {
			double result = (i-100)*0.9;
			System.out.printf("%d %.1f\n", i, result);
		}
		sc.close();
	}

}
