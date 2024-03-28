package new2024;
import java.util.Scanner;
public class new5s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개의 *를 표시할까요? : ");
		int num = sc.nextInt();
		
		while(num>0) {
			System.out.print("*");
			num--;
		}
		if(num>=1) {
			System.out.print("\n");
		}
		sc.close();
	}

}
