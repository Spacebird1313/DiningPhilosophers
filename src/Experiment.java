public class Experiment
{
	private static boolean showGUI = true;
	private static boolean deadlockMode = true;
	private static int aantalFilosofen = 3;
	
	private static ExperimentGUI GUI;
	private static Tafel tafel;
	public static void main(String[] args)
	{
		System.out.println("Start het experiment!");
		if(showGUI)
		{
			GUI = new ExperimentGUI();
		}
		else
		{
			tafel = new Tafel(aantalFilosofen, deadlockMode);
			tafel.etenstijd();
		}
	}
}
