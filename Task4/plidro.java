import java.util.*;
class plidro{
public static void main(String[] rgs){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the String Value");
String str= sc.nextLine();
String org=str;
String rev="";
for(int i=str.length()-1;i>=0;i--){
rev=rev+str.charAt(i);
}
if(org.equals(rev)){
System.out.println("Enter the String is Palidrome");
}else{
System.out.println("Enter the String is not Palidrome");

}
}
}