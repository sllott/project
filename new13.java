package new2024;
import java.util.Scanner;
public class new13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("계절을 찾습니다. ");
		System.out.print("몇 월입니까? : ");
		
		int month = sc.nextInt();
		
		while (month >= 13) {
			System.out.print("몇 월입니까? : ");
			month = sc.nextInt();
		}
		
		if (month == 12 || month == 1 || month == 2)
		{
		System.out.println("겨울입니다.");
	} else if (month == 3 || month == 4 || month == 5) { 
		System.out.println("봄입니다.");
	} else if (month == 6 || month == 7 || month == 8) {
		System.out.println("여름입니다.");
	} else if (month == 9 || month == 10 || month == 11) {
		System.out.println("가을입니다.");
	}
		sc.close();
	}
}