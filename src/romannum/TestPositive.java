package romannum;

public class TestPositive {
    public static void main(String[] args) {
        RomanNumerals converter = new RomanNumerals();
        String input = "IX";
        int expected = 9;
        int actual = converter.convertRomanNumToInt(input);
        System.out.println("Input: " + input + ", Output: " + actual + " => " + (actual == expected ? "PASS" : "FAIL"));
    }
}

