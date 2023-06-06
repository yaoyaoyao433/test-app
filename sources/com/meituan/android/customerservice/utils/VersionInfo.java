package com.meituan.android.customerservice.utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class VersionInfo {
    private static final String TAG = "VersionInfo";
    private static final String VOIP_VERSION = "1.0.0";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Keep
    public static String getVersion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e885d3829046c84d74aad565783bfd17", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e885d3829046c84d74aad565783bfd17");
        }
        Context context = com.meituan.android.customerservice.channel.voip.d.a().b;
        if (context == null) {
            return "";
        }
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.meituan.android.customerservice.callkefuuisdk.callkf.CallKFActivity");
        if (context.getPackageManager().resolveActivity(intent, 65536) != null) {
            c.a(TAG, "App has voip");
            return "1.0.0";
        }
        c.a(TAG, "App has no voip");
        return "";
    }
}
