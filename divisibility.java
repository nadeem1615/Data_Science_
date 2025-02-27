import java.util.*;
class divisibility{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0){
            System.out.println("The number is divisible by 3");
        }
        else{
            System.out.println("The number is not divisible by 3");
        }
        if(n%5==0){
            System.out.println("The number is divisible by 5");
        }
        else{
            System.out.println("The number is not divisible by 5 ");
        // }
        if(n%3==0&&n%5==0){
            System.out.println("The number is divisible by 3 and 5");
        }
        else{
            System.out.println("The number is not divisible by 3 and 5");
        }
    }
}}