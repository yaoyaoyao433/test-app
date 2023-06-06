package com.sankuai.xm.base.proto.ack;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends a {
    public static ChangeQuickRedirect h;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "605bff328724ef627c049ea4382fd838", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "605bff328724ef627c049ea4382fd838");
        }
        c(this.b);
        d(this.c);
        b(this.d);
        c(this.e);
        d(this.f);
        d(this.g);
        c(this.m);
        return super.bS_();
    }
}
