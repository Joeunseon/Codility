/**
 * Lesson2 - Arrays : CyclicRotation
 * 주어진 배열 A에 대하여 K회 회전 시키기
 * A의 각 요소는 오른쪽으로 K회 이동한다.
 * 마지막 요소는 첫 번째 위치로 이동된다.
 * ex) 
 * ----------------------------
 * A = [3, 8, 9, 7, 6]
 * K = 3
 * 반환되는 배열 [9, 7, 6, 3, 8]
 * ----------------------------
 * A = [0, 0, 0]
 * K = 1
 * 반환되는 배열 [0, 0, 0]
 * ----------------------------
 * A = [1, 2, 3, 4]
 * K = 4
 * 반환되는 배열 [1, 2, 3, 4]
 */

package Basic;

import java.util.Arrays;

public class Lesson2
{
	public static void main(String[] args) {
		int[] a = {3, 8, 9, 7, 6};
		
		int k = 3;
		
		int[] answer = solution(a, k);

		System.out.println(Arrays.toString(answer));
	}
	
	public static int[] solution(int[] A, int K) {
		int[] answer = new int[A.length];
		
		for (int i = 0; i < answer.length; i++)
			answer[(i+K) % A.length] = A[i];
		
		return answer;
	}
}
