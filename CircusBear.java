
/**
 * Write a description of class CircusBear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CircusBear extends Bear
{
    public CircusBear()
    {
        super("Ursus Circusus", "This is a retired circus bear that rides its \n" +
                                "tricycle all day long.");
    }
    
    @Override
      public String interact()
      {
          System.out.println(super.eat());
          return "The bear looks at you forlornly.";
      }
    
}
