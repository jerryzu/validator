package lab.crazyspark.validator.mysql;

import org.apache.commons.beanutils.BeanUtils;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MySQLColumnValidator implements ConstraintValidator<MySQLColumn, Object> {
    private String colNameField;
    private String dataTypeField;
    private String colLenField;
    private String precisionField;
    private String scaleField;

    @Override
    public void initialize(final MySQLColumn constraintAnnotation) {
        colNameField = constraintAnnotation.colName();
        dataTypeField = constraintAnnotation.dataType();
        colLenField = constraintAnnotation.colLen();
        precisionField = constraintAnnotation.precision();
        scaleField = constraintAnnotation.scale();
    }
    
    @Override
    public boolean isValid(final Object value, final ConstraintValidatorContext context) {
        try {
            final Object colNameObj = BeanUtils.getProperty(value, colNameField);
            final Object dataTypeObj = BeanUtils.getProperty(value, dataTypeField);
            final Object colLenObj = BeanUtils.getProperty(value, colLenField);
            final Object precisionObj = BeanUtils.getProperty(value, precisionField);
            final Object scaleObj = BeanUtils.getProperty(value, scaleField);
            String colName;
            String dataType;
            Integer colLen;
            Integer precision;
            Integer scale;
            if (colNameObj == null || dataTypeObj == null) {
                return false;
            } else {
                colName = String.valueOf(colNameObj);
                dataType = String.valueOf(dataTypeObj).toLowerCase();
            }
            if (colLenObj == null) {
                colLen = 0;
            } else {
                colLen = Integer.parseInt(String.valueOf(colLenObj));
            }
            if (precisionObj == null) {
                precision = 0;
            } else {
                precision = Integer.parseInt(String.valueOf(precisionObj));
            }
            if (scaleObj == null) {
                scale = 0;
            } else {
                scale = Integer.parseInt(String.valueOf(scaleObj));
            }
            /*
             * 整数类型：BIT、BOOL、TINY INT、SMALL INT、MEDIUM INT、 INT、 BIG INT
             * 浮点数类型：FLOAT、DOUBLE、DECIMAL 字符串类型：CHAR、VARCHAR、TINY TEXT、TEXT、MEDIUM
             * TEXT、LONGTEXT、TINY BLOB、BLOB、MEDIUM BLOB、LONG BLOB
             * 日期类型：Date、DateTime、TimeStamp、Time、Year
             * 其他数据类型：BINARY、VARBINARY、ENUM、SET、Geometry、Point、MultiPoint、LineString、
             * MultiLineString、Polygon、GeometryCollection等
             */
            switch (dataType) {
            case "char":
            case "varchar":
                if (colLen <= 0) {
                    return false;
                } else {
                    break;
                }
            case "decimal": {
                if (precision <= scale) {
                    return false;
                } else {
                    break;
                }
            }
            default:
                return true;
            }
        } catch (

        final Exception ignore) {
            // ignore
        }
        return true;
    }
}