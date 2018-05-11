
/**
 * Write a description of class Job here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Job
{
    // instance variables - replace the example below with your own
    private int x;
    String recruiterName;
    int no;
    String jobTitle;
    String companyName;
    String annualSalary;
    String skill1;
    String skill2;
    String skill3;

    /**
     * Constructor for objects of class Job
     */
    public Job(String recruiterName,int no,String jobTitle,String companyName,String annualSalary,String skill1,String skill2,String skill3)
    {
        // initialise instance variables
        this.recruiterName = recruiterName;
        this.no = no;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.annualSalary = annualSalary;
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = skill3;
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
    
    public String gerRecruiterName()
    {
        return recruiterName;
    }
        
    public String getJobTitle()
    {
        return jobTitle;
    }
        
    public String getCompanyName()
    {
        return companyName;
    }
        
    public String getAnnualSalary()
    {
        return annualSalary;
    }
        
    public String getSkill1()
    {
        return skill1;
    }
          
    public String getSkill2()
    {
        return skill2;
    }
    public String getSkill3()
    {
        return skill3;
    }
         
    
}
