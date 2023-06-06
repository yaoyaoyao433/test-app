package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k extends com.sankuai.xm.base.proto.protobase.g {
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

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19b3d873bab39df68aa71e98ad34dbb3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19b3d873bab39df68aa71e98ad34dbb3");
            return;
        }
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0eda3d0a7fea01f8ee3f54f357edfd86", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0eda3d0a7fea01f8ee3f54f357edfd86");
        }
        a(196730);
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

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2aea84624df9af31765c1cff76e6dbb5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2aea84624df9af31765c1cff76e6dbb5");
        }
        return "PLoginVisitor{uid=" + this.b + ", xsid='" + this.e + "', deviceType=" + ((int) this.h) + '}';
    }
}
