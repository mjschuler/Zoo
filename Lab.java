public class Lab extends Dog implements Walk{
     Lab(){
        super("Dog","A dog that likes butts");
        toy = "stick";
    }
    Lab(String a, String b){
        super(a,b);
    }
    
    @Override
    public String interact(){
        System.out.println(super.eat());
        System.out.println(walk());
        return "The lab sniffs your butt";
    }
    //Method for only labs
    public String playFetch(){
        return "The dog returns your stick";
    }
    public String sniffDog(){
        return "The dog sniffs another dog";
    }
    public String walk(){
        return "The lab walks in the field";
    }
    
    
}