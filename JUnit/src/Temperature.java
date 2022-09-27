public class Temperature {
    static void cel(int f)
    {
        int cel=12;
        f=((cel*9)/5)+32;
        System.out.println("Result of Celsius to fahrenheit : "+f);
    }

    static void fahren(int c)
    {
        int fah=10;
        c=((fah-32)*5)/9;
        System.out.println("Result of Fahrenheit to celsius: "+c );
    }
    public static void main(String[] args) {
        int f = 0;
        cel(f);

        int c = 0;
        fahren(c);
    }
}