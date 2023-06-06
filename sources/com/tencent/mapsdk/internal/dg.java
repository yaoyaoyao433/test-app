package com.tencent.mapsdk.internal;

import com.tencent.mapsdk.internal.ci;
import com.tencent.mapsdk.internal.ci.a;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class dg<R extends ci.a> extends de<R> {
    public String d;
    public String e;

    @Override // com.tencent.mapsdk.internal.ci
    public final String e() {
        return this.d;
    }

    @Override // com.tencent.mapsdk.internal.de, com.tencent.mapsdk.internal.ci
    public final String f() {
        return this.e;
    }

    private void a(String str) {
        this.d = str;
    }

    private void b(String str) {
        this.e = str;
    }
}
