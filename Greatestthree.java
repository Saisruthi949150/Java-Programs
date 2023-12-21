import java.util.Scanner;
public class Greatestthree
{
    public static void main(String args[])
    {
        System.out.print("\nEnter three numbers=========");
        Scanner reader = new Scanner(System.in);
        System.out.print("\nEnter the first number=");
        int fn = reader.nextInt();
        System.out.print("\nEnter the second number=");
        int sn = reader.nextInt();
        System.out.print("\nEnter the third number=");
        int tn = reader.nextInt();
        reader.close();
        if(fn > sn && fn > tn)
        { System.out.print("\nThe greater number = " + fn);}
        else if(sn > fn && sn > tn)
        { System.out.print("\nThe greater number = " + sn);}
        else
        { System.out.print("\nThe greater number = " + tn);}
     }
}