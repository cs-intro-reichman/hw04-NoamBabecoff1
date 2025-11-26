public class Primes {
    public static void main(String[] args) {
        final int N = Integer.parseInt(args[0]);
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + N + ":");

        int count = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }

        int percentage = (int) Math.round((count * 100.0) / N);

        System.out.println("There are " + count + " primes between 2 and " + N +" (" + percentage + "% are primes)");
    }
}