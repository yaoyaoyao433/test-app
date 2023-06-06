package com.meituan.android.mrn.monitor;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;
import com.facebook.react.uimanager.UIManagerModule;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class h extends a.AbstractC0145a {
    public static ChangeQuickRedirect a = null;
    private static final String b = "h";
    private final com.facebook.react.modules.core.a c;
    private final ReactContext d;
    private final UIManagerModule e;
    private final com.facebook.react.modules.debug.a f;
    private final a g;
    private final Handler h;
    private final String i;
    private final String j;
    private String k;
    private boolean l;
    private long m;
    private long n;
    private int o;
    private int p;
    private int q;
    private int r;
    private long s;
    private int t;
    private int u;
    private long v;
    private boolean w;
    private final float x;

    public static /* synthetic */ void a(h hVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "2f70413d86d1b6809397cfb3ec720339", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "2f70413d86d1b6809397cfb3ec720339");
        } else if (hVar.w) {
            hVar.q += hVar.o - hVar.t;
            hVar.r += hVar.p - hVar.u;
            hVar.s += hVar.n - hVar.v;
        }
    }

    public static /* synthetic */ void d(h hVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "68fb5dd529667bde5c56e5b3f0a938b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "68fb5dd529667bde5c56e5b3f0a938b2");
            return;
        }
        hVar.w = true;
        hVar.t = hVar.o;
        hVar.u = hVar.p;
        hVar.v = hVar.n;
    }

    public h(com.facebook.react.modules.core.a aVar, ReactContext reactContext, String str, String str2) {
        Activity currentActivity;
        WindowManager windowManager;
        Display defaultDisplay;
        Object[] objArr = {aVar, reactContext, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08e53609955ea484a33e7a4357f1da4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08e53609955ea484a33e7a4357f1da4a");
            return;
        }
        this.l = false;
        this.m = 0L;
        this.n = 0L;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0L;
        this.t = 0;
        this.u = 0;
        this.v = 0L;
        this.c = aVar;
        this.d = reactContext;
        this.i = str;
        this.j = str2;
        this.e = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.f = new com.facebook.react.modules.debug.a();
        this.g = new a();
        this.h = new Handler(Looper.getMainLooper());
        float f = -1.0f;
        if (reactContext != null && (currentActivity = reactContext.getCurrentActivity()) != null && (windowManager = currentActivity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            f = defaultDisplay.getRefreshRate();
        }
        this.x = f <= 0.0f ? 60.0f : f;
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0145a
    public void doFrame(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b31850c213d61ae26cca0526afa0ff8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b31850c213d61ae26cca0526afa0ff8");
        } else if (!this.l || this.d == null) {
        } else {
            if (this.m != 0) {
                this.n += j - this.m;
                this.o++;
                if (this.f.a(this.m, j)) {
                    this.p++;
                }
            }
            this.m = j;
            this.c.a(this);
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1b660ed015f413be3dd3be9cf26019", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1b660ed015f413be3dd3be9cf26019");
        } else if (this.l || this.d == null) {
        } else {
            this.l = true;
            f();
            this.d.getCatalystInstance().addBridgeIdleDebugListener(this.f);
            this.e.setViewHierarchyUpdateDebugListener(this.f);
            this.c.a(this, 1000L);
            a(this.d.getCurrentActivity());
        }
    }

    public final void a(com.meituan.android.mrn.engine.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49ce99bf225b454f33bf8ebcbfbcae4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49ce99bf225b454f33bf8ebcbfbcae4c");
        } else if (!this.l || this.d == null) {
        } else {
            this.l = false;
            this.d.getCatalystInstance().removeBridgeIdleDebugListener(this.f);
            this.e.setViewHierarchyUpdateDebugListener(null);
            b(this.d.getCurrentActivity());
            b(eVar);
        }
    }

    private double b() {
        if (this.o <= 0 || this.n <= 0) {
            return -1.0d;
        }
        double d = (this.o * 1.0E9d) / this.n;
        return d > ((double) this.x) ? this.x : d;
    }

    private double c() {
        if (this.p <= 0 || this.n <= 0) {
            return -1.0d;
        }
        double d = (this.p * 1.0E9d) / this.n;
        return d > ((double) this.x) ? this.x : d;
    }

    private double d() {
        if (this.w) {
            long j = this.s;
            int i = this.q;
            if (i <= 0 || j <= 0) {
                return -1.0d;
            }
            return (i * 1.0E9d) / j;
        }
        return -1.0d;
    }

    private double e() {
        if (this.w) {
            long j = this.s;
            int i = this.r;
            if (i <= 0 || j <= 0) {
                return -1.0d;
            }
            return (i * 1.0E9d) / j;
        }
        return -1.0d;
    }

    private void b(com.meituan.android.mrn.engine.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5921251c9cf9e4f7d0e1908d7173cb90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5921251c9cf9e4f7d0e1908d7173cb90");
        } else if (this.d == null || this.d.getCurrentActivity() == null || eVar == null) {
        } else {
            g.a().a(eVar).a(Float.valueOf((float) c()), this.j, eVar.c, eVar.f);
            g.a().a(eVar).b(Float.valueOf((float) e()), this.j, eVar.c, eVar.f);
            g.a().a(eVar).c(Float.valueOf((float) b()), this.j, eVar.c, eVar.f);
            double d = d();
            g.a().a(eVar).d(Float.valueOf((float) d), this.j, eVar.c, eVar.f);
            a(eVar, d);
        }
    }

    private void c(com.meituan.android.mrn.engine.e eVar, String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38912bb83bdf14bf9946afd1ce99868d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38912bb83bdf14bf9946afd1ce99868d");
        } else if (this.d == null || this.d.getCurrentActivity() == null || eVar == null) {
        } else {
            g.a().a(eVar).a(Float.valueOf((float) c()), str, eVar.c, eVar.f);
            g.a().a(eVar).b(Float.valueOf((float) e()), str, eVar.c, eVar.f);
            g.a().a(eVar).c(Float.valueOf((float) b()), str, eVar.c, eVar.f);
            double d = d();
            g.a().a(eVar).d(Float.valueOf((float) d), str, eVar.c, eVar.f);
            a(eVar, d);
        }
    }

    private void a(com.meituan.android.mrn.engine.e eVar, double d) {
        Object[] objArr = {eVar, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3180a169dfdc5af38e1468b9c52a5904", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3180a169dfdc5af38e1468b9c52a5904");
        } else if (eVar == null) {
        } else {
            Map<String, Object> d2 = g.d();
            d2.put("bundle_name", eVar.c);
            d2.put("bundle_version", eVar.f);
            Babel.logRT(new Log.Builder("").tag("scrollFps").optional(d2).reportChannel("prism-report-mrn").value(d).lv4LocalStatus(true).build());
        }
    }

    private void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4607b3f35b77aad3222eaa3bba012e7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4607b3f35b77aad3222eaa3bba012e7b");
            return;
        }
        this.m = 0L;
        this.n = 0L;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0L;
        this.t = 0;
        this.u = 0;
        this.v = 0L;
        this.w = false;
    }

    private void a(Activity activity) {
        Window window;
        View decorView;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa600697750c850ac1650053f6ea3911", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa600697750c850ac1650053f6ea3911");
        } else if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
        } else {
            try {
                decorView.getViewTreeObserver().addOnScrollChangedListener(this.g);
            } catch (Exception unused) {
            }
        }
    }

    private void b(Activity activity) {
        Window window;
        View decorView;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d4c1d4cf6973fc8b8665a0aec160f7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d4c1d4cf6973fc8b8665a0aec160f7f");
        } else if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
        } else {
            try {
                decorView.getViewTreeObserver().removeOnScrollChangedListener(this.g);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements ViewTreeObserver.OnScrollChangedListener {
        public static ChangeQuickRedirect a;
        public boolean b;
        private long d;
        private int e;
        private Runnable f;

        private a() {
            Object[] objArr = {h.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0520fc6af5043ba8a35832f16ae8e4b7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0520fc6af5043ba8a35832f16ae8e4b7");
                return;
            }
            this.e = 0;
            this.f = new Runnable() { // from class: com.meituan.android.mrn.monitor.h.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c1304b797b31afb619907970530855c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c1304b797b31afb619907970530855c");
                        return;
                    }
                    a.this.b = false;
                    if (TimeUtil.elapsedTimeMillis() - a.this.d <= 160 || a.this.e < 5) {
                        if (TimeUtil.elapsedTimeMillis() - a.this.d > 80 && a.this.e > 2) {
                            h.a(h.this);
                            return;
                        } else {
                            h.this.w = false;
                            return;
                        }
                    }
                    h.a(h.this);
                }
            };
            this.b = false;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e882bc4b03367403f3e9cdb781a7bdc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e882bc4b03367403f3e9cdb781a7bdc");
                return;
            }
            h.this.h.removeCallbacks(this.f);
            if (!this.b) {
                this.b = true;
                this.e = 0;
                this.d = TimeUtil.elapsedTimeMillis();
                h.d(h.this);
            }
            h.this.h.postDelayed(this.f, 80L);
            this.e++;
        }
    }

    public final void a(com.meituan.android.mrn.engine.e eVar, String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab721f5562c0457d4ad573d92a55cc8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab721f5562c0457d4ad573d92a55cc8a");
            return;
        }
        this.k = str;
        if (this.l) {
            a(eVar);
        }
        a();
    }

    public final void b(com.meituan.android.mrn.engine.e eVar, String str) {
        Object[] objArr = {eVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da20ce00bcc8f3f26420badc0317f4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da20ce00bcc8f3f26420badc0317f4a");
            return;
        }
        c(eVar, str);
        a(eVar);
    }
}
