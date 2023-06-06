package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g extends com.sankuai.xm.base.proto.protobase.g {
    public static ChangeQuickRedirect a;
    public long b;
    public short c;
    public short d;

    public g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "366a14114d75e55de8dfaaee39594c2b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "366a14114d75e55de8dfaaee39594c2b");
            return;
        }
        this.b = 0L;
        this.c = (short) 0;
        this.d = (short) 0;
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6456871cc39a48989764bed823904b89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6456871cc39a48989764bed823904b89");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = o();
        this.d = o();
    }
}
