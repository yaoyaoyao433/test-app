package com.meituan.android.paymentchannel.payers;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.meituan.android.pay.utils.p;
import com.meituan.android.paybase.moduleinterface.payment.Payer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h implements Payer {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.paybase.moduleinterface.payment.Payer
    public final void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1b59a843fb186e2f58ffbc9d82bdce1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1b59a843fb186e2f58ffbc9d82bdce1");
            return;
        }
        Object[] objArr2 = {activity, str, 1313};
        ChangeQuickRedirect changeQuickRedirect2 = p.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "86974012654ad70ea704dd4f53e4ece5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "86974012654ad70ea704dd4f53e4ece5");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).buildUpon().build());
        intent.setPackage(activity.getPackageName());
        activity.startActivityForResult(intent, 1313);
    }
}
