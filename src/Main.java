public class Main {
    public static void main(String[] args) {

        int count = 100;
        int refill = 10000;
        int bonus;
        if (refill > 1000) {
            bonus = (refill / 100);
        } else bonus = 0;
        count = (count + refill + bonus);
        System.out.println(count);
        System.out.println(bonus);
    }
}
