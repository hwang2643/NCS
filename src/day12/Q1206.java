package day12;

import java.util.Random;

/*
 * Q1206. (고급) 크기가 100,000인 배열을 생성하고 int의 표현범위 내의 값을 100,000개 난수 발생하여 이 배열을 채운 후 이 배열의 홀수와 짝수의 개수를 파악하여, 
 * ①홀수가 몇 개이고 이게 전체 중 몇 퍼센트에 해당하는지 ②짝수는 몇 개이고 이게 전체 중 몇 퍼센트에 해당하는지를 출력해보세요.
 */
public class Q1206 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[10000];
		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt();
		}
		int even = 0;
		int odd = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		double evenP = (double)((int)(((double)even/arr.length)*10000))/100;
		double oddP = (double)((int)(((double)odd/arr.length)*10000))/100;
		
		System.out.println("이 배열의 홀수의 개수는 " + odd + "개이고" + oddP + "%이다.");
		System.out.println("이 배열의 짝수의 개수는 " + even + "개이고" + evenP + "%이다.");
	}
}
