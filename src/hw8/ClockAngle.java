package hw8;

public class ClockAngle {

	public static double calcAngle(int hours, int minutes) {
		if (hours >= 12)
			hours -= 12;
		double minutePos = minutes * 6; // 1 minute -> x*
										// 60 minutes -> 360*
										// => x* = 1*360/60 = 1*6 (degrees per 1 minute)
										// 1 hour -> x*
										// 12 hours -> 360*
										// x* = 1*360/12 = 1*30* (degrees per one full hour)
										// time = hour+minutes
		double hourPos = (hours + ((double)minutes / 60)) * 30;
		double angle = Math.abs(hourPos - minutePos);
		if (angle >= 360)
			angle -= 360;

		return angle;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Angle for 15:15 is " + calcAngle(15, 15) + "°.");
	}

}
