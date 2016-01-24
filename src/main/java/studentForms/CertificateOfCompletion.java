package studentForms;

import java.math.BigDecimal;

public class CertificateOfCompletion extends StudentForm {
	
	protected BigDecimal price = BigDecimal.valueOf(Double.valueOf(myResources.getString("certificate.of.completion")));

	@Override
	public BigDecimal calculatePrice() {
		return price;
	}

}
