package com.meituan.android.privacy.interfaces.def;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class c {
    protected Context a;
    protected String b;

    public c(Context context, String str) {
        if (context == null) {
            return;
        }
        this.a = context.getApplicationContext();
        this.b = str;
    }
}
