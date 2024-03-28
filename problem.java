package start;
import java.util.Scanner;
public class problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	
	
	String grage;
	System.out.print("*** 첫 번째 숫자를 입력하세요 :  ");
	int a = in.nextInt();
		
	System.out.print("*** 두 번째 숫자를 입력하세요 : ");	
	int b = in.nextInt();
	
	System.out.print("*** 더할 숫자를 입력하세요 : ");
	int c = in.nextInt();
	
	int count = 0;
	
	for (int i = a; i <= b; i += c) {
		count += i;
	}
	System.out.print(a + "+" + "..." + "+" + b + "+" + b +1 );
	System.out.println("=" + count +"입니다");
	
	
	}

}
