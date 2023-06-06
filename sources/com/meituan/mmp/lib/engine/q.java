package com.meituan.mmp.lib.engine;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class q {
    public static ChangeQuickRedirect a;
    @Nullable
    final String b;
    final String c;
    private final String d;

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adb5114edee22df37cf6e546b8ed4cc1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adb5114edee22df37cf6e546b8ed4cc1")).booleanValue() : "preloadAll".equals(this.b);
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8166810f4365ebff81a88646309084c2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8166810f4365ebff81a88646309084c2");
        }
        return "PreloadStrategyConfig{preloadStrategy='" + this.b + "', preloadStrategyAppId='" + this.d + "', preloadStrategyStr='" + this.c + "'}";
    }
}
