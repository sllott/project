package new2024;
import java.util.Scanner;
public class new9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("카운트업 합니다.");
		System.out.print("양의 정숫값 : ");
		int num = sc.nextInt();
		
		while(num<=0) {
			System.out.print("양의 정숫값 : ");
			num = sc.nextInt();
		}
		for (int i = 0; i <= num; i++) {
			System.out.println(i);
		}
		sc.close();
	}

}
