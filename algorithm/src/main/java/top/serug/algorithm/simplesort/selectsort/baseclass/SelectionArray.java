package top.serug.algorithm.simplesort.selectsort.baseclass;

public class SelectionArray {

	private long[] a;
	private int nElems;
	
	public SelectionArray(int max) {
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
	
	public void selectionSort() {
		int in,out,min;
		//外层循环：有多少个待排列的数据项
		for(out = 0; out < nElems-1; out++) {
			min = out;
			//内层循环：数据顺延比较
			for (in = out+1; in < nElems; in++) {
				//生序/降序
				if(a[in] < a[min]) 
					min = in;
				else
					continue;
				long temp = a[out];
				a[out] = a[min];
				a[min] = temp;
			}
		}
	}
	
}
