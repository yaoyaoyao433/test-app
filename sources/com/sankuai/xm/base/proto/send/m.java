package com.sankuai.xm.base.proto.send;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class m extends c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e82ac2efb7a1b7d0506832848053cb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e82ac2efb7a1b7d0506832848053cb6");
            return;
        }
        super.a(bArr);
        this.e = p();
        this.b = r();
        this.c = q();
        this.d = q();
        this.f = m();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d11be4dc791beec8f65292db2bba865", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d11be4dc791beec8f65292db2bba865");
        }
        return "PPubSendTTRes{msgUuid='" + this.b + "', msgId=" + this.c + ", cts=" + this.d + ", rescode=" + this.e + ", deviceType=" + ((int) this.f) + ", sessionSeqId=" + this.i + '}';
    }
}
