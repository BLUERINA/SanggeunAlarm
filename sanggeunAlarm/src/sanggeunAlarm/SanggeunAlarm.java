package sanggeunAlarm;

import java.util.Scanner;

public class SanggeunAlarm {
	public static void main(String[] args) {
		// 상근이가 알람시간을 설정하면
		// 45분 앞선시간으로 알람시간이 출력된다.
		// 입력 : 10 10 ,  0 30 , 23 40 
		// 출력 :  9 25 , 23 45 , 22 55
		// 문제에 시간범위가 정해져 있어 따로 예외처리는 하지 않았습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("설정알람시간(시,분) : " );
		int hour = sc.nextInt(); // 0~23시간기준
		int minute = sc.nextInt(); // 0~59분기준
		
		int totalTime = 0;
		int alarmHour = 0;
		int alarmMinute = 0;

		if ( hour == 0) {
			hour = 24;
		}
		totalTime = (hour*60)+minute; // 총 시간을 분으로 계산
		alarmHour = (totalTime - 45) / 60; // 60으로 나눈몫 : 시간
		alarmMinute = (totalTime - 45) % 60; // 60으로 나눈나머지 : 분
		System.out.print("실제알람시간: " + alarmHour + ":" + alarmMinute);
	}
}
