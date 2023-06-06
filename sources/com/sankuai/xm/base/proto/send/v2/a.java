package com.sankuai.xm.base.proto.send.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.f;
import com.sankuai.xm.base.proto.protobase.g;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a extends com.sankuai.xm.base.proto.send.a<com.sankuai.xm.base.proto.protobase.d> {
    public static ChangeQuickRedirect B;
    protected String C;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = B;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d26a5846d8e739fca1e12d649866a09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d26a5846d8e739fca1e12d649866a09");
        } else {
            this.y = new g();
        }
    }

    public final g z() {
        return (g) this.y;
    }

    public final String A() {
        return this.C;
    }

    public final void f(String str) {
        this.C = str;
    }

    public final String B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = B;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7195c3785b1f325c9bf0d6db8bd56e7", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7195c3785b1f325c9bf0d6db8bd56e7") : ((g) this.y).v();
    }

    public final void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = B;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bf2fb0a7e3a36953f3fe77596dd5e56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bf2fb0a7e3a36953f3fe77596dd5e56");
        } else {
            ((g) this.y).b(str);
        }
    }

    @Override // com.sankuai.xm.base.proto.protobase.h
    public final /* bridge */ /* synthetic */ f v() {
        return (g) this.y;
    }
}
