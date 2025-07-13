package romannum;

public class TestNegative {
    public static void main(String[] args) {
        RomanNumerals converter = new RomanNumerals();
        String input = "K";
        try {
            converter.convertRomanNumToInt(input);
            System.out.println("Input: " + input + " => FAIL (Expected Exception)");
        } catch (IllegalArgumentException e) {
            System.out.println("Input: " + input + " => PASS (Caught Exception: " + e.getMessage() + ")");
        }
    }
}

