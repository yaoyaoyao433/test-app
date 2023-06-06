package com.sankuai.waimai.foundation.core.utils;

import android.app.Activity;
import android.os.Build;
import android.os.Process;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static boolean a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b09ecff261a558db5ca2ab1a5e64bb05", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b09ecff261a558db5ca2ab1a5e64bb05")).booleanValue();
        }
        com.dianping.networklog.c.a("handle task -1 crash " + str, 3);
        if (activity == null) {
            return false;
        }
        if (activity.getTaskId() == -1) {
            com.dianping.networklog.c.a("task -1 " + activity.getClass().getName() + str + " ： 栈id无效，直接关闭", 3);
            if (Build.VERSION.SDK_INT > 23) {
                k.b(Process.myPid());
            } else {
                activity.finish();
            }
            return false;
        }
        return true;
    }
}
