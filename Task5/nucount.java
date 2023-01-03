import java.util.*;
class count{
public static void main(String[] rgs){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Value");
int num= sc.nextInt();
int count=0;
while(num>0){
num=num/10;
count=count+1;
}
System.out.println("number of count"+num);
}
}