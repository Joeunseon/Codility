/**
 * Lesson3 - Time Complexity : PermMissingElem
 * 잃어버린 요소 찾기
 * N개의 다른 정수로 구성된 배열 A가 주어집니다.
 * 배열은 [1, 2....(N + 1)] 로 구성되어 있습니다.
 * 정확히는 하나의 요소가 빠져 있다.
 * 주어진 배열을 확인하여, 누락된 요소를 찾아야 한다.
 * ex) 
 * ----------------------------------
 * int[] A = {2, 3, 1, 5}
 * 최종 결과, 4 반환
 * ----------------------------------
 */

package Basic;

import java.util.Arrays;

public class Lesson5
{
	public static void main(String[] args) {
		int[] A = {2, 3, 1, 5};
		
		int answer = solution1(A);
		
		System.out.println(answer);
	}
	
	public static int solution1(int[] A) {
		int answer = 0;
		
		Arrays.sort(A);
		
		for (int i = 0; i < A.length; i++)
		{
			if ( i+A[0] != A[i] ) {
				answer = i+A[0];
				break;
			}
		}
		
		return answer;
	}
	
	public static int solution2(int[] A) {
		Arrays.sort(A);
		
		for (int i = 0; i < A.length; i++)
		{
			if ( i+1 != A[i] ) return i+1;
		}
		
		return A.length+1;
	}
}

/**
 * solution1 
 * for문 때문에 Time Out 에러가 나지 않을까 
 * 걱정했던 우려와 다르게 몇 개의 문제에서 오답으로 나왔다
 * Total score, 50%
 * 아무리 생각해도 모르겠어서 결국 구글 찬스..
 * 확인해보니 배열에 1 부터 N까지 모두 들어오고 
 * N+1이 안들어 왔을 경우도 생각해야한다고...
 */
