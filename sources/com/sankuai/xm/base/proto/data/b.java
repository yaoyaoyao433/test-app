package com.sankuai.xm.base.proto.data;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.e;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends e {
    public static ChangeQuickRedirect a;
    public int b;
    public byte c;
    public byte[] d;
    public String e;
    public short f;
    private long g;
    private long h;
    private long i;

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e4c1b29b14af80afc8bea9ab1905be6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e4c1b29b14af80afc8bea9ab1905be6");
        } else {
            this.g = j;
        }
    }

    public final void b(long j) {
        Object[] objArr = {0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28cd0b43e05eb7fcb3e3788601ffa625", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28cd0b43e05eb7fcb3e3788601ffa625");
        } else {
            this.h = 0L;
        }
    }

    public final void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d783e99e04744ee48ffd2de23954831", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d783e99e04744ee48ffd2de23954831");
        } else {
            this.i = j;
        }
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4223b335d583fe151da593daaa17710e", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4223b335d583fe151da593daaa17710e");
        }
        a(72155146);
        d(this.g);
        d(this.h);
        d(this.i);
        c(this.b);
        c(this.c);
        b(this.d);
        c(this.e);
        d(this.f);
        c(this.m);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "438adb2b3c43a1631560bd6ec95c9471", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "438adb2b3c43a1631560bd6ec95c9471");
            return;
        }
        super.a(bArr);
        this.g = q();
        this.h = q();
        this.i = q();
        this.b = p();
        this.c = m();
        this.d = n();
        this.e = r();
        this.f = o();
        this.m = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9af84844820834771e7a3782f64d289f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9af84844820834771e7a3782f64d289f");
        }
        return "PDataSendClientReq{fromUid=" + this.g + ", messageId=" + this.h + ", cts=" + this.i + ", type=" + this.b + ", deviceType=" + ((int) this.c) + ", data=" + Arrays.toString(this.d) + ", messageUuid='" + this.e + "', channel=" + ((int) this.f) + ", deviceId=" + this.m + '}';
    }
}
