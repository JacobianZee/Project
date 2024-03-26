package universe;

public class MyArray {
	private static int[] items;
	private static int length;
	private static int count;
	

	public MyArray(int size) {
		// TODO Auto-generated constructor stub
		MyArray.length = size;
		items = new int[length];
		
	}
	
	public void insert(int num) {
		//check if array is full, resize it
		if(items.length == count) {
			//create a new array twice the size
			int[] newArray = new int[count*2];			
			//copy all existing items
			for(int i = 0; i < count;i++) {
				//set "items" to this new array
				newArray[i] = items[i];
			}
			items = newArray;
		}
		
			//Add item to the last/end of the array
			items[count++] = num;//every time this line is executed it increments the size of the array by one			
		
		
	}
	
	public void showArray() {
		//print only the ones that we inserted
		for(int i = 0; i < count;i++){
			System.out.print(items[i]+" ");
		}
	}
	

}
