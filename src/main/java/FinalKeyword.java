class FinalKeyword {
    //Final class doesn't be extended to another class
   final void sum()
   //final method couldn't be extended anywhere
    {
        System.out.println("Hello");
    }
    void sum1(){
       this.sum();
        System.out.println("World");

    }
}
class FinalKeyword1 extends FinalKeyword{
    public static void main(String[] args) {
        FinalKeyword finalKeyword = new FinalKeyword();
        finalKeyword.sum();
        finalKeyword.sum1();
    }




}
