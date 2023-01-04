import java.util.*;
class fact{
public static void main(String[] rs){
Scanner sc=new Scanner(System.in);
System.out.println("enter Number To find Factorial");
int n=sc.nextInt();
int f=1;
for(int i=1;i<=n;i++){
f=f*i;
}
System.out.println("Factorial is..."+f);
}
}