package com.midas.ad.network.model;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.midas.ad.network.b {
    public String a;
    public String b;
    private Map<String, Object> c;
    private String d;
    private String e = "GET";
    private boolean f = true;

    @Override // com.midas.ad.network.b
    public final String a() {
        return this.a;
    }

    @Override // com.midas.ad.network.b
    public final Map<String, Object> b() {
        return this.c;
    }

    @Override // com.midas.ad.network.b
    public final String c() {
        return this.b;
    }

    @Override // com.midas.ad.network.b
    public final String d() {
        return this.d;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e = str;
    }

    @Override // com.midas.ad.network.b
    public final String e() {
        return this.e;
    }
}
