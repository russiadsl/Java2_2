public class Main {
    public static void main(String[] args) {

        int count = 500;
        int refill = 900;
        float bonus = 0.1F;
        if (refill >= 1000) {
            count = count + refill + (refill * 1 / 10);
        } else {
            count = count + refill + 0;
        }
        System.out.println(count);
    }
}
