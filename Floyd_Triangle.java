import java.util.*;
public class Floyd_Triangle{
    public static void PrintPattern(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
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