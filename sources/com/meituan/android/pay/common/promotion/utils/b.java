package com.meituan.android.pay.common.promotion.utils;

import com.meituan.android.pay.common.promotion.bean.PaymentReduce;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static float a(PaymentReduce paymentReduce) {
        Object[] objArr = {paymentReduce};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75dedecb917b47984e6787e6361505e8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75dedecb917b47984e6787e6361505e8")).floatValue();
        }
        if (paymentReduce != null) {
            return paymentReduce.getReduceMoneyWithoutBalance();
        }
        return 0.0f;
    }
}
