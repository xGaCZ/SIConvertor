import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        boolean exit =true;
        while (exit)
        {
        LengthConv lengthConv = new LengthConv();
        System.out.println(" Jakie jednostki chcesz przeliczyć");
        System.out.println(" 1 - Odległość ");
        System.out.println(" 2 - Masa ");
        System.out.println(" 3 - Prędkość ");
        System.out.println(" 4 - Ilość ");
        System.out.println(" 0 - Wyjście ");


        Scanner scan = new Scanner(System.in);
        int x =scan.nextInt();

        switch (x)
        {


            case 1 -> {

                System.out.println("1 - Kilometry na Metry, Decymetry, Centymetry, Milimetry ");
                System.out.println(" --------------------------------- ");
                System.out.println("2 - Metry na Kilometry, Decymetry, Centymetry, Milimetry ");
                System.out.println(" --------------------------------- ");
                System.out.println("3 - Decymetry na Kilometry, Metry, Centymetry, Milimetry ");
                System.out.println(" --------------------------------- ");
                System.out.println("4 - Centymetry na Kilometry, Metry, Decymetry, Milimetry");
                System.out.println(" --------------------------------- ");
                System.out.println("5 - Milimetry na Kilometry, Metry, Decymetry, Centymetry, ");
                System.out.println(" --------------------------------- ");
                System.out.println("0 - Wyjscie");
                int menu = scan.nextInt();
                if (menu==1)
                {
                    System.out.println("podaj wartość do przeliczenia: ");
                    float number =scan.nextFloat();
                    lengthConv.convertKM(number);
                }
                else if(menu==2)
                {
                    System.out.println("podaj wartość do przeliczenia: ");
                    float number =scan.nextFloat();
                    lengthConv.convertM(number);
                }
                else if(menu==3)
                {
                    System.out.println("podaj wartość do przeliczenia: ");
                    float number =scan.nextFloat();
                    lengthConv.convertDM(number);
                }
                else if(menu==4)
                {
                    System.out.println("podaj wartość do przeliczenia: ");
                    float number =scan.nextFloat();
                    lengthConv.convertCM(number);
                }
                else if(menu==5)
                {
                    System.out.println("podaj wartość do przeliczenia: ");
                    float number =scan.nextFloat();
                    lengthConv.convertMM(number);
                }
                else if (menu == 0)
                {
                    for (int ii=0;ii <10;ii++)
                    { System.out.println(" ");}
                }


            }


            case 0 -> {exit =false;}


        }}

    }
}