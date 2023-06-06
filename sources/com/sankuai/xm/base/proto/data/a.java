package com.sankuai.xm.base.proto.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.e;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends e {
    public static ChangeQuickRedirect a;
    public long b;
    public long[] c;
    public int d;
    public byte e;
    public byte[] f;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ea267c6b04b506d345731c4c1a9935c", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ea267c6b04b506d345731c4c1a9935c");
        }
        a(72155157);
        d(this.b);
        b(this.c);
        c(this.d);
        c(this.e);
        b(this.f);
        c(this.m);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e91e413f4e4423f53f800b0649ddce4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e91e413f4e4423f53f800b0649ddce4");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = s();
        this.d = p();
        this.e = m();
        this.f = n();
        this.m = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c51655db6574e24f124363bf58d56c7", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c51655db6574e24f124363bf58d56c7");
        }
        return "PDataSendAck{uid=" + this.b + ", messageIds=" + Arrays.toString(this.c) + ", type=" + this.d + ", deviceType=" + ((int) this.e) + ", deviceId=" + this.m + '}';
    }
}
