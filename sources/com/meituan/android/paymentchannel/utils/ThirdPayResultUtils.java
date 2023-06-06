package com.meituan.android.paymentchannel.utils;

import android.app.Activity;
import com.meituan.android.paybase.moduleinterface.payment.PayActionListener;
import com.meituan.android.paybase.moduleinterface.payment.PayFailInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ThirdPayResultUtils implements PayActionListener {
    public static ChangeQuickRedirect a;
    private final WeakReference<Activity> b;

    @Override // com.meituan.android.paybase.moduleinterface.payment.PayActionListener
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ab4fab1b25e8f55f0946a4c215cb12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ab4fab1b25e8f55f0946a4c215cb12");
        } else {
            com.meituan.android.paymentchannel.b.a().a(this.b.get(), str);
        }
    }

    @Override // com.meituan.android.paybase.moduleinterface.payment.PayActionListener
    public final void a(String str, int i, PayFailInfo payFailInfo) {
        Object[] objArr = {str, Integer.valueOf(i), payFailInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12e6957113b72cbd7d5caa78171a35f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12e6957113b72cbd7d5caa78171a35f6");
        } else {
            com.meituan.android.paymentchannel.b.a().a(this.b.get(), str, i, payFailInfo);
        }
    }
}
