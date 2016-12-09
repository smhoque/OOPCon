package inheritance;

/**
 * Created by riponctg on 12/7/2016.
 */
public class HumanResource {
    public void HumanResourceCleark() {
        System.out.println("Human Resource Cleark name: Khan");
    }

    public void FindLocation(int location) {
        String floor = "";

        switch (location) {
            case 1:
                floor = "One";
                System.out.println("Location: Accounting location is floor One");
                break;
            case 2:
                floor = "Two";
                System.out.println("Location: HumanResource Location is floor two");
                break;
            case 3:
                floor = "Three";
                System.out.println("Information Technology location is floor three");
                break;
            default:
                floor = "None";
                System.out.println("Out side of state");

        }

    }
}
