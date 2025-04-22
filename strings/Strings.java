public class Strings {
    public static void main(String[] args) {
        String employee1 = "employee1";
        String employee2 = employee1;
        String employee3 = employee2;

        employee3 = "asdf";

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        return;
    }
}
