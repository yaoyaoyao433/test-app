package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends com.sankuai.xm.base.proto.protobase.g {
    public static ChangeQuickRedirect a;
    public long b;
    public long c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4fb447ce3309e55d513382660e78e08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4fb447ce3309e55d513382660e78e08");
            return;
        }
        this.b = 0L;
        this.c = 0L;
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70120f8717e76db20016c142d51d26d8", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70120f8717e76db20016c142d51d26d8");
        }
        a(196728);
        d(this.b);
        d(this.c);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df22e6b9366c2f80d18029bda4c7f08c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df22e6b9366c2f80d18029bda4c7f08c");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = q();
    }
}
