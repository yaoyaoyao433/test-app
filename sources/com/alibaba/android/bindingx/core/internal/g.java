package com.alibaba.android.bindingx.core.internal;

import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    String a;
    boolean e = true;
    double b = 0.0d;
    double c = 0.0d;
    double d = 0.0d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(double d, double d2, double d3, String str) {
        this.b = d;
        this.c = d2;
        this.d = d3;
        if (TextUtils.isEmpty(str)) {
            str = "XYZ";
        }
        this.a = str;
    }
}
