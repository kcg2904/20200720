import java.util.Random;

import main.TheDel;

public class MainClass {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int a = rnd.nextInt(10) + 10;
		int b = rnd.nextInt(10) + 10;
		
		int c = a + b;
		int d = a - b;
		int e = a * b;
		float f = a / b;

		TheDel td = new TheDel();
		td.menu();
		td.get();
		td.reult();
//		for (;;) {
//			Scanner scan = new Scanner(System.in);
//			
//			int input = scan.nextInt();
//			if (input == 1) {
//				Scanner scn = new Scanner(System.in);
//				System.out.print(a + "+" + b + "=");
//				int a1 = scn.nextInt();
//				if (a1 == c) {
//					System.out.println("정답입니다.");
//				}
//				else {
//					System.out.println("틀렸습니다.답은: " + (a+b));
//				}
//			} 
//			else if (input == 2) {
//				Scanner scn = new Scanner(System.in);
//				System.out.print(a + "-" + b + "=");
//				int a1 = scn.nextInt();
//				if (a1 == d) {
//					System.out.println("정답입니다.");
//				}
//				else {
//					System.out.println("틀렸습니다.답은: " + (a-b));
//				}
//			} 
//			else if (input == 3) {
//				Scanner scn = new Scanner(System.in);
//				System.out.print(a + "x" + b + "=");
//				int a1 = scn.nextInt();
//				if (a1 == e) {
//					System.out.println("정답입니다.");
//				}
//				else {
//					System.out.println("틀렸습니다. 답은: " + (a*b));
//				}
//			} 
//			else if (input == 4) {
//				Scanner scn = new Scanner(System.in);
//				System.out.print(a + "/" + b + "=");
//				float a1 = scn.nextFloat();
//				if (a1 == f) {
//					System.out.println("정답입니다.");
//				}
//				else {
//					System.out.println("틀렸습니다.답은: " + (a/b));
//				}
//			}
//			else if (input == 0) {
//				System.out.println("종료");
//				break;
//			}
//		}
//		
////		System.out.println("예외 처리");
////		for (;;) {
////			try {
////			int [] arr = new int [2];
////			arr[2] = 1;
//
////				Scanner sc = new Scanner(System.in);
////				System.out.print("숫자만 입력 >> ");
////				int inp = sc.nextInt();
////				System.out.println("당신이 입력한 숫자: " + inp);
////				break;
////
////			} catch (Exception e) {
////			e.printStackTrace();
////				System.out.println("숫자만 입력하라고");
////			}
////		}
		
		
	}

}
