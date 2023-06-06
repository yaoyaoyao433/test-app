package com.meituan.android.hybridcashier.report;

import com.meituan.android.hybridcashier.cashier.HybridCashierFragment;
import com.meituan.android.neohybrid.neo.report.b;
import com.meituan.android.neohybrid.neo.report.c;
import com.meituan.android.neohybrid.neo.report.d;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(HybridCashierFragment hybridCashierFragment, String str) {
        Object[] objArr = {hybridCashierFragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89feb28ad82ddd6b172f36fcdadb313d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89feb28ad82ddd6b172f36fcdadb313d");
        } else {
            a(hybridCashierFragment, str, null);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95ba8cae975cd7959c2b449a50c61691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95ba8cae975cd7959c2b449a50c61691");
            return;
        }
        c.a(str, com.meituan.android.neohybrid.neo.report.a.c(NetLogConstants.Details.ERROR_MSG, str2).b);
        c.a(str, str2);
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "899fe93f5d4359b16c35aa3c2a6c1c6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "899fe93f5d4359b16c35aa3c2a6c1c6b");
        } else {
            b.a(str, "c_pay_7c9fc4b4", map);
        }
    }

    public static void a(HybridCashierFragment hybridCashierFragment, String str, Map<String, Object> map) {
        Object[] objArr = {hybridCashierFragment, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd9f520a61ec1ff26d2a4a0ce95e1efb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd9f520a61ec1ff26d2a4a0ce95e1efb");
        } else {
            d.c(hybridCashierFragment.d, str, map);
        }
    }

    public static void b(HybridCashierFragment hybridCashierFragment, String str, Map<String, Object> map) {
        Object[] objArr = {hybridCashierFragment, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3f42f55d16fe2fbee77552f9f76f588", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3f42f55d16fe2fbee77552f9f76f588");
        } else {
            d.a(hybridCashierFragment.d, str, "c_pay_7c9fc4b4", hybridCashierFragment.f(), map);
        }
    }
}
