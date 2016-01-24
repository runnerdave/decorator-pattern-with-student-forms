package studentForms;

import java.math.BigDecimal;
import java.util.ResourceBundle;

public abstract class StudentForm {
	
	ResourceBundle myResources =
	  	      ResourceBundle.getBundle("ResourceBundle");
	
	
	abstract public BigDecimal calculatePrice();
}
