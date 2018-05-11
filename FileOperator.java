/**
 * Write a description of class FileOperator here.
 *
 * @author (Yuanjin Huang)
 * @version (20.10.2017)
 */
import java.io.*;
import java.util.ArrayList;

public class FileOperator
{   
    private String filePath;

    /**
     * Constructor for objects of class FileOperator
     */
    public FileOperator(String newFilePath)
    {     
        filePath = newFilePath;
    }

    /**
     * This method will open specified file and get its information from file
     *  
     * @return     ArrayList<String> content of file.
     */    
    public static ArrayList<String> readFile()
    {   
        ArrayList<String> finalResult = new ArrayList<String>();
        File fileName = new File("jobList.txt");
        
        if (!fileName.exists() || !fileName.isFile())
        {
            System.out.println("The file is not exit or this is not a file.");
            return finalResult;
        }
        
        try
        {
            FileInputStream inputStream = new FileInputStream(fileName);
            //open a inputStream
            InputStreamReader readerFromStream = new InputStreamReader(inputStream);
            //read content from inputStream
            BufferedReader fileReader = new BufferedReader(readerFromStream);
            //read content from reader

            String eachLine = fileReader.readLine();
            
            while(eachLine != null)
            {    
                finalResult.add(eachLine);
                eachLine = fileReader.readLine();
            }
            
            fileReader.close();
        }
        catch(Exception e)
        {
            System.err.println("Error:" + e);
        }
        
        return finalResult;
    }
    
    
    /**
     * This method will put data into specified file
     * 
     * @param   ArrayList<String> newList a new carList
     * @return     boolean finnally save or not
     */
    public static boolean writeInFile(ArrayList<String> newList)
    {
        try
        {
            File file = new File("jobList.txt");
            
            if( !file.exists() )
                file.createNewFile();
            
            FileOutputStream outputSream = new FileOutputStream(file);
            OutputStreamWriter writerInOutStream = new OutputStreamWriter(outputSream);
            BufferedWriter fileWriter =  new BufferedWriter(writerInOutStream);
            
            for(String eachList : newList)
            {
                fileWriter.write(eachList);
                fileWriter.newLine();
            }
            
            fileWriter.close();
        }
        catch(Exception e)
        {
            System.out.println("fiel don't save");
            return false;
        }
        
        System.out.println("fiel saved");
        return true;
    }
}
