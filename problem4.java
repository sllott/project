package start;
import java.util.Scanner;
public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int num = 9;
		for (int i=0; i<5; i++) {
			for (int k=0; k<i; k++) {
				System.out.print(" ");
			}
			for(int j= num; j>0; j--) {
				System.out.print("*");
			}
		num = num -2;
		System.out.println();
		}
	}
}
