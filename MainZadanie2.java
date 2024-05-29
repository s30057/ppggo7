//Zadanie 2
interface Moveable {
    void start();
   void stop();
}
abstract class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
    public abstract String getType();
    public String getName() {
        return name;
    }
}
class Cat extends Animal implements Moveable {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void start() {
        System.out.println("Cat starts!");
    }
    @Override
    public void stop() {
        System.out.println("Cat stopped!");
    }
    @Override
    public String getType() {
        return "Cat";
    }
}
public class MainZadanie2 {
    public static void main(String[] args) {
        Cat mruczek = new Cat("Mruczek");
        mruczek.start();
        System.out.println(mruczek.getType());
        mruczek.stop();
    }
}