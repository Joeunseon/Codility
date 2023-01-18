/**
 * Lesson4 - Counting Elements : FrogRiverOne
 * 작은 개구리 한 마리가 강 반대편으로 가고 싶어한다. 
 * 개구리는 처음에 강의 한 둑(위치 0)에 위치하고 있으며 반대쪽 둑(위치 X+1)에 도달하려고 합니다.
 * 나뭇잎들이 나무에서 강 표면으로 떨어진다.
 * 
 * 낙엽을 나타내는 N개의 정수로 구성된 배열 A가 주어질 때,
 * A[K]는 시간 K에서 한 잎이 떨어지는 위치를 나타내며, 초 단위로 측정된다.
 * 나뭇잎이 한번 강에 떨어지면 그 위치가 바뀌지 않는다고 가정한다.
 * 
 * 개구리는 1부터 X까지 강 건너 모든 위치에 잎이 나타나야 건널 수 있다고 할 때 가장 빠른 시간을 구하여라.
 * 만약 개구리가 강 반대편으로 절대로 점프할 수 없다면, 함수는 -1을 반환해야 한다.
 */

package Basic;

import java.util.Arrays;
import java.util.HashSet;

public class Lesson7
{
	public static void main(String[] args) {
		int X = 5;
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
		
		int answer = solution1(X, A);
		
		System.out.println(answer);
	}
	
	public static int solution1(int X, int[] A) {
		
		// 배열에 해당 수가 존재하는지 확인
		if ( !Arrays.stream(A).anyMatch(i -> i == X) ) 
			return -1;
		
		// 1 ~ X 가 있는지 확인하기 위한 배열 생성 
		int[] B = new int[X];
		
		for (int i = 0; i < A.length; i++) {
            if ( A[i] <= X ) {
            	B[A[i]-1] = 1;
            	
            	if ( !Arrays.stream(B).anyMatch(j -> j == 0 ) ) return i;
            }
        }
		
		return -1;
	}
	
	public static int solution2(int X, int[] A) {
		
		// 배열에 해당 수가 존재하는지 확인
		if ( !Arrays.stream(A).anyMatch(i -> i == X) ) 
			return -1;
				
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for (int i = 0; i < A.length; i++)
		{
			if ( A[i] <= X ) {
				hash.add(A[i]);
				
				if ( hash.size() == X ) 
					return i;
			}
		}
		
		return -1;
	}
}

/**
 * solution1  
 * Total score, 54% 
 * TimeOut Error 발생
 * for문 하나만 써서 TimeOut Error 가 안나지 않을까..라고 생각했었는데...
 * 또 TimeOut Error 발생...
 * 
 * Stream API는 특정 조건을 만족하는 요소들을 얻을 수 있도록 메소드를 제공한다.
 * allMatch() 모든 요소들이 매개값으로 주어진 조건을 만족하는지 확인
 * anyMatch() 최소한 한 개의 요소가 주어진 조건에 만족하는지 확인
 * noneMatch() 모든 요소들이 주어진 조건을 만족하지 않는지 확인
 */
