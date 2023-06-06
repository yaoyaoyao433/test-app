package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "AccessibilityAgedInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "309cd07547c098d0abc4b6b0373386e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "309cd07547c098d0abc4b6b0373386e9");
            return;
        }
        Configuration configuration = application.getResources().getConfiguration();
        boolean z = configuration.fontScale > 1.0f;
        if (!z) {
            int a2 = a();
            z = a2 > 0 && configuration.densityDpi > a2;
        }
        com.sankuai.waimai.platform.accessibility.a.a().b = z;
    }

    private int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77ad3f1929787ee22e3f5cbb138095c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77ad3f1929787ee22e3f5cbb138095c2")).intValue();
        }
        if (Build.VERSION.SDK_INT > 23) {
            try {
                Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
                Method method = cls.getMethod("getWindowManagerService", new Class[0]);
                method.setAccessible(true);
                Object invoke = method.invoke(cls, new Object[0]);
                Method method2 = invoke.getClass().getMethod("getInitialDisplayDensity", Integer.TYPE);
                method2.setAccessible(true);
                return ((Integer) method2.invoke(invoke, 0)).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }
        return -1;
    }
}
