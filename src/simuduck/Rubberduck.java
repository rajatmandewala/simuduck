package simuduck;

public class Rubberduck extends Duck 
{
	@Override
	void Display() 
	{
		System.out.println("i am "+this.getClass().getSimpleName());
	}
}
