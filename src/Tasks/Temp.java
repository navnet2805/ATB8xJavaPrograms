package Tasks;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Temp {



    public static void main(String[] args) {

        String input ="Pawan";
        findDuplicateCharacters(input);
    }

    public static void findDuplicateCharacters(String input) {
        // Convert the string to lowercase to count characters case-insensitively
        input = input.toLowerCase();

        // Create a HashMap to store character count
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            // Skip spaces
            if (c != ' ') {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print duplicate characters with their counts
        System.out.println("Duplicate Characters in : " + input);
        charCountMap.forEach((Character key, Integer value) -> {
            if (value > 1) {
                System.out.println(key + " : " + value);
            }
        });
    }
}
