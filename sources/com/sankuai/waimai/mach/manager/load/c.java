package com.sankuai.waimai.mach.manager.load;

import android.support.annotation.MainThread;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.manager.cache.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
        @MainThread
        void a(e eVar);

        @MainThread
        void a(b bVar);
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d0c5b2e37ed3ce372ce9b3728af6e2d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d0c5b2e37ed3ce372ce9b3728af6e2d9");
            return;
        }
        try {
            com.sankuai.waimai.mach.manager_new.b.a().a(str, str2);
        } catch (Exception unused) {
        }
    }
}
