//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Fibonacci {
    public Fibonacci() {
    }

    public static String calculate(double op1) {
        double x = 0.0D;
        double y = 1.0D;
        double z = 1.0D;
        String r = "";
        String resultat = "0";

        for(int i = 0; (double)i < op1; ++i) {
            r = String.valueOf(z);
            if (r.substring(r.length() - 2).equals(".0")) {
                r = r.substring(0, r.length() - 2);
            }

            resultat = resultat + "," + r;
            z = x + y;
            x = y;
            y = z;
        }

        return resultat;
    }
}
