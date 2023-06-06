package com.meituan.android.cashier.common;

import android.text.TextUtils;
import com.meituan.android.cashier.activity.MTCashierActivity;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    public static ChangeQuickRedirect a;
    public final CashierParams b;
    public final MTCashierActivity c;

    public j(CashierParams cashierParams, MTCashierActivity mTCashierActivity) {
        Object[] objArr = {cashierParams, mTCashierActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f651db79adb767f58d58a3cafc4fe39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f651db79adb767f58d58a3cafc4fe39");
            return;
        }
        this.b = cashierParams;
        this.c = mTCashierActivity;
    }

    public final ICashier a(String str, String str2) {
        ICashier a2;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8521a6644cb9ca286e69725c0caeb3a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8521a6644cb9ca286e69725c0caeb3a");
        }
        String[] strArr = {str2, "native_standard_cashier"};
        for (int i = 0; i < 2; i++) {
            String str3 = strArr[i];
            if (!TextUtils.equals(str, str3) && (a2 = a(str3)) != null) {
                ICashier.a a3 = a2.a(this.c, this.b);
                a(a2, a3);
                if (a3 != null && a3.b) {
                    return a2;
                }
            }
        }
        return null;
    }

    private String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "940c91b2f646c6ffb2d31f65916f86ca", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "940c91b2f646c6ffb2d31f65916f86ca") : this.c == null ? "" : this.c.p();
    }

    public final ICashier a(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "def3881de10da928250511658c09b497", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "def3881de10da928250511658c09b497");
        }
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        for (String str : strArr) {
            ICashier a2 = a(str);
            if (a2 != null) {
                ICashier.a a3 = a2.a(this.c, this.b);
                a(a2, a3);
                if (a3 != null && a3.b) {
                    return a2;
                }
            }
        }
        return null;
    }

    public ICashier a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7894d323fb4957a8c52d3cf483b4317", RobustBitConfig.DEFAULT_VALUE)) {
            return (ICashier) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7894d323fb4957a8c52d3cf483b4317");
        }
        List a2 = com.sankuai.meituan.serviceloader.b.a(ICashier.class, str);
        if (com.meituan.android.paybase.utils.i.a((Collection) a2)) {
            return null;
        }
        return (ICashier) a2.get(0);
    }

    private void a(ICashier iCashier, ICashier.a aVar) {
        Object[] objArr = {iCashier, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c715371f22baca31d5b9798d4609ed71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c715371f22baca31d5b9798d4609ed71");
        } else if (iCashier == null || aVar == null || aVar.b) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(AlitaMonitorCenter.AlitaMonitorConst.BaseAvailability.TAG_KEY_ERROR_CODE, aVar.c);
            hashMap.put(NetLogConstants.Details.ERROR_MSG, aVar.d);
            hashMap.put("cashier_type", iCashier.i());
            q.b("b_pay_9bl5zxok_sc", hashMap, a());
        }
    }
}
