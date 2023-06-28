package Java8;

public interface SumLamda
{
    int add(int x,int y);
}
class LamdaExp2{

    public static void main(String[] args) {
        SumLamda obj = (x,y)->(x+y);
        SumLamda obj1 = (x,y) ->(x-y);
            System.out.println(obj.add(10,2));
        System.out.println(obj1.add(100,19));
    }
}
