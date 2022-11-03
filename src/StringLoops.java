public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() {
    }


    /* Returns the number of times "character" appears in "searchString"

       This should be case sensitive!

       Examples:
       - if character = "a" and searchString = "Apples and bananas",
         this method returns 4 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apples and bananas",
         this method returns 1 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2`
      */
    public int countCharacters(String character, String searchString) {
        int counter = 0;
        for (int i = 0; i < searchString.length(); i++) {
            if ((searchString.charAt(i) + "").equals("a")) {
                counter++;
            }
        }
        return counter;
    }

    public String reverseString(String origString) {
        String returnStr = "";
        for (int i = origString.length() - 1; i >= 0; i--) {
            returnStr += origString.charAt(i);
        }
        return returnStr;
    }

    public String reverseString2(String origString) {
        String returnStr = "";
        for (int i = 0; i < origString.length(); i++) {
            returnStr = origString.charAt(i) + returnStr;
        }
        return returnStr;
    }

    public int countVowels(String origString) {
        int counter = 0;
        for (int i = 0; i < origString.length(); i++) {
            if (((origString.charAt(i) + "").equals("a")) || ((origString.charAt(i) + "").equals("e")) || ((origString.charAt(i) + "").equals("i")) || ((origString.charAt(i) + "").equals("o")) || ((origString.charAt(i) + "").equals("u")) || ((origString.charAt(i) + "").equals("A")) || ((origString.charAt(i) + "").equals("E")) || ((origString.charAt(i) + "").equals("I")) || ((origString.charAt(i) + "").equals("O")) || ((origString.charAt(i) + "").equals("U"))) {
                counter++;
            }
        }
        return counter;
    }

    public int countString(String searchString, String origString) {
        int counter = 0;
        int length = searchString.length();
        for (int i = 0;i < origString.length()-length+1; i++)
             {
                if (origString.substring(i,i+length).equalsIgnoreCase(searchString))
                {
                    counter++;
                }
             }
        return counter;
    }

    public String removeString(String searchString, String origString)
    {
        String returnStr = "";
        int searchLength = searchString.length();
        while (origString.indexOf(searchString) != -1)
        {
            String reducedStr = origString.substring(origString.indexOf(0, origString.indexOf(searchString))) + origString.substring(origString.indexOf(searchString) + searchLength);
            returnStr = reducedStr;
        }
        return returnStr;
    }

}
