import java.util.Scanner;
class calcidivision
{
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
public static void main(String args[])
{
calcidivision c=new calcidivision();
Scanner sc=new Scanner(System.in);
System.out.println(div(5,3));
}
}

