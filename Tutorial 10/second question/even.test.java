import evenpackage.even;

public class TestEven {

    public static void main(String[] args) {

        int number = 24;

        if (even.checkEven(number)) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is not an even number");
        }
    }
}
