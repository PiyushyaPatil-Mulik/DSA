package DSA.basicArray;
import javax.swing.*;
class checkSorted{
public static void main(String args[]){
	String a=JOptionPane.showInputDialog("Enter Size of an array");
	int n=Integer.parseInt(a);
	
	int arr[]=new int[n];
	
	for(int i=0;i<n;i++){
		String ele=JOptionPane.showInputDialog("Enter ele "+(i+1));
	arr[i]=Integer.parseInt(ele);
	}
	System.out.println("Enter Array is");
	for(int i=0;i<n;i++){
		System.out.println(arr[i]);
	}
	boolean isSort=true;
	for(int i=1;i<n;i++){
		if(arr[i-1] >arr[i]){
			isSort=false;
			break;
		}
	}
		
    if(isSort){
            System.out.println("Array is sorted");
		}
    else{
	System.out.println("Array is not sorted");
}	
	}
}