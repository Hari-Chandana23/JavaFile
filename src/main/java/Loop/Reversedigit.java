package Loop;

public class Reversedigit {

    static int reversedigit(int number){
        int reverseNumber = 0;
        while(number > 0){
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number /= 10;
        }
        return  reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(reversedigit(12345));

    }
}

