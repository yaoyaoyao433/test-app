package com.meituan.android.paymentchannel.payers;

import android.app.Activity;
import com.meituan.android.pay.utils.p;
import com.meituan.android.paybase.moduleinterface.payment.Payer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements Payer {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paybase.moduleinterface.payment.Payer
    public final void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16350d5772b230511c0436732cb0e288", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16350d5772b230511c0436732cb0e288");
        } else {
            p.a(activity, str, 1313);
        }
    }
}
