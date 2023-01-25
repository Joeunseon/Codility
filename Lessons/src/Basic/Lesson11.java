/**
 * Lesson5 - Prefix Sums : PassingCars
 * N개의 정수로 구현된 비어있지 않은 배열 A가 주어진다.
 * 배열 A는 0 또는 1만 가지고 있다.
 * 0은 동쪽으로 이동하는 차량을
 * 1은 서쪽으로 이동하는 차량을 나타낸다.
 * 목표는 지나가는 차들을 세는 것이다.
 * 우리는 P가 동쪽으로 이동하고 Q가 서쪽으로 이동할 때 0≤ P < Q < N인 한 쌍의 자동차(P, Q)가 통과한다고 말한다.
 * 지나가는 자동차 쌍의 수를 반환해야한다.
 * 단, 지나가는 차량 쌍의 수가 1,000,000,000을 초과할 경우 -1을 반환해야 한다
 * ex)
 * -----------------------------------------
 * int A = {0, 1, 0, 1, 1};
 * (0, 1), (0, 3), (0, 4), (2, 3), (2, 4) 
 * 5를 반환해야 한다.
 * -----------------------------------------
 */

package Basic;

public class Lesson11
{
	public static void main(String[] args) {
		
		int[] A = {0, 1, 0, 1, 1};
		
		int answer = solution(A);
		
		System.out.println(answer);
	}
	
	public static int solution(int[] A) {
		
		int answer = 0;
        int p = 0;

        for ( int i : A ) {
            if ( i == 0 ) {
                p++;
            } else {
                answer += (i*p);
            }

            if ( answer > 1000000000 )
                return -1;
        }

        return answer;
	}
}
