import java.util.ArrayList;
public class DiceHolder{

	private ArrayList<Die> holder = new ArrayList<>();
	public DiceHolder(){
	}

	public int addDie(Die die){
		if (holder.size()<6){
			holder.add(die);
		return 1;
		}
		else
		return -1;
	}

	public void shake(){
		for(int i=0; i<holder.size(); i++){
			holder.get(i).roll();
		}
	}

	public String toString(){
		String z ="";
		for(int i=0; i<holder.size(); i++){
			z += holder.get(i)+"\n";
		}

		return z;
	}
}