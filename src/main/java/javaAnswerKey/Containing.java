package javaAnswerKey;

import java.util.Scanner;

abstract class Worker
{
    private String name;
    private String address;

        public String getName () {
            return name;
        }
        public void setName (String name){
            this.name = name;
        }
        public String getAddress () {
            return address;
        }
        public void setAddress (String address){
            this.address = address;
        }
}
class Containing1 extends Worker{
    public Containing1(String name1, String address1) {
        setName(name1);
        setAddress(address1);
        System.out.println("The name of the Worker = "+name1);
        System.out.println("The Address of the worker = "+address1);
    }
    public void earnings()
    {
        System.out.println("The details of worker wages");

    }
}
class PieceWorker extends Worker{
    int numberOfPieces;
    int wagePerPrice;
    public void earnings() {
        System.out.println("Enter the Number of pieces =");
        Scanner scanner = new Scanner(System.in);
        numberOfPieces=scanner.nextInt();
        System.out.println("Enter the Wage per prices =");
        Scanner scanner1 = new Scanner(System.in);
        wagePerPrice=scanner1.nextInt();
        int workerEarnings = numberOfPieces*wagePerPrice;
        System.out.println("The total number of worker Earnings are = "+workerEarnings);
    }
}
public class Containing {
    public static void main(String[] args) {
        Containing1 containing1 = new Containing1("Pooja","Gudiyattam");
        containing1.earnings();
        PieceWorker pieceWorker = new PieceWorker();
        pieceWorker.earnings();



    }
}
