package com.MCOTF;

public class 构造方法_建立长方体 {
	private int length;
	private int width;
	private int heigth;
	
	public 构造方法_建立长方体(int l,int w,int h) {
		length=l;
		width=w;
		heigth=h;
	}
	public int getVolume() {
		return length*width*heigth;
	}
	public int getArea() {
		return (length*width+width*heigth+length*heigth)*2;
	}
}
