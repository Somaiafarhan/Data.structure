import java.util.Scanner;

/**
 * Created by students on 13/01/22.
 */
public class Method {public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    int array1[]=new int[5];
    enter(array1);
    print(array1);
}
    public static void  print(int x[]){
        for (int i = 0; i <5 ; i++) {
            System.out.print(x[i]+"\t");
        }
    }
    public static void enter(int y[]){
        Scanner x=new Scanner(System.in);
        for (int i = 0; i <y.length ; i++) {
            y[i]=x.nextInt();

        }
    }
}
