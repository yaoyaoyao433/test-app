package com.xiaomi.clientreport.manager;

import android.content.Context;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.xiaomi.clientreport.data.a;
import com.xiaomi.push.ar;
import com.xiaomi.push.as;
import com.xiaomi.push.at;
import com.xiaomi.push.av;
import com.xiaomi.push.ay;
import com.xiaomi.push.jj;
import com.xiaomi.push.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes6.dex */
public class b {
    private static final int i;
    private static volatile b j;
    public ExecutorService a = Executors.newSingleThreadExecutor();
    HashMap<String, HashMap<String, com.xiaomi.clientreport.data.d>> b = new HashMap<>();
    HashMap<String, ArrayList<com.xiaomi.clientreport.data.d>> c = new HashMap<>();
    public Context d;
    com.xiaomi.clientreport.data.a e;
    public String f;
    public com.xiaomi.clientreport.processor.a g;
    public com.xiaomi.clientreport.processor.b h;

    static {
        i = jj.a() ? 30 : 10;
    }

    private b(Context context) {
        this.d = context;
    }

    public static b a(Context context) {
        if (j == null) {
            synchronized (b.class) {
                if (j == null) {
                    j = new b(context);
                }
            }
        }
        return j;
    }

    private void a(m.a aVar, int i2) {
        m.a(this.d).a(aVar, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.g.b();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.d("we: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            this.h.b();
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.d("wp: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int f() {
        if (this.c != null) {
            int i2 = 0;
            for (String str : this.c.keySet()) {
                ArrayList<com.xiaomi.clientreport.data.d> arrayList = this.c.get(str);
                i2 += arrayList != null ? arrayList.size() : 0;
            }
            return i2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int g() {
        int i2 = 0;
        if (this.b != null) {
            for (String str : this.b.keySet()) {
                HashMap<String, com.xiaomi.clientreport.data.d> hashMap = this.b.get(str);
                if (hashMap != null) {
                    for (String str2 : hashMap.keySet()) {
                        com.xiaomi.clientreport.data.d dVar = hashMap.get(str2);
                        if (dVar instanceof com.xiaomi.clientreport.data.c) {
                            i2 = (int) (i2 + ((com.xiaomi.clientreport.data.c) dVar).b);
                        }
                    }
                }
            }
        }
        return i2;
    }

    public final synchronized com.xiaomi.clientreport.data.a a() {
        if (this.e == null) {
            Context context = this.d;
            a.C1516a a = new a.C1516a().a(true);
            a.d = av.a(context);
            a.e = 1048576L;
            a.C1516a b = a.b(false);
            b.f = TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC;
            a.C1516a c = b.c(false);
            c.g = TbsDownloadConfig.DEFAULT_RETRY_INTERVAL_SEC;
            this.e = c.a(context);
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        if (a(this.d).a().b) {
            as asVar = new as(this.d);
            int i2 = (int) a(this.d).a().e;
            if (i2 < 1800) {
                i2 = 1800;
            }
            if (System.currentTimeMillis() - ay.a(this.d).b("sp_client_report_status", "event_last_upload_time", 0L) > i2 * 1000) {
                m.a(this.d).a(new i(this, asVar), 10);
            }
            synchronized (b.class) {
                if (!m.a(this.d).a(asVar, i2, 0)) {
                    m.a(this.d).a("100886");
                    m.a(this.d).a(asVar, i2, 0);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (a(this.d).a().c) {
            at atVar = new at(this.d);
            int i2 = (int) a(this.d).a().f;
            if (i2 < 1800) {
                i2 = 1800;
            }
            if (System.currentTimeMillis() - ay.a(this.d).b("sp_client_report_status", "perf_last_upload_time", 0L) > i2 * 1000) {
                m.a(this.d).a(new j(this, atVar), 15);
            }
            synchronized (b.class) {
                if (!m.a(this.d).a(atVar, i2, 0)) {
                    m.a(this.d).a("100887");
                    m.a(this.d).a(atVar, i2, 0);
                }
            }
        }
    }

    public final com.xiaomi.clientreport.data.b a(int i2, String str) {
        com.xiaomi.clientreport.data.b bVar = new com.xiaomi.clientreport.data.b();
        bVar.d = str;
        bVar.c = System.currentTimeMillis();
        bVar.b = 5001;
        bVar.a = ar.a(6);
        bVar.e = 1000;
        bVar.g = 1001;
        bVar.f = "E100004";
        bVar.h = this.d.getPackageName();
        bVar.i = this.f;
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(b bVar, com.xiaomi.clientreport.data.b bVar2) {
        if (bVar.g != null) {
            bVar.g.a(bVar2);
            if (bVar.f() < 10) {
                bVar.a(new e(bVar), i);
                return;
            }
            bVar.d();
            m.a(bVar.d).a("100888");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(b bVar, com.xiaomi.clientreport.data.c cVar) {
        if (bVar.h != null) {
            bVar.h.a(cVar);
            if (bVar.g() < 10) {
                bVar.a(new g(bVar), i);
                return;
            }
            bVar.e();
            m.a(bVar.d).a("100889");
        }
    }
}
