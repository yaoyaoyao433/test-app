package com.meituan.msc.modules.api.legacy.timing;

import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import com.meituan.msc.jse.bridge.Arguments;
import com.meituan.msc.jse.bridge.CatalystInstanceImpl;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.bridge.WritableArray;
import com.meituan.msc.jse.common.annotations.DoNotStrip;
import com.meituan.msc.jse.modules.core.a;
import com.meituan.msc.jse.modules.core.c;
import com.meituan.msc.modules.service.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    i b;
    final com.meituan.msc.modules.api.legacy.timing.a c;
    final Object d;
    final Object e;
    final PriorityQueue<c> f;
    final SparseArray<c> g;
    final AtomicBoolean h;
    final AtomicBoolean i;
    @Nullable
    a j;
    boolean k;
    private final d l;
    private final C0454b m;
    private boolean n;
    private boolean o;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        final int b;
        final boolean c;
        final int d;
        long e;

        private c(int i, long j, int i2, boolean z) {
            Object[] objArr = {Integer.valueOf(i), new Long(j), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa606ce5e5402bfcb500cac443d2018f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa606ce5e5402bfcb500cac443d2018f");
                return;
            }
            this.b = i;
            this.e = j;
            this.d = i2;
            this.c = z;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class d extends a.AbstractC0445a {
        public static ChangeQuickRedirect b;
        @Nullable
        private WritableArray d;

        private d() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "400d819e2654bf965c61243d6642f140", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "400d819e2654bf965c61243d6642f140");
            } else {
                this.d = null;
            }
        }

        @Override // com.meituan.msc.jse.modules.core.a.AbstractC0445a
        public final void a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6627cf4e8f3724d9aca41b68f67bd671", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6627cf4e8f3724d9aca41b68f67bd671");
            } else if (!b.this.h.get() || b.this.i.get()) {
                long j2 = j / 1000000;
                synchronized (b.this.d) {
                    while (!b.this.f.isEmpty() && b.this.f.peek().e < j2) {
                        c poll = b.this.f.poll();
                        if (this.d == null) {
                            this.d = Arguments.createArray();
                        }
                        this.d.pushInt(poll.b);
                        if (!poll.c) {
                            b.this.g.remove(poll.b);
                        } else {
                            poll.e = poll.d + j2;
                            b.this.f.add(poll);
                        }
                    }
                }
                if (this.d != null) {
                    b.this.c.a(this.d);
                    this.d = null;
                }
                com.meituan.msc.jse.modules.core.c.b().a(c.a.TIMERS_EVENTS, this);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.api.legacy.timing.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0454b extends a.AbstractC0445a {
        public static ChangeQuickRedirect b;

        private C0454b() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c746d394a22f7eef61c3b49878e27922", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c746d394a22f7eef61c3b49878e27922");
            }
        }

        @Override // com.meituan.msc.jse.modules.core.a.AbstractC0445a
        public final void a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f92a3b122764cfa4931ef3542404f83", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f92a3b122764cfa4931ef3542404f83");
            } else if (!b.this.h.get() || b.this.i.get()) {
                if (b.this.j != null) {
                    b.this.j.cancel();
                }
                b.this.j = new a(j);
                if (b.this.b != null) {
                    i iVar = b.this.b;
                    a aVar = b.this.j;
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = i.a;
                    if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "ecb590dac11a6325d0dffc29536e46bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "ecb590dac11a6325d0dffc29536e46bf");
                    } else {
                        ((CatalystInstanceImpl) iVar.d).runOnJSQueueThread(aVar);
                    }
                }
                com.meituan.msc.jse.modules.core.c.b().a(c.a.IDLE_EVENT, this);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        public static ChangeQuickRedirect a;
        private volatile boolean c;
        private final long d;

        public a(long j) {
            Object[] objArr = {b.this, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a3d153f24e295a1b49168177afffb27", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a3d153f24e295a1b49168177afffb27");
                return;
            }
            this.c = false;
            this.d = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1cff0f604f76bf22fa3fae74ebd2e4c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1cff0f604f76bf22fa3fae74ebd2e4c");
            } else if (this.c) {
            } else {
                long uptimeMillis = SystemClock.uptimeMillis() - (this.d / 1000000);
                long currentTimeMillis = System.currentTimeMillis() - uptimeMillis;
                if (16.666666f - ((float) uptimeMillis) < 1.0f) {
                    return;
                }
                synchronized (b.this.e) {
                    z = b.this.k;
                }
                if (z) {
                    b.this.c.a(currentTimeMillis);
                }
                b.this.j = null;
            }
        }

        public final void cancel() {
            this.c = true;
        }
    }

    public b(com.meituan.msc.modules.api.legacy.timing.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "335fe488b47acd0349d9a4a9f8b29ba6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "335fe488b47acd0349d9a4a9f8b29ba6");
            return;
        }
        this.d = new Object();
        this.e = new Object();
        this.h = new AtomicBoolean(true);
        this.i = new AtomicBoolean(false);
        this.l = new d();
        this.m = new C0454b();
        this.n = false;
        this.o = false;
        this.k = false;
        this.c = aVar;
        this.f = new PriorityQueue<>(11, new Comparator<c>() { // from class: com.meituan.msc.modules.api.legacy.timing.b.1
            public static ChangeQuickRedirect a;

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(c cVar, c cVar2) {
                c cVar3 = cVar;
                c cVar4 = cVar2;
                Object[] objArr2 = {cVar3, cVar4};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a9bf4c925181c2c7da219afe90a9526", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a9bf4c925181c2c7da219afe90a9526")).intValue();
                }
                int i = ((cVar3.e - cVar4.e) > 0L ? 1 : ((cVar3.e - cVar4.e) == 0L ? 0 : -1));
                if (i == 0) {
                    return 0;
                }
                return i < 0 ? -1 : 1;
            }
        });
        this.g = new SparseArray<>();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e5e54e3580b414d48d678848ed11d5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e5e54e3580b414d48d678848ed11d5c");
            return;
        }
        this.h.set(true);
        h();
        g();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8fde125df671a2811f2cfad96507adf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8fde125df671a2811f2cfad96507adf");
            return;
        }
        h();
        g();
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eee1971abd09ccbe7eabaf7d979fd1e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eee1971abd09ccbe7eabaf7d979fd1e9");
            return;
        }
        this.h.set(false);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afe157f8136917568152f6649346c7a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afe157f8136917568152f6649346c7a5");
        } else if (!this.n) {
            com.meituan.msc.jse.modules.core.c.b().a(c.a.TIMERS_EVENTS, this.l);
            this.n = true;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7cdbeea8b43fc0e82aa7f3802ab6a624", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7cdbeea8b43fc0e82aa7f3802ab6a624");
            return;
        }
        synchronized (this.e) {
            if (this.k) {
                e();
            }
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae723d7d4ed46878379c71d98896ae67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae723d7d4ed46878379c71d98896ae67");
            return;
        }
        h();
        f();
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4875a7ba8829b85e9a59e8e61f4b65b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4875a7ba8829b85e9a59e8e61f4b65b3");
        } else if (!this.h.get() || this.i.get()) {
        } else {
            h();
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d3b6d3f8ac2604fbdb94f53d8932d03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d3b6d3f8ac2604fbdb94f53d8932d03");
        } else if (this.n && this.h.get()) {
            com.meituan.msc.jse.modules.core.c.b().b(c.a.TIMERS_EVENTS, this.l);
            this.n = false;
        }
    }

    void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "264c5b96c51e89910fc7d9618ce92336", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "264c5b96c51e89910fc7d9618ce92336");
        } else if (this.o) {
        } else {
            com.meituan.msc.jse.modules.core.c.b().a(c.a.IDLE_EVENT, this.m);
            this.o = true;
        }
    }

    void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a8d50a662bc80b94f8321137eb59b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a8d50a662bc80b94f8321137eb59b25");
        } else if (this.o) {
            com.meituan.msc.jse.modules.core.c.b().b(c.a.IDLE_EVENT, this.m);
            this.o = false;
        }
    }

    @DoNotStrip
    public final void createTimer(int i, long j, int i2, boolean z) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a70b34e7a0a380f5d2b7b556c2aaa863", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a70b34e7a0a380f5d2b7b556c2aaa863");
            return;
        }
        c cVar = new c(i, (System.nanoTime() / 1000000) + j, i2, z);
        synchronized (this.d) {
            this.f.add(cVar);
            this.g.put(i, cVar);
        }
    }

    @DoNotStrip
    public final void deleteTimer(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ad4198ad5add4c221a078f5f3433466", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ad4198ad5add4c221a078f5f3433466");
            return;
        }
        synchronized (this.d) {
            c cVar = this.g.get(i);
            if (cVar == null) {
                return;
            }
            this.g.remove(i);
            this.f.remove(cVar);
        }
    }

    @DoNotStrip
    public final void setSendIdleEvents(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c206f9260154457488b2240c7d7d5550", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c206f9260154457488b2240c7d7d5550");
            return;
        }
        synchronized (this.e) {
            this.k = z;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.modules.api.legacy.timing.b.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c990a57236b742d62c96f3009e2710dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c990a57236b742d62c96f3009e2710dc");
                    return;
                }
                synchronized (b.this.e) {
                    if (z) {
                        b.this.e();
                    } else {
                        b.this.f();
                    }
                }
            }
        });
    }
}
