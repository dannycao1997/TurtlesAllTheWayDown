public class GDC {
    public static boolean gcd(int p, int q) {
        if (q == 0) return (p == 1);
        return gcd(q,p % q);
    }
}
