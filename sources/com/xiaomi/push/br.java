package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
/* loaded from: classes6.dex */
public final class br {
    private static SimpleDateFormat a;
    private static String b;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        a = simpleDateFormat;
        b = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static he a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        he heVar = new he();
        heVar.g = "category_push_stat";
        heVar.a = "push_sdk_stat_channel";
        heVar.a(1L);
        heVar.b = str;
        heVar.a(true);
        heVar.b(System.currentTimeMillis());
        heVar.k = az.a(context).b;
        heVar.h = "com.xiaomi.xmsf";
        heVar.i = "";
        heVar.c = "push_stat";
        return heVar;
    }
}
