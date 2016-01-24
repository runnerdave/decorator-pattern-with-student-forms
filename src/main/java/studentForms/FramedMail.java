package studentForms;

import java.math.BigDecimal;

public class FramedMail extends StudentFormDecorator {
	public FramedMail(StudentForm decoratedForm) {
		super(decoratedForm);
	}

	public BigDecimal calculatePrice() {
		return super.calculatePrice().add(BigDecimal.valueOf(Double.valueOf(myResources.getString("framed.mail"))));
	}
}
