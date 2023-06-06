package com.meituan.android.privacy.locate;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "546e90770b30dbcfa247413626f917b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "546e90770b30dbcfa247413626f917b5");
            return;
        }
        com.dianping.networklog.c.a(aVar.toString(), 3);
        if (aVar.j) {
            com.meituan.android.privacy.interfaces.monitor.d dVar = new com.meituan.android.privacy.interfaces.monitor.d();
            dVar.b = "callAPI";
            dVar.c = aVar.b;
            dVar.d = aVar.c;
            dVar.e = aVar.e ? 1000 : -1000;
            dVar.f = aVar.f;
            dVar.k = "locateSdk";
            dVar.l = aVar.k;
            dVar.m = aVar.i ? "Called" : "NotCalled";
            dVar.o = true;
            dVar.q = String.valueOf(aVar.d);
            a(dVar);
        }
    }

    private static void a(com.meituan.android.privacy.interfaces.monitor.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9a55db527e2c1f784da706ee0b36932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9a55db527e2c1f784da706ee0b36932");
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
        public String c;
        public long d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public String k;
        public String l;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07f8c17c629b09d1079e8aa1c13d8fae", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07f8c17c629b09d1079e8aa1c13d8fae");
                return;
            }
            this.d = -1L;
            this.e = true;
            this.j = true;
        }

        public final String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7e2757ffd8780fd89ea33ac5a946ddc", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7e2757ffd8780fd89ea33ac5a946ddc");
            }
            return "Privacy-locate{token='" + this.b + "', permission='" + this.c + "', isCache=" + this.g + ", isNull=" + this.h + ", desc='" + this.l + "'}";
        }
    }
}
