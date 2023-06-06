package com.sankuai.xm.base.proto.send;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k extends c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f95a837105a707a9117acd3d2ad2d9b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f95a837105a707a9117acd3d2ad2d9b8");
            return;
        }
        super.a(bArr);
        this.e = p();
        this.b = r();
        this.c = q();
        this.d = q();
        this.f = m();
        this.i = q();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b7f3819a64fa75de0375539dba0aa6b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b7f3819a64fa75de0375539dba0aa6b");
        }
        return "PPubSendMsgRes{msgUuid='" + this.b + "', msgId=" + this.c + ", cts=" + this.d + ", rescode=" + this.e + ", deviceType=" + ((int) this.f) + ", sessionSeqId=" + this.i + '}';
    }
}
