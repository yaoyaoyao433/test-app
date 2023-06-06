package com.meituan.msi.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.android.common.channel.ChannelReader;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class ae {
    public static ChangeQuickRedirect a;
    private static final DisplayMetrics b = com.meituan.msi.a.f().getResources().getDisplayMetrics();
    private static volatile String c = null;

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f87a2e4d29ce362540f9c890570e31ef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f87a2e4d29ce362540f9c890570e31ef")).intValue();
        }
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec7be5959db0b30b869b244e5d46bbcd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec7be5959db0b30b869b244e5d46bbcd")).intValue();
        }
        Object[] objArr2 = {45};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "522e6cc0688b9f9a238c8fe2d639770d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "522e6cc0688b9f9a238c8fe2d639770d")).intValue() : Math.round(b.density * 45.0f);
    }

    public static String a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "91b9dd14806c6740d16f2e76065528b4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "91b9dd14806c6740d16f2e76065528b4");
        }
        if (jsonElement == null || !jsonElement.isJsonObject()) {
            return "";
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject.has("_mt")) {
            try {
                JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("_mt");
                return (asJsonObject2 == null || !asJsonObject2.has("sceneToken")) ? "" : asJsonObject2.get("sceneToken").getAsString();
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    private static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed5f8792f75a211d097ccdb210455d00", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed5f8792f75a211d097ccdb210455d00");
        }
        if (TextUtils.isEmpty(c)) {
            if (context == null) {
                return "";
            }
            try {
                c = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("APP_NAME");
                return c == null ? "" : c;
            } catch (Exception e) {
                com.meituan.msi.log.a.a("Util - getAppName:" + e.getMessage());
                return "";
            }
        }
        return c;
    }

    public static String a(Context context) {
        String[] split;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f034113653997c513f74f26e84c2da0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f034113653997c513f74f26e84c2da0");
        }
        try {
            if ("group".equalsIgnoreCase(b(context))) {
                String channelInfo = ChannelReader.getChannelInfo(context, "mtbuildtime");
                return (TextUtils.isEmpty(channelInfo) || (split = channelInfo.split("\\.")) == null || split.length <= 1) ? "" : split[1];
            } else if ("dianping_nova".equalsIgnoreCase(AppUtil.getApplicationName(context))) {
                Class<?> cls = Class.forName("com.dianping.app.DPStaticConstant");
                return (String) cls.getField("hpxBuildNumber").get(cls);
            } else {
                String channelInfo2 = ChannelReader.getChannelInfo(context, "buildnum");
                return TextUtils.isEmpty(channelInfo2) ? ChannelReader.getChannelInfo(context, "buildNum") : channelInfo2;
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cba0cda47a9fd3a681202a9a7b08291a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cba0cda47a9fd3a681202a9a7b08291a");
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append(":  ");
        }
        String message = th.getMessage();
        if (message != null) {
            sb.append(message);
        }
        return sb.toString();
    }

    public static Throwable a(Throwable th) {
        int i = 0;
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "52d9e2c484b16f66b547a767e4a793e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Throwable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "52d9e2c484b16f66b547a767e4a793e0");
        }
        while (i < 10 && th.getCause() != null && th.getCause() != th) {
            i++;
            th = th.getCause();
        }
        return th;
    }
}
