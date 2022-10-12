package sanggeunAlarm;

import java.util.Scanner;

public class SanggeunAlarm2 {
	public static void main(String[] args) {
		// 상근이가 알람시간을 설정하면
		// 75분 앞선시간으로 알람시간이 출력된다.
		// h : 0~23 m : 0~59
		// am/pm :  h 1~12, m 0~59
		// 입력 : 23 55     , 13 05  
		// 출력 : 10 40(pm) , 11 50(am) 
				
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
		alarmHour = (totalTime - 75) / 60; // 60으로 나눈몫 : 시간
		alarmMinute = (totalTime - 75) % 60; // 60으로 나눈나머지 : 분

		if ( alarmHour > 12) {
			alarmHour -= 12;
			System.out.print("실제알람시간: " + "PM" +alarmHour + ":" + alarmMinute);
		} else {
			System.out.print("실제알람시간: " + "AM" +alarmHour + ":" + alarmMinute);
		}
	}
}


