/**
 * @author crkimberley on 10/10/2016.
 */
public class PersonTestManual {
    public static void main(String[] args) {
        new PersonTestManual().launch();
    }

    private void launch() {
        Person p = new Person();
        System.out.println(p.getInitials(" Frank  Smith "));
    }
}
