/**
 * Lesson3 - Time Complexity : FrogJmp
 * 작은 개구리가 점프해야하는 횟수 구하기 
 * 현재 작은 개구리가 있는 곳을 X,
 * 작은 개구리가 도착하거나 지나가야 하는 곳을 Y,
 * 작은 개구리가 한 번 점프해서 갈 수 있는 거리 D 라고 했을 때, 
 * 주어진 정수 X, Y, D를 이용하여 최소 점프 횟수를 맞추기
 * ex) 
 * ----------------------------------
 * int X = 10, int Y = 85, int D = 30
 * 10 + 30 = 40
 * 40 + 30 = 70
 * 70 + 30 = 100
 * 최종 결과 3 반환
 * ----------------------------------
 */

package Basic;

import java.util.Scanner;

public class Lesson4
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int answer = solution1(sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		System.out.println(answer);
	}
	
	public static int solution1(int X, int Y, int D) {
		int answer = 0;
		
		while (X < Y)
		{
			X += D;
			answer++;
			
		}
		
		return answer;
	}
	
	public static int solution2(int X, int Y, int D) {
		int answer = 0;
		
		if ( X < Y ) {
			answer = (Y-X)/D;
			
			if ( (Y-X)%D > 0 ) answer++;
		}
		
		return answer;
	}
}

/**
 * solution1 
 * 처음 생각했던 풀이
 * 코드 작성하고 나니 전일날 경험했던 TimeOut Error가 생각났다...
 * 반복문 안쓰는 것이 포인트 인 것으로 짐작
 * 다른 풀이 없을까하고 생각한지 얼마 지나지 않아 바로 생각난 solution2
 */
