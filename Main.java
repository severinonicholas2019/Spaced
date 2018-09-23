public class Main {

    public static void main(String[] args) {

        float pi = 3.14f;

        float h1 = 72.0f;
        float h2 = 19.0f;
        float h3 = 50.0f;
        float h4 = 67.0f;
        float h5 = 16.0f;
        float h6 = 53.0f;
        float h7 = 69.0f;
        float h8 = 30.0f;
        float h9 = 52.0f;
        float h10= 40.0f;
        float h11= 31.0f;
        float h12= 75.0f;


        float a1 = (11.0f*11.0f)*pi;
        float a2 = (9.0f*9.0f)*pi;
        float a3 = (6.5f*6.5f)*pi;
        float a4 = (8.0f*8.0f)*pi;
        float a5 = (7.0f*7.0f)*pi;
        float a6 = (11.5f*11.5f)*pi;
        float a7 = (11.0f*11.0f)*pi;
        float a8 = (11.0f*11.0f)*pi;
        float a9 = (11.5f*11.5f)*pi;
        float a10= (8.0f*8.0f)*pi;
        float a11= (9.0f*9.0f)*pi;
        float a12= (11.5f*11.5f)*pi;

        float v1 = h1*a1;
        float v2 = h2*a2;
        float v3 = h3*a3;
        float v4 = h4*a4;
        float v5 = h5*a5;
        float v6 = h6*a6;
        float v7 = h7*a7;
        float v8 = h8*a8;
        float v9 = h9*a9;
        float v10= h10*a10;
        float v11= h11*a11;
        float v12= h12*a12;
        float g = 264.172f;

        float days = 28.0f;
        float pop = 37640f;
        float totw = v1+v2+v3+v4+v5+v6+v7+v8+v9+v10+v11+v12;
        System.out.println("The total amount of water in Keane is " + totw +" cubic meters of water.");
        float pday = totw/days;
        System.out.println("The total amount of water for each day is " + pday +" cubic meters of water.");
        float pguy = pday/pop;
        System.out.println("The total amount of water per person per day is " + pguy +" cubic meters of water.");
        float avg = .246f;
        float save = avg-pguy;
        System.out.println("The total amount of water to save per day per person is " + save +" cubic meters of water.");
        float gtotw = totw*g;
        System.out.println("The total amount of water in Keane is " + gtotw +" gallons of water.");
        float gpday = pday*g;
        System.out.println("The total amount of water for each day is " + gpday +" gallons of water.");
        float gpguy = pguy*g;
        System.out.println("The total amount of water per person per day is " + gpguy +" gallons of water.");
        float gsave = save*g;
        System.out.println("The total amount of water to save per day per person is " + gsave +" gallons of water.");

    }
}
