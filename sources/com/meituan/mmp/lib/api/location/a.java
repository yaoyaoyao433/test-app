package com.meituan.mmp.lib.api.location;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.mmp.lib.map.c;
import com.meituan.mmp.lib.map.d;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    @Nullable
    public static c a(@Nullable Activity activity, @NonNull com.meituan.msi.provider.c cVar) {
        boolean z;
        Object[] objArr = {activity, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4ce59b0df717f8a09ab3b7ba4bba56e", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4ce59b0df717f8a09ab3b7ba4bba56e");
        }
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a9ba9adc9e185b65773eac6453ce866b", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a9ba9adc9e185b65773eac6453ce866b")).booleanValue();
        } else {
            z = activity == null || activity.isFinishing() || activity.isDestroyed();
        }
        if (z) {
            return null;
        }
        if (!com.meituan.mmp.lib.devtools.automator.a.b) {
            Object[] objArr3 = {activity, cVar};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "0460ad80b4a0ac23aeded5290f1311b4", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "0460ad80b4a0ac23aeded5290f1311b4");
            }
            d iLocationLoaderProvider = MMPEnvHelper.getILocationLoaderProvider();
            if (iLocationLoaderProvider != null) {
                return iLocationLoaderProvider.a(activity, cVar);
            }
            throw new IllegalStateException("not setILocationLoaderFactory");
        }
        d iLocationLoaderProvider2 = MMPEnvHelper.getILocationLoaderProvider();
        if (iLocationLoaderProvider2 != null) {
            c a2 = iLocationLoaderProvider2.a(activity, cVar);
            Object[] objArr4 = {a2, cVar};
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "6f139570b64058a531ed1a53086430fa", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "6f139570b64058a531ed1a53086430fa");
            }
            com.meituan.mmp.lib.devtools.automator.c a3 = com.meituan.mmp.lib.devtools.automator.d.a();
            if (a3 == null) {
                return null;
            }
            return a3.a(a2, cVar);
        }
        throw new IllegalStateException("not setILocationLoaderFactory");
    }
}
