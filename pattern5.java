import java.util.*;
class pattern5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        
        for(int i=rows; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}