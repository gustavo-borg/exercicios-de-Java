package hashCodeAndEquals;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("Gustavo", "12243254612");
        Person p2 = new Person("AUSUIHAHIO", "1223254612");

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
