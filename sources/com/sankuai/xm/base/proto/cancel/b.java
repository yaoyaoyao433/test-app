package com.sankuai.xm.base.proto.cancel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public abstract class b extends a<com.sankuai.xm.base.proto.protobase.c> {
    public static ChangeQuickRedirect u;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = u;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e69b09b875efcf6eb66a2bd42f24771", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e69b09b875efcf6eb66a2bd42f24771");
        } else {
            this.y = new com.sankuai.xm.base.proto.protobase.e();
        }
    }

    public final com.sankuai.xm.base.proto.protobase.e u() {
        return (com.sankuai.xm.base.proto.protobase.e) this.y;
    }

    @Override // com.sankuai.xm.base.proto.protobase.h
    public final /* bridge */ /* synthetic */ com.sankuai.xm.base.proto.protobase.f v() {
        return (com.sankuai.xm.base.proto.protobase.e) this.y;
    }
}
