package com.sankuai.waimai.touchmatrix.monitor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.dianping.monitor.impl.a {
    public static ChangeQuickRedirect a;
    private static Context b = com.meituan.android.singleton.b.a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c() {
        /*
            r13 = this;
            android.content.Context r0 = com.sankuai.waimai.touchmatrix.monitor.c.b
            r1 = 1
            java.lang.Object[] r9 = new java.lang.Object[r1]
            r10 = 0
            r9[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r11 = com.sankuai.waimai.touchmatrix.monitor.c.a
            java.lang.String r12 = "80c965f5d1c36c627deacd76b184800c"
            r3 = 0
            r5 = 1
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r9
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L25
            r2 = 0
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r9, r2, r11, r1, r12)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L47
        L25:
            java.lang.String r2 = r0.getPackageName()
            java.lang.String r3 = "com.sankuai.meituan.takeoutnew"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L34
            r1 = 11
            goto L47
        L34:
            java.lang.String r3 = "com.sankuai.meituan"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L45
            java.lang.String r3 = "com.sankuai.meituan"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L45
            goto L47
        L45:
            r1 = 10
        L47:
            r13.<init>(r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r1 = com.sankuai.waimai.touchmatrix.monitor.c.a
            java.lang.String r9 = "a7c69240bf4edb70176c5c989a5a69f1"
            r5 = 0
            r7 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r2 = r0
            r3 = r13
            r4 = r1
            r6 = r9
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L61
            com.meituan.robust.PatchProxy.accessDispatch(r0, r13, r1, r10, r9)
            return
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.touchmatrix.monitor.c.<init>():void");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static final class a {
        @SuppressLint({"StaticFieldLeak"})
        private static final c a = new c();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1fe4aa4844f4a59962d323623332686", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1fe4aa4844f4a59962d323623332686") : a.a;
    }

    @Override // com.dianping.monitor.impl.a
    public final String getUnionid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f94d5d1f57f362425638d65508fbdce8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f94d5d1f57f362425638d65508fbdce8") : GetUUID.getInstance().getUUID(b);
    }

    public final void a(int i, @NonNull String str, long j) {
        Object[] objArr = {Integer.valueOf(i), str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46dfae0279bccb7dd23633ea730d49f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46dfae0279bccb7dd23633ea730d49f1");
        } else {
            pv3(com.meituan.android.time.c.b(), str, 0, 0, i, 0, 0, (int) (SystemClock.elapsedRealtime() - j), null);
        }
    }
}
