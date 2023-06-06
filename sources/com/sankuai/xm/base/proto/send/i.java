package com.sankuai.xm.base.proto.send;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class i extends c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5c04f700c82f9d3832bd51f046fd37a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5c04f700c82f9d3832bd51f046fd37a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51ad46ce2cfbedf31f75bff2d2f4aaed", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51ad46ce2cfbedf31f75bff2d2f4aaed");
        }
        return "PPubSendMsgKFRes{msgUuid='" + this.b + "', msgId=" + this.c + ", cts=" + this.d + ", rescode=" + this.e + ", deviceType=" + ((int) this.f) + ", sessionSeqId=" + this.i + '}';
    }
}
