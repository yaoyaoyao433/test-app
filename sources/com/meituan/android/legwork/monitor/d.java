package com.meituan.android.legwork.monitor;

import com.meituan.android.legwork.utils.z;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a73b4701c559432ca4397702304ceb60", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a73b4701c559432ca4397702304ceb60")).booleanValue() : z.b(com.meituan.android.legwork.a.a(), "is_open_monitor", false);
    }

    public static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2abfcd30f2d05467fafc80fe70d5048f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2abfcd30f2d05467fafc80fe70d5048f")).intValue() : z.b(com.meituan.android.legwork.a.a(), "monitor_flags", 0);
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14c78ab960f5be811c9961fdf2b0c161", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14c78ab960f5be811c9961fdf2b0c161");
        } else {
            z.a(com.meituan.android.legwork.a.a(), "monitor_auto_report", z);
        }
    }

    public static int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70f37d40f280e4c46a10e6972cb1fec9", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70f37d40f280e4c46a10e6972cb1fec9")).intValue() : z.b(com.meituan.android.legwork.a.a(), "monitor_report_interval", 30000);
    }
}
