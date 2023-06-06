package com.tencent.tmsqmsp.oaid2;

import android.text.TextUtils;
import com.unionpay.tsmservice.mi.data.Constant;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum d {
    UNSUPPORT(-1, "unsupport"),
    HUA_WEI(0, "HUAWEI"),
    XIAOMI(1, Constant.DEVICE_XIAOMI),
    VIVO(2, "vivo"),
    OPPO(3, "oppo"),
    MOTO(4, "motorola"),
    LENOVO(5, "lenovo"),
    ASUS(6, "asus"),
    SAMSUNG(7, "samsung"),
    MEIZU(8, "meizu"),
    ALPS(9, "alps"),
    NUBIA(10, "nubia"),
    ZTE(11, "ZTE"),
    ONEPLUS(12, "OnePlus"),
    BLACKSHARK(13, "blackshark"),
    FREEMEOS(14, "freemeos"),
    SSUIOS(15, "ssui");
    
    public String a;

    d(int i, String str) {
        this.a = str;
    }

    public static d a(String str) {
        d[] values;
        if (TextUtils.isEmpty(str)) {
            return UNSUPPORT;
        }
        for (d dVar : values()) {
            if (dVar.a.equalsIgnoreCase(str)) {
                return dVar;
            }
        }
        return UNSUPPORT;
    }
}
