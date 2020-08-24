package top.serug.algorithm.simplesort.bubblesort.baseclass;

public class BubbleArray {

	private long[] a;
	private int nElems;
	
	public BubbleArray(int max) {
		a = new long[max];
		nElems = 0;
	}
	
	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}
	
	public void display() {
		for (long l : a) {
			System.out.print(l+" ") ;
		}
		System.out.println();
	}
	
	public void bubbleSort() {
		int in,out;
		//外层循环：有多少个待排列的数据项
		for(out = nElems-1; out >1; out--) {
			//内层循环：数据顺延比较
			for (in = 0; in < out; in++) {
				//生序/降序
				if(a[in] > a[out]) {
					long temp = a[in];
					a[in] = a[out];
					a[out] = temp;
				}
			}
		}
	}
	
	public void towWayBubbleSort() {
		int left,right,mov;
		for (right = nElems-1; right > 1; right--) {
			for (mov = 0; mov < right; mov++) {
				//生序/降序
				if(a[mov] > a[right]) {
					long temp = a[mov];
					a[mov] = a[right];
					a[right] = temp;
					
				}
			}
			for (left = nElems-1-right; left >= right; left--) {
				for (mov = right-1; mov > left; mov--) {
					//生序/降序
					if(a[mov] < a[left]) {
						long temp = a[mov];
						a[mov] = a[left];
						a[left] = temp;
					}
				}
			}	
		}
		
		
		
	}
	
	
}
