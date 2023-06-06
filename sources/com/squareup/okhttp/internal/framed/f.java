package com.squareup.okhttp.internal.framed;

import okhttp3.internal.http2.Header;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class f {
    public static final okio.f a = okio.f.a(Header.RESPONSE_STATUS_UTF8);
    public static final okio.f b = okio.f.a(Header.TARGET_METHOD_UTF8);
    public static final okio.f c = okio.f.a(Header.TARGET_PATH_UTF8);
    public static final okio.f d = okio.f.a(Header.TARGET_SCHEME_UTF8);
    public static final okio.f e = okio.f.a(Header.TARGET_AUTHORITY_UTF8);
    public static final okio.f f = okio.f.a(":host");
    public static final okio.f g = okio.f.a(":version");
    public final okio.f h;
    public final okio.f i;
    final int j;

    public f(String str, String str2) {
        this(okio.f.a(str), okio.f.a(str2));
    }

    public f(okio.f fVar, String str) {
        this(fVar, okio.f.a(str));
    }

    public f(okio.f fVar, okio.f fVar2) {
        this.h = fVar;
        this.i = fVar2;
        this.j = fVar.h() + 32 + fVar2.h();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.h.equals(fVar.h) && this.i.equals(fVar.i);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.h.hashCode() + 527) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return String.format("%s: %s", this.h.a(), this.i.a());
    }
}
