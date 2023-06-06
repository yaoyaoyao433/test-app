package com.sankuai.waimai.launcher.init.core;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.ProcessUtils;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public static String b;

    public static boolean a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b9d872647093f5abc71eaaa7d45707c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b9d872647093f5abc71eaaa7d45707c")).booleanValue() : ProcessUtils.isMainProcess(context);
    }

    public static int b(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "18a89566ff2804d4d5172f9e617ad2d5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "18a89566ff2804d4d5172f9e617ad2d5")).intValue() : ProcessUtils.isMainProcess(context) ? 1 : 2;
    }

    public static boolean a(int i, @NonNull com.sankuai.waimai.foundation.core.init.a aVar) {
        Object[] objArr = {Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccdfa6aaaab5ed9b2ec1e101574521f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccdfa6aaaab5ed9b2ec1e101574521f9")).booleanValue();
        }
        int process = aVar.process();
        if (process == -1) {
            if (com.sankuai.meituan.takeoutnew.a.f) {
                throw new RuntimeException("进程信息未初始化前请勿添加初始化项");
            }
            return false;
        }
        switch (process) {
            case 1:
            case 2:
                return i == process;
            case 3:
                return true;
            default:
                return false;
        }
    }
}
