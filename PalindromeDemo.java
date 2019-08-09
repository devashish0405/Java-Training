public class PalindromeDemo {
    public static void main(String args[]){
        String s="acbbca";
        PalindromeDemo pl=new PalindromeDemo();
        System.out.println(pl.checkpalindrome(s,0,s.length()-1));
    }
    public boolean checkpalindrome(String s,int srt,int end) {
        //int len=s.length();
        if(srt>end)
            return true;
        if (srt < s.length() - 1 && s.charAt(srt) == s.charAt(end)) {
            srt = srt + 1;
            end = end - 1;
            return checkpalindrome(s, srt, end);
        }
        return false;
    }
}
