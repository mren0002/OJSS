
/**
 * Write a description of class Recruiter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Recruiter
{
    // instance variables - replace the example below with your own
    private int x;
    private String name;
    /**
     * Constructor for objects of class Recruiter
     */
        
    public Recruiter(String name)
    {
        // initialise instance variables
        this.name = name;
    }
    public Recruiter()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public String getName()
    {
        return name;
    }
    
}
