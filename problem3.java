package start;
import java.util.Scanner;
public class problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int number = input.nextInt();
		System.out.println(number);
		
		if (number % 2 == 0) {
			System.out.println("짝수입니다");
		}
		else {	
			System.out.println("홀수입니다");
		}
	}

}
