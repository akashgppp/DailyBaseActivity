import java.util.*;
class rev{
public static void main(String[] rgs){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Numbers:");
int n = sc.nextInt();
int ans=0;
while(n>0){
ans=ans*10+n%10;
n=n/10;
}
System.out.println("reverse  digit is:--"+ans);
}
}