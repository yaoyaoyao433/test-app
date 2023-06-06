package com.meituan.msc.modules.preload;

import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.container.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class PackageDebugHelper {
    public static ChangeQuickRedirect a;
    public static final PackageDebugHelper b = new PackageDebugHelper();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public @interface BasePackageEnv {
    }

    @BasePackageEnv
    public static String a() {
        return "base_package_env_prod";
    }

    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "894c9deae3f8f6ddcaec37478583e0d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "894c9deae3f8f6ddcaec37478583e0d0");
        }
        if (MSCEnvHelper.getEnvInfo().isProdEnv()) {
            return null;
        }
        return str;
    }

    public final String a(String str, k kVar) {
        Object[] objArr = {str, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9cb4fe7891d7d53ba37fed9f686a25", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9cb4fe7891d7d53ba37fed9f686a25");
        }
        if (MSCEnvHelper.getEnvInfo().isProdEnv()) {
            return null;
        }
        return kVar.d;
    }
}
