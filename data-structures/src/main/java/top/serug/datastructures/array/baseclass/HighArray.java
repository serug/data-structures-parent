package top.serug.datastructures.array.baseclass;

public class HighArray {

	private long[] arr;
	private int nElems;
	
	public HighArray(int size){
		arr = new long[size];
		nElems = 0;
	}
	
	public void insert(long value) {
		arr[nElems] = value;
		nElems++;
	}
	
	public int find(long value) {
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIndex;
		
		while(true) {
			curIndex = (lowerBound+upperBound)/2;
			if(arr[curIndex]==value)
				return curIndex;
			else if(lowerBound > upperBound)
				return nElems;
			else {
				if (arr[curIndex] < value) 
					lowerBound = curIndex + 1;
				else
					upperBound = curIndex - 1;
			}
		}
	}
	
	
	
	public void display() {
		for (long l : arr) {
			System.out.print(l+" ");
		}
		System.out.println();
	}
	
	public long getMax() {
		long max = -1;
		if(nElems != 0 )
			max = arr[0];
		for (int i = 0; i < nElems; i++) {
			if(i+1<nElems && max<arr[i+1]) {
				max = arr[i+1];
			}
		}
		return max;
	}
	
	public long removeMax() {
		long max = -1;
		int index = 0;
		if(nElems != 0 )
			max = arr[0];
		for (int i = 0; i < nElems; i++) {
			if(i+1<nElems && max<arr[i+1]) {
				max = arr[i+1];
				index = i+1;
			}
		}
		for (int i = index; i < nElems; i++) 
			arr[i] = arr[i+1];
		nElems--;
		return max;
	}
	
	public void orderArr(String orderType) {
		//降序(从大到小)
		if("desc".equals(orderType)) {
			
		}else{
			
		}
		
		
	}
}
