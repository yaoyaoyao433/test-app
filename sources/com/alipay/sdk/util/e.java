package com.alipay.sdk.util;

import com.meituan.android.common.locate.model.MTCellInfo;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum e {
    WIFI(0, "WIFI"),
    NETWORK_TYPE_1(1, "unicom2G"),
    NETWORK_TYPE_2(2, "mobile2G"),
    NETWORK_TYPE_4(4, "telecom2G"),
    NETWORK_TYPE_5(5, "telecom3G"),
    NETWORK_TYPE_6(6, "telecom3G"),
    NETWORK_TYPE_12(12, "telecom3G"),
    NETWORK_TYPE_8(8, "unicom3G"),
    NETWORK_TYPE_3(3, "unicom3G"),
    NETWORK_TYPE_13(13, MTCellInfo.TYPE_LTE),
    NETWORK_TYPE_11(11, "IDEN"),
    NETWORK_TYPE_9(9, "HSUPA"),
    NETWORK_TYPE_10(10, "HSPA"),
    NETWORK_TYPE_15(15, "HSPAP"),
    NETWORK_TYPE_20(20, "5G"),
    NONE(-1, "none");
    
    public int r;
    public String s;

    e(int i, String str) {
        this.r = i;
        this.s = str;
    }

    public static e a(int i) {
        e[] values;
        for (e eVar : values()) {
            if (eVar.r == i) {
                return eVar;
            }
        }
        return NONE;
    }
}
