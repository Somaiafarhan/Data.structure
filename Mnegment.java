import java.util.Scanner;

/**
 * Created by students on 13/01/22.
 */
public class Mnegment {
    public static void main(String[] args) {
        Student []team=new Student[3];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i <team.length ; i++) {
            int id=in.nextInt();
            String name=in.next();
            Student s=new Student(id,name);
            team[i]=s;

        }
        for (int i = 0; i <team.length ; i++) {
            System.out.println(team[i].toString());

        }
    }
}
