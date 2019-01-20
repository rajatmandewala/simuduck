package simuduck;

public class Decoyduck extends Duck 
{
	@Override
	void Display() 
	{
		System.out.println("i am "+this.getClass().getSimpleName());		
	}
}
