class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();
        int tsum=0,ssum=0;
        for(char c : s.toCharArray())
        {
            if(smap.containsKey(c))
            {
                smap.put(c,smap.get(c)+2);
                ssum=ssum+smap.get(c);
            }
            else
            {
                smap.put(c,1);
                ssum=ssum+smap.get(c);
            }
        }
        for(char c : t.toCharArray())
        {
            if(tmap.containsKey(c))
            {
                tmap.put(c,tmap.get(c)+2);
                tsum=tsum+tmap.get(c);
            }
            else
            {
                tmap.put(c,1);
                tsum=tsum+tmap.get(c);
            }
        }
        if(tsum==ssum)
        {
            return true;
        }
        {
            return false;
        }
    }
}
