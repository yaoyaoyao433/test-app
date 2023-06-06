package com.meituan.android.pay.process;

import android.app.Activity;
import android.text.TextUtils;
import com.meituan.android.pay.model.bean.BankInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, BankInfo bankInfo) {
        Object[] objArr = {activity, bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "282898f2c4ea30ffaadcf692e0a7b212", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "282898f2c4ea30ffaadcf692e0a7b212");
            return;
        }
        String attachParams = bankInfo.getAttachParams();
        if (!TextUtils.isEmpty(attachParams)) {
            com.meituan.android.pay.common.payment.utils.b.a(activity, "attach_params", attachParams);
        }
        com.meituan.android.pay.common.payment.utils.b.a(activity, bankInfo.getOuterParams());
    }

    public static void b(Activity activity, BankInfo bankInfo) {
        Object[] objArr = {activity, bankInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d230405bbc04ac5a27694453322c68b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d230405bbc04ac5a27694453322c68b8");
        } else if (bankInfo != null && bankInfo.isPayed()) {
            com.meituan.android.pay.common.payment.utils.b.a(activity, "is_payed", String.valueOf(bankInfo.isPayed()));
        } else {
            com.meituan.android.pay.common.payment.utils.b.c(activity, "is_payed");
        }
    }
}
