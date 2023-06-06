package com.huawei.hms.hatool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class p0 {
    public static boolean a(Context context) {
        return System.currentTimeMillis() - g0.a(context, "Privacy_MY", "flashKeyTime", -1L) > DDLoadConstants.CACHE_MULTIPLE_PROCESS_PROCTECT_TIME;
    }

    public static boolean a(Context context, String str) {
        if (context == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (com.sankuai.meituan.takeoutnew.util.aop.f.a(context.getPackageManager(), str, context.getPackageName()) == 0) {
                return false;
            }
        } else if (com.sankuai.meituan.takeoutnew.util.aop.f.a(context, str) == 0) {
            return false;
        }
        y.f("hmsSdk", "not have read phone permission!");
        return true;
    }

    @SuppressLint({"DefaultLocale"})
    public static boolean a(Context context, String str, int i) {
        String str2 = g0.c(context, str) + ".xml";
        long length = new File(context.getFilesDir(), "../shared_prefs/" + str2).length();
        if (length > i) {
            y.c("hmsSdk", String.format("reach local file limited size - file len: %d limitedSize: %d", Long.valueOf(length), Integer.valueOf(i)));
            return true;
        }
        return false;
    }

    public static boolean a(String str, long j, long j2) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return j - Long.parseLong(str) > j2;
        } catch (NumberFormatException unused) {
            y.f("hmsSdk", "isTimeExpired(): Data type conversion error : number format !");
            return true;
        }
    }
}
