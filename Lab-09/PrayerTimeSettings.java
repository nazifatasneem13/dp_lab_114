public class PrayerTimeSettings implements IWidget{
    Mediator mediator;
    int id;
    public PrayerTimeSettings(Mediator mediator, int id)
    {
        this.mediator=mediator;
        this.id=id;
    }

    @Override
    public void update() {
        System.out.println("Prayertimesetting, id:" + this.id + " been updated");
        mediator.notify(this);
    }
}
