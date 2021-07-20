class Windchill{
    public static void main(String[] args) {
        Out.print("Wind speed in km/h: ");
        double v = In.readDouble();

        Out.print("Temperature in Celsius: ");
        double t = In.readDouble();

        double wct = 13.12 + 0.6215 * t + (0.3965 * t - 11.37) * Math.pow(v, 0.16);
        /*int round = (int)(wct * 100);
        Out.print("Windchill-Temperature: " + (int)wct + "." + round / 10 % 10 + "" + round % 10);*/
        System.out.format("Windchill-Temperature: %.2f%n", wct); //easier way to format integer
    }

}