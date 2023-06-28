package Java8;

interface sample {
    public void singleLamda(String aa);
}
public class LamdaParameters
{
    public static void main(String[] args) {
        int a=10;
        sample s=(obj)->{
            System.out.println(obj);
        };
        s.singleLamda("pooja");
    }

}
