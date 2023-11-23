
public class recursion {
  public static void main(String[] args) {

    //call your recursion fuction
    //print result
    String[] stringsToCheck = {"father", "mother", "madam", "racecar"}; // Add more strings as needed

        for (String str : stringsToCheck) {
            boolean result = recursionFunction(str);
            if (result) {
                System.out.println("'" + str + "' is a palindrome.");
            } else {
                System.out.println("'" + str + "' is not a palindrome.");
            }
        }
   }
    
    public static boolean recursionFunction(String str) {

        // if string is empty or has one character, it's palindrome
        if(str.length() <= 1){
          return true;
        }        

        // Check if the first and last character are equal
        if(str.charAt(0) == str.charAt(str.length() - 1)){
          // Recursively check the substring excluding the first and last characters
          return recursionFunction(str.substring(1, str.length() - 1));
          }else{
            // If characters don't match, it's not a palindrome
             return false;
          }
      }
}
    
