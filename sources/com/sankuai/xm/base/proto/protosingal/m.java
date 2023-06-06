package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class m extends com.sankuai.xm.base.proto.protobase.g {
    public static ChangeQuickRedirect a;
    public long b;
    public short c;

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d106ab541c2ce221728942cce75a3f6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d106ab541c2ce221728942cce75a3f6c");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = o();
    }
}
