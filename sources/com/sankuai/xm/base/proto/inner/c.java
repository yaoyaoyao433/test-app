package com.sankuai.xm.base.proto.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class c extends com.sankuai.xm.base.proto.protobase.e {
    public static ChangeQuickRedirect a;
    public long b;
    public long c;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final byte[] bS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb77965e3b763c85eef5071a441f4bec", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb77965e3b763c85eef5071a441f4bec");
        }
        d(this.b);
        d(this.c);
        c(this.d);
        c(this.e);
        c(this.f);
        d(this.g);
        d(this.h);
        d(this.i);
        d(this.j);
        return super.bS_();
    }

    @Override // com.sankuai.xm.base.proto.protobase.e, com.sankuai.xm.base.proto.protobase.b
    public final void a(byte[] bArr) {
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4baaa04cf7ce2b27a2d657db5152d34", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4baaa04cf7ce2b27a2d657db5152d34");
            return;
        }
        super.a(bArr);
        this.b = q();
        this.c = q();
        this.d = p();
        this.e = p();
        this.f = p();
        this.g = q();
        this.h = q();
        this.i = q();
        this.j = q();
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c70b1e40630514416a927bf816727c7b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c70b1e40630514416a927bf816727c7b");
        }
        return "PCallInfo{uid=" + this.b + ", peerUid='" + this.c + ", roles=" + this.d + ", callStatus=" + this.e + ", callType=" + this.f + ", startCallTs=" + this.g + ", startTalkTs=" + this.h + ", endTs=" + this.i + ", callDur=" + this.j + '}';
    }
}
