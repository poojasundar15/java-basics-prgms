package javaAnswerKey;

class Line{

   public int x; // or public int x;
    public int y; // or public int y;

    int x1;
    int y1;
    Line(int x,int y){
        this.x=x;
        this.y=y;
        x1=x;
        y1=y;
    }
    void computation(int x2, int y2)
    {
        int a = x2-x1;
        int b = y2-y1;
        int lengthOfLine = (int) Math.pow(a,b);
        System.out.println(lengthOfLine);

    }
}

public class Sample11 {

    public static void main(String[] args) {
        Line line = new Line(22,44);
        line.computation(2,6);
    }
}
