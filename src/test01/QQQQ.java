package test01;

public class QQQQ {
	public static void main(String[] args) {
		int[] arr = new int[100];
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = i+1;
		}
		System.out.print("[");
		for(int i=1; i<=100; i++) {
			int cnt = 0;
			for(int j=2; j<=100; j++) {
				if(i%j==0) {
					cnt++;
				}		
			}
			if(cnt==1) {
				System.out.print(arr[i-1]);
				if(i<97) {
					System.out.print(", ");
				}
			}
		}
		System.out.println("]");
	}
}
