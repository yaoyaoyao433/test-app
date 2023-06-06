package com.meituan.android.common.locate.platform.sniffer;

import android.support.annotation.NonNull;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public class b {
    public static boolean a = false;
    public static int b;
    public static int c;
    public static ChangeQuickRedirect changeQuickRedirect;
    public static int d;
    public static int e;

    public static void a(@NonNull c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0c30d2dba043e4901e1a13469494e285", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0c30d2dba043e4901e1a13469494e285");
        } else if (a) {
            c.a(aVar);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "14e205ad7ddda60c7364ba7ae8e65b9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "14e205ad7ddda60c7364ba7ae8e65b9a");
            return;
        }
        c.a(new c.a("mt_manager_count", str + CommonConstant.Symbol.UNDERLINE + str2, "", ""));
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e1f2b21f748b3a8d47bda716857195a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e1f2b21f748b3a8d47bda716857195a9");
        } else if (a) {
            c.b(new c.a("wifi_scan_percent", z ? "failed_new" : "failed_old", "", ""));
            if (com.meituan.android.common.locate.platform.abtest.a.a) {
                if (z) {
                    b++;
                } else {
                    d++;
                }
            }
        }
    }

    public static void b(@NonNull c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "642c88b7086c68c44dd44c9fd0cbfb0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "642c88b7086c68c44dd44c9fd0cbfb0e");
        } else if (a) {
            c.b(aVar);
        }
    }

    public static void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "68a5e1a6cbb4a4fca07d1b4de7b37b31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "68a5e1a6cbb4a4fca07d1b4de7b37b31");
        } else if (a) {
            c.a(new c.a("wifi_scan_percent", z ? "success_new" : "success_old", "", ""));
            if (com.meituan.android.common.locate.platform.abtest.a.a) {
                if (z) {
                    c++;
                } else {
                    e++;
                }
            }
        }
    }
}
