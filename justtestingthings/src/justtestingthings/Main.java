package justtestingthings;

public class Main<T> {
	
	public double englishRuler(int length) {
		//base case
		if((length) != 0 && length%0.5==0) {
		   System.out.println("---");
		}else {
			return englishRuler(length-1);
		}
		return -1;
	}
	
	Object obj = new Object[10][10];
	T[][] arr = (T[][])obj;
	/**
	 * 
	 * @param num
	 * @return
	 */
	public boolean recCalc(int num) {
		boolean isdivisable = false;
		//base case 
		if(num == 0) {
			return !isdivisable;
			
		}
		else if(num < 3) {
			return isdivisable;
		}
		else {
			System.out.print("("+num+")"+recCalc(num -3) + "--");
			return recCalc(num - 3);
			
		}		
		
		
	}
	
	/**
	 * 
	 */

		public void print100(){
			Object[] obj =  new Object[100];
			@SuppressWarnings("unchecked")
			T[] arr = (T[])obj;
			for (int i  = 0; i <arr.length;i++){
				//allocate values
				T num = (T)Integer.valueOf(i+1);
				arr[i] = num;
				System.out.println(i+":"+arr[i]) ;
			}
		}
	

	public static void main(String[] args) {
		Main<Integer> main = new Main<>();		
		System.out.print(main.recCalc(25));
		//System.out.println();
		main.print100();
		main.englishRuler(10);
		
	}

}
