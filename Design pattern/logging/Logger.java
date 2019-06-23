package package1.clean_code;

public class Logger{
	private static Logger obj;
	private Logger() {}
	synchronized public static Logger getObject()
	{
		if(obj==null)
			return obj=new Logger();
		else
			return obj;
	}
	public void logg(String s,Logger l)
	{
		System.out.println(s+"     "+l);	
	}
}
