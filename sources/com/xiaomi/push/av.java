package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.io.File;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes6.dex */
public final class av {
    public static String a(Context context) {
        String b = ay.a(context).b("sp_client_report_status", "sp_client_report_key", "");
        if (TextUtils.isEmpty(b)) {
            String a = ar.a(20);
            ay.a(context).a("sp_client_report_status", "sp_client_report_key", a);
            return a;
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f3, code lost:
        if (r7 == null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.av.a(android.content.Context, java.lang.String, java.lang.String):void");
    }

    public static void a(Context context, List<String> list) {
        if (list == null || list.size() <= 0 || !b(context)) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                c(context, str);
            }
        }
    }

    @TargetApi(9)
    public static byte[] a(String str) {
        byte[] copyOf = Arrays.copyOf(ao.b(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }

    private static boolean b(Context context) {
        return context.getApplicationContext().getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode >= 108;
    }

    public static File[] b(Context context, String str) {
        File externalFilesDir = context.getExternalFilesDir(str);
        if (externalFilesDir != null) {
            return externalFilesDir.listFiles(new ax());
        }
        return null;
    }

    private static void c(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.xmsf.push.XMSF_UPLOAD_ACTIVE");
        intent.putExtra("pkgname", context.getPackageName());
        intent.putExtra("category", "category_client_report_data");
        intent.putExtra("name", "quality_support");
        intent.putExtra("data", str);
        com.sankuai.meituan.takeoutnew.util.aop.b.a(context, intent, "com.xiaomi.xmsf.permission.USE_XMSF_UPLOAD");
    }

    public static boolean a(Context context, String str) {
        File file = new File(str);
        long j = com.xiaomi.clientreport.manager.b.a(context).a().d;
        if (file.exists()) {
            try {
                if (file.length() > j) {
                    return false;
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.c.a(e);
                return false;
            }
        } else {
            b.b(file);
        }
        return true;
    }
}
