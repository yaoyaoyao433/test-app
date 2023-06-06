package com.meituan.mmp.lib.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.mmp.lib.executor.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class aj {
    public static ChangeQuickRedirect a;

    public static void a(final Activity activity, final Intent intent, final String str) {
        Object[] objArr = {activity, intent, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9fbc0f7a3145af0de3ccaeca25728777", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9fbc0f7a3145af0de3ccaeca25728777");
            return;
        }
        intent.putExtra("appId", str);
        intent.putExtra("targetPath", z.b(activity.getIntent(), "targetPath"));
        a.c.a(new Runnable() { // from class: com.meituan.mmp.lib.utils.aj.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "477dd4ee6c0984861e025adfb873d3c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "477dd4ee6c0984861e025adfb873d3c6");
                    return;
                }
                com.meituan.mmp.lib.trace.b.b("ContainerController", String.format("notifyToNative appId:%s action:%s", str, intent.getAction()));
                activity.sendBroadcast(intent);
            }
        });
    }

    public static boolean a(Intent intent, Activity activity) {
        Object[] objArr = {intent, activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6acf6eaefddaf1e1f55d66f6c73cef6d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6acf6eaefddaf1e1f55d66f6c73cef6d")).booleanValue();
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
                    Uri.Builder buildUpon = Uri.parse(KNBWebManager.IEnvironment.WEBVIEW_URI).buildUpon();
                    buildUpon.appendQueryParameter("url", parse.toString());
                    intent2.setData(buildUpon.build());
                } else {
                    intent2.setData(parse);
                }
                intent2.setPackage(activity.getPackageName());
                activity.startActivity(intent2);
                com.meituan.mmp.lib.trace.b.c("downgrade", a2);
                activity.finish();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
