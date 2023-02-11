package HW_1;
import java.util.Scanner;

public class HW_J_1 {

   
    public static int triangle(int n) {
        if(n==1)
            return 1;
        else
            return( n + triangle(n-1) );
    }

}

