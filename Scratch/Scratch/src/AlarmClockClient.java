public class AlarmClockClient {
    public static void main(String[] args) {
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(7);

        AlarmClock clock2 = new AlarmClock();
        clock2.snoozeInterval = 10;

        clock1.snooze();
        clock2.snooze();

       int interval = clock2.getSnoozeInterval();
       System.out.println(interval);


    }
}


