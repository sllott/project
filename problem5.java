package start;
import java.util.Scanner;
public class problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String a = in.nextLine();
		System.out.print("연락처를 입력하세요 : ");
		int i = in.nextInt();
		int y ;
		
		
		y = 0;
		while ( y != 8) {
			System.out.println("*************************************************");
			System.out.println();
			System.out.println("           Welcome to Shopping Mall");
			System.out.println("           Welcome to Book Market!");
			System.out.println("*************************************************");
			System.out.println("  1. 고객 정보 확인하기       4. 바구니에 항목 추가하기");
			System.out.println("  2. 장바구니 상품 목록 보기   5. 장바구니의 항목 수량 줄이기");
			System.out.println("  3. 장바구니 비우기          6. 장바구니의 항목 삭제하기");
			System.out.println("  7. 영수증 표시하기          8. 종료");
			System.out.println("*************************************************"); 
			System.out.println();
			
			System.out.print("메뉴 번호를 선택해주세요 ");
			y = in.nextInt();
			
			
			switch (y) {
		    case 1:
		    	System.out.println("현재 고객 정보 : ");
		    	System.out.println("이름  " +a+ "   연락처  " +i);
		    	break;
		    case 2:
		    	System.out.println("장바구니 상품 목록 보기");
	        	break;
		    case 3:
		    	System.out.println("장바구니 비우기");
	        	break;
		    case 4:
		    	System.out.println("바구니에 항목 추가하기");
	        	break;
		    case 5:
		    	System.out.println("장바구니의 항목 수량 줄이기");
	        	break;
		    case 6:
		    	System.out.println("장바구니의 항목 삭제하기");
	        	break;
		    case 7:
		    	System.out.println("영수증 표시하기");
	        	break;
		    case 8:
		    	System.out.println("종료");
	        	break;
	        
		    default: 
		    	System.out.println("다른 번호를 입력하여 주십시오.");
	        	break;
	}
		
		}
		
				

	}

}
