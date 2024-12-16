public class Interface {
    public static void main(String[] args){
        Queen q=new Queen();
        q.move();
    }
}
interface player{
    void x();
}
interface Chess{
    void  move();
}
class Queen implements Chess{
    public void move(){
        System.out.println("up, dowm, left,right, daigonal(in all direction)");
    }
}
class Rook implements Chess{
    public void move(){
        System.out.println("some thing something");
    }
}
