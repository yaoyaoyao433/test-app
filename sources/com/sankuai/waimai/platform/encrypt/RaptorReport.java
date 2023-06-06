package com.sankuai.waimai.platform.encrypt;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class RaptorReport {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface CatCode {
    }

    public static void a(int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "990b4a418b0120be5ac389c537cc3cba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "990b4a418b0120be5ac389c537cc3cba");
            return;
        }
        com.sankuai.waimai.platform.capacity.log.c a2 = com.sankuai.waimai.platform.capacity.log.c.a();
        Object[] objArr2 = {Integer.valueOf(i), "waimai_tte_encrypt", new Long(j), 5};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.capacity.log.c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "4c9816608a8cff2f1ceb75c5dc4e0b4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "4c9816608a8cff2f1ceb75c5dc4e0b4b");
        } else if (a2.b()) {
            a2.pv3(com.meituan.android.time.c.b(), "waimai_tte_encrypt", 0, 0, i, 0, 0, (int) (SystemClock.elapsedRealtime() - j), null, 5);
        }
    }
}
