public class DiceRunner{
	public static void main(String[]args){

		Die one = new Die();
		Die two = new Die();
		DiceHolder tester = new DiceHolder();
		int c = 0;
		int b = 0;

		while(c==0){
			b++;
			one.roll();
			two.roll();
			System.out.println( "Die 1: "+ one );
			System.out.println( "Die 2: "+ two );
			if (one.getValue()==1 && two.getValue()==1)
			c++;
		}

		System.out.println("You rolled the die "+b+" times before you rolled snake eyes");

		Die a = new Die();
		for(int i=0; i<6; i++){
			a.roll();
			tester.addDie(a);
			System.out.println( tester );
		}

		tester.shake();
		System.out.println();
		System.out.println( tester );




	}
}