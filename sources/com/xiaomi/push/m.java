package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes6.dex */
public class m {
    private static volatile m a;
    private ScheduledThreadPoolExecutor b = new ScheduledThreadPoolExecutor(1);
    private Map<String, ScheduledFuture> c = new HashMap();
    private Object d = new Object();
    private SharedPreferences e;

    /* loaded from: classes6.dex */
    public static abstract class a implements Runnable {
        public abstract String a();
    }

    /* loaded from: classes6.dex */
    static class b implements Runnable {
        a a;

        public b(a aVar) {
            this.a = aVar;
        }

        void a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.run();
            a();
        }
    }

    private m(Context context) {
        this.e = context.getSharedPreferences("mipush_extra", 0);
    }

    public static m a(Context context) {
        if (a == null) {
            synchronized (m.class) {
                if (a == null) {
                    a = new m(context);
                }
            }
        }
        return a;
    }

    private ScheduledFuture a(a aVar) {
        ScheduledFuture scheduledFuture;
        synchronized (this.d) {
            scheduledFuture = this.c.get(aVar.a());
        }
        return scheduledFuture;
    }

    public final void a(Runnable runnable, int i) {
        this.b.schedule(runnable, i, TimeUnit.SECONDS);
    }

    public final boolean a(a aVar, int i) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        ScheduledFuture<?> schedule = this.b.schedule(new o(this, aVar), i, TimeUnit.SECONDS);
        synchronized (this.d) {
            this.c.put(aVar.a(), schedule);
        }
        return true;
    }

    public final boolean a(a aVar, int i, int i2) {
        return a(aVar, i, i2, false);
    }

    public final boolean a(String str) {
        synchronized (this.d) {
            ScheduledFuture scheduledFuture = this.c.get(str);
            if (scheduledFuture == null) {
                return false;
            }
            this.c.remove(str);
            return scheduledFuture.cancel(false);
        }
    }

    private boolean a(a aVar, int i, int i2, boolean z) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        String str = "last_job_time" + aVar.a();
        n nVar = new n(this, aVar, false, str);
        long abs = Math.abs(System.currentTimeMillis() - this.e.getLong(str, 0L)) / 1000;
        if (abs < i - i2) {
            i2 = (int) (i - abs);
        }
        try {
            ScheduledFuture<?> scheduleAtFixedRate = this.b.scheduleAtFixedRate(nVar, i2, i, TimeUnit.SECONDS);
            synchronized (this.d) {
                this.c.put(aVar.a(), scheduleAtFixedRate);
            }
            return true;
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.c.a(e);
            return true;
        }
    }
}
