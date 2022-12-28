import java.util.Scanner;
class rever{
public static void main(String[] arg){
Scanner sc = new Scanner(System.in);
System.out.println("enter number");
int number = sc.nextInt();
//using algo
int rev=0;
while(number!=0){
number=number/10;
rev=rev*10+number%10;

}
System.out.println("reverse number="+rev);
System.out.println("enter number");
int number1 = sc.nextInt();
//using StringBffer
StringBuffer sb = new StringBuffer(String.valueOf(number1));
StringBuffer rev1=sb.reverse();
System.out.println("reverse number="+rev1);
//using string bulider
System.out.println("enter number");
int number2 = sc.nextInt();
StringBuilder sb1 = new StringBuilder();
sb1.append(number2);
sb1.reverse();
System.out.println("reverse number="+sb1);
}
}