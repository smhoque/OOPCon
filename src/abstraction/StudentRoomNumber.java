package abstraction;

/**
 * Created by riponctg on 12/8/2016.
 */
public class StudentRoomNumber {
    public void RoomNumber() {
        System.out.println("Second Floor:");
        int limit = 10;
        int counter = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {

                System.out.println(i);
                counter++;
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

}




