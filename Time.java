public class Time {
	
	public static void main (String[] args) {
		int hour = 14;
		int minute = 40;
		int second = 12;
		
	System.out.println("Seconds since midnight: " + (hour*3600 + minute*60 + second));
	System.out.println("Number of seconds remaining in the day: " + ((24-hour-1)*3600 + (60-minute-1)*60 + (60-second)));
	System.out.println("Percentage of the day that has passed: ");
	}
}
