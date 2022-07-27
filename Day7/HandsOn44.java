package Day7;
abstract class Instrument
{
	public abstract String play();
}
class Piano extends Instrument
{   
	public String play()
	{
       return "Piano is playing tan tan tan tan";
	}	
}
class Flute extends Instrument
{   
	public String play()
	{
       return "Flute is playing toot toot toot toot";
	}	
}
class Guitar extends Instrument
{   
	public String play()
	{
       return "Guitar is playing tin tin tin ";
	}	
}

public class HandsOn44 {

	public static void main(String[] args) {
		Instrument a[]=new Instrument[10];
		for(int i=0;i<10;i++)
		{
			double b=Math.random()*3;//Generate Random number
			int x=(int)b;
		if(x==0)
			a[i]=new Piano();
		else if(x==1)
			a[i]=new Flute();
		else 
			a[i]=new Guitar();
		System.out.println(a[i].play());
		}
		for(int i=0;i<10;i++)
		{
			if (a[i] instanceof Piano) 
	    		System.out.println("Piano is stored at index " + i);
	    	else if (a[i] instanceof Flute) 
	    		System.out.println("Flute is stored at index " + i);
	    	else if (a[i] instanceof Guitar) 
	    		System.out.println("Guitar is stored at index " + i);
		}
	}

}