import java.util.Scanner;

/**
 * Created by students on 13/01/22.
 */
public class Array1 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int array1[]=new int[5];
        for (int i = 0; i <5 ; i++) {
            array1[i]=x.nextInt();
        }
        print(array1);
    }
    public static void  print(int x[]){
        for (int i = 0; i <5 ; i++) {
            System.out.print(x[i]+"\t");
        }
    }
}
