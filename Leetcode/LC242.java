class LC242 {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx = ch-'a';
            freq[idx]++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            int idx = ch-'a';
            freq[idx]--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        LC242 obj = new LC242();
        System.out.println(obj.isAnagram(s,t));
    }
}