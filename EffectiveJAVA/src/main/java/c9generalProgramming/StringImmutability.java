package c9generalProgramming;

public class StringImmutability {
    public static void main(String[] args) {
        String originalString = "hello";
        String newString = originalString.substring(0, 2) + 'w' + originalString.substring(3);

        System.out.println("Original string: " + originalString);
        System.out.println("New string: " + newString);

        // Check if the original string has changed
        if (originalString.equals("Hello, World!")) {
            System.out.println("The original string has not changed.");
        } else {
            System.out.println("The original string has changed.");
        }
    }
}
