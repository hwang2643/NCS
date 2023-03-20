package test01;

public class JavaPractice_5Chap {
	public static void main(String[] args) {
		// 5-3
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			sum = sum + arr[i];
//		}
//		System.out.println("sum="+sum);
		
		// 5-4
//		int[][] arr = {
//				{ 5, 5, 5, 5, 5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//				};
//		int total = 0;
//		float average = 0;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				total += arr[i][j];
//				}
//			}
//		average = (float)total/(arr.length*arr[0].length);
//		System.out.println("total="+total);
//		System.out.println("average="+average);
		
		// 5-5
//		int[] ballArr = {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		for(int i=0; i<ballArr.length; i++) {
//			int j = (int)(Math.random() * ballArr.length);
//			int tmp = 0;
//			tmp = ballArr[i];
//			ballArr[i] = ballArr[j];
//			ballArr[j] = tmp;
//		}
//		for(int i=0;i<ball3.length;i++) {
//			ball3[i] = ballArr[i];
//			System.out.print(ball3[i] + " ");
//		}
		
		// 5-6
		// . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		System.out.println("money="+money);
//		for(int i=0;i<coinUnit.length;i++) {
//			System.out.print(coinUnit[i] + "원 : " + (money/coinUnit[i]) + "\n");
//			money%=coinUnit[i];
//		}
		
		// 5-7
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
			}
			// . . 문자열을 숫자로 변환한다 입력한 값이 숫자가 아닐 경우 예외가 발생한다
			int money = Integer.parseInt(args[0]);
			System.out.println("money="+money);
			int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
			int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
			for(int i=0;i<coinUnit.length;i++) {
				int coinNum = 0;
				/* (1) . 아래의 로직에 맞게 코드를 작성하시오
				1. 금액 (money) 을 동전단위로 나눠서 필요한 동전의 개수(coinNum) 를 구한다. 
				2.배열 coin 에서 coinNum 만큼의 동전을 뺀다
				 (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
				3.금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
				*/
				System.out.println(coinUnit[i]+"원 : "+coinNum); 
			}
			if(money > 0) {
				System.out.println(" 거스름돈이 부족합니다."); 
				System.exit(0); //프로그램을 종료한다
			}
			System.out.println("=남은 동전의 개수 ="); 
			for(int i=0;i<coinUnit.length;i++) {
				System.out.println(coinUnit[i]+"원 :"+coin[i]); 
			}


		
		
		
		
		
		
		
		
		
		
		
		
	}
}
