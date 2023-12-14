class HillStations
{
	void location()
	{
		System.out.println("Know about locations of Hillstations !!");
	}
	void famousFor()
	{
		System.out.println("Know resons for what Hillstations is famous !!");
	}
}
class Manali extends HillStations {

    @Override
    void location() {
        System.out.println("Manali is located in H.P!!");
    }

    @Override
    void famousFor() {
        System.out.println("Manali is famous for hills, snow, and trekking!!");
    }
}
class Mussoorie extends HillStations
{

	@Override
	void location()
	{
		System.out.println("Mussoorie is located in U.K!!");
	}
	@Override

	void famousFor()
	{
		System.out.println("Mussoorie is famous for its beauty!!");
	}
}
class Gulmarg extends HillStations
{
	@Override

	void location()
	{
		System.out.println("Gulmarg is located in J&K !!");
	}
	@Override

	void famousFor()
	{
		System.out.println("Gulmarg is famous for natural and scienic view.");
	}
}
public class Overrides
{
	public static void main(String args[])
	{
		HillStations superclass = new HillStations(); //output using superclass
		superclass.location();
		superclass.famousFor();

		System.out.println();

		Manali subclass = new Manali(); //output using superclass
		subclass.location();
		subclass.famousFor();

		System.out.println();

		Mussoorie msclass = new Mussoorie(); //output using superclass
		msclass.location();
		msclass.famousFor();

		System.out.println();

		Gulmarg glclass = new Gulmarg(); //output using superclass
		glclass.location();
		glclass.famousFor();
	}
}
