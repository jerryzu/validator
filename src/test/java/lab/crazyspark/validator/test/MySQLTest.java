package lab.crazyspark.validator.test;

import java.util.List;

public class MySQLTest {
    public static void main(String[] args) {
        Column col = new Column();
        col.setTableName("sys");
        col.setColName("ID");
        col.setDataType("varchar");
        col.setColLen(10);
        col.setPrecision(36);
        col.setScale(6);
        List<String> messageList = ValidationUtils.validate(col);
        if (messageList.isEmpty()) {
        } else {
            System.out.println(String.format("记录:  %s.%s 出错信息: %s", col.getTableName(), col.getColName(), messageList));
            // notifier.doWork(String.format("记录: %s 出错信息: %s", Key(cls, iu), messageList));
        }
    }
}