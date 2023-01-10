/**
 * Lesson2 - Arrays : OddOccurrencesInArray
 * 주어진 배열 A에서 쌍을 이루지 못하는 요소 찾기
 * 배열의 각 요소는 짝을 이루지 않은 하나의 요소를 제외하고 
 * 동일한 값을 가진 다른 요소와 쌍을 이룰 수 있다
 * ex) 
 * ----------------------------------
 * int[] A = {9, 3, 9, 3, 9, 7, 9};
 * 쌍을 이루지 못한 7 반환
 * ----------------------------------
 */

package Basic;

import java.util.HashSet;

public class Lesson3
{
	public static void main(String[] args) {
		int[] arr = {9, 3, 9, 3, 9, 7, 9};
		
		int answer = solution3(arr);
		
		System.out.println(answer);
	}
	
	public static int solution1(int[] A) {
		int answer = 0;

		for (int i = 0; i < A.length; i++)
		{
			int temp = 1;
			
			for (int j = 0; j < A.length; j++)
			{
				if ( i != j && A[i] == A[j] ) temp++;
			}
			
			if ( temp%2 != 0 ) {
				answer = A[i];
				break;
			}
		}
		
		return answer;
	}
	
	public static int solution2(int[] A) {
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for (int n : A) {
			if ( hash.contains(n) ) {
				hash.remove(n);
			} else hash.add(n);
		}
		
		return hash.iterator().next();
	}
	
	public static int solution3(int[] A) {
		int answer = 0;
		
		for (int i : A)
			answer = answer ^ i;
		
		return answer;
	}
}

/**
 *  solution1 
 *  Total score, 66% 
 *  TimeOut Error 발생
 *  medium2, big1, big2 
 */

/**
 *  solution2 
 *  Compiler Error 발생
 *  cannot find symbol
 *  -------------------------------------------------------
 *  Compiler output:
 *	Solution.java:10: error: cannot find symbol
 *       HashSet<Integer> hash = new HashSet<Integer>();
 *       ^
 *  symbol:   class HashSet
 *  location: class Solution
 *  Solution.java:10: error: cannot find symbol
 *      HashSet<Integer> hash = new HashSet<Integer>();
 *                                  ^
 *  symbol:   class HashSet
 *  location: class Solution
 *  2 errors
 *  -------------------------------------------------------
 *  원인 : import 누락 
 *  codility 에서 주석으로 아래 내용이 써져 있어 
 *  ------------------------------------------
 *  // you can also use imports, for example:
 *  // import java.util.*;
 *  ------------------------------------------
 *  java.util.* import 되어 있다고 생각했는데.. 아니였던 것...
 */

/**
 * solution3
 * 다른 개발자 코드 
 * XOR 연산 이용
 * 0000 1001 = 1001 = 9
 * 1001 0011 = 1010 = 10
 * 1010 1001 = 0011 = 3
 * 0011 0011 = 0000 = 0
 * 0000 1001 = 1001 = 9
 * 1001 0111 = 1110 = 14
 * 1110 1001 = 0111 = 7
 */