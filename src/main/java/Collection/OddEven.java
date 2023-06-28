package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class OddEven
{
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,6,7,8));

     //   int arrayList= 2;

       // for (int i=0; i<=arrayList;){
        for (int arrayList:array)
            if(arrayList%2==0)
            {
                System.out.println("The number is Even = "+arrayList);
            }
            else if(arrayList%2!=0){
                System.out.println("The number is odd = "+arrayList);
            }
        }
    }

