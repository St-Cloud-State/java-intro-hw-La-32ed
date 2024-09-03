import java.util.*;

class Person
{
    String firstname;
    String lastname;
    int id;

    public Person(String firstname, String lastname, int id)
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

    public int getid()
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

    static void store(String Fname, List<Person> P)
    {
        P.add(Fname);
    }

    static void display()
    {

    }
    static void find()
    {

    }

    public static void main(String[] args)
    {
        List<Person> P = new LinkedList<Person>();


    }
}