package ClassCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AllVowelsContains {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input:");
        String input = sc.nextLine();
        String str = input.toLowerCase();
        for (char c : str.toCharArray()) {
            if (list.contains(c)) {
                list.remove((Object) c);
            }
        }
        if (list.isEmpty()) {
            System.out.println("Contains all vowels");
        } else {
            System.out.println("all vowels are not present");
        }


    }
}
