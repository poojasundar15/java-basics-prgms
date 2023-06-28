package StringConcepts;

public class Trim {

        public static void main(String args[]){
            String s="Sachin  ....";
            System.out.println(s);//  Sachin
            //"TRIM" is used for reduce the whitespaces
            System.out.println(s.trim());//SachinSystem.out.println(s.startsWith("Sa"));//true
            System.out.println(s.startsWith("Sa"));//true
//            public boolean startsWith(String prefix) {
//                return startsWith(prefix, 0);
//            }
            System.out.println(s.endsWith("n"));//true
//            public boolean endsWith(String suffix) {
//                return startsWith(suffix, value.length - suffix.value.length);
//            }


        }
    }


