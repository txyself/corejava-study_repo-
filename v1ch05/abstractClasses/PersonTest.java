package abstractClasses;

public class PersonTest
{
    public static void main(String[] args)
    {
        var people = new Person[2];

        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Mari Morris", "computer science");

        for(Person p : people){
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}