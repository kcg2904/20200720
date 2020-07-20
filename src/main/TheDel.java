package main;

import java.util.Random;
import java.util.Scanner;

import vo.NumVO;

public class TheDel {
	// 맴버 변수
	private Scanner sc;
	private NumVO numVO;
	
	public TheDel() {
		sc = new Scanner(System.in);
		numVO = new NumVO();
	}
	
	// 메뉴 출력
	public void menu() {
		System.out.print("1: 더하기, 2:빼기, 3:곱하기, 4:나누기 0: 종료 >> ");
		int a = sc.nextInt();
		System.out.println("당신이 선택한 번호(menu): " + a);
	}
	//문제 만들기
	public void get() {
		// 난수 생성
		Random rnd = new Random();
		numVO.setNum1(rnd.nextInt(10) + 10);
		numVO.setNum2(rnd.nextInt(10) + 10);
		//문제 출력
		System.out.print(numVO.getNum1() + " + " + numVO.getNum2() + " = ");
	}
	public void reult() {
		// 답 입력 받기
		int i = sc.nextInt();
		System.out.println("당신이 입력한 답은 : "+ i);
		// 만약에 문제의 답과 사용자의 입력값과 비교해서
		// 일치하면 정답 틀리면 오답
		int reult = numVO.getNum1()+numVO.getNum2();
		if (i == reult) {
			System.out.println("정답");
		}else {
			System.out.println("오답");
		}
		
	}
}
