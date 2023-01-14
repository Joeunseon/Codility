/**
 * Lesson3 - Time Complexity : TapeEquilibrium
 * N개의 정수로 구성된 비어 있지 않은 배열 A가 주어진다.
 * 0 < P < N과 같은 정수 P는 이 테이프를 비어 있지 않은 두 부분으로 분할한다
 * : A[0], A[1], ..., A[P-1] 및 A[P], A[P + 1], ..., A[N-1].
 * 두 부분의 차이는 다음 값이다
 * : |(A[0] + A[1] + ... + A[P - 1]) - (A[P] + A[P + 1] + ... + A[N - 1])|
 * N개의 정수로 이루어진 비어 있지 않은 배열 A가 주어지면 달성할 수 있는 최소 차이를 반환한다.
 * ex) 
 * ----------------------------------
 * int[] A = {3, 1, 2, 4, 3}
 * P = 1, 차이 = |3 - 10| = 7
 * P = 2, 차이 = | 4 - 9| = 5
 * P = 3, 차이 = | 6 - 7| = 1
 * P = 4, 차이 = | 10 - 3| = 7
 * 최종 결과, 1 반환
 * ----------------------------------
 */

package Basic;

import java.util.Arrays;

public class Lesson6
{
	public static void main(String[] args) {
		int[] A = {3, 1, 2, 4, 3};
		
		int answer = solution1(A);
		
		System.out.println(answer);
	}
	
	public static int solution1(int[] A) {
		int answer = 0;
		
		int[] B = new int[A.length-1];
		
		for (int i = 1; i < A.length; i++)
		{
			int X = 0;
			int Y = 0;
			
			for (int j = 0; j < A.length; j++)
			{
				if ( j < i ) {
					X += A[j];
				} else {
					Y += A[j];
				}
			}
			
			B[i-1] = Math.abs(X-Y);
		}
		
		Arrays.sort(B);
		
		answer = B[0];
		
		return answer;
	}
}

/**
 * soltuion1 
 * Total score, 53% 
 * TimeOut Error 발생
 * 이중 for문 쓸때 Time Out Error 예상은 했는데...
 * 진짜.. Time Out이 나왔네..
 * 이중 for문 사용하지 않는 방안으로 풀이 필요..
 */
