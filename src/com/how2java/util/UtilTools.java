package com.how2java.util;

import java.util.Random;

public class UtilTools {
	/**
	 * 生成iphone的后缀名
	 * @return
	 */
	public static String getRandomName(){
		String[] randomNames = new String[]{"X","XR","SE","XSMAX","6","7","8"};
		String nameSuffix = randomNames[new Random().nextInt(randomNames.length)];
		
		return nameSuffix;
	}
	
	/**
	 * 根据数组内容，自动生成随机值
	 * @return
	 */
	public static int getRandomPrice(){
		int[] randomNumbers = new int[]{3999,4999,5999,6999,7999,8999,9999};
		int randomPrice = randomNumbers[new Random().nextInt(randomNumbers.length)];
		return randomPrice;
	}
}
