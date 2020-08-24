package top.serug.algorithm.simplesort.insertsort.baseclass;

public class InsertArray {

	private long[] a;
	private int nElems;
	
	public InsertArray(int max) {
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
	
	public void insertSort() {
		int in,out;
		//外层循环：有多少个待排列的数据项
		for(out = 1; out < nElems; out++) {
			long temp = a[out];
			in = out;
			while(in>0 && a[in-1]>=temp) {
				a[in] = a[in-1];
				--in;
			}
			a[in] = temp;
		}
	}
	
}
