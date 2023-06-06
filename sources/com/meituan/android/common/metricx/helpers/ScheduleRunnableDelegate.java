package com.meituan.android.common.metricx.helpers;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ScheduleRunnableDelegate implements Runnable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Runnable mOriginal;

    public ScheduleRunnableDelegate(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "789b49e94df0dc6e55c615677d93cedf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "789b49e94df0dc6e55c615677d93cedf");
        } else {
            this.mOriginal = runnable;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40b426c097aac0fd830cdb5128156a33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40b426c097aac0fd830cdb5128156a33");
            return;
        }
        try {
            this.mOriginal.run();
        } catch (Throwable th) {
            b.a(c.a(), new Runnable() { // from class: com.meituan.android.common.metricx.helpers.ScheduleRunnableDelegate.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    throw th;
                }
            });
        }
    }
}
