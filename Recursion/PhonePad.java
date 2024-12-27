 import java.util.*;
// public class PhonePad {
//     public static void main(String [] args){
//         // phonepad("","12");
//         System.out.println(phonepad("", "12"));
//     }
//     public static List<String> phonepad(String p,String up){
//         if(up.isEmpty()){
//             List<String> list= new ArrayList<>();
//             list.add(p);
//             return list;
//         }
//         int digit= up.charAt(0)-'0';
//         List<String> ans= new ArrayList<>();
//         for(int i=(digit-1)*3;i<digit*3;i++){
//             char ch= (char) ('a' + i);
//             ans.addAll(phonepad(p+ch, up.substring(1)));
//         }
//         return ans;
//     }
// }

class PhonePad {
    public static(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>(); // Return empty list for empty input
        }
        return phonepad("", digits);
    }

    public static List<String> phonepad(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p); // Add the completed combination
            return list;
        }

        // Phone pad mapping for digits 2-9
        String[] phoneMap = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        int digit = up.charAt(0) - '0'; // Convert char to int
        String letters = phoneMap[digit]; // Get corresponding letters

        List<String> ans = new ArrayList<>();
        for (char ch : letters.toCharArray()) {
            ans.addAll(phonepad(p + ch, up.substring(1))); // Recursive call
        }
        return ans;
    }
}
