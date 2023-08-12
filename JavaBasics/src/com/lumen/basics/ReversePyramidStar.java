package com.lumen.basics;

public class ReversePyramidStar {

	public static void main(String[] args) {
char key='*';
int lines=3;
for(int i=lines;i>0;i--) {
	for(int j=i;j>0;j--)
		System.out.print(key);
	System.out.println();
}
	}

}
