package com.meituan.mtwebkit.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class n {
    public static ChangeQuickRedirect a;

    public static void a(com.meituan.android.cipstorage.q qVar, String str, PackageInfo packageInfo) {
        Object[] objArr = {qVar, str, packageInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ab74765a884b1de00bf551a2c1a543e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ab74765a884b1de00bf551a2c1a543e4");
        } else if (packageInfo == null) {
            e.c("MTWebViewPackageInfoStoreHelper", "setPackageInfo: packageInfo为空, CIP中移除key");
            qVar.b(str);
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("versionName", packageInfo.versionName);
                jSONObject.put("versionCode", packageInfo.versionCode);
                jSONObject.put("packageName", packageInfo.packageName);
                if (Build.VERSION.SDK_INT >= 28) {
                    jSONObject.put("longVersionCode", packageInfo.getLongVersionCode());
                } else {
                    jSONObject.put("longVersionCode", 0);
                }
                jSONObject.put("lastUpdateTime", packageInfo.lastUpdateTime);
                qVar.a(str, jSONObject.toString());
            } catch (JSONException e) {
                e.c("MTWebViewPackageInfoStoreHelper", "setPackageInfo过程发生异常");
                i.a(e);
                com.meituan.mtwebkit.internal.reporter.c.a(e);
            }
        }
    }

    public static PackageInfo a(com.meituan.android.cipstorage.q qVar, String str) {
        Object[] objArr = {qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77598df803084c05e505a2d6b3702881", RobustBitConfig.DEFAULT_VALUE)) {
            return (PackageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77598df803084c05e505a2d6b3702881");
        }
        String b = qVar.b(str, (String) null);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        try {
            PackageInfo packageInfo = new PackageInfo();
            JSONObject jSONObject = new JSONObject(b);
            packageInfo.versionName = jSONObject.optString("versionName");
            packageInfo.versionCode = jSONObject.optInt("versionCode");
            packageInfo.packageName = jSONObject.optString("packageName");
            if (Build.VERSION.SDK_INT >= 28) {
                packageInfo.setLongVersionCode(jSONObject.optLong("longVersionCode"));
            }
            packageInfo.lastUpdateTime = jSONObject.optLong("lastUpdateTime");
            packageInfo.applicationInfo = new ApplicationInfo();
            packageInfo.applicationInfo.metaData = new Bundle();
            packageInfo.applicationInfo.metaData.putInt("org.chromium.content.browser.NUM_SANDBOXED_SERVICES", h.B());
            packageInfo.applicationInfo.metaData.putInt("org.chromium.content.browser.NUM_PRIVILEGED_SERVICES", h.B());
            return packageInfo;
        } catch (JSONException e) {
            e.c("MTWebViewPackageInfoStoreHelper", "getPackageInfo过程发生异常");
            i.a(e);
            com.meituan.mtwebkit.internal.reporter.c.a(e);
            return null;
        }
    }
}
