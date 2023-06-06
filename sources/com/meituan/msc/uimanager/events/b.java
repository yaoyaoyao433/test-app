package com.meituan.msc.uimanager.events;

import android.util.LongSparseArray;
import com.meituan.msc.jse.bridge.LifecycleEventListener;
import com.meituan.msc.jse.bridge.ReactApplicationContext;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.jse.modules.core.a;
import com.meituan.msc.jse.modules.core.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class b implements LifecycleEventListener {
    public static ChangeQuickRedirect a;
    private static final Comparator<com.meituan.msc.uimanager.events.a> d = new Comparator<com.meituan.msc.uimanager.events.a>() { // from class: com.meituan.msc.uimanager.events.b.1
        public static ChangeQuickRedirect a;

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(com.meituan.msc.uimanager.events.a aVar, com.meituan.msc.uimanager.events.a aVar2) {
            com.meituan.msc.uimanager.events.a aVar3 = aVar;
            com.meituan.msc.uimanager.events.a aVar4 = aVar2;
            Object[] objArr = {aVar3, aVar4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aee1af31e9a313efef57a4c7ca708fe", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aee1af31e9a313efef57a4c7ca708fe")).intValue();
            }
            if (aVar3 == null && aVar4 == null) {
                return 0;
            }
            if (aVar3 == null) {
                return -1;
            }
            if (aVar4 != null) {
                int i = ((aVar3.i - aVar4.i) > 0L ? 1 : ((aVar3.i - aVar4.i) == 0L ? 0 : -1));
                if (i == 0) {
                    return 0;
                }
                if (i < 0) {
                    return -1;
                }
            }
            return 1;
        }
    };
    public final ReactApplicationContext b;
    public volatile ReactEventEmitter c;
    private final Object e;
    private final Object f;
    private final LongSparseArray<Integer> g;
    private final Map<String, Short> h;
    private final a i;
    private final ArrayList<com.meituan.msc.uimanager.events.a> j;
    private final ArrayList<c> k;
    private final List<Object> l;
    private final C0486b m;
    private final AtomicInteger n;
    private com.meituan.msc.uimanager.events.a[] o;
    private int p;
    private short q;
    private volatile boolean r;
    private volatile boolean s;

    public static /* synthetic */ void b(b bVar) {
        int i;
        short s;
        int i2;
        long longValue;
        com.meituan.msc.uimanager.events.a aVar;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "35bfce297d9e5851abed7e23e8af8453", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "35bfce297d9e5851abed7e23e8af8453");
            return;
        }
        synchronized (bVar.e) {
            synchronized (bVar.f) {
                int i3 = 0;
                while (i3 < bVar.j.size()) {
                    com.meituan.msc.uimanager.events.a aVar2 = bVar.j.get(i3);
                    if (!aVar2.d()) {
                        bVar.b(aVar2);
                        i = i3;
                    } else {
                        int i4 = aVar2.h;
                        String a2 = aVar2.a();
                        short b = aVar2.b();
                        Object[] objArr2 = new Object[3];
                        objArr2[c] = Integer.valueOf(i4);
                        objArr2[1] = a2;
                        objArr2[2] = Short.valueOf(b);
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        i = i3;
                        com.meituan.msc.uimanager.events.a aVar3 = null;
                        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "1522dde87fdecf2f32063056217109f6", RobustBitConfig.DEFAULT_VALUE)) {
                            longValue = ((Long) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "1522dde87fdecf2f32063056217109f6")).longValue();
                            i2 = 1;
                        } else {
                            Short sh = bVar.h.get(a2);
                            if (sh != null) {
                                s = sh.shortValue();
                            } else {
                                s = bVar.q;
                                bVar.q = (short) (s + 1);
                                bVar.h.put(a2, Short.valueOf(s));
                            }
                            i2 = 1;
                            Object[] objArr3 = {Integer.valueOf(i4), Short.valueOf(s), Short.valueOf(b)};
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            longValue = PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "e05eec2f53b3770bf3dd357131192fad", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "e05eec2f53b3770bf3dd357131192fad")).longValue() : i4 | ((s & 65535) << 32) | ((b & 65535) << 48);
                        }
                        Integer num = bVar.g.get(longValue);
                        if (num == null) {
                            bVar.g.put(longValue, Integer.valueOf(bVar.p));
                            aVar = aVar2;
                        } else {
                            com.meituan.msc.uimanager.events.a aVar4 = bVar.o[num.intValue()];
                            Object[] objArr4 = new Object[i2];
                            objArr4[0] = aVar4;
                            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.uimanager.events.a.f;
                            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "e850b8d05ac6486a8e095a5ba54f6da3", RobustBitConfig.DEFAULT_VALUE)) {
                                aVar = (com.meituan.msc.uimanager.events.a) PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "e850b8d05ac6486a8e095a5ba54f6da3");
                            } else {
                                if (aVar4 != null && aVar2.i < aVar4.i) {
                                    aVar = aVar4;
                                }
                                aVar = aVar2;
                            }
                            if (aVar != aVar4) {
                                bVar.g.put(longValue, Integer.valueOf(bVar.p));
                                bVar.o[num.intValue()] = null;
                                aVar3 = aVar4;
                            } else {
                                aVar = null;
                                aVar3 = aVar2;
                            }
                        }
                        if (aVar != null) {
                            bVar.b(aVar);
                        }
                        if (aVar3 != null) {
                            aVar3.f();
                        }
                    }
                    i3 = i + 1;
                    c = 0;
                }
            }
            bVar.j.clear();
        }
    }

    public static /* synthetic */ void m(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "024bf7f67f068ff7d72f77d24796d87c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "024bf7f67f068ff7d72f77d24796d87c");
            return;
        }
        Arrays.fill(bVar.o, 0, bVar.p, (Object) null);
        bVar.p = 0;
    }

    public b(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90777c6629977edbe93a5cb149fa8ad2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90777c6629977edbe93a5cb149fa8ad2");
            return;
        }
        this.e = new Object();
        this.f = new Object();
        this.g = new LongSparseArray<>();
        this.h = com.meituan.msc.jse.common.a.a();
        this.i = new a();
        this.j = new ArrayList<>();
        this.k = new ArrayList<>();
        this.l = new ArrayList();
        this.m = new C0486b();
        this.n = new AtomicInteger();
        this.o = new com.meituan.msc.uimanager.events.a[16];
        this.p = 0;
        this.q = (short) 0;
        this.r = false;
        this.s = false;
        this.b = reactApplicationContext;
        this.b.addLifecycleEventListener(this);
        this.c = new ReactEventEmitter(this.b);
    }

    public b(ReactApplicationContext reactApplicationContext, ReactEventEmitter reactEventEmitter) {
        Object[] objArr = {reactApplicationContext, reactEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e943e1e9703746d0b8422b50b33c05", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e943e1e9703746d0b8422b50b33c05");
            return;
        }
        this.e = new Object();
        this.f = new Object();
        this.g = new LongSparseArray<>();
        this.h = com.meituan.msc.jse.common.a.a();
        this.i = new a();
        this.j = new ArrayList<>();
        this.k = new ArrayList<>();
        this.l = new ArrayList();
        this.m = new C0486b();
        this.n = new AtomicInteger();
        this.o = new com.meituan.msc.uimanager.events.a[16];
        this.p = 0;
        this.q = (short) 0;
        this.r = false;
        this.s = false;
        this.b = reactApplicationContext;
        this.b.addLifecycleEventListener(this);
        this.c = reactEventEmitter;
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffdadad40f6d664d8c198f93124c792f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffdadad40f6d664d8c198f93124c792f");
        } else if (this.c != null) {
            this.m.c();
        }
    }

    public void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e015e68b160712102633115e2181893", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e015e68b160712102633115e2181893");
        } else if (cVar == null) {
        } else {
            this.k.add(cVar);
        }
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public void onHostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f21e1f9194eb30eb098642796f0878c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f21e1f9194eb30eb098642796f0878c8");
        } else {
            d();
        }
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public void onHostPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4116321c7200d246926bacce9a90a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4116321c7200d246926bacce9a90a16");
        } else {
            e();
        }
    }

    @Override // com.meituan.msc.jse.bridge.LifecycleEventListener
    public void onHostDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "885a59ec275da6d3809808bcc7fc1264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "885a59ec275da6d3809808bcc7fc1264");
            return;
        }
        e();
        if (this.b == null || !this.b.getRuntimeDelegate().enableJSErrorFix()) {
            return;
        }
        b();
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f9e00832a684b351964cc6e8d0ed879", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f9e00832a684b351964cc6e8d0ed879");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.uimanager.events.b.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3447262b7813be74e29a3ed56ef407be", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3447262b7813be74e29a3ed56ef407be");
                    } else {
                        b.this.e();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5298b4455cc99e476ea74bf8fca258a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5298b4455cc99e476ea74bf8fca258a9");
            return;
        }
        UiThreadUtil.assertOnUiThread();
        this.m.c = true;
    }

    public void a(int i, RCTEventEmitter rCTEventEmitter) {
        Object[] objArr = {Integer.valueOf(i), rCTEventEmitter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f182431726a4ccf48f9c93f6bf0463a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f182431726a4ccf48f9c93f6bf0463a3");
        } else {
            this.c.register(i, rCTEventEmitter);
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.uimanager.events.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0486b extends a.AbstractC0445a {
        public static ChangeQuickRedirect b;
        boolean c;
        private volatile boolean e;

        private C0486b() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b11a4d2d0f213875443729e1fbdc86a5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b11a4d2d0f213875443729e1fbdc86a5");
                return;
            }
            this.e = false;
            this.c = false;
        }

        @Override // com.meituan.msc.jse.modules.core.a.AbstractC0445a
        public final void a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2d3be6e99a0680664a71cd3c3a3cb7a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2d3be6e99a0680664a71cd3c3a3cb7a");
                return;
            }
            UiThreadUtil.assertOnUiThread();
            if (this.c) {
                this.e = false;
            } else {
                d();
            }
            com.meituan.msc.systrace.a.a(0L, "ScheduleDispatchFrameCallback");
            try {
                b.b(b.this);
                if (!b.this.r) {
                    b.this.r = true;
                    b.this.n.get();
                    b.this.b.runOnJSQueueThread(b.this.i);
                }
            } finally {
                com.meituan.msc.systrace.a.a(0L);
            }
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ca243a93442b38917b192b791376f8c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ca243a93442b38917b192b791376f8c");
            } else if (this.e) {
            } else {
                this.e = true;
                d();
            }
        }

        private void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b73ff25179e533874db4d57b948a2d52", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b73ff25179e533874db4d57b948a2d52");
            } else {
                com.meituan.msc.jse.modules.core.c.b().a(c.a.TIMERS_EVENTS, b.this.m);
            }
        }

        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = b;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e639dc0ff93bb637cb91261fc9c6ea3a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e639dc0ff93bb637cb91261fc9c6ea3a");
            } else if (this.e) {
            } else {
                if (!b.this.b.isOnUiQueueThread()) {
                    b.this.b.runOnUiQueueThread(new Runnable() { // from class: com.meituan.msc.uimanager.events.b.b.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "932d06677b53f8aecb160288734d30c7", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "932d06677b53f8aecb160288734d30c7");
                            } else {
                                C0486b.this.b();
                            }
                        }
                    });
                } else {
                    b();
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a implements Runnable {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {b.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f6b78a3f06fcf95d7a3844cc90f5bfd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f6b78a3f06fcf95d7a3844cc90f5bfd");
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25cb7ae64f3b0c84dee2abdc21edd88e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25cb7ae64f3b0c84dee2abdc21edd88e");
                return;
            }
            com.meituan.msc.systrace.a.a(0L, "DispatchEventsRunnable");
            try {
                b.this.n.getAndIncrement();
                b.this.r = false;
                com.facebook.infer.annotation.a.a(b.this.c);
                synchronized (b.this.f) {
                    if (!b.this.s && b.this.p > 0) {
                        if (b.this.p > 1) {
                            Arrays.sort(b.this.o, 0, b.this.p, b.d);
                        }
                        for (int i = 0; i < b.this.p; i++) {
                            com.meituan.msc.uimanager.events.a aVar = b.this.o[i];
                            if (aVar != null) {
                                aVar.a();
                                aVar.a(b.this.c);
                                aVar.f();
                            }
                        }
                        b.m(b.this);
                        b.this.g.clear();
                    }
                }
                Iterator it = b.this.l.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            } finally {
                com.meituan.msc.systrace.a.a(0L);
            }
        }
    }

    public void b() {
        this.s = true;
    }

    private void b(com.meituan.msc.uimanager.events.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c63e90c8d6e1cacf09a3043702b5d163", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c63e90c8d6e1cacf09a3043702b5d163");
            return;
        }
        if (this.p == this.o.length) {
            this.o = (com.meituan.msc.uimanager.events.a[]) Arrays.copyOf(this.o, this.o.length * 2);
        }
        com.meituan.msc.uimanager.events.a[] aVarArr = this.o;
        int i = this.p;
        this.p = i + 1;
        aVarArr[i] = aVar;
    }

    public void a(com.meituan.msc.uimanager.events.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42b3a1a6befa876c2d37471f582c2302", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42b3a1a6befa876c2d37471f582c2302");
            return;
        }
        com.facebook.infer.annotation.a.a(aVar.g, "Dispatched event hasn't been initialized");
        Iterator<c> it = this.k.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next != null) {
                next.a(aVar);
            }
        }
        synchronized (this.e) {
            this.j.add(aVar);
            aVar.a();
        }
        d();
    }
}
