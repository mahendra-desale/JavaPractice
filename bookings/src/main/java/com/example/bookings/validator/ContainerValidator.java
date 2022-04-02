package com.example.bookings.validator;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.bookings.controller.model.Container;

@Component("containerValidator")
public class ContainerValidator implements Validator {

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
		
		if (container.getContainerSize() < 0) {
            errors.rejectValue("containerSize", "containerSize.zero");
        }
		
		if (StringUtils.isEmpty(container.getOrigin())) {
            errors.rejectValue("origin", "origin.empty");
        }
		
		if (StringUtils.isEmpty(container.getDestination())) {
            errors.rejectValue("destination", "destination.empty");
        }
		
		if (container.getQuantity() < 0) {
            errors.rejectValue("quantity", "quantity.zero");
        }
 
	}

}
