package com.testspace.java.string;

/**
 * A class demonstrating simple string operations.
 *
 * @author
 *
 */
public class StringOps
{
    /**
     * Concatenate two strings.
     * @param a first string.
     * @param b second string.
     * @return concatenated string result.
     */
    public static String concat(String a, String b)
    {
        a += b;
        return a;
    }

    /**
     * Rerevse string.
     * @param s string to reverse.
     * @return reversed string result.
     */
    public static String reverse(String s)
    {
        if (s.length() == 0)
        {
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }
}
