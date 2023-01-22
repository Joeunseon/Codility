/**
 * Lesson4 - Counting Elements : MaxCounters
 * 처음에는 0으로 설정된 N개의 카운터가 제공되며, 다음과 같은 두 가지 작업을 수행할 수 있습니다.
 * 
 * 증가(X) - 카운터 X가 1 증가합니다,
 * max counter - 모든 카운터가 모든 카운터의 최대값으로 설정됩니다.
 * 
 * 만약 A[K] = X이고, 1 ≤ X ≤ N이라면, 연산 K는 증가한다.
 * A[K] = N + 1이면 연산 K가 max count입니다.
 * 
 * ex) 
 * ----------------------------------
 * int[] A = {3, 4, 4, 6, 1, 4, 4};
 * {3, 2, 2, 4, 2}를 반환
 * ----------------------------------
 */

package Basic;

import java.util.Arrays;

public class Lesson9
{
	public static void main(String[] args) {
		
		int[] A = {3, 4, 4, 6, 1, 4, 4};
		int N = 5;
		
		int[] answer = solution(N, A);
		
		System.out.println(Arrays.toString(answer));
		
	}
	
	static int max = 0;
    
    public static int[] solution(int N, int[] A) {
        int[] answer = new int[N];
        
    	return answer;
    }
    
}
