package com.mphasis.com;

public class EvenShow {
public void show(int n) {
	int i=1;
	while(i<n) {
		if(i%2==0) {
			System.out.println(i);
		}
		i++;
	}
}
public static void main(String[] args) {
EvenShow e1=new EvenShow();
e1.show(9);
}
}
