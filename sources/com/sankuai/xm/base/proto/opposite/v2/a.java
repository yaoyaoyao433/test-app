package com.sankuai.xm.base.proto.opposite.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.g;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends g {
    public static ChangeQuickRedirect a;
    private long b;
    private String c;
    private byte d;
    private byte[][] e;

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ed1b17c4025558d9f1a37e1a83265a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ed1b17c4025558d9f1a37e1a83265a9");
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

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6de975c92071bc35be54cc7267e012c", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6de975c92071bc35be54cc7267e012c");
        }
        a(26279990);
        d(this.b);
        c(this.c);
        c(this.d);
        b(this.e);
        c(this.r);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.g, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f31e6b97a803a1bd38f8a6a6d66f49c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f31e6b97a803a1bd38f8a6a6d66f49c6");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = r();
        this.d = m();
        this.e = u();
        this.r = r();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a8bc5ec999bf2d4a8793c85790bd5c3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a8bc5ec999bf2d4a8793c85790bd5c3");
        }
        return "PIMOppositeSyncRead2{uid=" + this.b + "msgUuid=" + this.c + ", deviceType=" + ((int) this.d) + ", syncReadItems=" + Arrays.toString(this.e) + ", deviceId=" + this.r + '}';
    }
}
