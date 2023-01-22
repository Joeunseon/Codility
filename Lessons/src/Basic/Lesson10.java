/**
 * Lesson4 - Counting Elements : MissingInteger
 * N개의 정수로 이루어진 배열 A가 주어졌을 때, 
 * A에서 발생하지 않는 최소 양의 정수(0보다 큰)를 반환한다.
 * ex) 
 * ----------------------------------
 * int[] A = {1, 3, 6, 4, 1, 2};
 * 5를 반환
 * ----------------------------------
 * int[] A = {1, 2, 3};
 * 4를 반환
 * ----------------------------------
 * int[] A = {-1, -3};
 * 1를 반환
 * ----------------------------------
 */

package Basic;

import java.util.Arrays;

public class Lesson10
{
	public static void main(String[] args) {
		
		int[] A = {3, 4, 4, 6, 1, 4, 2};
		
		int answer = solution2(A);
		
		System.out.println(answer);
	}
	
    public static int solution1(int[] A) {
        int answer = 1;
        
        for (int i = 0; i < A.length; i++)
		{
			if ( anyMatch(answer, A) ) {
				return answer;
			} else {
				answer++;
			}
		}
        
    	return answer;
    }
    
    public static boolean anyMatch(int X, int[] A) {
    	
    	if ( !Arrays.stream(A).anyMatch(j -> j == X ) ) 
			return true;
    	
    	return false;
    }
    
    public static int solution2(int[] A) {
    	int answer = 1;
    	
    	if ( !Arrays.stream(A).anyMatch(i -> i == 1 ) ) 
			return answer;
    	
    	Arrays.sort(A);
    	
    	for (int i = 0; i < A.length; i++)
		{
			if ( A[i] > answer ) {
				return answer;
			} else if ( A[i] == answer ) {
				answer++;
			}
		}
    	
    	return answer;
    }
}

/**
 * solution1 
 *  Total score, 66% 
 *  TimeOut Error 발생
 *  또...TimeOut Error...ㅎㅎㅎ 
 *  Arrays.stream().anyMatch() 때문인가..
 *  너무 어렵게 생각했나보다..
 */