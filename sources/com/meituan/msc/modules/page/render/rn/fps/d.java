package com.meituan.msc.modules.page.render.rn.fps;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.UiThread;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.msc.modules.page.render.rn.fps.e;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@TargetApi(16)
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    public static int i = 60;
    public long b;
    public long c;
    public int d;
    public com.meituan.msc.modules.page.render.rn.fps.b e;
    public volatile com.meituan.msc.modules.page.render.rn.fps.b f;
    volatile boolean g;
    public boolean h;
    public boolean j;
    volatile boolean k;
    final com.meituan.msc.modules.page.render.rn.fps.a l;
    public final e.a m;
    boolean n;
    private final Handler o;
    private final Handler p;
    private final ViewTreeObserver.OnScrollChangedListener q;
    private final Runnable r;
    private final Runnable s;
    private final Runnable t;

    public static /* synthetic */ void a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "51e93de78dd201444f319b86c746a971", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "51e93de78dd201444f319b86c746a971");
        } else if (dVar.f == null || !dVar.g) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "79350cd742212846053a00d0bb23d533", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "79350cd742212846053a00d0bb23d533");
                return;
            }
            com.meituan.msc.modules.page.render.rn.fps.b bVar = dVar.f;
            long j = dVar.c;
            int i2 = dVar.d;
            Object[] objArr3 = {new Long(j), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.page.render.rn.fps.b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "d4f180823fca6061cfed41cc21b1e8d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "d4f180823fca6061cfed41cc21b1e8d5");
            } else {
                long j2 = j - bVar.d;
                int i3 = i2 - bVar.c;
                if (j2 > 0 && i3 > 0) {
                    bVar.g += j2;
                    bVar.h += i3;
                }
            }
            dVar.f.e = false;
            dVar.k = false;
        }
    }

    public static /* synthetic */ void c(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "d017ad2c5e2c7113e093ebab5cc3bb1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "d017ad2c5e2c7113e093ebab5cc3bb1e");
        } else if (dVar.f != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "f512551deca86e7e30a57fe9b7928137", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "f512551deca86e7e30a57fe9b7928137");
                return;
            }
            dVar.f.e = true;
            dVar.g = true;
            dVar.f.d = dVar.c;
            dVar.f.c = dVar.d;
            dVar.k = true;
        }
    }

    public static /* synthetic */ int f(d dVar) {
        int i2 = dVar.d;
        dVar.d = i2 + 1;
        return i2;
    }

    public d(Context context, Handler handler, com.meituan.msc.modules.page.render.rn.fps.a aVar) {
        Object[] objArr = {context, handler, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bdbae82da624076b43b076ca6d6f2f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bdbae82da624076b43b076ca6d6f2f2");
            return;
        }
        this.b = 0L;
        this.m = new b();
        this.r = new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.fps.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7902f5e1e788d0e7a6c02df23d34bcbc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7902f5e1e788d0e7a6c02df23d34bcbc");
                } else {
                    d.a(d.this);
                }
            }
        };
        this.s = new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.fps.d.2
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1281bc633d6c6e6a2dfa1b8708daef90", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1281bc633d6c6e6a2dfa1b8708daef90");
                } else {
                    d.b(d.this);
                }
            }
        };
        this.t = new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.fps.d.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cfa18315d026c9387ec90ba5f156e959", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cfa18315d026c9387ec90ba5f156e959");
                } else {
                    d.c(d.this);
                }
            }
        };
        this.n = false;
        this.o = handler;
        this.l = aVar;
        this.q = new a();
        this.p = new Handler(Looper.getMainLooper());
        this.j = a(context);
    }

    @UiThread
    public void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65a3bfe173f4e58f8548858d5b7e241a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65a3bfe173f4e58f8548858d5b7e241a");
        } else if (view == null) {
        } else {
            try {
                view.getViewTreeObserver().addOnScrollChangedListener(this.q);
            } catch (Exception e) {
                g.d("metrics FpsSampler", "register global scroll listener failed", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @UiThread
    public void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d8669231d967cb846124544c901c501", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d8669231d967cb846124544c901c501");
        } else if (view == null) {
        } else {
            try {
                view.getViewTreeObserver().removeOnScrollChangedListener(this.q);
            } catch (Exception e) {
                g.d("metrics FpsSampler", "unregister global scroll listener failed", e);
            }
        }
    }

    public static boolean a(Context context) {
        Display defaultDisplay;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8e4382815fca9d522e14ac2ef16d039", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8e4382815fca9d522e14ac2ef16d039")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                i = Math.round(defaultDisplay.getRefreshRate());
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class b implements e.a {
        public static ChangeQuickRedirect a;

        private b() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "139e0941fd822958caffb0cebaa596f5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "139e0941fd822958caffb0cebaa596f5");
            }
        }

        @Override // com.meituan.msc.modules.page.render.rn.fps.e.a
        public final void a(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d3b69391fadb1409f8c3334c946cf47", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d3b69391fadb1409f8c3334c946cf47");
                return;
            }
            if (d.this.b > 0) {
                d.this.c += j - d.this.b;
                d.f(d.this);
            }
            d.this.b = j;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    class a implements ViewTreeObserver.OnScrollChangedListener {
        public static ChangeQuickRedirect a;
        private long c;
        private int d;
        private boolean e;
        private final Runnable f;

        private a() {
            Object[] objArr = {d.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a1f393f874da8a61cda655fbeb430f1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a1f393f874da8a61cda655fbeb430f1");
                return;
            }
            this.d = 0;
            this.e = false;
            this.f = new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.fps.d.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dcc0c2b78eecb95d89e25776189b5f82", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dcc0c2b78eecb95d89e25776189b5f82");
                        return;
                    }
                    a.a(a.this, false);
                    if (TimeUtil.elapsedTimeMillis() - a.this.c > 160 && a.this.d >= 5) {
                        d.this.o.post(d.this.r);
                    } else if (TimeUtil.elapsedTimeMillis() - a.this.c <= 80 || a.this.d <= 2) {
                        d.this.o.post(d.this.s);
                    } else {
                        d.this.o.post(d.this.r);
                    }
                }
            };
        }

        public static /* synthetic */ boolean a(a aVar, boolean z) {
            aVar.e = false;
            return false;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "715be85eda62834fec3ef94f4a8ce8f4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "715be85eda62834fec3ef94f4a8ce8f4");
                return;
            }
            d.this.p.removeCallbacks(this.f);
            if (!this.e && d.this.n) {
                this.e = true;
                this.d = 0;
                this.c = TimeUtil.elapsedTimeMillis();
                d.this.o.post(d.this.t);
            }
            d.this.p.postDelayed(this.f, 80L);
            this.d++;
        }
    }

    public static /* synthetic */ void b(d dVar) {
        if (dVar.f != null) {
            dVar.f.e = false;
        }
    }
}
