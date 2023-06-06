package com.meituan.android.hybridcashier.utils;

import com.meituan.android.paybase.moduleinterface.payment.UPPayAPI;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        UPPayAPI uPPayAPI = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e36a3ee6a9bc22cd58646b79281d311d", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e36a3ee6a9bc22cd58646b79281d311d");
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            List a2 = com.sankuai.meituan.serviceloader.b.a(UPPayAPI.class, "UPPayHandle");
            if (!CollectionUtils.isEmpty(a2)) {
                uPPayAPI = (UPPayAPI) a2.get(0);
            }
        } catch (Exception e) {
            HashMap hashMap = new HashMap();
            hashMap.put("time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            com.meituan.android.paybase.common.analyse.a.a(e, "AppUtils_getUpsePayStatus", hashMap);
        }
        if (uPPayAPI == null) {
            return a.FAILED;
        }
        if (uPPayAPI.h() || uPPayAPI.f()) {
            return a.FAILED;
        }
        if (uPPayAPI.i()) {
            return a.SUCCESS;
        }
        return a.FAILED;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        SUCCESS("0"),
        FAILED("1");
        
        public static ChangeQuickRedirect a;
        public final String d;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9cca0803ba7b3c2f3dd8a798ca6cbb78", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9cca0803ba7b3c2f3dd8a798ca6cbb78") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94ac6ce6f3f0d8609c637b88030e54b9", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94ac6ce6f3f0d8609c637b88030e54b9") : (a[]) values().clone();
        }

        a(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "032af6cc7e227423bd0a0a13f20164b1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "032af6cc7e227423bd0a0a13f20164b1");
            } else {
                this.d = str;
            }
        }
    }
}
