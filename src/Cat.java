public class Cat extends Animal{

    private int limitForRun = 200;

    private int limitForSwim = 0;

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if(distance <= limitForRun){
            System.out.println(getName() + " пробежал " + distance + " м.");
        }else {
            System.out.println("кот не умеет так далеко бегать");
        }

    }

    @Override
    public void swim(int distance) {
        if(distance > limitForSwim){
            System.out.println(getName() + " плавать не умеет.");
        }else {
            System.out.println("расстояние для плавания указано не корректно");
        }
    }
}
