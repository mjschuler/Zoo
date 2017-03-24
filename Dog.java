public class Dog extends Animal implements Walk{
    public String toy;
    Dog(){
        super("Dog","A dog");
        toy = "bone";
    }
    Dog(String a, String b){
        super(a,b);
    }
    public String interact(){
        return "Dog bites " + toy;
    }
    public String makeNoise(){
        return "Woof, Woof";
    }
    public String eat(){
        return "Yummy Woof";
    }
    // The walk method
    public String walk(){
        return "To dog is walking in circles";
    }
}