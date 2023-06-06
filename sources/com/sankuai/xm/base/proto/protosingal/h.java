package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h extends com.sankuai.xm.base.proto.protobase.g {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public short f;
    public int g;
    public short h;
    public String i;
    public String j;
    public boolean k;
    public long l;
    public String s;

    public h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6998c0336b134ab515a116fb9c51a8a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6998c0336b134ab515a116fb9c51a8a0");
            return;
        }
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = (short) 0;
        this.g = 0;
        this.h = (short) 0;
        this.i = null;
        this.j = null;
        this.k = false;
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2c9760cbacaf41026ef30c1bb61cefc", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2c9760cbacaf41026ef30c1bb61cefc");
        }
        a(196721);
        c(this.b);
        c(this.c);
        c(this.d);
        c(this.e);
        d(this.f);
        c(this.g);
        d(this.h);
        c(this.i);
        c(this.j);
        a(Boolean.valueOf(this.k));
        d(this.l);
        c(this.s);
        return super.bS_();
    }
}
