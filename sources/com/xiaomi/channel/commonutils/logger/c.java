package com.xiaomi.channel.commonutils.logger;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.xiaomi.push.jj;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes6.dex */
public abstract class c {
    private static int a = 2;
    private static Context b = null;
    private static boolean c = false;
    private static boolean d = false;
    private static String e = "XMPush-" + Process.myPid();
    private static com.xiaomi.channel.commonutils.logger.a f = new a();
    private static final HashMap<Integer, Long> g = new HashMap<>();
    private static final HashMap<Integer, String> h = new HashMap<>();
    private static final Integer i = -1;
    private static AtomicInteger j = new AtomicInteger(1);

    /* loaded from: classes6.dex */
    public static class a implements com.xiaomi.channel.commonutils.logger.a {
        private String a = c.e;

        a() {
        }

        @Override // com.xiaomi.channel.commonutils.logger.a
        public final void a(String str) {
        }

        @Override // com.xiaomi.channel.commonutils.logger.a
        public final void a(String str, Throwable th) {
            Log.v(this.a, str, th);
        }
    }

    public static int a() {
        return a;
    }

    public static void a(int i2) {
        a = 2;
    }

    private static void a(int i2, String str) {
        if (i2 >= a) {
            f.a(str);
        }
    }

    public static void a(Context context) {
        b = context;
        if (jj.a(context)) {
            c = true;
        }
        if (jj.a()) {
            d = true;
        }
    }

    public static void a(com.xiaomi.channel.commonutils.logger.a aVar) {
        f = aVar;
    }

    public static void a(Integer num) {
        if (a > 1 || !g.containsKey(num)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - g.remove(num).longValue();
        com.xiaomi.channel.commonutils.logger.a aVar = f;
        aVar.a(h.remove(num) + " ends in " + currentTimeMillis + " ms");
    }

    public static void a(String str) {
        a(2, g(str));
    }

    public static void b(String str) {
        a(0, g(str));
    }

    private static String c() {
        return "[Tid:" + Thread.currentThread().getId() + "] ";
    }

    public static void c(String str) {
        a(1, g(str));
    }

    public static void d(String str) {
        a(4, g(str));
    }

    public static Integer e(String str) {
        if (a <= 1) {
            Integer valueOf = Integer.valueOf(j.incrementAndGet());
            g.put(valueOf, Long.valueOf(System.currentTimeMillis()));
            h.put(valueOf, str);
            com.xiaomi.channel.commonutils.logger.a aVar = f;
            aVar.a(str + " starts");
            return valueOf;
        }
        return i;
    }

    public static void f(String str) {
        if (c) {
            a(str);
            return;
        }
        g(str);
        if (d) {
            return;
        }
        a(str);
    }

    private static String g(String str) {
        return c() + str;
    }

    public static void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(c());
        sb.append("[" + str + "] " + str2);
        a(2, sb.toString());
    }

    public static void a(String str, Throwable th) {
        String g2 = g(str);
        if (4 >= a) {
            f.a(g2, th);
        }
    }

    public static void a(Throwable th) {
        if (4 >= a) {
            f.a("", th);
        }
    }
}
