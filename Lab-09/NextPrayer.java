public class NextPrayer implements IWidget{
    Mediator mediator;
    int id;
    public NextPrayer(Mediator mediator, int id)
    {
        this.mediator=mediator;
        this.id=id;
    }

    @Override
    public void update() {
        System.out.println("Nextprayer, id:" + this.id + " been updated");
        mediator.notify(this);
    }
}
