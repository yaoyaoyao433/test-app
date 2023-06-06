package com.meituan.android.yoda.config.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static c b = new a();
    private static e c = null;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87306d753ce8b3b81b28add7993f3b63", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87306d753ce8b3b81b28add7993f3b63");
        }
        com.meituan.android.yoda.monitor.log.a.a("UIConfigEntrance", "get", true);
        return c != null ? c : b;
    }

    public static void a(@NonNull Context context, b bVar) {
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a79cf82e28eb7c57cc80aa57875dba3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a79cf82e28eb7c57cc80aa57875dba3");
            return;
        }
        b();
        c = new e(context, bVar);
        com.meituan.android.yoda.monitor.log.a.a("UIConfigEntrance", "registerBusinessUIConfig", true);
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8625781ec701225e5b27f25823af579b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8625781ec701225e5b27f25823af579b");
            return;
        }
        if (c != null) {
            c.t();
            c = null;
        }
        com.meituan.android.yoda.monitor.log.a.a("UIConfigEntrance", "unregisterBusinessUIConfig", true);
    }
}
