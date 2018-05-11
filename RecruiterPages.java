/**
 * Write a description of class Interface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.*;
public class RecruiterPages
{
    // instance variables - replace the example below with your own
    private int x;
    private Scanner in;

    /**
     * Constructor for objects of class Interface
     */
    public RecruiterPages()
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
    
    public String homePage(String name)
    {
        // put your code here
        String input = "";
        System.out.println("Hello," + name + "!");
        System.out.println("Choose an option:");
        System.out.println("1.Edit personal informaion;");
        System.out.println("2.Manage Job;");
        System.out.print("input your choice (1 or 2): ");
        in = new Scanner(System.in);
        input = in.nextLine();
        System.out.println("");
        System.out.println("");        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return input;
                        
    }
     
    public String manageJobPage()
    {
        // put your code here
        String input = "";
        //System.out.println("Hello," + name + "!");
        System.out.println("Choose an option:");
        System.out.println("1.Create a new job;");
        System.out.println("2.Manage existing job;");
        System.out.print("input your choice (1 or 2): ");
        in = new Scanner(System.in);
        input = in.nextLine();
        System.out.println("");
        System.out.println("");        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        return input;
                        
    }
    
    public String jobListPage()
    {        
        int i = 0;
        String[] carDetailArray = new String[8];
        while (i < strArray.size())
        {
            Car car = new Car();
            addCar(car);
            String str = strArray.get(i);
            carDetailArray = str.split(",");
            car.setCarReg(carDetailArray[0]);
            car.setYearMade(carDetailArray[1]);
            car.setColour(carDetailArray[2],carDetailArray[3],carDetailArray[4]);
            car.setCarMake(carDetailArray[5]);
            car.setCarModel(carDetailArray[6]);
            car.setPrice(carDetailArray[7]);
            i ++;
        }        
    }    
}
