package simuduck;

public class Duckmain 
{	
	public void process(Duck duckobj)
	{
		duckobj.Display();
		duckobj.swim();
		//duckobj.quack();
		//System.out.println(duckobj.getClass().getSimpleName());
	}
	
	public static void main(String[] args) 
	{
		
		
		
		
		//Duckmain duckmainobject=new Duckmain();
		
		Duck duck=new Redheadduck();
		duck.Display();
		duck.swim();		
//		duck.swim();
//		duck.Display();		
//		Redheadduck redheadduck=new Redheadduck();
//		redheadduck.Display();
//		redheadduck.quack();
//		redheadduck.swim();
//		redheadduck.Display();
		//redheadduck.fly();
		//redheadduck.
		//duck.quack();
//		duckmainobject.process(duck);
//		
//		Redheadduck redheadduck=new Redheadduck();		
		
		//Duck duckobject=new Mallardduck();
//		Mallardduck mallardduckobject=new Mallardduck();
//		mallardduckobject.Display();
//		mallardduckobject.quack();
//		mallardduckobject.swim();
		
		//Duck duck=new Redheadduck();
		//duck.fly();
	}
}
