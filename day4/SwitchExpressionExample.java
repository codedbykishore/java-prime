import java.util.*;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Give input from 1 to 7: ");
        int day = ip.nextInt();
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(dayName);
    }
}
