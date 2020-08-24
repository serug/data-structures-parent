package top.serug.datastructures.array.applet;

import java.math.BigDecimal;


public class ArrayApplet {

	public static void main(String[] args) {
//		HighArray arr = new HighArray(10);
//		arr.insert(5);
//		arr.insert(4);
//		arr.insert(3);
//		arr.insert(7);
//		arr.insert(6);
//		arr.insert(2);
//		arr.insert(1);
		
//		arr.insert(1);
//		arr.insert(2);
//		arr.insert(3);
//		arr.insert(4);
//		arr.insert(5);
//		arr.insert(7);
//		arr.insert(15);
//		arr.insert(25);
//		
//		
//		arr.display();
//		System.out.println("find():"+ arr.find(7));
//		System.out.println("get the max of this array by getMax():"+ arr.getMax());
//		System.out.println("get the max of this array by removeMax():"+ arr.removeMax());
//		arr.display();
		
		BigDecimal month = new BigDecimal(11);
		BigDecimal rate = month.divide(new BigDecimal(12), 4, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));
		
		System.out.println(rate);
		
		
		
	
	}
}
