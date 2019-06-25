package lab.crazyspark.validator.mysql;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;

/*
 * @Mysql(colName = "colID", dataType = "dataType", colLen = "colLen", precision = "precision", scale = "scale", message = "column rule not match")
 */
@Target({ TYPE, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = MySQLColumnValidator.class)
@Documented
public @interface MySQLColumn {
    String message() default "{constraints.fieldmatch}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    String colName();
    String dataType();
    String colLen();
    String precision();
    String scale();

    @Target({ TYPE, ANNOTATION_TYPE })
    @Retention(RUNTIME)
    @Documented
    @interface List {
        MySQLColumn[] value();
    }
}