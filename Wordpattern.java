import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        StringTokenizer token = new StringTokenizer(s," ");
        HashMap<Character,String> wpmap = new HashMap<>();

        for(char c : pattern.toCharArray())
        {
            if(!token.hasMoreTokens())
            {
                return false;
            }
            else
            {
                String tok=token.nextToken();
                System.out.println("Current token is = "+tok);
                System.out.println("Value of key is = "+wpmap.get(c)+","+"value of token is"+tok);

                if(wpmap.containsKey(c) && wpmap.get(c).equals(tok))
                {
                    System.out.println("No action");
                    continue;
                }
                else if(wpmap.containsKey(c) && !wpmap.get(c).equals(tok))
                {
                    System.out.println("Failed");
                    return false;
                }
                else if(!wpmap.containsKey(c))
                {
                    System.out.println("Added values="+c+","+tok);
                    wpmap.put(c,tok);
                }
            }

        }
        if(token.hasMoreTokens())
        {
            System.out.println("Failed outside");
            return false;
        }
        return true;
        
    }
}
