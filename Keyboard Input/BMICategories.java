import java.util.Scanner;

public class BMICategories
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, inch_h, lbs_w;
		String bmi_category;
		
		System.out.print( "Your height in inches: ");
		inch_h = keyboard.nextInt();
		
		System.out.print( "Your weight in pounds: " );
		lbs_w = keyboard.nextDouble();
		
		// metric conversions to change inches to meter
		m = inch_h / 39.370;
		// metric conversion from pounds to kilogram
		kg = lbs_w / 2.2046;
		
		bmi = kg / (m*m);
		
		System.out.println ( "Your BMI is " + bmi );

        if ( bmi  < 15 )
        	bmi_category = "very severely underweight";
        else if  ( bmi < 16 )
        	bmi_category = "severely underweight";
        else if ( bmi < 18.5 )
        	bmi_category = "underweight";
        else if ( bmi < 25 )
        	bmi_category = "normal weight";
        else if ( bmi < 30 )
        	bmi_category = "overweight";
        else if ( bmi < 35 )
        	bmi_category = "moderately obese";
        else if ( bmi < 40	)
        	bmi_category = "severely obese";
        else
        	bmi_category = "very severely (or \"morbidly\") obese";

        System.out.println( "BMI Category: " + bmi_category);        	
        
	}
}