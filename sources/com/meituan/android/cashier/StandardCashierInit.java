package com.meituan.android.cashier;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.meituan.android.paycommon.lib.IInitSDK;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class StandardCashierInit implements IInitSDK {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paycommon.lib.IInitSDK
    public final void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6d45df59583d13373f8493060a0bfbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6d45df59583d13373f8493060a0bfbf");
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(m.a(), MetricsAnrManager.ANR_THRESHOLD);
        }
    }

    public static /* synthetic */ void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5af69467ddf99f891e3cc53dc438f13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5af69467ddf99f891e3cc53dc438f13");
            return;
        }
        try {
            if (com.meituan.android.paymentchannel.utils.b.d()) {
                com.meituan.android.paymentchannel.utils.b.a(com.meituan.android.paybase.config.a.d().a());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
