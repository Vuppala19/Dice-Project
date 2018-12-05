public class Die{

	private int side;
	private int value;

		public Die (){
			side = 6;
			value = 0;
		}

		public Die(int side, int value){
			this.side = side;
			this.value = value;
		}

		public int getValue(){
			return value;
		}

		public void roll(){
			this.value = (int)(Math.random()*side);
		}





}