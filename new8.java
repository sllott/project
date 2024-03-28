package new2024;
import java.util.Scanner;
public class new8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정숫값 : ");
		int num = sc.nextInt();
		int n = num;
		int result = 1;
		while(num>0) {
			result*=num;
			num--;
		}
		System.out.printf("1부터 %d까지의 곱은 %d입니다. \n", n, result);
		sc.close();
	}

}
