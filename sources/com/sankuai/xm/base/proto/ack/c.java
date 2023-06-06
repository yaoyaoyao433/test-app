package com.sankuai.xm.base.proto.ack;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends a {
    public static ChangeQuickRedirect h;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4c830ced047d3297b712c5c65e52548", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4c830ced047d3297b712c5c65e52548");
        }
        c(this.b);
        d(this.c);
        b(this.d);
        c(this.m);
        return super.bS_();
    }
}
