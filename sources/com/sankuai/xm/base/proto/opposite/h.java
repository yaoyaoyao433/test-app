package com.sankuai.xm.base.proto.opposite;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    private long b;
    private String c;
    private byte d;
    private byte[][] e;

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5463fc303dda96b6962575808133ff46", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5463fc303dda96b6962575808133ff46");
        } else {
            this.b = j;
        }
    }

    public final void a(String str) {
        this.c = str;
    }

    public final void a(byte b) {
        this.d = (byte) 1;
    }

    public final byte[][] b() {
        return this.e;
    }

    public final void a(byte[][] bArr) {
        this.e = bArr;
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "099febe278d6d7f5defab0779b39a216", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "099febe278d6d7f5defab0779b39a216");
        }
        a(26869816);
        d(this.b);
        c(this.c);
        c(this.d);
        b(this.e);
        c(this.m);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e73be37ca5175a45b94d42d7cfe0bf4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e73be37ca5175a45b94d42d7cfe0bf4");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = r();
        this.d = m();
        this.e = u();
        this.m = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed2e65ecb3e37baf7715ffbd490336a5", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed2e65ecb3e37baf7715ffbd490336a5");
        }
        return "PPubOppositeSyncRead{uid=" + this.b + "msgUuid=" + this.c + ", deviceType=" + ((int) this.d) + ", syncReadItems=" + Arrays.toString(this.e) + ", deviceId=" + this.m + '}';
    }
}
