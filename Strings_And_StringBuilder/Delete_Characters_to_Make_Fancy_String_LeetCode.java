package Strings_And_StringBuilder;
public class Delete_Characters_to_Make_Fancy_String_LeetCode {
    public static void main(String[] args) {
        System.out.println(makeFancyString("leeetcode"));
    }
    public static String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        result.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count < 3) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
