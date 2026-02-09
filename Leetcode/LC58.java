class LC58 {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String lastword = arr[arr.length-1];
        return lastword.length();
    }
    public static void main(String[] args) {
        String s = "Hello World";
        LC58 obj = new LC58();
        System.out.println(obj.lengthOfLastWord(s));
    }
}