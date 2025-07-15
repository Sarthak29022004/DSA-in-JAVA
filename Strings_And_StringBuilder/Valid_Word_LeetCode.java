package Strings_And_StringBuilder;

public class Valid_Word_LeetCode {

    public static void main(String[] args) {
        Valid_Word_LeetCode obj = new Valid_Word_LeetCode();
        System.out.println(obj.isValid("Ya$"));
    }

    public boolean isValid(String word) {
        if (word.length() < 3) {
            return false;
        }
        String Vowels = "aeiouAEIOU";
        boolean v = false;
        boolean c = false;
        for(char ch: word.toCharArray()){
            if(Character.isDigit(ch)) continue;
            if(Character.isLetter(ch)){
                if(Vowels.indexOf(ch) > -1){
                    v = true;
                } else {
                    c = true;
                }
            } else {
                return false;
            }
        }
        return v && c;
    }
}
