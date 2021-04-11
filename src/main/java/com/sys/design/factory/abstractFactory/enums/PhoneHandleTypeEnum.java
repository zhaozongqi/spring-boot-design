package com.sys.design.factory.abstractFactory.enums;


public enum PhoneHandleTypeEnum {
    APPLE("apple", "appleHandler"),
    VIVO("vivo", "vivoHandler");

    private String value;

    private String handle;

    public static PhoneHandleTypeEnum getByValue(String value) {
        if (value == null) {
            return null;
        }

        for (PhoneHandleTypeEnum sourceTypeEnum : PhoneHandleTypeEnum.values()) {
            if (sourceTypeEnum.getValue().equals(value)) {
                return sourceTypeEnum;
            }
        }
        return null;
    }


    PhoneHandleTypeEnum(String value, String handle) {
        this.value = value;
        this.handle = handle;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }
}
