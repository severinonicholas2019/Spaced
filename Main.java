public class Main {

    public static void main(String[] args) {

        int d1x = 5;
        int d1y = 2;
        int d1z = -5;
        int d2x = 4;
        int d2y = 9;
        int d2z = 2;
        int d3x = -3;
        int d3y = 2;
        int d3z = 6;

        double dab = Math.sqrt(Math.pow(d1x-d2x,2)+Math.pow(d1y-d2y,2)+Math.pow(d1z-d2z,2));
        double dac = Math.sqrt(Math.pow(d1x-d3x,2)+Math.pow(d1y-d3y,2)+Math.pow(d1z-d3z,2));
        double dcb = Math.sqrt(Math.pow(d2x-d3x,2)+Math.pow(d2y-d3y,2)+Math.pow(d2z-d3z,2));
        System.out.println(dab);
        System.out.println(dac);
        System.out.println(dcb);
        double a = Math.max(dab,Math.max(dac,dcb));
        double b = Math.min(dab,Math.min(dac,dcb));
        System.out.println("The greatest distance is "+a+".");
        System.out.println("The smallest distance is "+b+".");
    }
}
