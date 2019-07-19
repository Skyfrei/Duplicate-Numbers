import java.util.Random;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
public class Ushtrimi1 {
	int [] a = new int[30];
	Set<Integer> array2 = new TreeSet<Integer>();
	//The function that returns the repeated numbers.
	public int kthePerseritje() {
		int duplicates=0 ; 
		//Inserting the numbers in an array
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*30+1);
		}
		//Finding the duplicated numbers
		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
				array2.add(a[i]);
				}
			}
		}
		//We sort the array from the smallest number to the biggest one and we return the numbers of duplicates
		Arrays.sort(a);
		for(int i=1;i<a.length;i++) {
			if(a[i]==a[i-1]) {
				duplicates = duplicates +1;
			}
		}
        for(int i =0;i<a.length;i++) {
        	System.out.print(a[i]);
        	System.out.print(" ");
        }
        System.out.print("Dubplicate number "+duplicates);
        return duplicates;
    }
    //Returns 2nd array.
	public Set ktheArray() {
		System.out.println("");
		System.out.println("The duplicated numbers are =  "+array2);
		return array2;
	}
	
 }
