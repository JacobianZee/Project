import universe.MyArray;

public class Main {

	/**
	 * 
	 * @param num, takes an integer as input
	 * @return boolean, returns a boolean
	 */
	
	public boolean recCalc(int num) {
		//BASE CASE 1
		boolean status = true;
		if(num < 3) {//if num is less than 3 then it means that it is not divisible by 3
			return !status;
		}//BASE CASE 2
		else if(num == 0){// if num is evaluated to 0 then it means there is no reminder
			return status;
		}
		else {//recursive case
			int c = num-3;
			recCalc(num-3);
			System.out.print(c+"\n--"+status);
		}
		return status;
		
		
	}	
  
	public int recursiveBinarySearch(int[] arr, int target, int left, int right) {		
		//base case
	if(left <= right) {
		int mid = (left + right)/2;
		if(arr[mid] == target) 			
			return mid;		
		else if(arr[mid] < target) //recursive cases
			return recursiveBinarySearch(arr, target,mid+1,right);		
		else
			return recursiveBinarySearch(arr, target,left,mid-1);
	}
	return -1;
		
				
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Dynamic Array test");
		  MyArray mArr = new MyArray(5); 
		  mArr.insert(1);
		  mArr.insert(2);
		  mArr.insert(3);
		  mArr.insert(4);
		  mArr.insert(5);
		  mArr.insert(6);
		  mArr.showArray();
		 
		  System.out.println();
		 
		  System.out.println("Search for index test");
		 Main main = new Main();
		 int[] myArry = {1,2,3,4,5,6,7,8,9};
		 System.out.print("The index of the desired number is:");
		 System.out.println(main.recursiveBinarySearch(myArry, 4,1,9));
		
	}

}
