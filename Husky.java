public class Husky extends Dog implements Walk{
    
    Husky(){
        super("Dog","A snow dog");
        toy = "sled";
    }
    Husky(String a, String b){
        super(a,b);
    }
    
    @Override
    public String interact(){
        System.out.println(super.eat());
        System.out.println(walk());
        return "The husky sniffs you";
    }
    //Method for only Huskies
    public String raceDog(){
        return "The dog wins the race";
    }
    //overriden method
    public String walk(){
        return "the Husky walks around in the snow";
    }
}