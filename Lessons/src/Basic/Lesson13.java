/**
 * Lesson5 - Prefix Sums : GenomicRangeQuery
 * DNA 서열은 서열의 연속적인 뉴클레오타이드의 유형에 해당하는 
 * 문자 A, C, G, T로 구성된 문자열로 표현될 수 있다.
 * A형, C형, G형, T형의 뉴클레오타이드는 각각 1, 2, 3, 4의 영향 인자를 갖는다.
 * 문자열 S와 시작, 끝 위치를 나타내는 숫자 배열 P, Q가 주어졌을 때,
 * DNA 서열에 포함된 뉴클레오타이드의 최소 영향 인자를 찾아야 한다
 * ex) 
 * ----------------------------------------------------------------------
 * String S = "CAGCCTA"
 * int[] P = {2, 5, 0}
 * int[] Q = {4, 5, 6}
 * 첫번째 P[0] = 2, Q[0] = 4 로 "GCC" 를 나타내며 최소 인자는 C로 2
 * 두번째 P[1] = 5, Q[1] = 5 로 "T" 를 나타내며 최소 인자는 T로 4
 * 세번째 P[2] = 0, Q[2] = 6 로 "CAGCCTA"를 나타내며 최소 인자는 A로 1
 * 즉, {2, 4, 1} 반환
 * ----------------------------------------------------------------------
 */

package Basic;

import java.util.Arrays;

public class Lesson13
{
	public static void main(String[] args)
	{
		String S = "CAGCCTA";
		int[] P = {2, 5, 0};
		int[] Q = {4, 5, 6};
		
		int[] asnwer = solution(S, P, Q);
		
		System.out.println(Arrays.toString(asnwer));
	}
	
	public static int[] solution(String S, int[] P, int[] Q) {
		int[] answer = new int[P.length];
		
		for (int i = 0; i < P.length; i++)
		{
			String str = "";
			
			if ( P[i] <= Q[i] ) {
				str = S.substring(P[i], (Q[i]+1));
			} else {
				str = S.substring(Q[i], (P[i]+1));
			}
			
			if ( str.indexOf("A") != -1 ) {
				answer[i] = 1;
			} else if ( str.indexOf("C") != -1 ) {
				answer[i] = 2;
			} else if ( str.indexOf("G") != -1 ) {
				answer[i] = 3;
			} else if ( str.indexOf("T") != -1 ) {
				answer[i] = 4;
			} else {
				answer[i] = 0;
			}
		}
		
		return answer;
	}
}

/**
 * solution1 
 * Total score, 62% 
 * TimeOut Error 발생
 * 또...TimeOut Error...
 */