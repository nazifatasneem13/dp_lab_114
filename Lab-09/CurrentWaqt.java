public class CurrentWaqt implements IWidget{
    Mediator mediator;
    int id;
    public CurrentWaqt(Mediator mediator, int id)
    {
        this.mediator=mediator;
        this.id=id;
    }

    @Override
    public void update() {
        System.out.println("Currentwaqt, id:" + this.id + " been updated ");
        mediator.notify(this);
    }
}
