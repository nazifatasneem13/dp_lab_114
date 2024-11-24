public class CurrentTime implements IWidget{
    Mediator mediator;
    int id;
    public CurrentTime(Mediator mediator, int id)
    {
        this.mediator=mediator;
        this.id=id;
    }

    @Override
    public void update() {
        System.out.println("Currenttime, id:" + this.id + "  been updated");
        mediator.notify(this);
    }
}
