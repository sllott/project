package start;
import java.util.Scanner;
public class problem2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
	System.out.println("5개의 숫자를 입력하세요.");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		int e = in.nextInt();
		int f = (a+b+c+d+e);
	
	System.out.printf("합계 : "+(f));

	}

}
