/**
 * @author crkimberley on 10/10/2016.
 */
public class Person {

    public String getInitials(String fullName) {
        String result = "";
        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            // Bug fixed - now checking for words of zero length
            String nextInitial = "" + (words[i].length() > 0 ? words[i].charAt(0) : "");
            result = result + nextInitial.toUpperCase();
        }
        return result;
    }

    /*
    public String getInitials(String fullName) {
        String result = "";
        String[] words = fullName.split(" ");
        for (int i = 0; i < words.length; i++) {
            String nextInitial = "" + words[i].charAt(0);
            result = result + nextInitial.toUpperCase();
        }
        return result;
    }
    */
}
