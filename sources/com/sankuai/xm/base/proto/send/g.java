package com.sankuai.xm.base.proto.send;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g extends c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57c0480f6bed5fcfb3e3f79d20346804", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57c0480f6bed5fcfb3e3f79d20346804");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = q();
        this.d = q();
        this.e = p();
        this.f = m();
        this.i = q();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1193f3f75c4a89868b7d4161cbb78fe0", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1193f3f75c4a89868b7d4161cbb78fe0");
        }
        return "PIMSendMsgRes{msgUuid='" + this.b + "', msgId=" + this.c + ", cts=" + this.d + ", rescode=" + this.e + ", deviceType=" + ((int) this.f) + ", sessionSeqId=" + this.i + '}';
    }
}
