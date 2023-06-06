package com.sankuai.xm.base.proto.addition;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends a {
    public static ChangeQuickRedirect l;

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = l;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aa5a167baa32645fcfc58b0509435c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aa5a167baa32645fcfc58b0509435c5");
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
        q();
        this.g = s();
        this.h = o();
        this.i = q();
        this.j = p();
        this.k = l().booleanValue();
    }
}
