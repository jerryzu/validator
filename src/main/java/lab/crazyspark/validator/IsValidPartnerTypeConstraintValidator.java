package lab.crazyspark.validator;

import java.util.Objects;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsValidPartnerTypeConstraintValidator
        implements ConstraintValidator<IsValidPartnerType, Integer> {

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (Objects.isNull(value)) {
            return true;
        }

        return UserType.isValidPartnerType(value);
    }
}
