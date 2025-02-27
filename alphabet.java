import java.util.*;
class alphabet{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            System.out.println("The character is a vowel");
        }
        else{
            System.out.println("The character is a constant");
        }
    }
}