package com.meituan.android.paybase.utils;

import android.content.Context;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class af {
    public static ChangeQuickRedirect a;

    private static Context a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "893d8b667e2ff8eb52b124ba576973b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "893d8b667e2ff8eb52b124ba576973b3");
        }
        Context a2 = com.meituan.android.paybase.config.a.d().a();
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException(MonitorManager.CONTEXT_IS_NULL_MSG);
    }

    public static com.meituan.android.cipstorage.q a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ec7ec91099ab5e87a8f385d3e17c5df", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ec7ec91099ab5e87a8f385d3e17c5df") : com.meituan.android.cipstorage.q.a(a(), str);
    }

    public static com.meituan.android.cipstorage.q a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5ff9cc8bf7302b22890980676f147a12", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cipstorage.q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5ff9cc8bf7302b22890980676f147a12") : com.meituan.android.cipstorage.q.a(context, str);
    }

    @Deprecated
    public static com.meituan.android.cipstorage.x b(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f707d24a586240c92294234a4808a223", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cipstorage.x) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f707d24a586240c92294234a4808a223") : com.meituan.android.cipstorage.x.a(a(context, str));
    }
}
