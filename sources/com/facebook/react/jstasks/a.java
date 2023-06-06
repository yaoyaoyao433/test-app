package com.facebook.react.jstasks;

import com.facebook.react.bridge.WritableMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    final String a;
    final WritableMap b;
    final long c;
    final boolean d;
    final d e;

    public a(String str, WritableMap writableMap, long j, boolean z, d dVar) {
        this.a = str;
        this.b = writableMap;
        this.c = j;
        this.d = z;
        this.e = dVar;
    }

    public a(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b.copy();
        this.c = aVar.c;
        this.d = aVar.d;
        d dVar = aVar.e;
        if (dVar != null) {
            this.e = dVar.d();
        } else {
            this.e = null;
        }
    }
}
