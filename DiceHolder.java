import java.util.ArrayList;
public class DiceHolder{

	private ArrayList<Die> holder = new ArrayList<>();

	public DiceHolder(){

	}

	public int addDie(Die die){

		Die a = new Die();
		holder.add(a);

		if (holder.size()<7)
		return 1;
		else
		return -1;

	}

}