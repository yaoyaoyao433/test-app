package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meituan.mtmap.rendersdk.MapConstant;
/* loaded from: classes6.dex */
public class ds {
    private static volatile ds a;
    private Context b;

    private ds(Context context) {
        this.b = context;
    }

    public static ds a(Context context) {
        if (a == null) {
            synchronized (ds.class) {
                if (a == null) {
                    a = new ds(context);
                }
            }
        }
        return a;
    }

    private void a(com.xiaomi.clientreport.data.d dVar) {
        if (dVar instanceof com.xiaomi.clientreport.data.c) {
            com.xiaomi.clientreport.manager.a.a(this.b, (com.xiaomi.clientreport.data.c) dVar);
        } else if (dVar instanceof com.xiaomi.clientreport.data.b) {
            com.xiaomi.clientreport.manager.a.a(this.b, (com.xiaomi.clientreport.data.b) dVar);
        }
    }

    public final void a(String str, Intent intent, int i, String str2) {
        if (intent == null) {
            return;
        }
        a(str, dr.a(com.sankuai.waimai.platform.utils.f.a(intent, "eventMessageType", -1)), com.sankuai.waimai.platform.utils.f.a(intent, "messageId"), i, System.currentTimeMillis(), null);
    }

    public final void a(String str, Intent intent, String str2) {
        if (intent == null) {
            return;
        }
        a(str, dr.a(com.sankuai.waimai.platform.utils.f.a(intent, "eventMessageType", -1)), com.sankuai.waimai.platform.utils.f.a(intent, "messageId"), 5001, System.currentTimeMillis(), str2);
    }

    public final void a(String str, String str2, String str3, int i, String str4) {
        a(str, str2, str3, i, System.currentTimeMillis(), str4);
    }

    public final void a(String str, String str2, String str3, String str4) {
        a(str, str2, str3, 5002, System.currentTimeMillis(), str4);
    }

    public final void b(String str, String str2, String str3, String str4) {
        a(str, str2, str3, 5001, System.currentTimeMillis(), str4);
    }

    public final void c(String str, String str2, String str3, String str4) {
        a(str, str2, str3, MapConstant.LayerPropertyFlag_MarkerAvoidScreen, System.currentTimeMillis(), str4);
    }

    public final void a(String str, String str2, String str3, int i, long j, String str4) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        com.xiaomi.clientreport.data.b a2 = dr.a(this.b, str2, str3, i, j, str4);
        a2.h = str;
        a2.i = "4_8_2";
        a(a2);
    }

    public final void a(String str, int i, long j, long j2) {
        if (i < 0 || j2 < 0) {
            return;
        }
        com.xiaomi.clientreport.data.c a2 = dr.a(this.b, i, 1L, j2);
        a2.h = str;
        a2.i = "4_8_2";
        a(a2);
    }
}
