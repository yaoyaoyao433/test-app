package com.sankuai.xm.base.proto.opposite;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    private String b;
    private long c;
    private long d;

    public final void a(String str) {
        this.b = str;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f11512f1e2a1f9d6738c6ec9c2db406", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f11512f1e2a1f9d6738c6ec9c2db406");
        } else {
            this.c = j;
        }
    }

    public final long b() {
        return this.d;
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce8d3a5f2aafee59043795f65758b74b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce8d3a5f2aafee59043795f65758b74b");
        } else {
            this.d = j;
        }
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8534bc575e86407657c5eafa9023606d", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8534bc575e86407657c5eafa9023606d");
        }
        a(26279986);
        c(this.b);
        d(this.c);
        d(this.d);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0461c21414d4e908e103c40e6506190d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0461c21414d4e908e103c40e6506190d");
            return;
        }
        super.a(bArr);
        this.b = r();
        this.c = q();
        this.d = q();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaff0c8ef3da91ee667af5a41027d4c6", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaff0c8ef3da91ee667af5a41027d4c6");
        }
        return "PGroupOppositeSyncReadItem{msgUuid=" + this.b + ", toUid=" + this.c + ", msgId=" + this.d + '}';
    }
}
