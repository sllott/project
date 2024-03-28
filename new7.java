package new2024;
import java.util.Scanner;
public class new7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정숫값의 자릿수를 표시합니다.");
		System.out.println("양의 정숫값 : ");
		int num = sc.nextInt();
		int count = 0;
		while(num>0) {
			num/=10;
			count++;
		}
		System.out.printf("입력한 숫자는 %d자리 입니다.", count);
		sc.close();
	}

}
