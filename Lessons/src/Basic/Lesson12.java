/**
 * Lesson5 - Prefix Sums : CountDiv
 * 세 개의 정수 A, B, K가 주어지면 K로 나눗셈 할 수 있는 숫자의 갯수 반환 해야한다.
 * { i : A ≤ i ≤ B, i mod K = 0 }
 * ex)
 * -----------------------------------------
 * int A = 6, int B = 11, int C = 2
 * 2로 나눌 수 있는 세 개의 숫자, 6, 8, 10
 * 3을 반환
 * -----------------------------------------
 */

package Basic;

public class Lesson12
{
	public static void main(String[] args)
	{
		int A = 6;
		int B = 11;
		int K = 2;
		
		int answer = solution1(A, B, K);
		
		System.out.println(answer);
	}
	
	public static int solution1(int A, int B, int K) {
		int answer = 0;
		
		for (int i = A; i <= B; i++)
		{
			if ( i%K == 0 ) 
				answer++;
		}
		
		return answer;
	}
	
	public static int solution2(int A, int B, int K) {
		int min = 0;
		int max = 0;
		
		if ( A == B )
			return (A%K == 0 ? 1 : 0 );
		
		for (int i = A; i <= B; i++)
		{
			if ( i%K == 0 ) {
				min = i/K;
				break;
			}
		}
		
		for (int i = B; i >= A; i--)
		{
			if ( i%K == 0 ) {
				max = i/K;
				break;
			}
		}
		
		return (max-min+1);
	}
}

/**
 *  solution1 
 *  Total score, 50% 
 *  TimeOut Error 발생
 *  또...TimeOut Error...
 *  for문 하나만 쓰는데도... 
 */