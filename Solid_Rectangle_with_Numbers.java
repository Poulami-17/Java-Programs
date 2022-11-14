import java.util.*;
public class Solid_Rectangle_with_Numbers {
    public static void PrintPattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                System.out.print(i+" ");
            System.out.println();
        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Here, row number is same as column numnber
        sc.close();
        PrintPattern(n);
    }
}
