public class main {
public static void main (String[]args) {
	Ushtrimi1 ob = new Ushtrimi1();
	long startTime = System.nanoTime();
    ob.kthePerseritje();
    ob.ktheArray();
	long endTime = System.nanoTime();
	System.out.println("Koha "+(endTime - startTime) + " ns"); 
}}
