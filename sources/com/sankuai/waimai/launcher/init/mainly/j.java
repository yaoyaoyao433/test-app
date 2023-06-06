package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class j extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit, com.sankuai.waimai.foundation.core.init.a
    public final int process() {
        return 3;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "GcHackerInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f3395a18ab12a76e98c213fab85ce9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f3395a18ab12a76e98c213fab85ce9");
            return;
        }
        try {
            Field declaredField = Class.forName("java.lang.Daemons$FinalizerWatchdogDaemon").getDeclaredField("INSTANCE");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Class<?> cls = Class.forName("java.lang.Daemons$Daemon");
            Method declaredMethod = cls.getDeclaredMethod("stop", new Class[0]);
            declaredMethod.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("thread");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            Method declaredMethod2 = cls.getDeclaredMethod("isRunning", new Class[0]);
            declaredMethod2.setAccessible(true);
            if (((Boolean) declaredMethod2.invoke(obj, new Object[0])).booleanValue()) {
                declaredMethod.invoke(obj, new Object[0]);
                declaredField2.set(obj, obj2);
            }
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.b(th);
        }
    }
}
