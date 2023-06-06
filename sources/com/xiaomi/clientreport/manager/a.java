package com.xiaomi.clientreport.manager;

import android.content.Context;
import android.os.Process;
import com.xiaomi.clientreport.data.a;
import com.xiaomi.push.av;
import com.xiaomi.push.fd;
import com.xiaomi.push.m;
/* loaded from: classes6.dex */
public final class a {
    public static void a(Context context, com.xiaomi.clientreport.data.a aVar, com.xiaomi.clientreport.processor.a aVar2, com.xiaomi.clientreport.processor.b bVar) {
        com.xiaomi.channel.commonutils.logger.c.c("init in process " + fd.a(context, Process.myPid()) + " pid :" + Process.myPid() + " threadId: " + Thread.currentThread().getId());
        b a = b.a(context);
        a.e = aVar;
        a.g = aVar2;
        a.h = bVar;
        a.g.a(a.c);
        a.h.a(a.b);
        if (fd.c(context)) {
            com.xiaomi.channel.commonutils.logger.c.c("init in process\u3000start scheduleJob");
            b a2 = b.a(context);
            b.a(a2.d).b();
            b.a(a2.d).c();
        }
    }

    public static void a(Context context, com.xiaomi.clientreport.data.a aVar) {
        if (aVar == null) {
            return;
        }
        b a = b.a(context);
        boolean z = aVar.b;
        boolean z2 = aVar.c;
        long j = aVar.e;
        long j2 = aVar.f;
        if (a.e != null) {
            if (z == a.e.b && z2 == a.e.c && j == a.e.e && j2 == a.e.f) {
                return;
            }
            long j3 = a.e.e;
            long j4 = a.e.f;
            a.C1516a c1516a = new a.C1516a();
            c1516a.d = av.a(a.d);
            a.C1516a b = c1516a.a(a.e.a).b(z);
            b.f = j;
            a.C1516a c = b.c(z2);
            c.g = j2;
            com.xiaomi.clientreport.data.a a2 = c.a(a.d);
            a.e = a2;
            if (!a.e.b) {
                m.a(a.d).a("100886");
            } else if (j3 != a2.e) {
                com.xiaomi.channel.commonutils.logger.c.c(a.d.getPackageName() + "reset event job " + a2.e);
                a.b();
            }
            if (!a.e.c) {
                m.a(a.d).a("100887");
            } else if (j4 != a2.f) {
                com.xiaomi.channel.commonutils.logger.c.c(a.d.getPackageName() + " reset perf job " + a2.f);
                a.c();
            }
        }
    }

    public static void a(Context context, com.xiaomi.clientreport.data.b bVar) {
        if (bVar != null) {
            b a = b.a(context);
            if (a.a().b) {
                a.a.execute(new c(a, bVar));
            }
        }
    }

    public static void a(Context context, com.xiaomi.clientreport.data.c cVar) {
        if (cVar != null) {
            b a = b.a(context);
            if (a.a().c) {
                a.a.execute(new d(a, cVar));
            }
        }
    }
}
