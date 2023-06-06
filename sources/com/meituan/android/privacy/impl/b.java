package com.meituan.android.privacy.impl;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d86a1e0152eef062bf0b1dde1c9ab708", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d86a1e0152eef062bf0b1dde1c9ab708");
            return;
        }
        if (!"[internal.Locate.once]".equals(aVar.d) && !"ad.read".equals(aVar.g)) {
            com.dianping.networklog.c.a(aVar.toString(), 3);
        }
        com.meituan.android.privacy.interfaces.monitor.d dVar = new com.meituan.android.privacy.interfaces.monitor.d();
        dVar.b = "callAPI";
        dVar.c = aVar.b;
        dVar.d = aVar.d;
        dVar.e = aVar.e;
        dVar.f = aVar.f;
        dVar.k = aVar.g;
        dVar.m = aVar.j ? "Called" : "NotCalled";
        dVar.l = aVar.k;
        dVar.o = true;
        dVar.q = String.valueOf(aVar.c);
        a(dVar);
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0313225b72af56303e389f06d486459", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0313225b72af56303e389f06d486459");
            return;
        }
        com.dianping.networklog.c.a("Privacy-system:" + str, 3);
    }

    public static void a(com.meituan.android.privacy.interfaces.monitor.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ade11222f7a8c2d0b650a00930d932e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ade11222f7a8c2d0b650a00930d932e7");
        } else if (com.meituan.android.privacy.interfaces.monitor.c.a != null) {
            dVar.h = SystemClock.elapsedRealtime();
            com.meituan.android.privacy.interfaces.monitor.c.a.a(dVar);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public long c;
        public String d;
        public int e;
        public boolean f;
        public String g;
        public boolean h;
        public boolean i;
        public boolean j;
        public String k;
        public String l;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f49bdddaa7dea3e8a3aee3faa118420c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f49bdddaa7dea3e8a3aee3faa118420c");
            } else {
                this.c = -1L;
            }
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6376ba7dfb27c688e1216c73c13e9c8", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6376ba7dfb27c688e1216c73c13e9c8");
            }
            return "Privacy-system{token='" + this.b + "', permission='" + this.d + "', code=" + this.e + "', methodId='" + this.g + "', isCache=" + this.h + ", isNull=" + this.i + ", desc='" + this.l + "'}";
        }
    }
}
