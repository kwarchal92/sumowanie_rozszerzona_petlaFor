package pinp_sumowanie;

public class Main {
    public static void main(String[] args)
    {
        int n = 100, i;
        int suma_p = 0;
        int suma_np = 0;
        int [] dane = new int[n];

        System.out.println("\nprogram sumuje liczby parzyste i nieparzyste z przedziału 1-100 znajdujące się wtablicy dane");

        for (i = 1; i <= dane.length; i++)
        {
            dane[i - 1] = i;
        }

        for (int x : dane) //rozszerzona prtla for
        {
            if ((x % 2) == 0)
                suma_p += x; //sumowanie liczb parzystych
            else
                suma_np += x; //sumowanie liczb nie parzystych
        }

        System.out.println();
        System.out.println("Suma liczb parzystych 1-100 wynsi: " + suma_p + ".");
        System.out.println("Suma liczb NIEparzystych 1-100 wynsi: " + suma_np + ".");
    }
}
