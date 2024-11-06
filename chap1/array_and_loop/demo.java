import java.util.*;

public class demo {
    public static void main(String args[]){
        int x[] = new int[5];
        Scanner sc  = new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("Enter "+ i+" input");
            x[i] = Integer.parseInt((sc.nextLine()));
        }
        for(int j:x){
            System.out.println(j);
        }
    }
}
