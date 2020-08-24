package top.serug.algorithm.simplesort.selectsort.applet;


import top.serug.algorithm.simplesort.selectsort.baseclass.SelectionArray;

import java.util.concurrent.Executors;


public class SelectSortApplet {

	public static void main(String[] args) {
		SelectionArray arr = new SelectionArray(10);
		arr.insert(15);
		arr.insert(14);
		arr.insert(13);
		arr.insert(17);
		arr.insert(16);
		arr.insert(12);
		
		arr.display();
		arr.selectionSort();
		System.out.println("selectionSort after:");
		arr.display();


		Executors.newScheduledThreadPool(5);
	}
}
