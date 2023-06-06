package com.dianping.richtext.model;

import android.text.TextUtils;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d {
    public int a;
    public String b;
    public String c;
    public float d;
    public float e;
    public String f;
    public String g;
    public int h;

    public d(String str, String str2, float f, float f2, String str3, String str4, int i) {
        this.a = 2;
        this.c = str;
        this.b = str2;
        this.d = f;
        this.e = f2;
        this.f = str3;
        this.g = str4;
        this.h = i;
        if (f <= 0.0f || f2 <= 0.0f) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            this.a = 0;
        } else if (TextUtils.isEmpty(str2)) {
        } else {
            this.a = 1;
        }
    }
}
