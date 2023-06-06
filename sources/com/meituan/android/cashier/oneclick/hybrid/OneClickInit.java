package com.meituan.android.cashier.oneclick.hybrid;

import android.content.Context;
import android.support.annotation.NonNull;
import com.meituan.android.paycommon.lib.IInitSDK;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class OneClickInit implements IInitSDK {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paycommon.lib.IInitSDK
    public final void a(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b015f49c8d74b656adfc6c9465b0a09a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b015f49c8d74b656adfc6c9465b0a09a");
            return;
        }
        a.a();
        com.meituan.android.neohybrid.container.a.a("one_click_pay_modal", OneClickNeoFragment.class);
        com.meituan.android.neohybrid.v2.container.a.a("one_click_pay_modal", OneClickNeoFragmentV2.class);
    }
}
