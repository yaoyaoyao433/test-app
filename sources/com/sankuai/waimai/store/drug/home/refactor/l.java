package com.sankuai.waimai.store.drug.home.refactor;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static com.sankuai.waimai.platform.utils.lifecycle.a c = new com.sankuai.waimai.platform.utils.lifecycle.a() { // from class: com.sankuai.waimai.store.drug.home.refactor.l.1
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.platform.utils.lifecycle.a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@NonNull Activity activity) {
            Object[] objArr = {activity};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0120252f4c9a1119c6bfbf2aeb889eb8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0120252f4c9a1119c6bfbf2aeb889eb8");
            } else if (com.sankuai.waimai.foundation.utils.activity.a.a().c() == null || com.sankuai.waimai.foundation.utils.activity.a.a().c() == activity) {
                l.b(false);
            }
        }
    };

    public static /* synthetic */ boolean b(boolean z) {
        b = false;
        return false;
    }

    public static boolean a() {
        return b;
    }

    public static void a(boolean z) {
        b = true;
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d92f8d7e93b19b41e6428c3fa47c060a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d92f8d7e93b19b41e6428c3fa47c060a");
            return;
        }
        AppBus.getInstance().unregister(c);
        AppBus.getInstance().register(c);
    }
}
