/**
 * Lesson1 - Iterations : Binary gap
 * 입력 받은 정수 N에 대하여 이진 간격 구하기
 * 양의 정수 N이 입력되면 가장 긴 이진 간격의 길이를 반환한다.
 * N에 이진 간격이 없으면 0을 반환해야 한다.
 * ex) 
 * ----------------------------
 * 숫자 9 입력시 
 * 이진 표현 1001 반환되는 값 2
 * ----------------------------
 * 숫자 529 입력시 
 * 이진 표현 1000010001 반환되는 값 4
 * ----------------------------
 * 숫자 15 입력시
 * 이진 표현 1111 반환되는 값 0
 * ----------------------------
 * 숫자 32 입력시
 * 이진 표현 100000 반환되는 값 0
 */

package Basic;

import java.util.Scanner;

public class Lesson1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int answer = solution(sc.nextInt());
		
		System.out.println(answer);
	}
	
	public static int solution(int N) {
		int answer = 0;
		
		String binaryString = Integer.toBinaryString(N);
		String[] arr = binaryString.substring(binaryString.indexOf("1"), binaryString.lastIndexOf("1")).split("1");
		
		for (String arrStr : arr) {
			if ( arrStr.length() > answer ) answer = arrStr.length(); 
		}
		
		return answer;
	}
}


/**
 * java.lang 패키지에 있는 Integer 클래스는 10 진수 값을 2진수로 바꾸고 
 * 2진수를 10진수로 바꿔주는 함수를 지원한다.
 * 
 * 10진수 -> 2진수
 * String : Integer.toBinaryString(int i)
 * Integer.toBinaryString(5); // 101
 * 
 * 2진수 -> 10진수 
 * int : Integer.parseInt(String s, int radix)
 * Integer.parseInt("1010", 2); // 10
 */