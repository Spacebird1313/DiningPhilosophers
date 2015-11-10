import java.util.Observable;
import java.util.Random;

public class Filosoof implements Runnable
{
	private int nummer;
	private Tafel tafel;
	private FilosoofObserver observer;
	private Random waitGenerator;
	
	public Filosoof(int i, Tafel tafel)
	{
		nummer = i;
		this.tafel = tafel;
		this.observer = new FilosoofObserver();
		waitGenerator = new Random();
	}
	
	public Observable observerableOpvragen()
	{
		return this.observer;
	}
	
	public int getNummer()
	{
		return nummer;
	}
	
	@Override
	public void run()
	{
		eetCyclus();
	}
	
	public void eetCyclus()
	{
		while(true)
		{
			denken();
			plaatsNemen();
			rechterVorkNemen();
			linkerVorkNemen();
			eten();
			linkerVorkTerugleggen();
			rechterVorkTerugleggen();
			plaatsVrijmaken();
		}
	}
	
	private void denken()
	{
		observer.setChanged();
		observer.notifyObservers("denken");
		System.out.println("Filosoof " + nummer + " is aan het denken...");
		try
		{
			int wait = (waitGenerator.nextInt(30) + 20) * 100;
			Thread.sleep(wait);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	private void eten()
	{
		observer.setChanged();
		observer.notifyObservers("eten");
		System.out.println("Filosoof " + nummer + " geniet van de spaghetti...");
		try
		{
			int wait = (waitGenerator.nextInt(30) + 30) * 100;
			Thread.sleep(wait);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
	private void plaatsNemen()
	{
		observer.setChanged();
		observer.notifyObservers("wachtPlaats");
		System.out.println("Filosoof " + nummer + " wacht op plaats aan tafel.");
		while(!(tafel.vraagPlaats()));
		observer.setChanged();
		observer.notifyObservers("neemPlaats");
		System.out.println("Filosoof " + nummer + " heeft plaatsgenomen aan tafel.");
	}
	
	private void plaatsVrijmaken()
	{
		observer.setChanged();
		observer.notifyObservers("plaatsVrij");
		tafel.maakPlaats();
		System.out.println("Filosoof " + nummer + " is vertrokken van tafel.");
	}
	
	private void rechterVorkNemen()
	{
		observer.setChanged();
		observer.notifyObservers("wachtRVork");
		System.out.println("Filosoof " + nummer + " wacht op rechtervork: " + nummer + ".");
		while(!(tafel.vraagVork(nummer)));
		observer.setChanged();
		observer.notifyObservers("neemRVork");
		System.out.println("Filosoof " + nummer + " heeft rechtervork: " + nummer  + ".");
	}
	
	private void linkerVorkNemen()
	{
		observer.setChanged();
		observer.notifyObservers("wachtLVork");
		System.out.println("Filosoof " + nummer + " wacht op linkervork: " + (nummer + 1) % tafel.aantalVorken() + ".");
		while(!(tafel.vraagVork((nummer + 1) % tafel.aantalVorken())));
		observer.setChanged();
		observer.notifyObservers("neemLVork");
		System.out.println("Filosoof " + nummer + " heeft linkervork: " + (nummer + 1) % tafel.aantalVorken() + ".");
	}
	
	private void linkerVorkTerugleggen()
	{
		observer.setChanged();
		observer.notifyObservers("LVorkVrij");
		tafel.vorkTerugleggen((nummer + 1) % tafel.aantalVorken());
		System.out.println("Filosoof " + nummer + " heeft linkervork teruggelegd: " + (nummer + 1) % tafel.aantalVorken() + ".");
	}

	private void rechterVorkTerugleggen()
	{
		observer.setChanged();
		observer.notifyObservers("RVorkVrij");
		tafel.vorkTerugleggen(nummer);
		System.out.println("Filosoof " + nummer + " heeft rechtervork teruggelegd: " + nummer + ".");
	}
}
