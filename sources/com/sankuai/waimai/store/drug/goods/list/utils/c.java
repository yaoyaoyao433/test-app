package com.sankuai.waimai.store.drug.goods.list.utils;

import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cc3e1f153982042f203f4ca7e008eef1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cc3e1f153982042f203f4ca7e008eef1");
        } else if (runnable == null) {
        } else {
            if (Looper.getMainLooper() != Looper.myLooper()) {
                runnable.run();
            } else {
                Looper.myQueue().addIdleHandler(d.a(runnable));
            }
        }
    }
}
