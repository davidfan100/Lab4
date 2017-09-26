/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/*
 *
 *
 */
public class ReclamationProject {
    /*
     *
     */
    static String doit(String firstStr, String secondStr){
        if (firstStr.length() > secondStr.length()) {
            String temp = firstStr;
            firstStr = secondStr;
            secondStr = temp;
        }
        String maxStr = "";
        /*
         * loop over all the characters in firstStr
         */
        for (int begin = 0; begin < firstStr.length(); begin++) {
            /*
             * loop over all the characters in secondStr, but start from the end
             */
            for (int end = firstStr.length() - begin; end > 0; end--) {
                /*
                 * Compare all possible substrings within the given begin and end
                 */
                for (int possibleSubStr = 0; possibleSubStr < secondStr.length() - end;
                        possibleSubStr++) {
                    if (firstStr.regionMatches(begin, secondStr, possibleSubStr, end)
                            && end > maxStr.length()) {
                        maxStr = firstStr.substring(begin, begin + end);
                    }
                }
            }
        }
        return maxStr;
    }
}
