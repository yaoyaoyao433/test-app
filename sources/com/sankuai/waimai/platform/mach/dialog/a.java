package com.sankuai.waimai.platform.mach.dialog;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5da2f4519fa0102e90cae15318f594b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5da2f4519fa0102e90cae15318f594b6");
        } else {
            a(18903);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6ca29b31db0546f679f532cff1be51f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6ca29b31db0546f679f532cff1be51f");
        } else {
            com.sankuai.waimai.platform.capacity.log.c.a().a(i, "waimai_dynamic_popup", SystemClock.elapsedRealtime());
        }
    }
}
