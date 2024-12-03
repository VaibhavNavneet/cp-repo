import java.util.*;

public class B_Replace_Character {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); 
        while (t-- > 0) {
            int n = in.nextInt(); 
            in.nextLine(); 
            String s = in.nextLine(); 

            if (n == 1) {
                System.out.println(s); 
                continue;
            }

            HashMap<Character, Integer> charCountMap = new HashMap<>();
            char[] chars = s.toCharArray();
            for (char c : chars) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

          
            char maxChar = '\0';
            char minChar = '\0';
            int maxCount = 0;
            int minCount = Integer.MAX_VALUE;

            
            for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxChar = entry.getKey();
                    maxCount = entry.getValue();
                }
                if (entry.getValue() < minCount) {
                    minChar = entry.getKey();
                    minCount = entry.getValue();
                }
            }

           
            if (maxCount == minCount) {
                
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] != maxChar) {
                        chars[i] = maxChar;
                        break;
                    }
                }
            } else {
                
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == minChar) {
                        chars[i] = maxChar;
                        break;
                    }
                }
            }

            
            System.out.println(new String(chars));
        }
    }
}
