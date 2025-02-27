import java.util.*;
class dig{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int r=d%9;
        int sum=0;
        sum+=r;
        System.out.println(sum);
    }
}