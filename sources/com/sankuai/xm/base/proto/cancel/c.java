package com.sankuai.xm.base.proto.cancel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends com.sankuai.xm.base.proto.send.c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7667da7f522c2318b9716c0fb73005e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7667da7f522c2318b9716c0fb73005e9");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = q();
        this.d = q();
        this.e = p();
        this.f = m();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f58f79ed78b3a4774c6d30af3721bc6", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f58f79ed78b3a4774c6d30af3721bc6");
        }
        return "PIMCancelGroupMsgRes{msgUuid='" + this.b + "', msgId=" + this.c + ", cts=" + this.d + ", resCode=" + this.e + ", deviceType=" + ((int) this.f) + '}';
    }
}
