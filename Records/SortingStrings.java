import java.io.File;
import java.util.Scanner;

public class SortingStrings
{
	public static void main( String[] args ) throws Exception
	{
		Scanner kb = new java.util.Scanner(System.in);
		String usrFile;
		Car[] cars = new Car[5];
		int i = 0;
		Car temp_car;
		
				
		System.out.print( "From which file: " );
		usrFile = kb.next();
		
		File f = new File(usrFile);
		Scanner readFile = new Scanner(f);
		
		while ( readFile.hasNext() )
		{
			cars[i] = new Car();
			cars[i].make = readFile.next();
			cars[i].model = readFile.next();
			cars[i].year = readFile.nextInt();
			cars[i].license = readFile.next();
			i++;
		}
		readFile.close();
		System.out.println( "Data loaded." );
		
		for ( i = 0; i < cars.length; i++ ) {
			for ( int j = i + 1; j < cars.length; j++ ) {
				int strValue = cars[i].make.compareTo(cars[j].make);
				if ( strValue > 0 ) {
					temp_car = cars[i];
					cars[i] = cars[j];
					cars[j] = temp_car;
				}
			}
		}
		
		
		for ( i = 0; i < cars.length; i++ )
		{
			System.out.println( "Car " + (i + 1) );
			System.out.println( "\tMake: " + cars[i].make );
			System.out.println( "\tModel: " + cars[i].model );
			System.out.println( "\tYear: " + cars[i].year );
			System.out.println( "\tLicense: " + cars[i].license );
		}
	}
}