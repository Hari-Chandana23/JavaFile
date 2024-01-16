package Static;

public class College {
    static int CollegeNumber = 527;

    public static int getCollegeNumber() {
        return CollegeNumber;
    }

    public static void main(String[] args) {

        System.out.println(getCollegeNumber());
    }
}
