package com.app.numbers;

import java.util.Arrays;

public class MaxMinNumbersInArray {
	public static void main(String[] args) {
		int a[]= {12,3,45,67,234,9};
		
		Arrays.stream(a).min().ifPresent(s->System.out.println(" min from labda  "+s));
		Arrays.stream(a).max().ifPresent(s->System.out.println(" max from lambda "+s));
		System.out.print("Before Sorting ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.print("After Sorting ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(+a[i]+" ");
		}
		System.out.println();
		System.out.println("Minum   Number is :"+a[0]);
		System.out.println("Maximam Number is :"+a[a.length-1]);
	}
}
