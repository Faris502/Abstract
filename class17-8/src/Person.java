
abstract class Person {

	private String name;
	private String address;
	protected String salary;
	
	abstract void printinfo();
	
	
	public String getName() {
        return name;
    }
    public void setName(String name) {
      this.name = name;
    }
	
    public String getAddress() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
  
    public void setSalary(String salary) {
        this.salary = salary;
    }


	public String getSalary() {
		return salary;
	}
	
}


