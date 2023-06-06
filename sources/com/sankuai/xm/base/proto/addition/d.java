package com.sankuai.xm.base.proto.addition;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends a {
    public static ChangeQuickRedirect l;

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a437139f16166e2cbc804ae0d17a6e18", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a437139f16166e2cbc804ae0d17a6e18");
            return;
        }
        super.a(bArr);
        this.a = r();
        this.b = q();
        this.c = m();
        this.r = r();
        this.d = q();
        this.e = o();
        this.f = r();
        this.g = s();
        this.h = o();
        this.i = q();
        this.j = p();
        this.k = l().booleanValue();
    }
}
