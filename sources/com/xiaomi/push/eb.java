package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public final class eb {
    public static void a(Context context, List<dx> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (dx dxVar : list) {
            sb.append(dxVar.toString());
        }
        hashMap.put("wake_up_date", sb.toString());
        a(context, hashMap);
    }

    private static void a(Context context, Map<String, String> map) {
        a(context, "tiny_data_category_hb_policy", null, map);
    }

    public static void b(Context context, List<dw> list) {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        for (dw dwVar : list) {
            sb.append(dwVar.toString());
        }
        hashMap.put("ping_pong_date", sb.toString());
        a(context, hashMap);
    }

    public static void a(Context context, String str, String str2, Map<String, String> map) {
        he heVar = new he();
        heVar.g = str;
        heVar.c = "hb_name";
        heVar.a = "hb_channel";
        heVar.a(1L);
        heVar.b = str2;
        heVar.a(false);
        heVar.b(System.currentTimeMillis());
        heVar.k = context.getPackageName();
        heVar.h = "com.xiaomi.xmsf";
        if (map == null) {
            map = new HashMap<>();
        }
        String str3 = null;
        com.xiaomi.push.service.cm a = com.xiaomi.push.service.cn.a(context);
        if (a != null && !TextUtils.isEmpty(a.a)) {
            String[] split = a.a.split("@");
            if (split.length > 0) {
                str3 = split[0];
            }
        }
        map.put("uuid", str3);
        map.put("model", Build.MODEL);
        map.put("avc", String.valueOf(fd.b(context, context.getPackageName())));
        map.put("pvc", "40082");
        map.put("cvc", "47");
        heVar.j = map;
        gy a2 = gy.a(context);
        if (a2 != null) {
            a2.a(heVar, context.getPackageName());
        }
    }
}
