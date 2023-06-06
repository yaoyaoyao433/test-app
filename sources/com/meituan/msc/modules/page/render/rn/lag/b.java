package com.meituan.msc.modules.page.render.rn.lag;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Printer;
import com.meituan.metrics.looper_logging.LooperLoggingManager;
import com.meituan.msc.modules.page.render.rn.fps.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements Printer, e.a {
    public static ChangeQuickRedirect a;
    public final Looper b;
    public int c;
    private volatile boolean d;
    private final com.meituan.msc.modules.page.render.rn.lag.a e;
    private volatile long f;
    private final List<e> g;
    private final long h;
    private final long i;
    private final Handler j;
    private final Thread k;
    private final String l;
    private volatile int m;
    private boolean n;
    private final Runnable o;
    private final boolean p;
    private final int q;

    public static /* synthetic */ void b(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "3325af9991b49be83d9fe82726350d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "3325af9991b49be83d9fe82726350d72");
            return;
        }
        try {
            if (bVar.g.size() >= bVar.q) {
                bVar.g.remove(bVar.g.size() - 1);
            }
            long currentTimeMillis = System.currentTimeMillis();
            StackTraceElement[] stackTrace = bVar.k.getStackTrace();
            if (stackTrace.length > 0) {
                bVar.g.add(new e(currentTimeMillis, stackTrace));
            }
        } catch (Throwable unused) {
            bVar.g.clear();
        }
    }

    public static /* synthetic */ int c(b bVar) {
        int i = bVar.m;
        bVar.m = i + 1;
        return i;
    }

    public b(int i, boolean z, long j, Looper looper, com.meituan.msc.modules.page.render.rn.lag.a aVar) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), looper, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d91d5d445283633d8708c9742c2e3fc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d91d5d445283633d8708c9742c2e3fc5");
            return;
        }
        this.d = false;
        this.f = 0L;
        this.g = Collections.synchronizedList(new ArrayList());
        this.c = 0;
        this.o = new a();
        this.e = aVar;
        this.h = j;
        this.i = Math.max(j / 2, 1000L);
        this.j = new Handler(looper);
        this.b = looper;
        this.k = looper.getThread();
        this.l = this.k.getName();
        this.p = z;
        this.q = i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;

        public a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2095cfcf0ce8d2e29c7ea9c3424089d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2095cfcf0ce8d2e29c7ea9c3424089d");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e98ae5543c67c8dfcdd0c832e1269184", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e98ae5543c67c8dfcdd0c832e1269184");
            } else if (b.this.d && com.meituan.msc.modules.page.render.rn.fps.e.a().b) {
                b.b(b.this);
                b.c(b.this);
                long elapsedRealtime = SystemClock.elapsedRealtime() - b.this.f;
                if (b.this.m == 1) {
                    b.this.n = false;
                }
                if (b.this.e != null && !b.this.n && elapsedRealtime >= b.this.h && !b.this.g.isEmpty()) {
                    b.this.e.a(elapsedRealtime, b.this.l, new ArrayList(b.this.g));
                    b.this.j.removeCallbacks(this);
                    b.this.n = true;
                }
                if (!b.this.d || b.this.n) {
                    return;
                }
                b.this.j.postDelayed(this, b.this.i);
            }
        }
    }

    @Override // android.util.Printer
    public final void println(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3483fdc6a7f843322ef1214fb25d4e20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3483fdc6a7f843322ef1214fb25d4e20");
        } else if (!this.p || Debug.isDebuggerConnected() || str == null || str.length() <= 0) {
        } else {
            boolean z = str.charAt(0) == '>';
            this.d = z;
            if (z) {
                this.f = SystemClock.elapsedRealtime();
                this.g.clear();
                this.j.postDelayed(this.o, this.i);
                return;
            }
            this.m = 0;
            this.j.removeCallbacks(this.o);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbeccfdfc67dbb2864fdc4d9e16d3ecb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbeccfdfc67dbb2864fdc4d9e16d3ecb");
        } else if (this.c == 0) {
            LooperLoggingManager.getInstance().unRegisterLogging(this.b, this);
        } else {
            com.meituan.msc.modules.page.render.rn.fps.e.a().b(this);
        }
    }

    @Override // com.meituan.msc.modules.page.render.rn.fps.e.a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f4907bb6764126989e5e6bd240ffe35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f4907bb6764126989e5e6bd240ffe35");
            return;
        }
        if (this.c == 0) {
            a();
            this.c = 1;
        }
        b();
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53565b26492bc1381acea25ff08dc168", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53565b26492bc1381acea25ff08dc168");
            return;
        }
        this.j.removeCallbacks(this.o);
        this.g.clear();
        this.m = 0;
        this.f = SystemClock.elapsedRealtime();
        this.j.postDelayed(this.o, this.i);
        this.d = true;
    }
}
