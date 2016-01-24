package studentForms;

import java.math.BigDecimal;

public class RegisteredMail extends StudentFormDecorator {

	public RegisteredMail(StudentForm decoratedForm) {
		super(decoratedForm);
	}

	public BigDecimal calculatePrice() {
		return super.calculatePrice().add(BigDecimal.valueOf(Double.valueOf(myResources.getString("registered.mail"))));
	}
}
