package com.MCOTF;

public class ���췽��_���������� {
	private int length;
	private int width;
	private int heigth;
	
	public ���췽��_����������(int l,int w,int h) {
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
