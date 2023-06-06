package com.xiaomi.push;
/* loaded from: classes6.dex */
public enum hi {
    INT(1),
    LONG(2),
    STRING(3),
    BOOLEAN(4);
    
    private final int e;

    hi(int i) {
        this.e = i;
    }

    public static hi a(int i) {
        switch (i) {
            case 1:
                return INT;
            case 2:
                return LONG;
            case 3:
                return STRING;
            case 4:
                return BOOLEAN;
            default:
                return null;
        }
    }
}
