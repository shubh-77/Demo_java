package Activity4;

import java.util.*;
public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    HashSet<String> set=new HashSet<String>();
	    Scanner sc = new Scanner(System.in);
	    int limit = sc.nextInt();
	    sc.nextLine();
	    for(int i=0;i<limit;i++){
	    	String s =sc.nextLine();
			 set.add(s); 
	    }
        System.out.println(set.size());

//        TreeSet<String> treeSet = new TreeSet<String>(set);
//
//	    Iterator<String> i=treeSet.iterator();  
//        while(i.hasNext())  
//        {  
//        System.out.println(i.next());  
//        } 

	}


}
/*
5
Virat Kohli
MS Dhoni
Rohit Sharma
Virat Kohli
Gautam Gambir
*/