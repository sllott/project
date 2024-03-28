package new2024;
import java.util.Scanner;
public class new6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개를 표시할까요? : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			if (i%2==1) {
				System.out.print("+");
			} else {
				System.out.print("*");
			}
		}
		System.out.print("\n");
		sc.close();
	}

}
