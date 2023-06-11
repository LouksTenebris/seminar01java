import java.util.Scanner;
 
public class task02 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int s = 0;
        
        while (true) {
            int x = sc.nextInt();
            if (x != 0) s += x;
            else break;
        }
        
        System.out.println(s);
        
        sc.close();
    }
    
}