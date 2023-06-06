package com.sankuai.xm.base.proto.opposite.v2;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.g;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends g {
    public static ChangeQuickRedirect a;
    private long b;
    private String c;
    private byte d;
    private byte[][] e;

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a05f61bcd061190a496ea5f525257ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a05f61bcd061190a496ea5f525257ab");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e5479c79b99a81ef3dabce94415cb6b", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e5479c79b99a81ef3dabce94415cb6b");
        }
        a(26869825);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fd5d415c09a673b43f96b9c97fef9fe", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fd5d415c09a673b43f96b9c97fef9fe");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a43b67540c0bd46c2d6b01dff3443121", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a43b67540c0bd46c2d6b01dff3443121");
        }
        return "PPubOppositeSyncRead2{uid=" + this.b + "msgUuid=" + this.c + ", deviceType=" + ((int) this.d) + ", syncReadItems=" + Arrays.toString(this.e) + ", deviceId=" + this.r + '}';
    }
}
