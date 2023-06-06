package com.meituan.android.quickpass.uptsm.common.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.android.ptcommonim.model.PTFloatInfo;
import com.meituan.android.quickpass.uptsm.model.TsmUpdateInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static String a(Context context, String str) {
        PackageInfo packageInfo;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9bc618b42940195f2fb19a627862f85", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9bc618b42940195f2fb19a627862f85");
        }
        if (context == null) {
            return "";
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable th) {
            h.b(Log.getStackTraceString(th));
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "";
    }

    public static String a(TsmUpdateInfo tsmUpdateInfo) {
        Object[] objArr = {tsmUpdateInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82a51575d1b45a800735d6c30c42e96f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82a51575d1b45a800735d6c30c42e96f");
        }
        try {
            return new Gson().toJson(tsmUpdateInfo);
        } catch (JsonIOException e) {
            h.b(Log.getStackTraceString(e));
            return null;
        }
    }

    public static TsmUpdateInfo a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a107fc9f411b7c80c9b6681a1becd12", RobustBitConfig.DEFAULT_VALUE)) {
            return (TsmUpdateInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a107fc9f411b7c80c9b6681a1becd12");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return (TsmUpdateInfo) new Gson().fromJson(str, (Class<Object>) TsmUpdateInfo.class);
            } catch (Exception e) {
                h.b(Log.getStackTraceString(e));
            }
        }
        return null;
    }

    public static JSONObject a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "157906cf32f313a4f241f55de4ba7429", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "157906cf32f313a4f241f55de4ba7429");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String str = Build.BOARD;
            String str2 = Build.DISPLAY;
            String str3 = Build.FINGERPRINT;
            String str4 = Build.MODEL;
            String str5 = Build.DEVICE;
            String str6 = Build.BRAND;
            String str7 = Build.PRODUCT;
            String str8 = Build.VERSION.RELEASE;
            String valueOf = String.valueOf(Build.VERSION.SDK_INT);
            String str9 = Build.VERSION.INCREMENTAL;
            jSONObject.put("board", str);
            jSONObject.put("display", str2);
            jSONObject.put(FingerprintManager.TAG, str3);
            jSONObject.put("model", str4);
            jSONObject.put("device", str5);
            jSONObject.put("brand", str6);
            jSONObject.put(PTFloatInfo.TYPE_PRODUCT, str7);
            jSONObject.put("release", str8);
            jSONObject.put("sdkInt", valueOf);
            jSONObject.put("incremental", str9);
            h.a("设备信息\t" + jSONObject.toString());
            return jSONObject;
        } catch (Throwable th) {
            h.b(Log.getStackTraceString(th));
            return jSONObject;
        }
    }
}
