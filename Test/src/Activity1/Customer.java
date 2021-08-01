package Activity1;

public class Customer {
	private String name,address,mobile;	
	
	//setter methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void setInfo(String name,String address,String mobile) {
		setName(name);
		setAddress(address);
		setMobile(mobile);
	}
	
	//getter methods
	String getName() {
		return name;
	}
	
	
	String getAddress() {
		return address;
	}
	
	String getMobile() {
		return mobile;
	}
	
	
	
	
	
	
}
