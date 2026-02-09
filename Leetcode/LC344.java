class LC344 {
    public void reverseString(char[] s) {
        int i=0;
        int j=s.length-1;
        while(i<j){
            //swap
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        char[] s = "Hello World".toCharArray();
        LC344 obj = new LC344();
        obj.reverseString(s);  
        System.out.println(s);
    }
}