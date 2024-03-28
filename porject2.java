package start;
import java.util.Scanner;
public class porject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("안녕하세요 Car WASH입니다.");
		
		int y =0;
		
		while ( y != 4) {
			System.out.println("**************************************************************");
			System.out.println("                  Welcome to Car WASH                         ");
			System.out.println("**************************************************************");
			
			System.out.println("**************************************************************");
			System.out.println("  1. 기본세차                세제 2회, 휠 1회, 고압수 1회     7,000원");
			System.out.println("  2. 고급세차     세제 2회, 휠 1회, 고압수 2회, 하부세차 1회    10,000원");
			System.out.println("  3. 최고급세차    세제 3회, 휠 2회, 고압수 3회 하부세차 1회    13,000원");
			System.out.println("**************************************************************"); 
			System.out.println();
			
			System.out.print("원하시는 코스를 선택해 주십시오. ");
			y = in.nextInt();
		
			switch (y) {
		    case 1:
		    	System.out.println("기본세차 7,000원");
		    	System.out.println("카드를 IC칩이 위로해서 삽입해주세요");
				System.out.println("이용해 주셔서 감사합니다.");
		    	break;
		    case 2:
		    	System.out.println("고급세차 10,000원");
		    	System.out.println("카드를 IC칩이 위로해서 삽입해주세요");
				System.out.println("이용해 주셔서 감사합니다.");
	        	break;
		    case 3:
		    	System.out.println("최고급세차 13,000원");
		    	System.out.println("카드를 IC칩이 위로해서 삽입해주세요");
				System.out.println("이용해 주셔서 감사합니다.");
	        	break;
		    case 4:
		    	System.out.println("초기화면으로 돌아갑니다.");
	        	break;

			}	
	}
}
}
