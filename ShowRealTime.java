public class ShowRealTime{
	public static void main(String[] args){
		long totalSeconds = System.currentTimeMillis();

		long totalRSeconds = totalSeconds / 1000;

		long realSeconds = totalRSeconds / 60;
		long realDSeconds = realSeconds % 60;
		long realMins = totalSeconds / 60;
		long realRMins = realMins % 60;
		long realHours = realMins / 60;
		long realRHours = realHours % 24;

		System.out.print("CurrentTime is" + realRHours + " Hours " + realRMins + "Minutes" + realDSeconds + "seconds"); 


	}
}