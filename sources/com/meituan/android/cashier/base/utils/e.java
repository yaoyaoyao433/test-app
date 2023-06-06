package com.meituan.android.cashier.base.utils;

import com.meituan.android.cashier.common.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "811fdb6dafa17a0620c16e3d10de1751", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "811fdb6dafa17a0620c16e3d10de1751");
            return;
        }
        b = com.meituan.android.paymentchannel.utils.b.d();
        a("recordUpsepayStatusWhenInit", str);
    }

    private static String a() {
        boolean z = false;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a22d5567c2a84ad863d7d5aa4132c79", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a22d5567c2a84ad863d7d5aa4132c79");
        }
        boolean c = com.meituan.android.paymentchannel.utils.b.c();
        boolean d = com.meituan.android.paymentchannel.utils.b.d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.paymentchannel.utils.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "82a3268f89466048406dc384a7070773", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "82a3268f89466048406dc384a7070773")).booleanValue();
        } else if (com.meituan.android.paymentchannel.utils.b.a() != null) {
            z = com.meituan.android.paymentchannel.utils.b.a().i();
        }
        return c ? "isError" : z ? "isSuccess" : d ? "isNull" : "";
    }

    private static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8aafbd5acc9d11acc30d84eca6131fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8aafbd5acc9d11acc30d84eca6131fe5");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("recordUpsepayStatus", a());
        hashMap.put("recordUpsepayScene", str);
        q.a("b_pay_q4wfd2p5_sc", hashMap, str2);
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b50489495676eb2266de28452c03fd3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b50489495676eb2266de28452c03fd3f");
        } else if (b) {
            a("recordUpsepayStatusWhenPay", str);
        }
    }
}
