package com.xiaomi.mipush.sdk;

import android.text.TextUtils;
/* loaded from: classes6.dex */
public final class bk {
    int a = 0;
    String b = "";

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        return !TextUtils.isEmpty(bkVar.b) && bkVar.b.equals(this.b);
    }
}
