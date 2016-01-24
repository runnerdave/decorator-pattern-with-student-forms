package studentForms;

import java.math.BigDecimal;

public class ReplacementTestamur extends StudentForm {

	protected BigDecimal price = BigDecimal.valueOf(Double.valueOf(myResources.getString("replacement.testamur")));
	
	@Override
	public BigDecimal calculatePrice() {
		return price;
		
	}
	
}
