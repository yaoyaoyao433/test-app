package com.sankuai.xm.base.proto.syncread;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class e extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect b;
    protected long c;
    protected long d;
    protected long e;
    protected byte f;
    protected short g;
    protected long h;
    protected short i;

    public final long b() {
        return this.c;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d70cd65abe883d4a4f1638c749f3efe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d70cd65abe883d4a4f1638c749f3efe");
        } else {
            this.c = j;
        }
    }

    public final byte c() {
        return this.f;
    }

    public final void a(byte b2) {
        this.f = b2;
    }

    public final short d() {
        return this.g;
    }

    public final void a(short s) {
        this.g = s;
    }

    public final long e() {
        return this.h;
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72b9f0275b7851ea211c80eb3e986b11", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72b9f0275b7851ea211c80eb3e986b11");
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

    public final long i() {
        return this.d;
    }

    public final void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "145f4d63432fca7e3af4beeac2058829", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "145f4d63432fca7e3af4beeac2058829");
        } else {
            this.d = j;
        }
    }
}
