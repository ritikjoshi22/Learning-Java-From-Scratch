package package2;
import package1.*;

public class C {
	public String publicMessage = "This is public";
	String defaultMessage = "This is Default";
	private String privateMessage = "This is Private";
	
//	public: visible in all classes in all packages
//	protected: visible to all classes in the same package or classes in other packages that are a subclass
//	default: visible to all classes in the same package 
//	private: visible only in the same class
}
