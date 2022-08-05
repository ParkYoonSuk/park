package practice;

import java.util.Scanner;


public class Car2 {
	
	public static void main(String[] args) {
	
		
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		
		long start = System.currentTimeMillis();
		
		
		System.out.println("1. 화면에 몇 단인지 입력하시오.(1, 2, 3, 4, 5, 6, 7.후진)");
		System.out.println("   현재속도");
		System.out.println("2. 타이어 교체 (1.미쉐린, 2.금호, 3.한국타이어, 4.컨티넨탈)");
		System.out.println("3. 와이퍼선택 (1. 와이퍼켜기, 2. 와이퍼끄기)");
		System.out.println("4. 깜박이선택 (1.왼쪽, 2.오른쪽, 3.비상깜빡이, 4.끄기)");
		System.out.println("5. 자동차의 상태");
		System.out.println("6. 급브레이크(기어상태, 현재속도 리셋)");
		System.out.println("7. 종료");
		
		
		
		System.out.println("번호를 선택해주세요");
		
		
		
		String name;
		int n = scanner.nextInt();
		
		int speed = 0;
	
		int gear = scanner.nextInt();
	
	
		if(n == 1) {	
			Scanner scanner1 = new Scanner(System.in);
			
		switch(gear) {
		case 1: 
			System.out.println("1단 ");
			gear = 1; 
			speed = 10;
			break;
		case 2:
			System.out.println("2단");
			gear = 2;
			speed = 20;
			break;
		case 3:
			System.out.println("3단");
			gear = 3;
			speed = 30;
			break;
		case 4:
			System.out.println("4단");
			gear = 4;
			speed = 40;
			break;
		case 5:
			System.out.println("5단");
			gear = 5;
			speed = 50;
			break;
		case 6:
			System.out.println("6단");
			gear =6;
			speed = 100;
			break;
		case 7:
			System.out.println("R단");
			gear = 7;
			break;
		default :
			System.out.println("다시 선택해주세요");
			break;
		}	
		
		if(gear == 1) {
			System.out.println("현재속도는 " + speed + "km입니다.");
			
		} else if(gear == 2) {
			System.out.println("현재속도는" +speed + "km입니다.");
			
		}
		else if(gear == 3) {
			System.out.println("현재속도는" +speed + "km입니다.");
		}	
		else if(gear == 4) {
			System.out.println("현재속도는" +speed + "km입니다.");
		}	
		else if(gear == 5) {
			System.out.println("현재속도는" +speed + "km입니다.");
		}	
		else if(gear == 6) {
			System.out.println("현재속도는" +speed + "km입니다.");
			
			
		}	
		
		}
		else if (n == 2) {
		System.out.println("2. 타이어 교체 (1.미쉐린, 2.금호, 3.한국타이어, 4.컨티넨탈)");
	
	
		Scanner scanner1 = new Scanner(System.in);
		int tire = scanner.nextInt();
		switch(tire) {
		
		case 1: 
			
			System.out.println("미쉐린");
			break;
		case 2: 
			System.out.println("금호");
			break;
		case 3:
			System.out.println("한국타이어");
			break;
		case 4:
			System.out.println("컨티넨탈");
		default :
			System.out.println("다시 선택해주세요");
			break;
			
			}
		
		}
		
		else if(n == 3) {
		System.out.println("3. 와이퍼선택 (1. 와이퍼켜기, 2. 와이퍼끄기)");
		Scanner scanner3 = new Scanner(System.in);
		int wifer =  scanner.nextInt();
		
		switch(wifer) {
		
		
		case 1:
			System.out.println("와이퍼가 켜졌습니다.");
			break;
		case 2:
			System.out.println("와이퍼가 꺼졌습니다.");
			break;
		default : 
			System.out.println("다시 선택해주세요");
			break;
		
		}
		}
		
		else if(n == 4) {
		System.out.println("4. 깜빡이선택 (1. 왼쪽, 2. 오른쪽, 3.비상깜빡이, 4.끄기)");
		Scanner scanner4 = new Scanner(System.in);
		int light = scanner.nextInt();
		switch(light) {
		case 1:
			System.out.println("1.왼쪽");
			break;
		case 2:
			System.out.println("2.오른쪽");
			break;
		case 3:
			System.out.println("3.비상깜빡이");
			break;
		case 4:
			System.out.println("4.끄기");
			break;
		default :
			System.out.println("다시 선택해주세요");
			break;
		}	
			
		}
	
		
		System.out.println("현재 자동차 상태입니다.");
		System.out.println("기어단수는" + gear + "단입니다.");
		System.out.println("현재속도는" +speed + "km입니다." );
		
		
	
		
		long stop = System.currentTimeMillis();
		
		System.out.println("운행시간 :" + (stop - start) + "입니다.");
		System.out.println("안녕히계세요");
		}
		}
	

	
/*
 메뉴를 전부 만들지 못했고
 순환을 돌리지 못했다.
 배운 오버라이드 클래스등을 사용하지 못했다.
 */

	



