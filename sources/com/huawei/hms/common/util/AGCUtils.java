package com.huawei.hms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.huawei.agconnect.config.a;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AGCUtils {
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r5, java.lang.String r6) {
        /*
            com.huawei.agconnect.config.a r0 = com.huawei.agconnect.config.a.a(r5)
            java.lang.String r1 = ""
            r2 = 0
            android.content.res.Resources r5 = r5.getResources()     // Catch: java.lang.Throwable -> L28 java.lang.NullPointerException -> L2a java.io.IOException -> L47
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L28 java.lang.NullPointerException -> L2a java.io.IOException -> L47
            java.lang.String r3 = "agconnect-services.json"
            java.io.InputStream r5 = r5.open(r3)     // Catch: java.lang.Throwable -> L28 java.lang.NullPointerException -> L2a java.io.IOException -> L47
            r0.a(r5)     // Catch: java.lang.Throwable -> L1f java.lang.NullPointerException -> L22 java.io.IOException -> L25
            java.lang.String r0 = r0.a(r6)     // Catch: java.lang.Throwable -> L1f java.lang.NullPointerException -> L22 java.io.IOException -> L25
            r2 = r5
            r1 = r0
            goto L63
        L1f:
            r6 = move-exception
            r2 = r5
            goto L88
        L22:
            r0 = move-exception
            r2 = r5
            goto L2b
        L25:
            r0 = move-exception
            r2 = r5
            goto L48
        L28:
            r6 = move-exception
            goto L88
        L2a:
            r0 = move-exception
        L2b:
            java.lang.String r5 = "AGCUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "Get "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L28
            r3.append(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = " with AGConnectServicesConfig failed: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L28
            r3.append(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L28
            com.huawei.hms.support.log.HMSLog.e(r5, r0)     // Catch: java.lang.Throwable -> L28
            goto L63
        L47:
            r0 = move-exception
        L48:
            java.lang.String r5 = "AGCUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "Get "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L28
            r3.append(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = " failed: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L28
            r3.append(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L28
            com.huawei.hms.support.log.HMSLog.e(r5, r0)     // Catch: java.lang.Throwable -> L28
        L63:
            com.huawei.hms.utils.IOUtils.closeQuietly(r2)
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L6d
            return r1
        L6d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "The "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r6 = " is null."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "AGCUtils"
            com.huawei.hms.support.log.HMSLog.e(r6, r5)
            java.lang.String r5 = ""
            return r5
        L88:
            com.huawei.hms.utils.IOUtils.closeQuietly(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.util.AGCUtils.a(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String b(Context context) {
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo != null && applicationInfo.metaData != null && (obj = applicationInfo.metaData.get("com.huawei.hms.client.cpid")) != null) {
                String valueOf = String.valueOf(obj);
                return valueOf.startsWith("cpid=") ? valueOf.substring(5) : valueOf;
            }
            HMSLog.i("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
            return "";
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e("AGCUtils", "In getMetaDataCpId, Failed to read meta data for the CpId.");
            return "";
        }
    }

    public static boolean c(Context context) {
        return context.getPackageName().equals(HMSPackageManager.getInstance(context).getHMSPackageName());
    }

    public static String getAppId(Context context) {
        if (c(context)) {
            return a(context, "client/app_id");
        }
        String str = null;
        try {
            str = a.a(context).a("client/app_id");
        } catch (NullPointerException unused) {
            HMSLog.e("AGCUtils", "Get appId with AGConnectServicesConfig failed");
        }
        if (TextUtils.isEmpty(str)) {
            String a = a(context);
            return !TextUtils.isEmpty(a) ? a : a(context, "client/app_id");
        }
        return str;
    }

    public static String getCpId(Context context) {
        if (c(context)) {
            return a(context, "client/cp_id");
        }
        String str = null;
        try {
            str = a.a(context).a("client/cp_id");
        } catch (NullPointerException unused) {
            HMSLog.e("AGCUtils", "Get cpid with AGConnectServicesConfig failed");
        }
        if (TextUtils.isEmpty(str)) {
            String b = b(context);
            return !TextUtils.isEmpty(b) ? b : a(context, "client/cp_id");
        }
        return str;
    }

    public static String a(Context context) {
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
            if (applicationInfo != null && applicationInfo.metaData != null && (obj = applicationInfo.metaData.get("com.huawei.hms.client.appid")) != null) {
                String valueOf = String.valueOf(obj);
                return valueOf.startsWith("appid=") ? valueOf.substring(6) : valueOf;
            }
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e("AGCUtils", "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        }
    }
}
