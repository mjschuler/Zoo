public class Owl extends Animal implements Fly{
    public String toy;
    //New Constructer
    public String color;
    Owl(){
        super("Owl","A flying creature");
        toy = "bone";
    }
    Owl(String a, String b){
        super(a,b);
    }
    public String interact(){
        return "The owl flies away" + toy;
    }
    public String makeNoise(){
        return "Hoot, Hoot";
    }
    public String eat(){
        return "Yummy Mouse";
    }
    
    public String fly(){
        return "To owl flies to the moon and back";
    }
}