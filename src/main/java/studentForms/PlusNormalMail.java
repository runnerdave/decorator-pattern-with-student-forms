package studentForms;

import java.math.BigDecimal;

public class PlusNormalMail extends StudentFormDecorator {
	public PlusNormalMail(StudentForm decoratedForm) {
		super(decoratedForm);
	}

	public BigDecimal calculatePrice() {
		return super.calculatePrice().add(BigDecimal.valueOf(Double.valueOf(myResources.getString("normal.mail"))));
	}
}
