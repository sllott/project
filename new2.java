package new2024;
import java.util.*;
public class new2 {

	private static int maxGuessCount;

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		// 2자리의 정숫값(10~99)을 맞추는 '숫자 맞추기 게임'을 만들자. 난수 생성과 if문 그리고 do문을 사용할 것.
		
//		System.out.println("숫자 맞추기 게임 시작!");
//		System.out.println("10부터 99사이의 숫자를 맞추세요.");
		
//		int goal = rd.nextInt(90)+10;
//		System.out.printf("어떤 숫자일까?: ");
//		
//		int guess = sc.nextInt();
//		
//		while (guess != goal) {
//			if (guess > goal) {
//				System.out.println("더 작은 숫자입니다.");
//			} else {
//				System.out.println("더 큰 숫자입니다.");
//			}
//			System.out.println("어떤 숫자일까?: ");
//			guess = sc.nextInt();
//		}
//		System.out.println("정답입니다.");
//		sc.close();
		
		
		// 위 문제의 숫자 맞추기 게임에서 숫자의 범위를 0~99로 변경하고 플레이어가 입력할수 있는 횟수를 제한
		// 하도록 프로그램을 수정하자. 제한 횟수 내에 맞추지 못한 경우에는 정답을 표시하고 게임을 종료할 것.
		
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("0부터 99사이의 숫자를 맞추세요.");
		System.out.println("플레이어는 5번의 시도 기회가 있다.");
		
		int goal = rd.nextInt(100);
		int guessCount = 0;
		int maxGuessCiunt = 5;
		
		while (guessCount < maxGuessCount) {
			System.out.println("어떤 숫자일까? : ");
			int guess = sc.nextInt();
			
			if (guess == goal) {
				System.out.println("정답입니다.");
				break;
			} else if (guess > goal) {
				System.out.println("더 작은 숫자입니다.");
			} else {
				System.out.println("더 큰 숫자입니다.");
			}
			guessCount++;
		}
		if (guessCount == maxGuessCount) {
			System.out.println("5번의 시도 기회를 모두 사용했습니다.");
			System.out.println("정답은" + goal + "입니다");
		}
		sc.close();
	}

}
