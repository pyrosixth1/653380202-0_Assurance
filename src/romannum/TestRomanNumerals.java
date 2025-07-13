package romannum;


public class TestRomanNumerals {
    public static void main(String[] args) {
        RomanNumerals converter = new RomanNumerals();

        // Positive Test
        String input1 = "IX";
        int expected1 = 9;
        int result1 = converter.convertRomanNumToInt(input1);
        System.out.println("Input: " + input1 + ", Result: " + result1 + " => " + (result1 == expected1 ? "PASS" : "FAIL"));

        // Negative Test
        String input2 = "K";
        try {
            converter.convertRomanNumToInt(input2);
            System.out.println("Input: " + input2 + " => FAIL (Expected Exception)");
        } catch (IllegalArgumentException e) {
            System.out.println("Input: " + input2 + " => PASS (Caught Exception: " + e.getMessage() + ")");
        }
    }
}

