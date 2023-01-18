/**
 * Lesson4 - Counting Elements : PermCheck
 * N개의 정수로 구성된 비어 있지 않은 배열 A가 주어진다.
 * 순열은 1부터 N까지의 각 요소를 한 번만 포함하는 시퀀스이다.
 * 배열 A가 순열일 경우, 1을 반환
 * 순열이 아닐 경우, 0을 반환해야 한다.
 */

package Basic;

import java.util.Arrays;
import java.util.HashSet;

public class Lesson8
{
	public static void main(String[] args) {
		
		int[] A = {4, 1, 3, 2};
		int[] B = {4, 1, 3};
		
		System.out.println(solution4(A));
		System.out.println(solution4(B));
	}
	
	public static int solution1(int[] A) {
		
		int max = Arrays.stream(A).max().getAsInt();
		
		if ( max == A.length ) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int solution2(int[] A) {
		
		int max = Arrays.stream(A).max().getAsInt();
		
		HashSet<Integer> hash = new HashSet<Integer>(Arrays.asList(Arrays.stream(A).boxed().toArray(Integer[]::new)));
		
		if ( max == hash.size() ) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int solution3(int[] A) {
		
		int max = Arrays.stream(A).max().getAsInt();
		
		int min = Arrays.stream(A).min().getAsInt();
		
		if ( max == A.length && min == 1 ) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public static int solution4(int[] A) {
		
		Arrays.sort(A);
		
		for (int i = 0; i < A.length; i++)
		{
			if ( A[i] != (i+1) ) {
				return 0;
			}
		}
		
		return 1;
	}
}

/**
 * solution1  
 * Total score, 83%
 * 2문제 오답... 왜 오답일까....
 * 중복되는 숫자가 있나...
 */

/**
 * solution2
 * Total score, 53%
 * 3문제 더 오답.....총 5문제 오답...
 * 최소값에 문제가 있나...
 */