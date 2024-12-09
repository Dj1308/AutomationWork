class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      HashMap<Character,Integer> magazinemap = new HashMap<>();

      for(char c : magazine.toCharArray())
      {
            if(magazinemap.containsKey(c))
            {
                magazinemap.put(c,magazinemap.get(c)+1);
            }
            else
            {
                magazinemap.put(c,1);
            }
      }
      for(char c : ransomNote.toCharArray())
      {
           
            if(!magazinemap.containsKey(c))
            {
                return false;
            }
            else if(magazinemap.containsKey(c))
            {
                if(magazinemap.get(c)==0)
                {
                    return false;
                }
                magazinemap.put(c,magazinemap.get(c)-1);
            }
      }
      return true;
    }
}
