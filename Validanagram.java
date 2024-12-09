class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer> tmap = new HashMap<>();
        for(char c : t.toCharArray())
        {
            if(tmap.containsKey(c))
            {
                tmap.put(c,tmap.get(c)+1);
            }
            else
            {
                tmap.put(c,1);
            }
        }
        HashMap<Character,Integer> smap = new HashMap<>();
        for(char c : s.toCharArray())
        {
            if(smap.containsKey(c))
            {
                smap.put(c,smap.get(c)+1);
            }
            else
            {
                smap.put(c,1);
            }
        }

        for(char c : s.toCharArray())
        {
            if(smap.get(c)!=tmap.get(c))
            {
                return false;
            }
        }
        return true;
    }
}
