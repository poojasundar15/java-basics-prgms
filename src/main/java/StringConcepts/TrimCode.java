package StringConcepts;

import static jdk.nashorn.internal.objects.NativeString.substring;

public class TrimCode {
    public String trim() {
        char[] value = new char['u'];
        int len = value.length;
        int st = 0;
        char[] val = value;    /* avoid getfield opcode */

        while ((st < len) && (val[st] <= ' ')) {
            st++;
        }
        while ((st < len) && (val[len - 1] <= ' ')) {
            len--;
        }
        return ((st > 0) || (len < value.length)) ? substring(st, len) : String.valueOf(this);
    }


    public static void main(String[] args) {
        TrimCode trimCode = new TrimCode();
        trimCode.trim();
    }
}
