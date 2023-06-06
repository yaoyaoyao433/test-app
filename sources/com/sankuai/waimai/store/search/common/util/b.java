package com.sankuai.waimai.store.search.common.util;

import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.aa;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static long a(Intent intent, String str, String str2, String str3, String str4, long j) {
        Object[] objArr = {intent, str, str2, str3, str4, 0L};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fecbf1cebd4a4511ee4ccbcb6c599dfb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fecbf1cebd4a4511ee4ccbcb6c599dfb")).longValue();
        }
        long a2 = aa.a(intent, str, str2, 0L);
        if (a2 == 0) {
            a2 = aa.a(intent, str, str3, 0L);
        }
        return a2 == 0 ? aa.a(intent, str, str4, 0L) : a2;
    }

    public static int a(Intent intent, String str, String str2, int i) {
        Object[] objArr = {intent, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "abd67dea04c1cbf839920b15491ea5cc", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "abd67dea04c1cbf839920b15491ea5cc")).intValue() : aa.a(intent, str, str2, i);
    }

    public static String a(Intent intent, String str, String str2) {
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d36f4078a29d746c02c9a96b7214153c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d36f4078a29d746c02c9a96b7214153c") : aa.c(intent, str, str2);
    }

    public static Object b(Intent intent, String str, String str2) {
        Object[] objArr = {intent, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "391c70f46def9eced1226bfdec58c00f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "391c70f46def9eced1226bfdec58c00f") : aa.a(intent, str, str2);
    }
}
