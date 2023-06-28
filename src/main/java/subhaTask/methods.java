package subhaTask;

public class methods {

    void allSmall(String a) {
        System.out.println(a.toLowerCase());
    }

    void allSmallRemoveSpace(String str) {
        str = str.toLowerCase();
        System.out.println(str.replaceAll("\\s", ""));
    }

    void allSmallReplaceSpaceUnderscoreAndHyphen(String s, String ss) {
        s = s.toLowerCase().replaceAll(" ", "_");
        ss = ss = ss.toLowerCase().replaceAll(" ", "-");
        System.out.println(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        methods obj = new methods();
        obj.allSmall("POOJA");
        obj.allSmallRemoveSpace("POOJA Is a GOod gIRl");
        obj.allSmallReplaceSpaceUnderscoreAndHyphen("I haVE chanGED mY DOmAIN ScalA inTO JavA",
                "I am WorKING iN QBRAINX");

    }
}
