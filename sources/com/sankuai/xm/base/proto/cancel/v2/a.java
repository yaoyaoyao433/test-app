package com.sankuai.xm.base.proto.cancel.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.f;
import com.sankuai.xm.base.proto.protobase.g;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class a extends com.sankuai.xm.base.proto.cancel.a<com.sankuai.xm.base.proto.protobase.d> {
    public static ChangeQuickRedirect u;
    protected String v;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "623e779eef1c19cf87068f428bb47d65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "623e779eef1c19cf87068f428bb47d65");
        } else {
            this.y = new g();
        }
    }

    public final g u() {
        return (g) this.y;
    }

    public final String w() {
        return this.v;
    }

    public final void f(String str) {
        this.v = str;
    }

    @Override // com.sankuai.xm.base.proto.protobase.h
    public final /* bridge */ /* synthetic */ f v() {
        return (g) this.y;
    }
}
