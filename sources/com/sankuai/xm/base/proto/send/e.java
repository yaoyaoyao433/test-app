package com.sankuai.xm.base.proto.send;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends c {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5762a686d469feaf2edcc2d3534841a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5762a686d469feaf2edcc2d3534841a3");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = q();
        this.d = q();
        this.e = p();
        this.f = m();
        this.g = q();
        this.h = p();
        this.i = q();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8525d1fd44ca22bcf40800c566c2e548", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8525d1fd44ca22bcf40800c566c2e548");
        }
        return "PIMSendGroupMsgRes{msgUuid='" + this.b + "', msgId=" + this.c + ", cts=" + this.d + ", rescode=" + this.e + ", deviceType=" + ((int) this.f) + ", sessionSeqId=" + this.i + '}';
    }
}
