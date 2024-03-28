package new2024;
import java.util.Scanner;
public class new4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("카운트다운 합니다.");
		System.out.println("양의 정숫값 : ");
		int num = sc.nextInt();
		
		while(num<=0) {
			System.out.print("양의 정숫값 : ");
			num = sc.nextInt();
		}
		while(num>=0) {
			System.out.println(num);
			num--;
		}
		System.out.printf("x값은 %d이 됐습니다. \n", num);
		sc.close();
	}

}
