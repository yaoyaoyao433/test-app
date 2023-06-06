package com.meituan.android.loader.impl;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class o {
    public static ChangeQuickRedirect a;

    public static void a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b08c3a2eadcd4a8b3333b85680d99c95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b08c3a2eadcd4a8b3333b85680d99c95");
        } else {
            a.b().a(th);
        }
    }

    public static void a(Throwable th, Map<String, Object> map) {
        Object[] objArr = {th, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e6eed8e50854396e3628bf0440d70e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e6eed8e50854396e3628bf0440d70e6");
        } else {
            a.b().a(th, map);
        }
    }
}
