
import javax.swing.*;

public class largestElement {
    public static void main(String[] args) {
        
    
    String a=JOptionPane.showInputDialog("Enter Array Size");
    int n=Integer.parseInt(a);
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        String ele=JOptionPane.showInputDialog("Enter Array ele" + (i+1));
        arr[i]=Integer.parseInt(ele);
    }
System.out.println("Entered Array is");
    for(int j=0;j<n;j++){
        System.out.println(arr[j]);
    }
    int max=arr[0];
    for(int k=0;k<n;k++){
        if(arr[k]>max){
            max=arr[k];
        }
    }
    System.out.println("Largest Ele is "+max);
}
}