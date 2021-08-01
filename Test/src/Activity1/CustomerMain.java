package Activity1;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		String name,address,mobile;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details:");
		line = sc.next();
		String[] words = line.split(",");
		
		Customer c = new Customer();
		
		name=words[0];
		address=words[1];
		mobile=words[2];

//		System.out.println(words[words.length-1]);
		
		c.setInfo(name,address,mobile);
		System.out.println("Name:"+c.getName());
		System.out.println("Address:"+c.getAddress());
		System.out.println("Mobile:"+c.getMobile());
		sc.close();
	}

}
