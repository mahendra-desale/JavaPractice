package com.example.bookings.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.bookings.controller.model.Container;

@Component("contValidator")
public class ContValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Container.class.equals(clazz);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void validate(Object target, Errors errors) {
		Container container = (Container) target;
		
		if (StringUtils.isEmpty(container.getContainerType())) {
            errors.rejectValue("containerType", "containerType.empty");
        }
		
		if (container.getContainerSize() != 20 || container.getContainerSize() != 40) {
            errors.rejectValue("containerSize", "containerSize should be either 20 or 40");
        }
		
		if (container.getOrigin().length() < 5 || container.getOrigin().length() > 20) {
            errors.rejectValue("origin", "Invalid origin");
        }
		
		if (container.getDestination().length() < 5 || container.getDestination().length() > 20) {
            errors.rejectValue("destination", "Invalid destination");
        }
		
		if (container.getQuantity() < 1 || container.getQuantity() > 100) {
            errors.rejectValue("quantity", "Invalid quantity");
        }
		
	}

}
