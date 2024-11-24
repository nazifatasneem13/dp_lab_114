public class PrayerTimesTable implements IWidget{
    Mediator mediator;
    int id;
    public PrayerTimesTable(Mediator mediator, int id)
    {
        this.mediator=mediator;
        this.id=id;
    }

    @Override
    public void update() {
        System.out.println("Prayertimetables, id:" + this.id + " been updated");
        mediator.notify(this);
    }
}
