package com.meituan.android.hybridcashier.downgrade;

import android.text.TextUtils;
import com.meituan.android.hybridcashier.cashier.HybridCashierFragment;
import com.meituan.android.neohybrid.util.gson.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static DowngradeBean a(String str, HybridCashierFragment hybridCashierFragment) {
        Object[] objArr = {str, hybridCashierFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5db4be8bf8e6a08f81321b67f2d16240", RobustBitConfig.DEFAULT_VALUE)) {
            return (DowngradeBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5db4be8bf8e6a08f81321b67f2d16240");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            DowngradeBean downgradeBean = (DowngradeBean) b.b().fromJson(str, (Class<Object>) DowngradeBean.class);
            if (downgradeBean != null) {
                String cashierType = downgradeBean.getCashierType();
                String degradeUrl = downgradeBean.getDegradeUrl();
                if (!TextUtils.isEmpty(degradeUrl) && TextUtils.isEmpty(cashierType)) {
                    com.meituan.android.hybridcashier.report.a.a(hybridCashierFragment, "hybrid_downgrade_info_error", com.meituan.android.neohybrid.neo.report.a.c("cashierType", cashierType).a("degradeUrl", degradeUrl).b);
                }
                if ("native".equals(cashierType)) {
                    return downgradeBean;
                }
                if ("hybrid".equals(cashierType) && !TextUtils.isEmpty(degradeUrl)) {
                    return downgradeBean;
                }
                if ("h5".equals(cashierType)) {
                    if (!TextUtils.isEmpty(degradeUrl)) {
                        return downgradeBean;
                    }
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f14bb44cd3e94446caa25efce486a651", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f14bb44cd3e94446caa25efce486a651");
        }
        DowngradeBean downgradeBean = new DowngradeBean();
        downgradeBean.setCashierType("native");
        downgradeBean.setDegradeMessage(str);
        return b.a().toJson(downgradeBean);
    }
}
