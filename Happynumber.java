class Solution {
    public boolean isHappy(int n) {
        int sum = n;
        HashMap<Integer, Integer> seen = new HashMap<>();

        seen.put(sum, 1);
        
        while (sum != 1) {
            int j = 0;
            String s = Integer.toString(sum);
            System.out.println("String value=" + s);

            for (char c : s.toCharArray()) {
                int digit = c - '0';  
                j = j + digit * digit; 
            }
            
            sum = j;
            
            if (seen.containsKey(sum)) {
                return false; 
            }
   
            seen.put(sum, 1);
            System.out.println("Updated sum value=" + sum);
        }
        return true;     

        }
        
    }
