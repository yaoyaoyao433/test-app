package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.cm;
import com.xiaomi.push.cn;
/* loaded from: classes6.dex */
public final class f {
    private static boolean a = false;
    private static com.xiaomi.channel.commonutils.logger.a b;

    /* JADX INFO: Access modifiers changed from: protected */
    public static com.xiaomi.channel.commonutils.logger.a a() {
        return b;
    }

    private static boolean a(Context context) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String str : strArr) {
                    if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void a(Context context, com.xiaomi.channel.commonutils.logger.a aVar) {
        b = aVar;
        boolean z = false;
        boolean z2 = b != null;
        if (a) {
            z2 = false;
        } else if (a(context)) {
            z = true;
        }
        com.xiaomi.channel.commonutils.logger.c.a(new cm(z2 ? b : null, z ? cn.a(context) : null));
    }
}
