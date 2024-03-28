package start;
import java.util.Scanner;
public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int y ;
		y = 0;
		while ( y != 4) {
		System.out.println("**************************************************************");
		System.out.println("                  Welcome to Car WASH                         ");
		System.out.println("**************************************************************");
		
		System.out.println("**************************************************************");
		System.out.println("  1. 기본세차                세제 2회, 휠 1회, 고압수 1회     7,000원");
		System.out.println("  2. 고급세차     세제 2회, 휠 1회, 고압수 2회, 하부세차 1회    10,000원");
		System.out.println("  3. 최고급세차    세제 3회, 휠 2회, 고압수 3회 하부세차 1회    13,000원");
		System.out.println("  4. 초기화면"                                                   );
		System.out.println("**************************************************************"); 
		System.out.println();
		
		System.out.print("원하시는 코스를 선택해주세요 : ");
		int i = in.nextInt();
		y = in.nextInt();
		
		
		
		
		switch (y) {
	    case 1:
	    	System.out.println("기본세차");
	    	break;
	    case 2:
	    	System.out.println("고급세차");
        	break;
	    case 3:
	    	System.out.println("최고급세차");
        	break;
	    case 4:
	    	System.out.println("초기화면");
        	break;	
		}
	}
}
}
