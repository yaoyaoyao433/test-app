package com.sankuai.waimai.business.page.home.preload;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99af4fe22aa638bc040c58d87aae3211", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99af4fe22aa638bc040c58d87aae3211");
        } else if (b.a().a) {
            a(i, SystemClock.elapsedRealtime());
        }
    }

    public static void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3708ebcdd926075e18ef8ca74ae2fbde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3708ebcdd926075e18ef8ca74ae2fbde");
        } else if (b.a().a) {
            com.sankuai.waimai.foundation.utils.log.a.b("PreRequestCatReporter", "catStateReport code : %d ， startTime : %d ", Integer.valueOf(i), Long.valueOf(j));
            com.sankuai.waimai.platform.capacity.log.c.a().a(i, "wm_prelocation_request", j);
        }
    }
}
