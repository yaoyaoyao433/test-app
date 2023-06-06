package com.sankuai.xm.base.proto.opposite;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    private long b;
    private String c;
    private byte d;
    private byte[][] e;

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4740938e263c1bf4b833390f0ffdaead", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4740938e263c1bf4b833390f0ffdaead");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0d8eaae933a4161df717ab1f3fb65d9", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0d8eaae933a4161df717ab1f3fb65d9");
        }
        a(26279980);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70686de721a005eadf9792b0e5f939ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70686de721a005eadf9792b0e5f939ab");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd54600cebe0d8a91a736fd846d8f4d", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd54600cebe0d8a91a736fd846d8f4d");
        }
        return "PIMOppositeSyncRead{uid=" + this.b + "msgUuid=" + this.c + ", deviceType=" + ((int) this.d) + ", syncReadItems=" + Arrays.toString(this.e) + ", deviceId=" + this.m + '}';
    }
}
