import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.concurrent.Semaphore;

public class Tafel
{
	private ArrayList<Filosoof> filosofen = new ArrayList<Filosoof>();
	private Semaphore vorken[];
	private Semaphore ruimte;
	
	public Tafel(int plaatsen, boolean deadlockMode)
	{
		vorken = new Semaphore[plaatsen];
		if(deadlockMode)
		{
			this.ruimte = new Semaphore(plaatsen);
		}
		else
		{
			this.ruimte = new Semaphore(plaatsen-1);
		}
		
		for(int i = 0; i < plaatsen; i++)
		{
			this.vorken[i] = new Semaphore(1);
			this.filosofen.add(new Filosoof(i, this));
		}
	}
	
	public void etenstijd()
	{
		Iterator<Filosoof> iterator = filosofen.iterator();
		while(iterator.hasNext())
		{
			Filosoof filosoof = iterator.next();
			Thread t = new Thread(filosoof);
			t.start();			
		}
	}
	
	public boolean vraagPlaats()
	{
		return this.ruimte.tryAcquire();
	}
	
	public void maakPlaats()
	{
		this.ruimte.release();
	}
	
	public boolean vraagVork(int nummer)
	{
		return this.vorken[nummer].tryAcquire();
	}
	
	public void vorkTerugleggen(int nummer)
	{
		this.vorken[nummer].release();
	}
	
	public int aantalVorken()
	{
		return vorken.length;
	}
	
	public Observable observerableOpvragen(int nummer)
	{
		return this.filosofen.get(nummer).observerableOpvragen();
	}
}
