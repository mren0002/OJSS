import java.util.ArrayList;
/**
 * Write a description of class System here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Backend
{
    // instance variables - replace the example below with your own
    private int x;
    Recruiter recruiter = new Recruiter();
    /**
     * Constructor for objects of class System
     */
    public Backend()
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
    
    public RecruiterPages start(Recruiter recruiter)
    {
        this.recruiter = recruiter;
        String name = recruiter.getName();
        RecruiterPages recruiterPages = new RecruiterPages();
        String option = recruiterPages.homePage(name);
        if (option.equals("1"))
        {
            String editInfo = "";
            //以后改成跳转到编辑界面
        }
        else if (option.equals("2"))
        {
            String manageJob = "";
            manageJob(recruiterPages);
            //改成跳转到job管理界面
        }
      
        return recruiterPages;
        
    }
    
    public void manageJob(RecruiterPages recruiterPages)
    {
        String option = recruiterPages.manageJobPage();  
        if (option.equals("1"))
        {
            String createJob = "";
            //以后改成跳转到创建界面
        }
        else if (option.equals("2"))
        {
            String manageExistingJob = "";
            // 跳转到job编辑界面 显示加载的文件
            ArrayList<String> str = FileOperator.readFile();
            String selectedJob = recruiterPages.jobListPage(recruiter,str);
        }
        
    }
    
    
    public void createJob(RecruiterPages recruiterPages)
    {
        
    }
    
    
    
}
