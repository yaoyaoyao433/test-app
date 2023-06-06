package com.sankuai.xm.base.proto.syncread;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends e {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c06a66bc86f4892057080cc023bc34bf", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c06a66bc86f4892057080cc023bc34bf");
        }
        a(26869802);
        d(this.c);
        d(this.e);
        c(this.f);
        d(this.d);
        d(this.g);
        d(this.h);
        d(this.i);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90387b3d96eb2a5bac2474001461e28d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90387b3d96eb2a5bac2474001461e28d");
            return;
        }
        super.a(bArr);
        this.c = q();
        this.e = q();
        this.f = m();
        this.d = q();
        this.g = o();
        this.h = q();
        this.i = o();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14da99bd353dedfc6c08d118e2930c28", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14da99bd353dedfc6c08d118e2930c28");
        }
        return "PPubSyncReadItem{chatId=" + this.c + ", stamp=" + this.e + ", type=" + ((int) this.f) + ", peerUid=" + this.d + ", peerAppId=" + ((int) this.g) + ", sts=" + this.h + ", channel=" + ((int) this.i) + '}';
    }
}
