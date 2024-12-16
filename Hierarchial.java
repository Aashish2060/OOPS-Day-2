public class Hierarchial {

    public static void main(String[] args) {
        Mammals dog = new Mammals();
        dog.eat();
        dog.legs= 4;
        Fishes Whale = new Fishes();
        Whale.swim();

    }
}
class AnimaL {
    String color;
    void eat(){
        System.out.println("Eat");
    }
    void  breathe(){
        System.out.println("Breathe");
    }
}
class Mammals extends AnimaL{
    int  legs;
    String feed;
    void feed(){
        System.out.println("Feed milk");
    }
}
class Fishes extends AnimaL{
    int fins;
    void swim(){
        System.out.println("Swims in water..");
    }
}
