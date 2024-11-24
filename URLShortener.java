import java.util.*;
import java.io.*;
/*
 * MIT License
 * Copyright (c) 2024 Purohit1999
 */

class URLShortener {
    // Function to generate a short URL from an integer ID
    static String idToShortURL(int n) {
        // Map to store 62 possible characters
        char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        // StringBuffer to store the short URL
        StringBuffer shortURL = new StringBuffer();

        // Convert given integer ID to a base-62 number
        while (n > 0) {
            // Append the character corresponding to the remainder
            shortURL.append(map[n % 62]);
            // Divide the ID by 62 to proceed to the next digit
            n = n / 62;
        }

        // Reverse the string to complete the conversion
        return shortURL.reverse().toString();
    }

    // Function to retrieve the integer ID from a short URL
    static int shortURLtoID(String shortURL) {
        int id = 0; // Initialize the result ID

        // Loop through each character in the short URL
        for (int i = 0; i < shortURL.length(); i++) {
            // If the character is lowercase, map 'a' to 'z' to 0-25
            if ('a' <= shortURL.charAt(i) && shortURL.charAt(i) <= 'z') {
                id = id * 62 + shortURL.charAt(i) - 'a';
            }
            // If the character is uppercase, map 'A' to 'Z' to 26-51
            else if ('A' <= shortURL.charAt(i) && shortURL.charAt(i) <= 'Z') {
                id = id * 62 + shortURL.charAt(i) - 'A' + 26;
            }
            // If the character is a digit, map '0' to '9' to 52-61
            else if ('0' <= shortURL.charAt(i) && shortURL.charAt(i) <= '9') {
                id = id * 62 + shortURL.charAt(i) - '0' + 52;
            }
        }
        return id; // Return the final decoded integer ID
    }

    // Driver code to test the URL shortener and decoder
    public static void main(String[] args) throws IOException {
        int n = 12345; // Example integer ID to shorten

        // Generate a short URL from the integer ID
        String shortURL = idToShortURL(n);
        System.out.println("Generated short URL is: " + shortURL);

        // Retrieve the integer ID back from the short URL
        int id = shortURLtoID(shortURL);
        System.out.println("ID from the short URL is: " + id);
    }
}

