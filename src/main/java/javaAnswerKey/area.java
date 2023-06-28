package javaAnswerKey;

import java.util.Scanner;

public class area
{
    private int l,b,r; //global declaration

    public void shape()
    {

        System.out.println("Enter the Length value =");
        Scanner s=new Scanner(System.in);
        l=s.nextInt();
        System.out.println(" THE VALUE OF LENGTH : "+l);
        System.out.println("Enter the Breath value =");
        b=s.nextInt();
        System.out.println(" THE VALUE OF BREATH : "+b);
        r=l*b;
        System.out.println(" \n The Area of Rectangle = "+r);
    }
    void circumface()
    {
        System.out.println(r);

    }
    public static void main(String[]args)
    {
        area area=new area();
        area.shape();
    }
}

