package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.ha;
import com.xiaomi.push.hl;
import com.xiaomi.push.hx;
import com.xiaomi.push.ia;
import com.xiaomi.push.jj;
import java.util.HashMap;
/* loaded from: classes6.dex */
public class bg {
    private static volatile bg a;
    private final Context b;

    private bg(Context context) {
        this.b = context.getApplicationContext();
    }

    private static bg a(Context context) {
        if (a == null) {
            synchronized (bg.class) {
                if (a == null) {
                    a = new bg(context);
                }
            }
        }
        return a;
    }

    public static void a(Context context, hx hxVar) {
        a(context).a(hxVar, 0, true);
    }

    public static void a(Context context, hx hxVar, boolean z) {
        a(context).a(hxVar, 1, z);
    }

    public static void b(Context context, hx hxVar, boolean z) {
        a(context).a(hxVar, 2, z);
    }

    public static void c(Context context, hx hxVar, boolean z) {
        a(context).a(hxVar, 3, z);
    }

    public static void d(Context context, hx hxVar, boolean z) {
        a(context).a(hxVar, 4, z);
    }

    public static void e(Context context, hx hxVar, boolean z) {
        bg a2;
        int i;
        ap a3 = ap.a(context);
        if (TextUtils.isEmpty(a3.b.c) || TextUtils.isEmpty(a3.b.d)) {
            a2 = a(context);
            i = 6;
        } else if (a3.b()) {
            a2 = a(context);
            i = 7;
        } else {
            a2 = a(context);
            i = 5;
        }
        a2.a(hxVar, i, z);
    }

    private void a(hx hxVar, int i, boolean z) {
        if (jj.a(this.b) || !jj.a() || hxVar == null || hxVar.a != ha.SendMessage || hxVar.h == null || !z) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.a("click to start activity result:" + String.valueOf(i));
        ia iaVar = new ia(hxVar.h.a, false);
        iaVar.e = hl.SDK_START_ACTIVITY.ah;
        iaVar.d = hxVar.e;
        iaVar.i = hxVar.f;
        iaVar.h = new HashMap();
        iaVar.h.put("result", String.valueOf(i));
        ag.a(this.b).a(iaVar, ha.Notification, false, false, null, true, hxVar.f, hxVar.e, true, false);
    }
}
