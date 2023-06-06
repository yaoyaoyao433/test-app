package com.tencent.map.geolocation.a.a;

import android.content.Context;
import com.meituan.robust.common.CommonConstant;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h {
    public static String a = "7.2.6";
    private static volatile h c;
    Context b;
    private List<a> d = new ArrayList();

    private h(Context context) {
        this.b = context;
    }

    public static h a(Context context) {
        if (c == null) {
            synchronized (h.class) {
                if (c == null) {
                    c = new h(context);
                }
            }
        }
        return c;
    }

    public final boolean a(List<a> list, String str) {
        boolean z;
        List<String> a2 = com.tencent.map.geolocation.a.b.h.a(new File(this.b.getFilesDir(), str));
        if (a2 == null || a2.size() == 0 || list.size() == 0) {
            e.a(this.b).a("DLC", "localComp file error");
            return false;
        }
        String b = com.tencent.map.geolocation.a.b.h.b(this.b, "__bad_dex_info__", "preference_default");
        List<a> b2 = com.tencent.map.geolocation.a.b.h.b(b);
        if (b.equals("preference_default") || b2.isEmpty() || !com.tencent.map.geolocation.a.b.b.a(list, b2)) {
            boolean z2 = true;
            for (a aVar : list) {
                Iterator<String> it = a2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    String[] split = it.next().split(CommonConstant.Symbol.COMMA);
                    if (split.length == 3 && aVar.c.equals(split[0]) && String.valueOf(aVar.d).equals(split[1]) && aVar.e.equals(split[2])) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    z2 = false;
                }
            }
            return z2;
        }
        return false;
    }

    public final List<a> a(String str) {
        List<a> b = com.tencent.map.geolocation.a.b.h.b(com.tencent.map.geolocation.a.b.h.b(this.b, str, ""));
        if (b.size() == 0) {
            e.a(this.b).a("DLC", "localComp parse error");
        }
        return b;
    }
}
