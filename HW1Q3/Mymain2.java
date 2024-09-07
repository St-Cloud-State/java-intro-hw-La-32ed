package HW1Q3;
import java.util.*;

import HW1Q2.Person;

import java.io.*;

class PersonList
{
    private List<Person> Student;

    public PersonList()
    {
        this.Student = new LinkedList<>();
    }

    public void store(InputStream IS)
    {
        Scanner sc = new Scanner(IS);
    
        while(sc.hasNextLine()) 
        {
            String data = sc.nextLine();
            String[] words = data.split(" ");
            String FN = words[0];
            String LN = words[1]; 
            String IDS = words[2];
            Student.add(new Person(FN, LN, IDS));
        }
        sc.close();
    }
    
    public void display(OutputStream OS)
    {
        PrintStream prints = new PrintStream(OS);
        for(Person person : Student)
        {
            prints.println(person);
        }
    }
    
    public int find(String SID)
    {
        for (int i =0;i < Student.size(); i++)
        {
            if(Student.get(i).getid().equals(SID))
            {
                return i;
            }
        }
        return -1;
    }
    
}

public class Mymain2 
{
    public static void main(String[] args) throws Exception
    {
        PersonList P = new PersonList(); 
        InputStream file1 = new FileInputStream("test.txt");
        P.store(file1);
        P.display(System.out);
        String IDS = "3";
        int indexfound = P.find(IDS);
        System.out.println(indexfound);

    }
}
