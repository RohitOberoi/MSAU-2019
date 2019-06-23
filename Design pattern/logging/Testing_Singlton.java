package package1.clean_code;

public class Testing_Singlton {
	public static void main(String s[])
	{
		Logger obj1=Logger.getObject();
		obj1.logg("Logging object1",obj1);
		
		Logger obj2=Logger.getObject();
		obj2.logg("Logging object2",obj2);
		
		Logger obj3=Logger.getObject();
		obj3.logg("Logging object3",obj3);
		
		System.out.println("     THUS WE SEE ONLY ONE OBJECT IS CREATED");
		
	}
}
