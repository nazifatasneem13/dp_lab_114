public class Timezone implements IWidget{
    Mediator mediator;
    int id;
    public Timezone(Mediator mediator, int id)
    {
        this.mediator=mediator;
        this.id=id;
    }

    @Override
    public void update() {
        System.out.println("Timezone, id:" + this.id + " been updated");
        mediator.notify(this);
    }
}
