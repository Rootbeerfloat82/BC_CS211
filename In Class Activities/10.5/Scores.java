import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Scores {
    
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("score.txt");
        Scanner input = new Scanner(file);
        ArrayList<Students> studentsA = new ArrayList<Students>();

        while (input.hasNextLine()) {
            String name = input.next();
            int score = input.nextInt();
            Students student = new Students(name,score);
            studentsA.add(student);
        }

        System.out.println("Students: " + studentsA.toString());
        input.close();

        Scanner console = new Scanner(System.in);
        
        System.out.print("Desired Score: ");

        while (!console.hasNextInt()) {
            System.out.println("Input is not a number.");
            System.out.print("Desired Score: ");
            console.next();
        }

        int dScore = console.nextInt();
        
        for (int i = 0; i < studentsA.size(); i++) {
            if ((studentsA.get(i)).getScore() >= dScore) {
                System.out.println((studentsA.get(i)).getName() + " " + (studentsA.get(i)).getScore());
            }
        }

        console.close();

    }
}
