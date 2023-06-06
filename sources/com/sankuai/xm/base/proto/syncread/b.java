package com.sankuai.xm.base.proto.syncread;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends e {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "537401b41838b25c5530397f3096b699", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "537401b41838b25c5530397f3096b699");
        }
        a(26279959);
        d(this.c);
        d(this.e);
        c(this.f);
        d(this.g);
        d(this.h);
        d(this.i);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f89af06ffc135acc99ae7330623cb8a2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f89af06ffc135acc99ae7330623cb8a2");
            return;
        }
        super.a(bArr);
        this.c = q();
        this.e = q();
        this.f = m();
        this.g = o();
        this.h = q();
        this.i = o();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec43f89da553da78f5b341b1c2bb6d90", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec43f89da553da78f5b341b1c2bb6d90");
        }
        return "PIMSyncReadItem{chatId=" + this.c + ", stamp=" + this.e + ", type=" + ((int) this.f) + ", peerAppId=" + ((int) this.g) + ", sts=" + this.h + ", channel=" + ((int) this.i) + '}';
    }
}
