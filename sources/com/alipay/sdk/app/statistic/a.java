package com.alipay.sdk.app.statistic;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.util.d;
import com.alipay.sdk.util.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: ProGuard */
    /* renamed from: com.alipay.sdk.app.statistic.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0022a {
        public static synchronized String a(Context context) {
            synchronized (C0022a.class) {
                d.a("RecordPref", "stat peek");
                if (context == null) {
                    return null;
                }
                C0023a b = b(context);
                if (b.a.isEmpty()) {
                    return null;
                }
                return b.a.entrySet().iterator().next().getValue();
            }
        }

        public static synchronized String a(Context context, String str, String str2) {
            synchronized (C0022a.class) {
                d.a("RecordPref", "stat append " + str2 + " , " + str);
                if (context == null || TextUtils.isEmpty(str)) {
                    return null;
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = UUID.randomUUID().toString();
                }
                C0023a b = b(context);
                if (b.a.size() > 20) {
                    b.a.clear();
                }
                b.a.put(str2, str);
                a(context, b);
                return str2;
            }
        }

        /* compiled from: ProGuard */
        /* renamed from: com.alipay.sdk.app.statistic.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0023a {
            public final LinkedHashMap<String, String> a = new LinkedHashMap<>();

            public C0023a() {
            }

            public final String a() {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (Map.Entry<String, String> entry : this.a.entrySet()) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(entry.getKey()).put(entry.getValue());
                        jSONArray.put(jSONArray2);
                    }
                    return jSONArray.toString();
                } catch (Throwable th) {
                    d.a(th);
                    return new JSONArray().toString();
                }
            }

            public C0023a(String str) {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                        this.a.put(jSONArray2.getString(0), jSONArray2.getString(1));
                    }
                } catch (Throwable th) {
                    d.a(th);
                }
            }
        }

        public static synchronized int a(Context context, String str) {
            synchronized (C0022a.class) {
                d.a("RecordPref", "stat remove " + str);
                if (context == null || TextUtils.isEmpty(str)) {
                    return 0;
                }
                C0023a b = b(context);
                if (b.a.isEmpty()) {
                    return 0;
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : b.a.entrySet()) {
                    if (str.equals(entry.getValue())) {
                        arrayList.add(entry.getKey());
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    b.a.remove((String) it.next());
                }
                a(context, b);
                return arrayList.size();
            }
        }

        private static synchronized C0023a b(Context context) {
            synchronized (C0022a.class) {
                try {
                    String b = h.b(null, context, "alipay_cashier_statistic_record", null);
                    if (TextUtils.isEmpty(b)) {
                        return new C0023a();
                    }
                    return new C0023a(b);
                } catch (Throwable th) {
                    d.a(th);
                    return new C0023a();
                }
            }
        }

        private static synchronized void a(Context context, C0023a c0023a) {
            synchronized (C0022a.class) {
                if (c0023a == null) {
                    try {
                        c0023a = new C0023a();
                    } catch (Throwable th) {
                        d.a(th);
                        return;
                    }
                }
                h.a(null, context, "alipay_cashier_statistic_record", c0023a.a());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class b {

        /* compiled from: ProGuard */
        /* renamed from: com.alipay.sdk.app.statistic.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class RunnableC0024a implements Runnable {
            public final /* synthetic */ String a;
            public final /* synthetic */ Context b;

            public RunnableC0024a(String str, Context context) {
                this.a = str;
                this.b = context;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (TextUtils.isEmpty(this.a) || b.a(this.b, this.a)) {
                    for (int i = 0; i < 4; i++) {
                        String a = C0022a.a(this.b);
                        if (TextUtils.isEmpty(a) || !b.a(this.b, a)) {
                            return;
                        }
                    }
                }
            }
        }

        public static synchronized boolean a(Context context, String str) {
            synchronized (b.class) {
                d.a("mspl", "stat sub " + str);
                if ((com.alipay.sdk.data.a.a().j ? new com.alipay.sdk.packet.impl.c() : new com.alipay.sdk.packet.impl.d()).a((com.alipay.sdk.sys.a) null, context, str) != null) {
                    C0022a.a(context, str);
                    return true;
                }
                return false;
            }
        }

        public static synchronized void a(Context context, com.alipay.sdk.app.statistic.b bVar, String str, String str2) {
            synchronized (b.class) {
                if (context == null || bVar == null || str == null) {
                    return;
                }
                a(context, bVar.a(str), str2);
            }
        }

        private static synchronized void a(Context context, String str, String str2) {
            synchronized (b.class) {
                if (context == null) {
                    return;
                }
                if (!TextUtils.isEmpty(str)) {
                    C0022a.a(context, str, str2);
                }
                new Thread(new RunnableC0024a(str, context)).start();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class c {
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:14:0x0025
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public static synchronized long a(android.content.Context r6) {
            /*
                java.lang.Class<com.alipay.sdk.app.statistic.a$c> r0 = com.alipay.sdk.app.statistic.a.c.class
                monitor-enter(r0)
                r1 = 0
                r3 = 0
                java.lang.String r4 = "alipay_cashier_statistic_v"
                java.lang.String r4 = com.alipay.sdk.util.h.b(r3, r6, r4, r3)     // Catch: java.lang.Throwable -> L17
                boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L17
                if (r5 != 0) goto L17
                long r4 = java.lang.Long.parseLong(r4)     // Catch: java.lang.Throwable -> L17
                r1 = r4
            L17:
                r4 = 1
                long r1 = r1 + r4
                java.lang.String r4 = "alipay_cashier_statistic_v"
                java.lang.String r5 = java.lang.Long.toString(r1)     // Catch: java.lang.Throwable -> L23
                com.alipay.sdk.util.h.a(r3, r6, r4, r5)     // Catch: java.lang.Throwable -> L23
            L23:
                monitor-exit(r0)
                return r1
            L25:
                r6 = move-exception
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.statistic.a.c.a(android.content.Context):long");
        }
    }

    public static synchronized void a(Context context, com.alipay.sdk.sys.a aVar, String str, String str2) {
        synchronized (a.class) {
            if (context == null || aVar == null) {
                return;
            }
            try {
                C0022a.a(context, aVar.i.a(str), str2);
            } catch (Throwable th) {
                d.a(th);
            }
        }
    }

    public static synchronized void b(Context context, com.alipay.sdk.sys.a aVar, String str, String str2) {
        synchronized (a.class) {
            if (context == null || aVar == null) {
                return;
            }
            b.a(context, aVar.i, str, str2);
        }
    }

    public static void a(com.alipay.sdk.sys.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.i.a(str, str2, str3);
    }

    public static void a(com.alipay.sdk.sys.a aVar, String str, Throwable th) {
        if (aVar == null || th.getClass() == null) {
            return;
        }
        aVar.i.a(str, th.getClass().getSimpleName(), th);
    }

    public static void a(com.alipay.sdk.sys.a aVar, String str, String str2, Throwable th, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.i.a(str, str2, th, str3);
    }

    public static void a(com.alipay.sdk.sys.a aVar, String str, String str2, Throwable th) {
        if (aVar == null) {
            return;
        }
        aVar.i.a(str, str2, th);
    }

    public static void b(com.alipay.sdk.sys.a aVar, String str, String str2, String str3) {
        if (aVar == null) {
            return;
        }
        aVar.i.b(str, str2, str3);
    }

    public static void a(com.alipay.sdk.sys.a aVar, String str, String str2) {
        if (aVar == null) {
            return;
        }
        aVar.i.a(str, str2);
    }
}
