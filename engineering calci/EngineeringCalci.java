import java.util.Scanner;
class EngineeringCalci
{
public static float add(int a,int b)
{
return a+b;
}
public static float sub(int a,int b)
{
return a-b;
}
public static float multi(int a,int b)
{
return a*b;
}
public static float div(int a,int b)
{
if(b!=0)
{
return a/b;
}
else
{
return 0;
}
}
public static float mod(int a,int b)
{
return a%b;
}
public static float sq(int a)
{
return a*a;
}
public static float cube(int a)
{
return a*a*a;
}
public static void main(String args[])
{
System.out.println(add(5,3));
System.out.println(sub(5,3));
System.out.println(multi(5,3));
System.out.println(div(5,3));
System.out.println(mod(5,3));
System.out.println(sq(5));
System.out.println(cube(5));
}
}

