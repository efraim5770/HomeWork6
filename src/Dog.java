public class Dog extends Animal{
    private int limitForRun = 500;

    private int limitForSwim = 10;

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        if(distance <= limitForRun){
            System.out.println(getName() + " пробежал " + distance + " м.");
        }else {
            System.out.println("собака не умеет так далеко бегать");
        }

    }

    @Override
    public void swim(int distance) {
        if(distance <= limitForSwim){
            System.out.println(getName() + " проплыл " + distance + " м.");
        }else {
            System.out.println("собака не умеет так далеко плавать");
        }
    }
}
