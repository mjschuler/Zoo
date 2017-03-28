//Michael Schuler
public class BarnOwl extends Owl implements Fly{

    
    BarnOwl(){
        super("Owl","An owl that lives in a barn");
        toy = "mouse";
        color = "brown";
    }
    BarnOwl(String a, String b){
        super(a,b);
    }
    
    @Override
    public String interact(){
        System.out.println(super.eat());
        System.out.println(fly());
        return "The Owl flies around the barn";
    }
    //specific method for barn owl
    public String read(){
        return "The owl reads some barn literature";
    }
    public String fly(){
        return "The owl flies to the barn";
    }
}
    
    
    
    
