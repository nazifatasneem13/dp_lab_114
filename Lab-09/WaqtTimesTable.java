public class WaqtTimesTable implements IWidget{
    Mediator mediator;
    int id;
    public WaqtTimesTable(Mediator mediator, int id)
    {
        this.mediator=mediator;
        this.id=id;
    }

    @Override
    public void update() {
        System.out.println("Waqttimestable, id:" + this.id + " been updated");
        mediator.notify(this);
    }
}
