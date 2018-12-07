public class Die{

	private int side;
	private int value;

		public Die (){
			side = 6;
			value = (int)(Math.random()*side+1);
		}

		public Die(int side){
			this.side = side;
		}

		public int getValue(){
			return value;
		}

		public int getSide(){
			return side;
		}

		public void roll(){
			this.value = (int)(Math.random()*side+1);
		}

		public String toString(){
			return ("Number of sides: " + side + " & " + "Value: " + value);
		}
}