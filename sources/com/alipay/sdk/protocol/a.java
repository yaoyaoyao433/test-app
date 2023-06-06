package com.alipay.sdk.protocol;

import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public enum a {
    None("none"),
    WapPay("js://wappay"),
    Update("js://update"),
    OpenWeb("loc:openweb"),
    SetResult("loc:setResult"),
    Exit("loc:exit");
    
    public String h;

    a(String str) {
        this.h = str;
    }

    public static a a(String str) {
        a[] values;
        if (TextUtils.isEmpty(str)) {
            return None;
        }
        a aVar = None;
        for (a aVar2 : values()) {
            if (str.startsWith(aVar2.h)) {
                return aVar2;
            }
        }
        return aVar;
    }
}
