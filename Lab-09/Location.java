public class Location implements IWidget {
    Mediator mediator;
    int id;
    public Location(Mediator mediator, int id)
    {
        this.mediator=mediator;
        this.id = id;
    }

    @Override
    public void update() {
        System.out.println("Location, id:" + this.id + " been updated");
        mediator.notify(this);
    }
}
