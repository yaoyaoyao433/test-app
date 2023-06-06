package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.aa;
import com.squareup.okhttp.u;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l extends aa {
    private final com.squareup.okhttp.r a;
    private final okio.e b;

    public l(com.squareup.okhttp.r rVar, okio.e eVar) {
        this.a = rVar;
        this.b = eVar;
    }

    @Override // com.squareup.okhttp.aa
    public final u a() {
        String a = this.a.a("Content-Type");
        if (a != null) {
            return u.a(a);
        }
        return null;
    }

    @Override // com.squareup.okhttp.aa
    public final long b() {
        return k.a(this.a);
    }

    @Override // com.squareup.okhttp.aa
    public final okio.e c() {
        return this.b;
    }
}
