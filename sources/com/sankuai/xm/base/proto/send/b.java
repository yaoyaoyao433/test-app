package com.sankuai.xm.base.proto.send;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class b extends a<com.sankuai.xm.base.proto.protobase.c> {
    public static ChangeQuickRedirect B;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = B;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f111518ff08995b69ca5f23c1e9923ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f111518ff08995b69ca5f23c1e9923ee");
        } else {
            this.y = new com.sankuai.xm.base.proto.protobase.e();
        }
    }

    public final com.sankuai.xm.base.proto.protobase.e z() {
        return (com.sankuai.xm.base.proto.protobase.e) this.y;
    }

    public final String A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = B;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a58fd145a96f12d9c45c18070cfb3a", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a58fd145a96f12d9c45c18070cfb3a") : ((com.sankuai.xm.base.proto.protobase.e) this.y).h();
    }

    public final void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = B;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fd7fcf077dc471d629e8bd6182aea3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fd7fcf077dc471d629e8bd6182aea3d");
        } else {
            ((com.sankuai.xm.base.proto.protobase.e) this.y).b(str);
        }
    }

    @Override // com.sankuai.xm.base.proto.protobase.h
    public final /* bridge */ /* synthetic */ com.sankuai.xm.base.proto.protobase.f v() {
        return (com.sankuai.xm.base.proto.protobase.e) this.y;
    }
}
