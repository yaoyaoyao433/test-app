package com.meizu.cloud.pushsdk.c.c;

import com.meizu.cloud.pushsdk.c.c.c;
/* loaded from: classes3.dex */
public final class k {
    public final int a;
    public final l b;
    private final i c;
    private final String d;
    private final c e;
    private final k f;
    private final k g;
    private final k h;

    /* loaded from: classes3.dex */
    public static class a {
        i a;
        String c;
        l e;
        k f;
        k g;
        k h;
        int b = -1;
        c.a d = new c.a();
    }

    private k(a aVar) {
        this.c = aVar.a;
        this.a = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d.a();
        this.b = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
    }

    public final String toString() {
        return "Response{protocol=, code=" + this.a + ", message=" + this.d + ", url=" + this.c.a + '}';
    }
}
