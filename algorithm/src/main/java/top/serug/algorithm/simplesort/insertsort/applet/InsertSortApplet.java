package top.serug.algorithm.simplesort.insertsort.applet;


import top.serug.algorithm.simplesort.insertsort.baseclass.InsertArray;

public class InsertSortApplet {

	public static void main(String[] args) {
		InsertArray arr = new InsertArray(10);
		arr.insert(5);
		arr.insert(4);
		arr.insert(3);
		arr.insert(7);
		arr.insert(6);
		arr.insert(2);
		
		arr.display();
		arr.insertSort();
		System.out.println("insertSort after:");
		arr.display();
	}
}
