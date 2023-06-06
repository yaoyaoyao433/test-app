package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class o extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public int b;
    public long c;
    public short d;
    public int e;
    public String f;
    public short g;
    public short h;
    public String i;
    public String j;
    public boolean q;

    public o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29c19f2ec04e0fec570ea287de89b62c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29c19f2ec04e0fec570ea287de89b62c");
            return;
        }
        this.b = 0;
        this.c = 0L;
        this.d = (short) 0;
        this.e = 0;
        this.f = "";
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8790ea7a3c4c5fb6bb0c9d2db77c6415", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8790ea7a3c4c5fb6bb0c9d2db77c6415");
        }
        a(131093);
        c(this.b);
        d(this.c);
        d(this.d);
        c(this.e);
        c(this.f);
        d(this.g);
        d(this.h);
        c(this.i);
        c(this.j);
        a(Boolean.valueOf(this.q));
        return super.bS_();
    }
}
