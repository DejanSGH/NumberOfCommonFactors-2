public class Main {

    public static void main(String[] args) {

        int common = commonFactors(885,885);
        System.out.println(common);

    }

    public static int commonFactors(int a, int b) {
        int maks = Math.max(a,b);
        int common = 0;
        for (int i = 1; i <= maks; i++) {
            if(a%i == 0 && b%i == 0) common++;
        }
        return common;
    }
}
