class swp{
public static void main (String[] args){
int a=10,b=20;

System.out.println("Before swapping values are..."+a+","+b);
//first logic using third v@ri@ble
int t =a; //t=10
a=b;   //a=20
b=t;   //b=10
System.out.println("logic first After swapping values are..."+a+","+b);
//second logic using +,- Operator
int a1=10,b1=20;
a1=a1+b1; //10+20=30
b1=a1-b1; //30-20=10
a1=a1-b1; //30-10=20
System.out.println("second logic  After swapping values are..."+a1+","+b1);
//third logic using *,/ Operator
int a2=10,b2=20;
a2=a2*b2; //10*20=200
b2=a2/b2; //200/20=10
a2=a2/b2; //200/10=20
System.out.println("third logic  After swapping values are..."+a2+","+b2);
//fourth logic bitwise operator XOR(^)
int a3=10,b3=20;
a3=a3^b3; //@=10,b=20
b3=a3^b3; //binary of 10,20 is 1010,10100
a3=a3^b3; //
System.out.println("four logic  After swapping values are..."+a3+","+b3);
//fivth logic single st@tement
int a4=10,b4=20;
b4=a4+b4-(a4=b4);
System.out.println("four logic  After swapping values are..."+a4+","+b4);
}
}