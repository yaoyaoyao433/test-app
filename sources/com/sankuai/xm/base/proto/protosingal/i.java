package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i extends com.sankuai.xm.base.proto.protobase.g {
    public static ChangeQuickRedirect a;
    public long b;
    public short c;
    public int d;
    public String e;
    public String f;
    public String g;
    public short h;
    public String i;
    public String j;
    public boolean k;
    public long l;
    public String s;

    public i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9da2bbf26dc359da0c6641e02e6b2d6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9da2bbf26dc359da0c6641e02e6b2d6");
            return;
        }
        this.b = 0L;
        this.c = (short) 0;
        this.d = 0;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = (short) 0;
        this.i = null;
        this.j = null;
        this.k = false;
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c64cad604fa14d6b2fdf528d9e8c242", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c64cad604fa14d6b2fdf528d9e8c242");
        }
        a(196719);
        d(this.b);
        d(this.c);
        c(this.d);
        c(this.e);
        c(this.f);
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
