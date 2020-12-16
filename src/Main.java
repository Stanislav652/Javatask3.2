public class Main {
    public static void main(String[] args) {
        int account = 50;
        int refil = 1200;
        int bonus;

        if (refil > 1000) {
            bonus = refil / 100 * 1;
        } else {
            bonus = 0;
        }

        int accountnew = account + refil+ bonus;
        System.out.println(accountnew);    }
}
