package com.dianping.nvnetwork;

import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class s implements r {
    public static ChangeQuickRedirect a = null;
    private static String c = "http://appmock.51ping.com";
    private static volatile s d;
    public boolean b;

    public static s a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5add642324cbc19b3597f868b30454e3", 6917529027641081856L)) {
            return (s) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5add642324cbc19b3597f868b30454e3");
        }
        if (d == null) {
            synchronized (s.class) {
                if (d == null) {
                    d = new s();
                }
            }
        }
        return d;
    }

    @Override // com.dianping.nvnetwork.r
    public rx.d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9889c7827f36ace3b2bf8b57721634d3", 6917529027641081856L)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9889c7827f36ace3b2bf8b57721634d3");
        }
        Request a2 = aVar.a();
        if (g.p() && this.b) {
            Object[] objArr2 = {a2};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return aVar.a(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "14c769388a0062491c647185e48bee9d", 6917529027641081856L) ? (Request) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "14c769388a0062491c647185e48bee9d") : k.a(a2, c));
        }
        return aVar.a(a2);
    }

    public final void a(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4721fccd75c410e66bafdab346a28382", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4721fccd75c410e66bafdab346a28382");
        } else if (this.b != z) {
            this.b = z;
            if (z2) {
                if (z) {
                    g.a(h.h().aM, 8000);
                } else {
                    g.a(null, 0);
                }
            }
        }
    }

    public static void a(String str) {
        c = str;
    }
}
