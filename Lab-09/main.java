import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Mediator mediator = new Mediator();
        IWidget currentTime=new CurrentTime(mediator, 1);
        IWidget currentWaqt =new CurrentWaqt(mediator, 2);
        IWidget location =new Location(mediator, 3);
        IWidget nextPrayer =new NextPrayer(mediator, 4);
        IWidget prayerTimeSettings =new PrayerTimeSettings(mediator, 5);
        IWidget prayerTimeTable =new PrayerTimesTable(mediator, 6);
        IWidget timeZone =new Timezone(mediator, 7);
        IWidget waqtTime =new WaqtTimesTable(mediator, 8);

        mediator.set(currentTime, currentWaqt, location, nextPrayer, prayerTimeSettings, prayerTimeTable, timeZone, waqtTime);

        System.out.println("timeZone");


        mediator.notify(timeZone);
        System.in.read();

        System.out.println("currentTime");
        mediator.notify(currentTime);
        System.in.read();

        System.in.read();
        System.out.println("location");
        mediator.notify(location);
        System.in.read();

        System.out.println("prayerTimeSettings");

        mediator.notify(prayerTimeSettings);

        System.in.read();
        System.out.println("prayerTimeTable");
        mediator.notify(prayerTimeTable);

        System.in.read();
        System.out.println("waqtTime");
        mediator.notify(waqtTime);

        System.in.read();

    }
}

