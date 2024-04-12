package JavaAssignment3;

import java.util.*;

public class Time {
	int hr, min, sec;

	public Time(int hr, int min, int sec) {
		if (isValid(hr, min, sec) == true) {
			this.hr = hr;
			this.min = min;
			this.sec = sec;
			System.out.println("Time is:+hr+min+sec");
		} else {
			System.out.println("Invalid values for time,setting for default values 00:00:00");

		}
	}

	public Time() {
		hr = 0;
		min = 0;
		sec = 0;

	}

	public boolean isValid(int hr, int min, int sec) {
		return (hr >= 0 && hr < 24) && (min >= 0 && min < 60) && (sec >= 0 && sec < 60);
	}

	public void display() {
		System.out.println(hr + ":" + min + ":" + sec);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hr,min and sec: ");
		int hr = sc.nextInt();
		int min = sc.nextInt();
		int sec = sc.nextInt();
		Time time = new Time(hr, min, sec);
		time.display();

	}

}
