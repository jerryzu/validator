package lab.crazyspark.validator;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
合伙人类型: 1-企业 2-个人
@IsValidPartnerType
private Integer type;
 */

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

@Target({ FIELD, PARAMETER, LOCAL_VARIABLE })
@Retention(RUNTIME)
@Constraint(validatedBy = IsValidPartnerTypeConstraintValidator.class)
public @interface IsValidPartnerType {
    String message() default "非法的合伙人类型";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}