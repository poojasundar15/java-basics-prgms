package Java8;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SayHai{

    SayHai sayHai;

    SayHai(){
        this.sayHai=new SayHai();
    }

    public SayHai getSayHai() {
        return sayHai;
    }

    public static void main(String[] args) {
        //Predicate
        List<Say> says = new ArrayList<>();

        says.stream().filter(say -> say.saySomething(5)==25).collect(Collectors.toList());
        Say say= i-> {
            System.out.println(i*2);
            return i*i;
        };
        int i = say.saySomething(5);

        System.out.println(i);
    }


}
