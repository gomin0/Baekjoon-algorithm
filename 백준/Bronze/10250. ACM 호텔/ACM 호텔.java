import java.util.Scanner;

public class Main{
    public static void main(String []args){
        
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        for(int i = 0; i < t; i++){
            int h = scanner.nextInt();
            int w = scanner.nextInt();
            int n = scanner.nextInt();
            
            if(n % h == 0){
                System.out.println((h * 100) + (n / h));
            }else{
                System.out.println(((n % h) * 100) + ((n / h) + 1));
            }
        }
    }
}