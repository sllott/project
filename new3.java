package new2024;
import java.util.Scanner;
public class new3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 A : ");
		int A = sc.nextInt();
		System.out.println("정수 B : ");
		int B = sc.nextInt();
		
		if (A < B) {
			for (int i = A; i <= B; i++) {
				System.out.printf("%d ", i);
			}
		} else if ( A > B) {
			for (int i = B; i <= A; i++) {
				System.out.printf("%d ",i);
			}
		} else { // A == B 
			System.out.print(A);
		}
		sc.close();
	}

}
