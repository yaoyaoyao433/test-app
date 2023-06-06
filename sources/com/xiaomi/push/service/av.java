package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.xiaomi.push.cz;
import com.xiaomi.push.da;
import com.xiaomi.push.gr;
import com.xiaomi.push.hf;
import com.xiaomi.push.jr;
import com.xiaomi.push.p;
import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes6.dex */
public final class av {
    private static String b;
    private static av e = new av();
    cz.a a;
    private List<a> c = new ArrayList();
    private p.b d;

    /* loaded from: classes6.dex */
    public static abstract class a {
        public void a(da.b bVar) {
        }
    }

    private av() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ p.b a(av avVar, p.b bVar) {
        avVar.d = null;
        return null;
    }

    public static av a() {
        return e;
    }

    public static synchronized String e() {
        String str;
        synchronized (av.class) {
            if (b == null) {
                SharedPreferences sharedPreferences = jr.a().getSharedPreferences("XMPushServiceConfig", 0);
                String string = sharedPreferences.getString("DeviceUUID", null);
                b = string;
                if (string == null) {
                    String a2 = hf.a(jr.a(), false);
                    b = a2;
                    if (a2 != null) {
                        sharedPreferences.edit().putString("DeviceUUID", b).commit();
                    }
                }
            }
            str = b;
        }
        return str;
    }

    private void f() {
        if (this.d != null) {
            return;
        }
        this.d = new aw(this);
        gr.a(this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.xiaomi.push.jr.a()     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.lang.String r2 = "XMCloudCfg"
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            com.xiaomi.push.ac r0 = com.xiaomi.push.ac.a(r2)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L25
            com.xiaomi.push.cz$a r0 = com.xiaomi.push.cz.a.a(r0)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L25
            r4.a = r0     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L25
            r2.close()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L25
            com.xiaomi.push.b.a(r2)
            goto L44
        L21:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L50
        L25:
            r0 = move-exception
            r1 = r0
            r0 = r2
            goto L2c
        L29:
            r1 = move-exception
            goto L50
        L2b:
            r1 = move-exception
        L2c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = "load config failure: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L29
            r2.append(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L29
            com.xiaomi.channel.commonutils.logger.c.a(r1)     // Catch: java.lang.Throwable -> L29
            com.xiaomi.push.b.a(r0)
        L44:
            com.xiaomi.push.cz$a r0 = r4.a
            if (r0 != 0) goto L4f
            com.xiaomi.push.cz$a r0 = new com.xiaomi.push.cz$a
            r0.<init>()
            r4.a = r0
        L4f:
            return
        L50:
            com.xiaomi.push.b.a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.av.g():void");
    }

    public final synchronized void a(a aVar) {
        this.c.add(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        this.c.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (this.a == null) {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d() {
        c();
        if (this.a != null) {
            return this.a.a;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(da.b bVar) {
        a[] aVarArr;
        if (bVar.c && bVar.d > d()) {
            f();
        }
        synchronized (this) {
            aVarArr = (a[]) this.c.toArray(new a[this.c.size()]);
        }
        for (a aVar : aVarArr) {
            aVar.a(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(av avVar) {
        try {
            if (avVar.a != null) {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(jr.a().openFileOutput("XMCloudCfg", 0));
                com.xiaomi.push.bd bdVar = new com.xiaomi.push.bd(bufferedOutputStream, new byte[4096]);
                avVar.a.a(bdVar);
                if (bdVar.a != null) {
                    bdVar.a();
                }
                bufferedOutputStream.close();
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.a("save config failure: " + e2.getMessage());
        }
    }
}
