package Java.Loops;

import java.util.*;

public class BasicLoop {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        for(int i=1;  i<10; i++){
           int  Total = sum + i;
            System.out.println(Total);
        }
    }

}
