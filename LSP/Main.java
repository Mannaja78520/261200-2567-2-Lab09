package LSP;

public class Main {
    public static void main(String[] args){
        Penguin penguin = new Penguin();
        penguin.move();
        
        Ostrich ostrich = new Ostrich();
        ostrich.move();

        Sparrow juad = new Sparrow();
        juad.fly();
        juad.move();
        
        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.move();

    }
}
