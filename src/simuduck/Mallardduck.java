package simuduck;

public class Mallardduck extends Duck implements Iduckquack,Ifly
{
	@Override
	void Display() 
	{
		System.out.println("i am Mallardduck");
	}

//	@Override
//	public void quack() 
//	{		
//		System.out.println(this.getClass().getSimpleName()+" Quack's");
//	}

//	@Override
//	public void fly() 
//	{
//		System.out.println(this.getClass().getSimpleName()+" flies");		
//	}
}
