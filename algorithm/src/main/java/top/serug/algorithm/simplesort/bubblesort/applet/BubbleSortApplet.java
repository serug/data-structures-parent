package top.serug.algorithm.simplesort.bubblesort.applet;


import top.serug.algorithm.simplesort.bubblesort.baseclass.BubbleArray;

public class BubbleSortApplet {

	public static void main(String[] args) {
		BubbleArray arr = new BubbleArray(10);
		arr.insert(5);
		arr.insert(4);
		arr.insert(3);
		arr.insert(7);
		arr.insert(6);
		arr.insert(2);
		
		arr.display();
		arr.towWayBubbleSort();
		//System.out.println("bubbleSort after:");
		System.out.println("towWayBubbleSort after:");
		arr.display();
	}
}
