
public class Application {

	public static void main(String[] args) {
		
		int intValue = 888;
		short shortValue = 16;
		byte byteValue = 25;
		long longValue = 23456;
		
		float floatValue = 4321.8f; //note f
		double doubleValue = 1234.5678;
		
		//some of these are also classes with methods:		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
		//don't forget to use the drop=down menu to see some methods!
		
		//you can "cast" from one type of value to another.
		intValue = (int)longValue;
		
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
		//you didn't need a cast there because they are already compatible
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		//your cast there chopped off the stuff after the decimal
		//to round, you need the Math class
		
		byteValue = (byte)128;	
		System.out.println(byteValue);
		//that'll do something weird...
		//you get -128 because it "wraps around" to the minimum value	
		
		float floatValue2 = (float)4.56;
		
		//summary: you can't always convert from one to another
		//but you can for a lot of them!
		
	}
}
