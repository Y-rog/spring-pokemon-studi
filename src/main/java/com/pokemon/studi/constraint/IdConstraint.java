package com.pokemon.studi.constraint;

import com.pokemon.studi.constraint.validator.IdConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = {IdConstraintValidator.class})
public @interface IdConstraint {

    String message() default "l'id est égal à 0";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
