package javaAnswerKey;

import java.util.Locale;

public class StringManipulations
{
    public static void main(String[] args) {
        String a = "POOJA"; //NOT CHANGEABLE or IMMUTABLE
        StringBuilder stringBuilder = new StringBuilder("5555555555"); //CHANGEABLE or MUTABLE
        StringBuffer s = new StringBuffer("5555555555");
        s.append("ufbihf");
        a.concat("ugu");
        String aa = a.toLowerCase();
        System.out.println(aa);
      //  System.out.println(s);

    }
}
