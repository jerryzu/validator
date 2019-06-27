package lab.crazyspark.validator;

// @Getter
// @AllArgsConstructor
public enum UserType {
    /**
     * 用户是企业,用户是个人
     */
    COMPANY(1, "企业"), PERSON(2, "个人");

    private final Integer code;

    private final String desc;

    private UserType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public boolean match(final Integer code) {
        return this.getCode().equals(code);
    }

    /**
     * 是否是合法的用户类型
     * 
     * @param code 用户类型
     * @return 是否合法
     */
    public static boolean isValidPartnerType(final Integer code) {
        for (UserType item : values()) {
            if (item.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}