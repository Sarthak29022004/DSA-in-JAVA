public class Max_num_from_69 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(changeNum(99669969));
    }
    static int changeNum(int num){
        String str = Integer.toString(num);
        int num2 = Integer.parseInt(str.replaceFirst("6", "9"));
        return num2;
    }
}
