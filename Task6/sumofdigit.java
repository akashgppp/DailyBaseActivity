import java.util.*;
class sumofdigit{
public static void main(String[] rgs){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Numbers:");
int n = sc.nextInt();
int sumofdigit=0;
int org_n=n;
while(n>0){
sumofdigit+=n%10;
n=n/10;
}
System.out.println("sum of digit is:--"+sumofdigit);
}
}