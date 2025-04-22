public class PetShop {
    public static void main(String[] args) {

        User user = new User(1, "Alice", 28, "123 pet st", "555-1234", "Fluffy", "P001");

        Driver driver = new Driver(2, "Bob", 35, "456 Driver Rd", "555-5678", "Woober Van", "XYZ-987");

        driver.welcome();
        user.name = "kishore";
        System.out.println(user.name);

    }
}
