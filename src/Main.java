
public class Main {

	public static void main(String[] args) {
		//GENERICS:
		//Main Objective: Return Employee Objects as Generics.
		//Generics use Reference types: Integer, String, Boolean, not primitives
		
		//Create non-Generic to compare it to Generic Object:
		NonGeneric gen1 = new NonGeneric('c');
		System.out.println(gen1.showType());
		//Try not to cast a variable:
		int char1 = (Character) gen1.getObject();
		System.out.println(char1);
		//Non-Generics should be cast implicitly in order to know what
		//type of reference type it is.
		
		//Generic Class:
		GenericClass<Integer, String> genericOne =
		new GenericClass<Integer,String>(101, "Alladin Maderfaker");
		//Generic class doesn't need to implicitly cast Objects into
		//its primitive types. It is automatically unboxed.
		int id = genericOne.GetObject1();
		System.out.println(id);
	}

}
