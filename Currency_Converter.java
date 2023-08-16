import java.util.*;
//import java.text.DecimalFormat;
class Currency_Converter
{
    public static void main(String[] args) 
        {
            double rupee,dollar,pound,code,euro,KWD;
            //DecimalFormat f = new DecimalFormat("##.###");
            Scanner sc = new Scanner(System.in);
            System.out.println("WelCome to Currency Converter ");
            System.out.println("*--------------------------------*");
            System.out.println("Enter the currency code");
            System.out.println("1. Rupee");
            System.out.println("2. Dollar");
            System.out.println("3. Pound");
            System.out.println("4. Euro");
            System.out.println("5. Kuwaiti dinar");
            System.out.println("6. Exit");

            System.out.println("Enter your choice : ");
            code=sc.nextInt();
            if(code == 1)
            {
                System.out.println("Enter amount in rupees:");
                rupee = sc.nextFloat();
                dollar = rupee / 75;
                System.out.println("Dollar : "+dollar);
                pound = rupee / 101;
                System.out.println("Pound : "+pound);
                euro = rupee / 84;
                System.out.println("Euro : "+euro);
                KWD = rupee / 250;
                System.out.println("Kuwaiti dinar : "+KWD);
            }
            else if (code == 2)
            {
                System.out.println("Enter amount in dollar:");
                dollar = sc.nextFloat();
                rupee = dollar * 75;
                System.out.println("Rupees : "+rupee);
                pound = dollar * 0.72;
                System.out.println("Pound : "+pound);
                euro = dollar * 0.88;
                System.out.println("Euro : "+euro);
                KWD = dollar * 0.30;
                System.out.println("Kuwaiti dinar : "+KWD);
            }
            else if(code == 3)
            {
                System.out.println("Enter amount in Pound:");
                pound = sc.nextFloat();
                rupee = pound * 101;
                System.out.println("Rupees : "+rupee);
                dollar = pound * 1.35;
                System.out.println("Dollar : "+dollar);
                euro = pound * 1.36;
                System.out.println("Euro : "+euro);
                KWD = pound * 0.4;
                System.out.println("Kuwaiti dinar : "+KWD);
            }
            else if(code == 4)
            {
                System.out.println("Enter amount in Euro:");
                euro = sc.nextFloat();
                rupee = euro * 84;
                System.out.println("Rupees : "+rupee);
                dollar = euro * 1.12;
                System.out.println("Dollar : "+dollar);
                pound = euro * 0.73;
                System.out.println("Pound : "+pound);
                KWD = euro * 0.34;
                System.out.println("Kuwaiti dinar : "+KWD);
            }
            else if(code == 5)
            {
                System.out.println("Enter amount in Kuwaiti dinar:");
                KWD = sc.nextFloat();
                rupee = KWD * 250;
                System.out.println("Rupees : "+rupee);
                dollar = KWD * 3.30;
                System.out.println("Dollar : "+dollar);
                pound = KWD * 2.5;
                System.out.println("Pound : "+pound);
                euro = KWD * 2.94;
                System.out.println("Euro : "+euro);
            }
            else if(code == 6){
                System.out.println("Exiting....");
            }else{
                System.out.println("Invalid Code!");
            }
    }
}