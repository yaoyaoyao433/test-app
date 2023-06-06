package com.sankuai.xm.base.proto.syncread.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends d {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bab0e9cc1ac99a1ff0f182b487eb83bd", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bab0e9cc1ac99a1ff0f182b487eb83bd");
        }
        a(26279994);
        d(this.c);
        d(this.d);
        c(this.e);
        d(this.g);
        d(this.h);
        d(this.i);
        c(this.j);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb01d07925b067772b22d365ca2a9c6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb01d07925b067772b22d365ca2a9c6e");
            return;
        }
        super.a(bArr);
        this.c = q();
        this.d = q();
        this.e = m();
        this.g = o();
        this.h = q();
        this.i = o();
        this.j = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f216f386b3473655432665c19a1f3c0", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f216f386b3473655432665c19a1f3c0");
        }
        return "PIMSyncReadItem2{chatId=" + this.c + ", stamp=" + this.d + ", type=" + ((int) this.e) + ", peerAppId=" + ((int) this.g) + ", sts=" + this.h + ", channel=" + ((int) this.i) + ", sid=" + this.j + '}';
    }
}
