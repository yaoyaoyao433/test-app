package com.sankuai.xm.base.proto.opposite;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    private String b;
    private long c;
    private long d;
    private long e;
    private byte f;
    private short g;
    private byte[][] h;

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3338055b10d74ad6950847785d198502", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3338055b10d74ad6950847785d198502");
        } else {
            this.c = j;
        }
    }

    public final void a(String str) {
        this.b = str;
    }

    public final void a(byte b) {
        this.f = (byte) 1;
    }

    public final void a(byte[][] bArr) {
        this.h = bArr;
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d1bc2b98bf1f828171efe28bab1d9c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d1bc2b98bf1f828171efe28bab1d9c7");
        } else {
            this.d = j;
        }
    }

    public final void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8abd94c147d2daa4a090e7a3baa914f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8abd94c147d2daa4a090e7a3baa914f6");
        } else {
            this.e = j;
        }
    }

    public final void a(short s) {
        this.g = s;
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "231a8379c4d9623dfff7429049e3d31b", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "231a8379c4d9623dfff7429049e3d31b");
        }
        a(26279985);
        c(this.b);
        d(this.c);
        d(this.d);
        d(this.e);
        c(this.f);
        d(this.g);
        b(this.h);
        c(this.m);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f612c8fb0f0de84e112397dce9530ab8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f612c8fb0f0de84e112397dce9530ab8");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = q();
        this.d = q();
        this.e = q();
        this.f = m();
        this.g = o();
        this.h = u();
        this.m = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30fa6ab089d8b96f08f6de6b11abe163", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30fa6ab089d8b96f08f6de6b11abe163");
        }
        return "PGroupOppositeSyncRead{, oppositeUuid=" + this.b + ", fromUid=" + this.c + ", toGuid=" + this.d + ", cts=" + this.e + ", deviceType=" + ((int) this.f) + ", channel=" + ((int) this.g) + ", syncReadItems=" + Arrays.toString(this.h) + ", deviceId=" + this.m + '}';
    }
}
