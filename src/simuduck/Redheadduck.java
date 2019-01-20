package simuduck;

import java.awt.FlowLayout;

public class Redheadduck extends Duck implements Iduckquack,Ifly
{
	
//	public Redheadduck() 
//	{
//		// TODO Auto-generated constructor stub
//		Ifly.fly();
//		Iduckquack.quack();
//	}
	
	@Override
	void Display()
	{
		System.out.println("i am Redheadduck");
//		swim();
//		Iduckquack.quack();
//		Ifly.fly();		
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
