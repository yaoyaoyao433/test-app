package com.sankuai.xm.base.proto.protosingal;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class u extends com.sankuai.xm.base.proto.protobase.g {
    public static ChangeQuickRedirect a;
    public byte[] b;
    public long c;
    private long d;
    private byte e;
    private long f;

    public u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1567ae2d603e505b280a38d814a2feb8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1567ae2d603e505b280a38d814a2feb8");
            return;
        }
        this.d = 0L;
        this.b = null;
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5c79b9e4168677689cf4d5183de3f08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5c79b9e4168677689cf4d5183de3f08");
            return;
        }
        super.a(bArr);
        this.d = q();
        this.e = m();
        this.f = q();
        this.b = n();
        this.c = q();
    }
}
