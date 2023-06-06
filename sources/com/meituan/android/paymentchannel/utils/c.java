package com.meituan.android.paymentchannel.utils;

import android.app.Activity;
import android.content.Intent;
import com.meituan.android.paymentchannel.webpay.MTCPayWebActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, String str) {
        Object[] objArr = {activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3e8b71926eefa8aa402fb382ff02344", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3e8b71926eefa8aa402fb382ff02344");
            return;
        }
        Intent intent = new Intent(activity, MTCPayWebActivity.class);
        intent.putExtra("url", str);
        activity.startActivityForResult(intent, 2323);
    }
}
