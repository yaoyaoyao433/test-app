package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.meituan.robust.common.CommonConstant;
import java.util.Map;
/* compiled from: ProGuard */
@SuppressLint({"ApplySharedPref"})
/* loaded from: classes2.dex */
public class g0 {
    public static long a(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            y.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return j;
        }
        SharedPreferences b = b(context, str);
        return b != null ? b.getLong(str2, j) : j;
    }

    public static String a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            y.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return str3;
        }
        SharedPreferences b = b(context, str);
        return b != null ? b.getString(str2, str3) : str3;
    }

    public static Map<String, ?> a(Context context, String str) {
        return b(context, str).getAll();
    }

    public static void a(Context context, String str, String... strArr) {
        if (context == null || TextUtils.isEmpty(str)) {
            y.f("hmsSdk", "clearData(): parameter error.context,spname");
        } else if (strArr == null) {
            y.f("hmsSdk", "clearData(): No data need to be deleted,keys is null");
        } else {
            SharedPreferences b = b(context, str);
            if (b != null) {
                SharedPreferences.Editor edit = b.edit();
                if (strArr.length == 0) {
                    edit.clear();
                    edit.commit();
                    return;
                }
                for (String str2 : strArr) {
                    if (b.contains(str2)) {
                        edit.remove(str2);
                        edit.commit();
                    }
                }
            }
        }
    }

    public static SharedPreferences b(Context context, String str) {
        return context.getSharedPreferences(c(context, str), 0);
    }

    public static void b(Context context, String str, String str2, long j) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            y.f("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences b = b(context, str);
        if (b != null) {
            SharedPreferences.Editor edit = b.edit();
            edit.putLong(str2, j);
            edit.commit();
        }
    }

    public static void b(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            y.e("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences b = b(context, str);
        if (b != null) {
            SharedPreferences.Editor edit = b.edit();
            edit.putString(str2, str3);
            edit.commit();
        }
    }

    public static String c(Context context, String str) {
        String packageName = context.getPackageName();
        String n = c.n("_hms_config_tag", "oper");
        if (TextUtils.isEmpty(n)) {
            return "hms_" + str + CommonConstant.Symbol.UNDERLINE + packageName;
        }
        return "hms_" + str + CommonConstant.Symbol.UNDERLINE + packageName + CommonConstant.Symbol.UNDERLINE + n;
    }
}
