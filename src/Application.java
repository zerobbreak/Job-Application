
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Application {

    public static void main(String[] args)
    {
        try (Scanner employee = new Scanner(System.in)) {

            System.out.print("What is your name: ");
            String name = employee.nextLine();//user inputs data for the system.out.print statement
            System.out.print("What is your surname: ");
            String surname = employee.nextLine();

            System.out.print("What is your position: " +
                    "         \n- CEH \n- Bug Bounty \n- Forensics \n> ");
            String position = employee.nextLine();

            Job j = new Job(name, surname, position);
            System.out.println(j);
        }catch(Exception e){
            System.out.println(e);
    }

    }
}
