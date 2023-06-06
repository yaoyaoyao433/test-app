package com.sankuai.xm.base.proto.syncread.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.g;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d extends g {
    public static ChangeQuickRedirect b;
    protected long c;
    protected long d;
    protected byte e;
    protected long f;
    protected short g;
    protected long h;
    protected short i;
    protected String j;

    public final long b() {
        return this.c;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc3f24adc119282fd43df50391716b52", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc3f24adc119282fd43df50391716b52");
        } else {
            this.c = j;
        }
    }

    public final long c() {
        return this.f;
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60ba17e97b2557de1d94ea837cff0d50", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60ba17e97b2557de1d94ea837cff0d50");
        } else {
            this.f = j;
        }
    }

    public final void a(byte b2) {
        this.e = b2;
    }

    public final short d() {
        return this.g;
    }

    public final void a(short s) {
        this.g = (short) 0;
    }

    public final long e() {
        return this.h;
    }

    public final void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35e03f8c471136a4032cc71ae5435482", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35e03f8c471136a4032cc71ae5435482");
        } else {
            this.h = j;
        }
    }

    public final short f() {
        return this.i;
    }

    public final void b(short s) {
        this.i = s;
    }

    public final void a(String str) {
        this.j = str;
    }

    public final String g() {
        return this.j;
    }
}
