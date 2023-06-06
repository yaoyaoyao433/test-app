package com.meituan.mtwebkit.internal;

import android.app.Application;
import android.content.res.AssetManager;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Application a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb47678d060d1cbcd78d1dad803a0cc9", RobustBitConfig.DEFAULT_VALUE)) {
            return (Application) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb47678d060d1cbcd78d1dad803a0cc9");
        }
        try {
            return (Application) d.a("android.app.ActivityThread").a("currentApplication", new Object[0]).b;
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    public static AssetManager a(String... strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ea78dbd8f565cde914d02cd5ef91a05a", RobustBitConfig.DEFAULT_VALUE)) {
            return (AssetManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ea78dbd8f565cde914d02cd5ef91a05a");
        }
        try {
            d a2 = d.a((Class<?>) AssetManager.class).a(new Object[0]);
            for (int i = 0; i < 2; i++) {
                a2.a("addAssetPath", d.a((Object) strArr[i], (Class<?>) String.class));
            }
            return (AssetManager) a2.b;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9181661c9d9f6c2a9a40efffbf5e83f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9181661c9d9f6c2a9a40efffbf5e83f")).booleanValue() : ((Boolean) d.a("dalvik.system.VMRuntime").a("getRuntime", new Object[0]).a("is64Bit", new Object[0]).b).booleanValue();
    }

    public static String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4938cc9d94869b2aafda66d2e6321360", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4938cc9d94869b2aafda66d2e6321360");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        return (String) d.a("android.app.ActivityThread").a("currentProcessName", new Object[0]).b;
    }
}
