package com.sankuai.meituan.tte;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class u {
    public static ChangeQuickRedirect a = null;
    private static volatile int b = 2;

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee2e2302e8f410c3c327db5ff7874dfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee2e2302e8f410c3c327db5ff7874dfa");
        } else if (i == 0) {
            b = Integer.MAX_VALUE;
        } else if (i == 1) {
            b = 3;
        } else if (i == 2) {
            b = 2;
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2a043b52ca4f46974db271f6e67b8c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2a043b52ca4f46974db271f6e67b8c7");
        } else if (b <= 2) {
            a(2, str, str2, null);
            com.dianping.networklog.c.a("[V]" + str2, 49, new String[]{str});
        }
    }

    public static void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "37bed5f911951cc7ab8c5da6ec9d37da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "37bed5f911951cc7ab8c5da6ec9d37da");
        } else if (b <= 3) {
            a(3, str, str2, null);
            com.dianping.networklog.c.a("[D]" + str2, 49, new String[]{str});
        }
    }

    public static void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7d47ec09d40cd67139d0bb1562dbefb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7d47ec09d40cd67139d0bb1562dbefb6");
        } else if (b <= 4) {
            a(4, str, str2, null);
            com.dianping.networklog.c.a("[I]" + str2, 49, new String[]{str});
        }
    }

    public static void a(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b4b3ced7cc249ca0a26f52a5244aff0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b4b3ced7cc249ca0a26f52a5244aff0");
        } else if (b <= 5) {
            a(5, str, str2, th);
            com.dianping.networklog.c.a("[W]" + str2 + "\n" + a(th), 49, new String[]{str});
        }
    }

    public static void b(String str, String str2, Throwable th) {
        Object[] objArr = {str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04253640ee100a1336d10abbe8d97ade", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04253640ee100a1336d10abbe8d97ade");
        } else if (b <= 6) {
            a(6, str, str2, th);
            com.dianping.networklog.c.a("[E]" + str2 + "\n" + a(th), 49, new String[]{str});
        }
    }

    private static void a(int i, String str, String str2, Throwable th) {
        Object[] objArr = {Integer.valueOf(i), str, str2, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf960238f238095a344ab96fe6e35bdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf960238f238095a344ab96fe6e35bdd");
        } else if (x.c) {
            Log.println(i, str, str2 + "\n" + a(th));
        }
    }

    private static String a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c8f4babd56745be64d8d52642cbd7337", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c8f4babd56745be64d8d52642cbd7337");
        }
        String stackTraceString = Log.getStackTraceString(th);
        return (th == null || !stackTraceString.isEmpty()) ? stackTraceString : th.toString();
    }
}
