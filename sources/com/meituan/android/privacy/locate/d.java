package com.meituan.android.privacy.locate;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.common.locate.LoadConfig;
import com.meituan.android.common.locate.LocationLoaderFactory;
import com.meituan.android.privacy.interfaces.PermissionGuard;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.locate.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;

    public static LoadConfig a(String str, @NonNull LoadConfig loadConfig, LocationLoaderFactory.LoadStrategy loadStrategy) {
        Object[] objArr = {str, loadConfig, loadStrategy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4949cd9f1af5136d8e1eafe527cea60c", RobustBitConfig.DEFAULT_VALUE)) {
            return (LoadConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4949cd9f1af5136d8e1eafe527cea60c");
        }
        com.meituan.android.privacy.interfaces.config.c a2 = com.meituan.android.privacy.interfaces.config.d.a(str, a(loadStrategy) ? "Locate.once" : PermissionGuard.PERMISSION_LOCATION_CONTINUOUS, "");
        loadConfig.set(LoadConfig.IS_ALLOW_BACKGROUND_LOCATION, "TRUE");
        loadConfig.set("privacy_allow_background", a2.b() ? "TRUE" : "FALSE");
        loadConfig.set("privacy_cache_time", String.valueOf(a2.e));
        loadConfig.set("privacy_only_cache", a2.j ? "TRUE" : "FALSE");
        loadConfig.set("privacy_enable_first_pass", a2.i ? "TRUE" : "FALSE");
        if (a(loadStrategy)) {
            loadConfig.set(LoadConfig.FORCE_SINGLE_CALLBACK, "TRUE");
        }
        return loadConfig;
    }

    public static boolean a(Context context, String str, LocationLoaderFactory.LoadStrategy[] loadStrategyArr) {
        Object[] objArr = {context, str, loadStrategyArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a680cc9978229f6f91383a0fdb9a155", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a680cc9978229f6f91383a0fdb9a155")).booleanValue();
        }
        String str2 = a(loadStrategyArr[0]) ? "Locate.once" : PermissionGuard.PERMISSION_LOCATION_CONTINUOUS;
        e.a aVar = new e.a();
        aVar.b = str;
        aVar.c = str2;
        aVar.f = !com.meituan.android.privacy.impl.a.c();
        com.meituan.android.privacy.interfaces.e createPermissionGuard = Privacy.createPermissionGuard();
        if (createPermissionGuard != null) {
            int a2 = createPermissionGuard.a(context, str2, str);
            if (a2 <= 0) {
                if (PermissionGuard.PERMISSION_LOCATION_CONTINUOUS.equals(str2) && createPermissionGuard.a(context, "Locate.once", str) > 0) {
                    aVar.e = false;
                    aVar.k = "1";
                    aVar.l = "token has no continuous permission, but have once permission, downgrade";
                    e.a(aVar);
                    loadStrategyArr[0] = LocationLoaderFactory.LoadStrategy.normal;
                    return true;
                }
                aVar.e = false;
                aVar.k = "1";
                aVar.l = "token has no permission(" + str2 + CommonConstant.Symbol.BRACKET_RIGHT;
                e.a(aVar);
            }
            return a2 > 0;
        }
        aVar.k = "1";
        aVar.l = "permission guard is null";
        e.a(aVar);
        return false;
    }

    public static boolean a(LocationLoaderFactory.LoadStrategy loadStrategy) {
        Object[] objArr = {loadStrategy};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c34aa71bcccbf7270b17d9f4705ee217", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c34aa71bcccbf7270b17d9f4705ee217")).booleanValue();
        }
        if (loadStrategy == null) {
            return false;
        }
        switch (loadStrategy) {
            case normal:
            case useCache:
            case refresh:
            case newest:
                return true;
            default:
                return false;
        }
    }
}
