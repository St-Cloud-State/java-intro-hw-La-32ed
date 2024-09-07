package HW1Q2;
import java.util.*;
import java.io.*;

class Person
{
    private String firstname;
    private String lastname;
    private String id;

    public Person(String firstname, String lastname, String id)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.id = id;
    }

    public String getFN()
    {
        return firstname;
    }

    public String getLS()
    {
        return lastname;
    }

    public String getid()
    {
        return id;
    }

    public String toString()
    {
        return "Name: " + this.firstname + " " + this.lastname + " "+ "Id: " + this.id; 
    }
}

public class Mymain
{

    static void store(InputStream IS, LinkedList<Person> P)
    {
        Scanner sc = new Scanner(IS);
        while(sc.hasNextLine()) 
        {
            String data = sc.nextLine();
            String[] words = data.split(" ");
            String FN = words[0];
            String LN = words[1];
            String IDS = words[2];
            Person P1 = new Person(FN,LN,IDS);
            P.add(P1);
        }
        sc.close();
    }

    static void display(OutputStream OS, LinkedList<Person> P)
    {
        PrintStream prints = new PrintStream(OS);
        for(Person person : P)
        {
            prints.println(person);
        }
    }

    static int find(String SID, LinkedList<Person> P)
    {
        for (int i =0;i < P.size(); i++)
        {
            if(P.get(i).getid().equals(SID))
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws Exception
    {
        LinkedList<Person> P = new LinkedList<>();
        InputStream file1 = new FileInputStream("test.txt");
        store(file1,P);
        display(System.out, P);
        String IDS = "3";
        int indexfound = find(IDS,P);
        System.out.println(indexfound);

    }
}