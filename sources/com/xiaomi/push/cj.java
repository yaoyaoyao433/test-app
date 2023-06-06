package com.xiaomi.push;

import android.content.Context;
import com.meituan.met.mercury.load.bean.DDLoadConstants;
import com.xiaomi.push.p;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes6.dex */
public class cj {
    private static volatile cj c;
    public final ConcurrentLinkedQueue<b> a = new ConcurrentLinkedQueue<>();
    private Context b;

    /* loaded from: classes6.dex */
    class a extends b {
        a() {
            super();
        }

        @Override // com.xiaomi.push.cj.b, com.xiaomi.push.p.b
        public final void a() {
            cj.c(cj.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class b extends p.b {
        long b = System.currentTimeMillis();

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        @Override // com.xiaomi.push.p.b
        public void a() {
        }

        public boolean c() {
            return true;
        }
    }

    /* loaded from: classes6.dex */
    class c extends b {
        String a;
        String d;
        File e;
        int f;
        boolean g;
        boolean h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(String str, String str2, File file, boolean z) {
            super();
            this.a = str;
            this.d = str2;
            this.e = file;
            this.h = z;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:2|3)|(2:5|6)|7|(2:9|(1:11))(1:20)|13|14|15|16|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
            com.xiaomi.channel.commonutils.logger.c.c("JSONException on put " + r0.getMessage());
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean d() {
            /*
                r10 = this;
                com.xiaomi.push.cj r0 = com.xiaomi.push.cj.this
                android.content.Context r0 = com.xiaomi.push.cj.a(r0)
                java.lang.String r1 = "log.timestamp"
                r2 = 0
                android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
                java.lang.String r1 = "log.requst"
                java.lang.String r3 = ""
                java.lang.String r1 = r0.getString(r1, r3)
                long r3 = java.lang.System.currentTimeMillis()
                org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2b
                r5.<init>(r1)     // Catch: org.json.JSONException -> L2b
                java.lang.String r1 = "time"
                long r6 = r5.getLong(r1)     // Catch: org.json.JSONException -> L2b
                java.lang.String r1 = "times"
                int r1 = r5.getInt(r1)     // Catch: org.json.JSONException -> L2c
                goto L2d
            L2b:
                r6 = r3
            L2c:
                r1 = 0
            L2d:
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r6
                r8 = 86400000(0x5265c00, double:4.2687272E-316)
                int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r3 >= 0) goto L3e
                r3 = 10
                if (r1 <= r3) goto L43
                return r2
            L3e:
                long r6 = java.lang.System.currentTimeMillis()
                r1 = 0
            L43:
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                r3 = 1
                java.lang.String r4 = "time"
                r2.put(r4, r6)     // Catch: org.json.JSONException -> L66
                java.lang.String r4 = "times"
                int r1 = r1 + r3
                r2.put(r4, r1)     // Catch: org.json.JSONException -> L66
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: org.json.JSONException -> L66
                java.lang.String r1 = "log.requst"
                java.lang.String r2 = r2.toString()     // Catch: org.json.JSONException -> L66
                android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)     // Catch: org.json.JSONException -> L66
                r0.commit()     // Catch: org.json.JSONException -> L66
                goto L7c
            L66:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "JSONException on put "
                r1.<init>(r2)
                java.lang.String r0 = r0.getMessage()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.xiaomi.channel.commonutils.logger.c.c(r0)
            L7c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.cj.c.d():boolean");
        }

        @Override // com.xiaomi.push.cj.b, com.xiaomi.push.p.b
        public final void a() {
            try {
                if (d()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("uid", com.xiaomi.push.service.av.e());
                    hashMap.put("token", this.d);
                    hashMap.put("net", al.i(cj.this.b));
                    al.a(this.a, hashMap, this.e, "file");
                }
                this.g = true;
            } catch (IOException unused) {
            }
        }

        @Override // com.xiaomi.push.p.b
        public final void b() {
            if (!this.g) {
                this.f++;
                if (this.f < 3) {
                    cj.this.a.add(this);
                }
            }
            if (this.g || this.f >= 3) {
                this.e.delete();
            }
            cj.this.b((1 << this.f) * 1000);
        }

        @Override // com.xiaomi.push.cj.b
        public final boolean c() {
            if (al.d(cj.this.b)) {
                return true;
            }
            return this.h && al.a(cj.this.b);
        }
    }

    private cj(Context context) {
        this.b = context;
        this.a.add(new a());
        a(0L);
    }

    public static cj a(Context context) {
        if (c == null) {
            synchronized (cj.class) {
                if (c == null) {
                    c = new cj(context);
                }
            }
        }
        c.b = context;
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        b peek = this.a.peek();
        if (peek == null || !peek.c()) {
            return;
        }
        a(j);
    }

    public void a(long j) {
        if (this.a.isEmpty()) {
            return;
        }
        gr.a(new cl(this), j);
    }

    public final void a() {
        while (!this.a.isEmpty()) {
            b peek = this.a.peek();
            if (peek != null) {
                if (!(System.currentTimeMillis() - peek.b > DDLoadConstants.UNKNOWN_FILE_CLEAR_POLL_DURATION) && this.a.size() <= 6) {
                    break;
                }
                com.xiaomi.channel.commonutils.logger.c.c("remove Expired task");
                this.a.remove(peek);
            }
        }
        b(0L);
    }

    static /* synthetic */ void c(cj cjVar) {
        if (d.b() || d.a()) {
            return;
        }
        try {
            File file = new File(cjVar.b.getExternalFilesDir(null) + "/.logcache");
            if (file.exists() && file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    file2.delete();
                }
            }
        } catch (NullPointerException unused) {
        }
    }
}
