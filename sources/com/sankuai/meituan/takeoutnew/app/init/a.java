package com.sankuai.meituan.takeoutnew.app.init;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;

    public static void a(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3e2d6e0128e892dc4908cc94bc527291", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3e2d6e0128e892dc4908cc94bc527291");
        } else if (b) {
        } else {
            try {
                Class<?> cls = Class.forName("com.sankuai.meituan.takeoutnew.app.dev.octopus.OctopusInit");
                cls.getDeclaredMethod("init", Application.class).invoke(cls.newInstance(), application);
                b = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
