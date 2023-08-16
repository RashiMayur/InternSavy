import java.util.*;
class TempConvertor{	
	public static void main(String arg[]){
	    double f,c;
        Scanner sc=new Scanner(System.in);
        
        int ch;
        do{
            System.out.println("Choose type of conversion ");
			System.out.println("*------------ ** --------------*");
			System.out.println("1. Fahrenheit to Celsius ");
			System.out.println("2. Celsius to Fahrenheit ");
			System.out.println("3. Celcius to kelvin");
            System.out.println("4. Kelvin to Celcius ");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.println("Enter your choice : ");
			ch = sc.nextInt();
  
	    switch(ch) {
	        case 1:  
            	System.out.println("Enter  Fahrenheit temperature");
           		f=sc.nextDouble();
	    		c=(f-32)*5/9;
	    		System.out.println("Celsius temperature is = "+c);
		    	break;
	    	case 2:  
           		System.out.println("Enter  Celsius temperature");
       	    	c=sc.nextDouble();
	    		f=((9*c)/5)+32;
	    		System.out.println("Fahrenheit temperature is = "+f);
		    	break;
			case 3 : 
				System.out.println("Enter temperature in celcius : ");
				double celsius = sc.nextDouble();
				double kelvin = (celsius + 273.15);
				System.out.println("Temprature in kelvin : " + kelvin);
				break;
			case 4 : 
				System.out.println("Enter temperature in kelvin : ");
				double kel = sc.nextDouble();
				double cel = (kel - 273.15);
				System.out.println("Temprature in kelvin" + cel);
				break;
			case 5 : 
				System.out.print("Enter temperature in Fahrenheit: ");
				double fahrenheit = sc.nextDouble();
				double kel2 = (fahrenheit - 32) * 5/9 + 273.15;
				System.out.println("Temprature in kelvin : " + kel2);
				break;
			case 6 : 
				System.out.println("Enter temperature in kelvin : ");
				double kel3 = sc.nextDouble();
				double fahrenheit1 = (kel3 - 273.15) * 9/5 + 32;
				System.out.println("Temperature in Fahrenheit: " + fahrenheit1);
				break;
			case 7 : 
				System.out.println("Exiting the code");
				break;
	   		default:  
            	System.out.println("please choose valid choice");
            	break;
	   		}  
		} 
    	while(ch != 7);
	}
}