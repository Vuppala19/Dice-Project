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
			System.out.println( one );
			System.out.println( two );
			if (one.getValue()==1 && two.getValue()==1)
			c++;
		}

		System.out.println("You rolled the die "+b+" times before you rolled snake eyes");

		for(int i=0; i<6; i++){
			Die a = new Die();
			tester.addDie(a);
			System.out.println( tester );
		}

		tester.shake();
		System.out.println();
		System.out.println( tester );




	}
}