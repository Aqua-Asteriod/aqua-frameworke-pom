package com.qf.commons.web.valid.constraint;

import com.qf.commons.web.valid.CustomerValid;
import com.qf.commons.web.valid.extend.AquaValid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author pww
 * @date 2021/10/18
 * @apiNote
 */
public class CustomerConstraint implements ConstraintValidator<CustomerValid, Object> {
    private CustomerValid customerValid;
    @Override
    public void initialize(CustomerValid constraintAnnotation) {
        this.customerValid=constraintAnnotation;
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        try {
            if (value == null )return true;
            AquaValid aquaValid = customerValid.myValid().newInstance();
            return aquaValid.aquaValid();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
}
