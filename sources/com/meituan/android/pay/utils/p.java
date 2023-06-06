package com.meituan.android.pay.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class p {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, 1313};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bff013cead8adb020fd8f15b462cd701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bff013cead8adb020fd8f15b462cd701");
            return;
        }
        Uri.Builder buildUpon = Uri.parse("meituanpayment://meituanpay/launch").buildUpon();
        buildUpon.appendQueryParameter("url", str);
        Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
        intent.setPackage(activity.getPackageName());
        activity.startActivityForResult(intent, 1313);
    }

    public static void a(Activity activity, String str, String str2, int i) {
        Object[] objArr = {activity, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "527203f6318248b19d7bcb3fe7df0dbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "527203f6318248b19d7bcb3fe7df0dbe");
            return;
        }
        Uri.Builder buildUpon = Uri.parse("meituanpayment://meituanpay/launch").buildUpon();
        buildUpon.appendQueryParameter("url", str);
        buildUpon.appendQueryParameter("tradeno", str2);
        Intent intent = new Intent("android.intent.action.VIEW", buildUpon.build());
        intent.setPackage(activity.getPackageName());
        activity.startActivityForResult(intent, i);
    }
}
