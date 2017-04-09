package cc;

import java.awt.im.InputContext;
import java.util.Scanner;
import java.*;
public class Ew {
	public static void main(String arg[]){
		int n,i,j,c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a n.o of array");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array element");
		for(i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					c++;
				System.out.println(arr[i]);
				break;
				}
				}
			}
		if(c==0){
			System.out.println("No intex value is equal");
		}
	}}