package studentForms;

import java.math.BigDecimal;

public abstract class StudentFormDecorator extends StudentForm {

	protected StudentForm decoratedForm;

	public StudentFormDecorator(StudentForm decoratedForm) {
		super();
		this.decoratedForm = decoratedForm;
	}

	@Override
	public BigDecimal calculatePrice() {
		return decoratedForm.calculatePrice();
	}

}
