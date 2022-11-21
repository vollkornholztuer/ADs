package uebung02.aufgabe03;

public class Permutation {

    public void permute(String str) {
        char[] chars = str.toCharArray();
        permute(chars, 0);
    }

    private void permute(char[] str, int startIndex) {

        if (str.length - startIndex == 2) {
            System.out.println(str);
            char c = str[str.length - 1];
            str[str.length - 1] = str[str.length - 2];
            str[str.length - 2] = c;
            System.out.println(str);
        } else {
            for (int i = startIndex; i < str.length; i++) {
                char[] newStr = str.clone();
                newStr[startIndex] = newStr[i];
                newStr[i] = str[startIndex];
                permute(newStr, startIndex + 1);
            }
        }
    }

    public static void main(String[] args) {
        String str = "abcde";
        Permutation permutation = new Permutation();
        permutation.permute(str);
    }

}
