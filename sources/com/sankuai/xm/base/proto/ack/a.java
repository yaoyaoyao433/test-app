package com.sankuai.xm.base.proto.ack;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.proto.protobase.e;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class a extends e {
    public static ChangeQuickRedirect a;
    protected byte b;
    protected long c;
    protected long[] d;
    protected byte e;
    protected long f;
    protected long g;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d216d086292d814e2591fc7d2f74110", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d216d086292d814e2591fc7d2f74110");
        } else {
            this.e = (byte) 1;
        }
    }

    public final void a(byte b) {
        this.b = (byte) 1;
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a47afffb8adcfdb3668177cbd64d71b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a47afffb8adcfdb3668177cbd64d71b7");
        } else {
            this.c = j;
        }
    }

    public final void a(long[] jArr) {
        this.d = jArr;
    }

    public final void b(byte b) {
        this.e = (byte) 2;
    }

    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da8282e472199938f114fd88be3a8c1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da8282e472199938f114fd88be3a8c1c");
        } else {
            this.f = j;
        }
    }

    public final void c(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd634e5388706e05d18bb5d825f4f934", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd634e5388706e05d18bb5d825f4f934");
        } else {
            this.g = j;
        }
    }
}
