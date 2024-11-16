package com.pokemon.studi.constraint.validator;

import com.pokemon.studi.constraint.IdConstraint;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IdConstraintValidator implements ConstraintValidator <IdConstraint, Long> {

    @Override
    public void initialize(IdConstraint constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Long aLong, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
