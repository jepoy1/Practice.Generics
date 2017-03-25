
public class NonGeneric {
	Object nonGen;
	
	
	NonGeneric(Object nonGen){
		this.nonGen = nonGen;
	}
	
	//Return Object:
	Object showType(){
		return nonGen.getClass().getName();
	}
	
	Object getObject(){
		return nonGen;
	}
	
}
