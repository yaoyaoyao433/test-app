package com.meituan.android.paymentchannel.payers;

import android.app.Activity;
import com.meituan.android.pay.utils.p;
import com.meituan.android.paybase.moduleinterface.payment.Payer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements Payer {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paybase.moduleinterface.payment.Payer
    public final void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a822711a09d8238fda97b91bce11022c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a822711a09d8238fda97b91bce11022c");
        } else {
            p.a(activity, str, 1313);
        }
    }
}
