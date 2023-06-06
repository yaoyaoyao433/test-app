package com.sankuai.xm.base.proto.syncread.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends d {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c518892a9b4736e9fc8b74c725d57f3d", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c518892a9b4736e9fc8b74c725d57f3d");
        }
        a(26869828);
        d(this.c);
        d(this.d);
        c(this.e);
        d(this.f);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06cfb7c65b8de04bcb57dac4295b9de3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06cfb7c65b8de04bcb57dac4295b9de3");
            return;
        }
        super.a(bArr);
        this.c = q();
        this.d = q();
        this.e = m();
        this.f = q();
        this.g = o();
        this.h = q();
        this.i = o();
        this.j = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10fbc1c33a475acb5696225147f81e30", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10fbc1c33a475acb5696225147f81e30");
        }
        return "PPubSyncReadItem2{chatId=" + this.c + ", stamp=" + this.d + ", type=" + ((int) this.e) + ", peerUid=" + this.f + ", peerAppId=" + ((int) this.g) + ", sts=" + this.h + ", channel=" + ((int) this.i) + ", sid=" + this.j + '}';
    }
}
