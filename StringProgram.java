package com.practice;

public class StringProgram {

	public static String largestCharacter(String str)
    {
		try {
        // Array for keeping track of both uppercase
        // and lowercase english alphabets
        boolean[] uppercase = new boolean[26];
        boolean[] lowercase = new boolean[26];
        if(str == null || str == "") {
        	throw new Exception("string is null or empty");
        }
        char[] arr = str.toCharArray();
 
        for (char c : arr) {
 
            if (Character.isLowerCase(c))
                lowercase[(char)(c - 'a')] = true;
 
            if (Character.isUpperCase(c))
                uppercase[(char)(c - 'A')] = true;
  
        }
 
        // Iterate from right side of array
        // to get the largest index character
        for (int i = 25; i >= 0; i--) {
 
            // Check for the character if both its
            // uppercase and lowercase exist or not
            if (uppercase[i] && lowercase[i])
                return (char)(i + 'A') + "";
        }
		}catch(Exception e) {
			e.printStackTrace();
		}
 
        // Return -1 if no such character whose
        // uppercase and lowercase present in
        // string str
        return "-1";
    }
 
    
    public static void main(String[] args)
    {
        String str = "admeDCABM";
 
        System.out.println(largestCharacter(str));
    }

}
