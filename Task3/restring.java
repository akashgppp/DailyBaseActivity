import java.util.*;
class Reverse{
public static void main(String[] rgs){
//1) using conc@ten@tion oper@tor
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String Value");
String str= sc.nextLine();
String rev="";
int len=str.length();
for(int i=len-1;i>=0;i--){
rev=rev+str.charAt(i);
}
System.out.println("reverse=="+rev);

//2) using ch@r@cter @rry
System.out.println("Enter the String Value");
String str1= sc.nextLine();
String rev1="";
char s[]=str1.toCharArray();
int len1= s.length;
for(int i=len1-1; i>=0;i--){
rev1=rev1+s[i];
}
System.out.println("reverse=="+rev1);
//3) using buffer string
StringBuffer sb = new StringBuffer(str1);
System.out.println("reverse=="+sb.reverse());



//lst
}
}