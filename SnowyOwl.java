//Michael Schuler
public class SnowyOwl extends Owl implements Fly{
    
    SnowyOwl(){
        super("Owl","An owl that lives in the snow");
        toy = "mouse";
    }
    SnowyOwl(String a, String b){
        super(a,b);
    }
    
    @Override
    public String interact(){
        System.out.println(super.eat());
        System.out.println(fly());
        return "The Owl flies around the snowy landscape";
    }
    //A method for only SnowyOwls
      public String buildSnowman(){
        return "The owl makes a big snowman";
    }
    public String fly(){
        return "The owl flies to the top of the snowy mountain";
    }
}
    
    
    
    
