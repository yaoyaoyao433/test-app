package com.meituan.msc.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aj {
    public static ChangeQuickRedirect a;

    public static boolean a(Intent intent, Activity activity) {
        Object[] objArr = {intent, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9d08b83a74f56744e28db8ec4bed6635", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9d08b83a74f56744e28db8ec4bed6635")).booleanValue();
        }
        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "fallbackUrl");
        if (TextUtils.isEmpty(a2) && intent.getData() != null) {
            a2 = intent.getData().getQueryParameter("fallbackUrl");
        }
        try {
            if (!TextUtils.isEmpty(a2)) {
                Intent intent2 = new Intent();
                Uri parse = Uri.parse(a2);
                if (a2.startsWith("http")) {
                    Uri.Builder buildUpon = Uri.parse(MSCEnvHelper.getEnvInfo().getKNBHostScheme()).buildUpon();
                    buildUpon.appendQueryParameter("url", parse.toString());
                    intent2.setData(buildUpon.build());
                } else {
                    intent2.setData(parse);
                }
                intent2.setPackage(activity.getPackageName());
                activity.startActivity(intent2);
                com.meituan.msc.modules.reporter.g.e("downgrade", a2);
                activity.finish();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void a(Activity activity, String str, String str2, String str3, String str4) {
        Object[] objArr = {activity, str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e59a5a4197924b68d9e4eb62ad54859", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e59a5a4197924b68d9e4eb62ad54859");
            return;
        }
        try {
            Intent intent = new Intent();
            Uri.Builder buildUpon = Uri.parse(MSCEnvHelper.getEnvInfo().getKNBHostScheme()).buildUpon();
            Object[] objArr2 = {str, str2, str3, str4};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            buildUpon.appendQueryParameter("url", PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2b4f42e1cbdb25d83fe76ab78b52855d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2b4f42e1cbdb25d83fe76ab78b52855d") : new Uri.Builder().scheme("https://awp.meituan.com").path("/msc/msc-h5-pages/index.html").appendQueryParameter("mscId", str).appendQueryParameter("mscName", str2).appendQueryParameter("mscIcon", str3).appendQueryParameter("publishId", str4).build().toString());
            Uri build = buildUpon.build();
            com.meituan.msc.modules.reporter.g.d("ContainerController", "startUpgradeAppPage", build);
            intent.setData(build);
            intent.setPackage(activity.getPackageName());
            if (a(activity, intent)) {
                activity.startActivity(intent);
                activity.finish();
                return;
            }
            com.meituan.msc.modules.reporter.g.a("ContainerController", "host app not dep KNB");
        } catch (Exception e) {
            com.meituan.msc.modules.reporter.g.b("ContainerController", e, "startUpgradeAppPage error");
        }
    }

    private static boolean a(Context context, Intent intent) {
        ResolveInfo resolveInfo;
        ResolveInfo resolveActivity;
        Object[] objArr = {context, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0233a1f9827278fa64a6eedfccb2c638", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0233a1f9827278fa64a6eedfccb2c638")).booleanValue();
        }
        Intent intent2 = new Intent(intent);
        intent2.setPackage(context.getPackageName());
        PackageManager packageManager = context.getPackageManager();
        try {
            resolveInfo = packageManager.resolveActivity(intent2, 65536);
        } catch (RuntimeException e) {
            com.meituan.msc.modules.reporter.g.b("ContainerController", e, "isSupportOpenIntent error1:");
            resolveInfo = null;
        }
        if (resolveInfo == null || resolveInfo.activityInfo == null) {
            try {
                resolveActivity = packageManager.resolveActivity(intent2, 0);
            } catch (RuntimeException e2) {
                com.meituan.msc.modules.reporter.g.b("ContainerController", e2, "isSupportOpenIntent error2:");
            }
            return resolveActivity == null && resolveActivity.activityInfo != null;
        }
        resolveActivity = resolveInfo;
        if (resolveActivity == null) {
        }
    }
}
