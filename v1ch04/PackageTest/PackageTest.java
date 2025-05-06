import com.horstmann.corejava.*;

import static java.lang.System.*;

/**
 * A {@code packageTest} object represents 
 * a test on package
 */
public class packageTest
{
    public static void main(String[] args)
    {   
        var harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

        harry.raiseSalary(5);

        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
        out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
    }
}