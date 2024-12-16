public class Inheritance {
    public static void main(String[] args){
        Fish shark= new Fish();
        shark.eat();
    }

}
class Animal{
    String color;
    String shape;
    void breathe(){
        System.out.println("breathes");
    }
    void eat(){
        System.out.println("Eats");
    }

}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water..");
    }
}