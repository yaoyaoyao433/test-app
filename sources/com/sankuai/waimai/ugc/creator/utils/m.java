package com.sankuai.waimai.ugc.creator.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class m {
    public static ChangeQuickRedirect a;

    public static String a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75d09d399546a0442566d9bd4dd3854c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75d09d399546a0442566d9bd4dd3854c");
        }
        long j2 = j / 1000;
        if (j2 < 60) {
            return j2 + "秒";
        }
        long j3 = j2 % 60;
        if (j3 == 0) {
            return (j2 / 60) + "分钟";
        }
        return (j2 / 60) + "分钟" + j3 + "秒";
    }

    public static boolean a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f9e0c20d72fb285e395e36aeca28aac0", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f9e0c20d72fb285e395e36aeca28aac0")).booleanValue() : (j / 1000) * 1000 < j2;
    }

    public static boolean b(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6074bf7290ae6b21f7c968379c0bcc78", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6074bf7290ae6b21f7c968379c0bcc78")).booleanValue() : (j / 1000) * 1000 > j2;
    }
}
