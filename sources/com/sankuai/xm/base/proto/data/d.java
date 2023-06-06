package com.sankuai.xm.base.proto.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.e;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d extends e {
    public static ChangeQuickRedirect a;
    public int b;
    public long c;
    public byte[] d;
    public short e;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "141505dbaae6a0160cb832927c9e2050", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "141505dbaae6a0160cb832927c9e2050");
        }
        a(72155137);
        c(this.b);
        d(this.c);
        b(this.d);
        d(this.e);
        c(this.m);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e22637cba7d28bb8a7e93ff358e35e4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e22637cba7d28bb8a7e93ff358e35e4");
            return;
        }
        super.a(bArr);
        this.b = p();
        this.c = q();
        this.d = n();
        this.e = o();
        this.m = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "986f5add85719b578b52fc1d7dc8b929", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "986f5add85719b578b52fc1d7dc8b929");
        }
        return "PDataSendReq{type=" + this.b + ", msgId=" + this.c + ", data=" + Arrays.toString(this.d) + ", channel=" + ((int) this.e) + ", deviceId=" + this.m + '}';
    }
}
