package day5;

public class Ex503 {
	public static void main(String[] args) {
		int n = 0x40fd70a4;  // 7.92
		int n2 = 1090351268;  // 0x40fd70a4dė 10ė§ė ę°
		float f = Float.intBitsToFloat(n);
		float f2 = Float.intBitsToFloat(n2);
		System.out.println(f + ", " + f2);
		
		
	}
}
