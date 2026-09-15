public class Time {
	
	public static void main (String[] args) {
		double hour = 14.0;
		double minute = 40.0;
		double second = 12.0;
		int hour2 = 22;
		int minute2 = 18;
		int second2 = 10;
		
	System.out.println("Seconds since midnight: " + (hour*3600 + minute*60 + second));
	System.out.println("Number of seconds remaining in the day: " + ((24-hour-1)*3600 + (60-minute-1)*60 + (60-second)));
	System.out.println(("Percentage of the day that has passed: " + ((hour*3600+minute*60+second)/86400)*100) + "%");
	System.out.println("Time elapsed working on this exercise: " + (((hour2-hour)*3600)+((minute2-minute)*60)+second2-second) + " seconds.");
	}
}
