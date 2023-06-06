package com.meituan.android.pay.utils;

import android.app.Activity;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class n {
    public static ChangeQuickRedirect a;
    private static long b;

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5bddd66d699dec9f51a4f18e4703a53d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5bddd66d699dec9f51a4f18e4703a53d");
            return;
        }
        b = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("tradeNo", com.meituan.android.pay.common.payment.utils.b.b(activity, "tradeno"));
        hashMap.put("container", Boolean.TRUE.toString().equals(com.meituan.android.pay.common.payment.utils.b.b(activity, "enable_neo_sign_pay")) ? KernelConfig.CONTAINER_TYPE_NEO : "titans");
        com.meituan.android.neohybrid.neo.report.b.a("b_pay_hybrid_sign_pay_launch_start_sc", hashMap);
    }

    public static void a(Activity activity, boolean z, String str) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61f2e1ab845fa607ad7b00ae13609137", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61f2e1ab845fa607ad7b00ae13609137");
        } else if (b <= 0) {
        } else {
            b = 0L;
            HashMap hashMap = new HashMap();
            hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - b));
            hashMap.put("tradeNo", com.meituan.android.pay.common.payment.utils.b.b(activity, "tradeno"));
            hashMap.put("container", Boolean.TRUE.toString().equals(com.meituan.android.pay.common.payment.utils.b.b(activity, "enable_neo_sign_pay")) ? KernelConfig.CONTAINER_TYPE_NEO : "titans");
            hashMap.put("downgrade", Boolean.valueOf(z));
            hashMap.put("bridge", str);
            com.meituan.android.neohybrid.neo.report.b.a("b_pay_hybrid_sign_pay_launch_success_sc", hashMap);
        }
    }
}
