package com.sankuai.waimai.store.poi.list.util;

import android.app.ActivityManager;
import android.content.Context;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;

    public static boolean a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> a2;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6635b067b3a122f51095417a8808704b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6635b067b3a122f51095417a8808704b")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            a2 = Privacy.createActivityManager(context, "com.sankuai.waimai:store-mt").a();
        } catch (Throwable unused) {
        }
        if (a2 == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : a2) {
            if (runningAppProcessInfo.processName.equals(context.getPackageName())) {
                return runningAppProcessInfo.importance != 100;
            }
        }
        return false;
    }
}
