package com.sankuai.waimai.router.components;

import android.content.Intent;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;
    @NonNull
    private static c b = e.b;
    @NonNull
    private static a c = d.c;
    @NonNull
    private static com.sankuai.waimai.router.service.c d = com.sankuai.waimai.router.service.b.b;

    public static void a(a aVar) {
        c = aVar;
    }

    @NonNull
    public static com.sankuai.waimai.router.service.c a() {
        return d;
    }

    public static <T extends com.sankuai.waimai.router.core.h> void a(T t, Class<? extends b<T>> cls) {
        Object[] objArr = {t, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e40438d26b26a52118b6aad3b834a46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e40438d26b26a52118b6aad3b834a46");
        } else {
            b.a(t, cls);
        }
    }

    public static int a(@NonNull com.sankuai.waimai.router.core.j jVar, @NonNull Intent intent) {
        Object[] objArr = {jVar, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84abd31ca49cf601750a0570a2a674b5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84abd31ca49cf601750a0570a2a674b5")).intValue() : c.a(jVar, intent);
    }
}
