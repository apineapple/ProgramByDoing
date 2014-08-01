public class MoreVariablesAndPrinting
{
	public static void main( String[] args )
	{
		String name, eyes, teeth, hair;
		int age, height_in, weight_lbs;
		double height_cm, weight_kg;
		
		name = "Zed A. Shaw";
		age = 35; // not a lie
		height_in = 74; // inches
		height_cm = height_in * 2.54;
		weight_lbs = 180; // lbs
		weight_kg = weight_lbs / 2.2046;
		eyes = "Blue";
		teeth = "White";
		hair = "Brown";
		
		System.out.println( "Let's talk about " + name + "." );
		System.out.println( "He's " + height_in + " inches (or " + Math.round(height_cm) + " cm) tall." );
		System.out.println( "He's " + weight_lbs + " pounds (or " + Math.round(weight_kg) + " kg) heavy." );
		System.out.println( "Actually, that's not too heavy." );
		System.out.println( "He's got " + eyes + " eyes and " + hair + " hair." );
		System.out.println( "His teeth are usually " + teeth + " depending on the coffee." );
		
		// This line is tricky; try to get it exactly right.
		System.out.println( "If I add " + age + ", " + height_in + ", and " + weight_lbs + " I get " + (age + height_in + weight_lbs) + "." );
	}
}