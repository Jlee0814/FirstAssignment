
/**
 * Created by Yang on 1/23/20.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int last = array.length-1;
        return array[last];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int len = array.length;
        
        return array[len-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String a:array){
            if(a.equals(value))
                return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int i=0;
        int j=array.length-1;
        while(i<j){
          String temp = array[i];
          array[i]=array[j];
          array[j]=temp;
          i++;
          j--;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int i =0;
        int j=array.length-1;
        while(i<j){
          if(!array[i].equals(array[j]))
                    return false;
          i++;
          j--;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
         int[] arr = new int[26];
         for(String s:array){
             s=s.toLowerCase();
             for(int i=0;i<s.length();i++){
                 if(s.charAt(i)-'a'>=0&&s.charAt(i)-'a'<26)
                  arr[s.charAt(i)-'a']++;
                }
            }
            for(int i=0;i<26;i++){
                if(arr[i]==0)
                    return false;
            }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int cnt = 0;
        for(String s:array){
            if(s.equals(value)){
                cnt++;
            }
        }
        return cnt;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int cnt = 0;
        for(String s:array){
            if(!s.equals(valueToRemove)){
            cnt++;
            }
        }
        String[] res = new String[cnt];
        int i=0;
        for(String s:array){
            if(!s.equals(valueToRemove)){
                res[i]=s;
                i++;
            }
        }
        return res;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int cnt = 1;
        for(int i=1;i<array.length;i++){
            if(!array[i].equals(array[i-1])){
                cnt++;
            }
        }
        String[] res = new String[cnt];
        int j=0;
        for(int i=1;i<array.length;i++){
            if(!array[i].equals(array[i-1])){
                res[j]=array[i-1];
                j++;
            }
        }
        res[j]=array[array.length-1];
        return res;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
      int cnt = 1;
        for(int i=1;i<array.length;i++){
            if(!array[i].equals(array[i-1])){
                cnt++;
            }
        }
        String[] res = new String[cnt];
        String tmp = array[0];
        int j=0;
        for(int i =1;i<array.length;i++){
            if(array[i].equals(array[i-1])){
                tmp+=array[i];
            }else{
                res[j]=tmp;
                tmp=array[i];
                j++;
            }
        }
        res[j]=tmp;
        return res;
    }


}

