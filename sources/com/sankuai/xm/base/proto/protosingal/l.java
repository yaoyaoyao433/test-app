package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class l extends com.sankuai.xm.base.proto.protobase.g {
    public static ChangeQuickRedirect a;
    public long b;
    public long c;
    public String d;

    public l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0135177d25ad999d4d6d22edf02094da", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0135177d25ad999d4d6d22edf02094da");
        } else {
            this.b = 0L;
        }
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ad1cbbfdeb9341c504fe23d283a89db", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ad1cbbfdeb9341c504fe23d283a89db");
        }
        a(196724);
        d(this.b);
        d(this.c);
        c(this.d);
        return super.bS_();
    }
}
