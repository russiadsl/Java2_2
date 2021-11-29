public class Main {
    public static void main(String[] args) {

        int count = 100;
        int refill = 1050;
        int bonus;
        if (refill > 1000) {
            count = count + refill + (refill * 1 / 100);
        } else count = count + refill + 0;
        bonus = count - (refill + (refill * 1 / 100));
        System.out.println(count);
        System.out.println(bonus);
    }
}
