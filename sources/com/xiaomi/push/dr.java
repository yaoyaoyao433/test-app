package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.clientreport.data.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes6.dex */
public final class dr {
    private static a a;
    private static Map<String, hl> b;

    /* loaded from: classes6.dex */
    public interface a {
        void a(Context context, he heVar);
    }

    public static int a(Enum r1) {
        if (r1 != null) {
            if (r1 instanceof ha) {
                return r1.ordinal() + 1001;
            }
            if (r1 instanceof hl) {
                return r1.ordinal() + 2001;
            }
            if (r1 instanceof ep) {
                return r1.ordinal() + 3001;
            }
        }
        return -1;
    }

    public static hl a(String str) {
        hl[] values;
        if (b == null) {
            synchronized (hl.class) {
                if (b == null) {
                    b = new HashMap();
                    for (hl hlVar : hl.values()) {
                        b.put(hlVar.ah.toLowerCase(), hlVar);
                    }
                }
            }
        }
        hl hlVar2 = b.get(str.toLowerCase());
        return hlVar2 != null ? hlVar2 : hl.Invalid;
    }

    public static String a(int i) {
        return i == 1000 ? "E100000" : i == 3000 ? "E100002" : i == 2000 ? "E100001" : i == 6000 ? "E100003" : "";
    }

    public static void a(Context context) {
        com.xiaomi.clientreport.manager.a.a(context, b(context));
    }

    public static void a(Context context, com.xiaomi.clientreport.data.a aVar) {
        com.xiaomi.clientreport.manager.a.a(context, aVar, new dp(context), new dq(context));
    }

    public static void a(a aVar) {
        a = aVar;
    }

    public static int b(int i) {
        if (i > 0) {
            return i + 1000;
        }
        return -1;
    }

    public static com.xiaomi.clientreport.data.b a(Context context, String str, String str2, int i, long j, String str3) {
        com.xiaomi.clientreport.data.b bVar = new com.xiaomi.clientreport.data.b();
        bVar.e = 1000;
        bVar.g = 1001;
        bVar.f = str;
        bVar.a = str2;
        bVar.b = i;
        bVar.c = j;
        bVar.d = str3;
        return bVar;
    }

    public static com.xiaomi.clientreport.data.c a(Context context, int i, long j, long j2) {
        com.xiaomi.clientreport.data.c cVar = new com.xiaomi.clientreport.data.c();
        cVar.e = 1000;
        cVar.g = 1000;
        cVar.f = "P100000";
        cVar.a = i;
        cVar.b = j;
        cVar.c = j2;
        return cVar;
    }

    public static void a(Context context, List<String> list) {
        he heVar;
        if (list == null) {
            return;
        }
        try {
            for (String str : list) {
                if (TextUtils.isEmpty(str)) {
                    heVar = null;
                } else {
                    he heVar2 = new he();
                    heVar2.g = "category_client_report_data";
                    heVar2.a = "push_sdk_channel";
                    heVar2.a(1L);
                    heVar2.b = str;
                    heVar2.a(true);
                    heVar2.b(System.currentTimeMillis());
                    heVar2.k = context.getPackageName();
                    heVar2.h = "com.xiaomi.xmsf";
                    heVar2.i = com.xiaomi.push.service.az.a();
                    heVar2.c = "quality_support";
                    heVar = heVar2;
                }
                boolean z = false;
                if (!com.xiaomi.push.service.az.a(heVar, false)) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null && !TextUtils.isEmpty(applicationContext.getPackageName()) && "com.xiaomi.xmsf".equals(applicationContext.getPackageName())) {
                        z = true;
                    }
                    if (z) {
                        com.xiaomi.push.service.ba.a(context.getApplicationContext(), heVar);
                    } else if (a != null) {
                        a.a(context, heVar);
                    }
                }
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.d(th.getMessage());
        }
    }

    public static com.xiaomi.clientreport.data.a b(Context context) {
        boolean a2 = com.xiaomi.push.service.z.a(context).a(hg.PerfUploadSwitch.by, false);
        boolean a3 = com.xiaomi.push.service.z.a(context).a(hg.EventUploadNewSwitch.by, false);
        int a4 = com.xiaomi.push.service.z.a(context).a(hg.PerfUploadFrequency.by, RemoteMessageConst.DEFAULT_TTL);
        int a5 = com.xiaomi.push.service.z.a(context).a(hg.EventUploadFrequency.by, RemoteMessageConst.DEFAULT_TTL);
        a.C1516a b2 = new a.C1516a().b(a3);
        b2.f = a5;
        a.C1516a c = b2.c(a2);
        c.g = a4;
        return c.a(context);
    }
}
