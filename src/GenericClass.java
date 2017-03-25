
public class GenericClass<EmployeeID, EmployeeName> {
	//we created a Reference type of Object EmployeeID and EmployeeName
	EmployeeID id;
	EmployeeName name;
	
	
	GenericClass(EmployeeID id , EmployeeName name){
		this.id = id;
		this.name = name;
	}
	
	//return types:
	void showTypes(){
		System.out.println("Reference of id is:" + id.getClass().getName());
		System.out.println("Reference of id name:" + name.getClass().getName());
	}
	
	EmployeeID GetObject1(){
		return id;
	}
	
	EmployeeName GetObject2(){
		return name;
	}
	
	
}
