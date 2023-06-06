package com.meituan.msc.modules.page.render.rn;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.msc.jse.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    final ReactContext b;
    final a c;
    final Handler d;
    volatile boolean e;
    boolean f;
    boolean g;
    final float h;
    final b i;
    ScheduledExecutorService j;
    ScheduledFuture<?> k;
    final Choreographer$FrameCallbackC0468c l;
    final Choreographer$FrameCallbackC0468c m;
    final Choreographer$FrameCallbackC0468c n;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface b {
        void a(double d, double d2, double d3, double d4, double d5, double d6);

        void a(boolean z, String str, ArrayList<String> arrayList);
    }

    public c(ReactContext reactContext, b bVar) {
        Activity currentActivity;
        WindowManager windowManager;
        Display defaultDisplay;
        Object[] objArr = {reactContext, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc1e5b9c34e9901b0c891a8f6bc568a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc1e5b9c34e9901b0c891a8f6bc568a1");
            return;
        }
        this.e = false;
        this.f = false;
        this.l = new Choreographer$FrameCallbackC0468c("ui");
        this.m = new Choreographer$FrameCallbackC0468c("js");
        this.n = new Choreographer$FrameCallbackC0468c("shadow");
        this.b = reactContext;
        this.i = bVar;
        this.c = new a();
        this.d = new Handler(Looper.getMainLooper());
        float f = -1.0f;
        if (reactContext != null && (currentActivity = reactContext.getCurrentActivity()) != null && (windowManager = currentActivity.getWindowManager()) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            f = defaultDisplay.getRefreshRate();
        }
        this.h = f <= 0.0f ? 60.0f : f;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.page.render.rn.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class Choreographer$FrameCallbackC0468c implements Choreographer.FrameCallback {
        public static ChangeQuickRedirect a;
        private final List<Double> c;
        private final List<Double> d;
        private volatile Choreographer e;
        private final i f;
        private final String g;
        private long h;
        private long i;
        private int j;
        private int k;
        private long l;

        public Choreographer$FrameCallbackC0468c(String str) {
            Object[] objArr = {c.this, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f230e3316a08e133d3556120182b828", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f230e3316a08e133d3556120182b828");
                return;
            }
            this.c = new CopyOnWriteArrayList();
            this.d = new CopyOnWriteArrayList();
            this.e = null;
            this.f = new i();
            this.h = 0L;
            this.i = 0L;
            this.j = 0;
            this.k = 0;
            this.l = 0L;
            this.g = str;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceb8408e9174c2761df7fde9c86e8925", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceb8408e9174c2761df7fde9c86e8925");
            } else if (!c.this.e || c.this.b == null) {
            } else {
                if (this.h != 0) {
                    if (j - this.h > MSCFpsHornConfig.d().g()) {
                        c.this.i.a(c.this.f, this.g, this.f.a());
                    }
                    this.i += j - this.h;
                    this.j++;
                    if (c.this.f) {
                        this.l += j - this.h;
                        this.k++;
                    }
                }
                this.h = j;
                this.f.b();
                final i iVar = this.f;
                long i = MSCFpsHornConfig.d().i();
                Object[] objArr2 = {new Long(i)};
                ChangeQuickRedirect changeQuickRedirect2 = i.a;
                if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "2e136fe0b030c3c0c4db95605becfc3d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "2e136fe0b030c3c0c4db95605becfc3d");
                } else {
                    iVar.c = iVar.b.schedule(new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.i.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4de98422be7c53a92f9a323c2a34b477", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4de98422be7c53a92f9a323c2a34b477");
                            } else {
                                i.a(iVar);
                            }
                        }
                    }, i, TimeUnit.MILLISECONDS);
                }
                this.e.postFrameCallback(this);
            }
        }

        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a58ec7cb3244858dc25c198af31944", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a58ec7cb3244858dc25c198af31944");
            } else {
                this.f.c();
            }
        }

        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7016d83d7e810d11a8e1357ac8c84524", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7016d83d7e810d11a8e1357ac8c84524");
                return;
            }
            g();
            this.e = Choreographer.getInstance();
            this.e.postFrameCallbackDelayed(this, 1000L);
        }

        private void g() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb65a070b89a5679ed2889e630afa2fd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb65a070b89a5679ed2889e630afa2fd");
                return;
            }
            this.h = 0L;
            this.i = 0L;
            this.j = 0;
            this.k = 0;
            this.l = 0L;
        }

        public final void c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff2e9c47d1037628d4a2eafe7f430cde", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff2e9c47d1037628d4a2eafe7f430cde");
                return;
            }
            this.c.clear();
            this.d.clear();
        }

        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e50e10f8fba3d8348a414e1a332a2236", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e50e10f8fba3d8348a414e1a332a2236");
                return;
            }
            double h = h();
            if (h > 0.0d) {
                this.c.add(Double.valueOf(h));
            }
            double i = i();
            if (i > 0.0d) {
                this.d.add(Double.valueOf(i));
            }
            g();
        }

        private double h() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72b6e0da4accb628b4aa619adac6ea80", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72b6e0da4accb628b4aa619adac6ea80")).doubleValue();
            }
            if (this.j <= 0 || this.i <= 0) {
                return -1.0d;
            }
            double d = (this.j * 1.0E9d) / this.i;
            return d > ((double) c.this.h) ? c.this.h : d;
        }

        private double i() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19dc8a16eea43c04f9fc41610b6aa0a7", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19dc8a16eea43c04f9fc41610b6aa0a7")).doubleValue();
            }
            if (c.this.g) {
                long j = this.l;
                int i = this.k;
                if (i <= 0 || j <= 0) {
                    return -1.0d;
                }
                double d = (i * 1.0E9d) / j;
                return d > ((double) c.this.h) ? c.this.h : d;
            }
            return -1.0d;
        }

        public final double e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc2533402d222e1f42188fac4ae4cbd", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc2533402d222e1f42188fac4ae4cbd")).doubleValue() : a(this.c);
        }

        public final double f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d37b6deba271742942c0e4bb42c18d2", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d37b6deba271742942c0e4bb42c18d2")).doubleValue() : a(this.d);
        }

        private double a(List<Double> list) {
            int i = 0;
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba3e097d82a5a738c8ef1d2c768ed2c9", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba3e097d82a5a738c8ef1d2c768ed2c9")).doubleValue();
            }
            double d = 0.0d;
            for (Double d2 : list) {
                if (d2.doubleValue() > 0.0d) {
                    d += d2.doubleValue();
                    i++;
                }
            }
            if (i == 0) {
                return -1.0d;
            }
            return d / i;
        }
    }

    public final void a() {
        Window window;
        View decorView;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44f4e720d557c9b8711c3861f5712d5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44f4e720d557c9b8711c3861f5712d5e");
        } else if (!this.e || this.b == null) {
        } else {
            this.k.cancel(true);
            this.j.shutdown();
            this.l.a();
            this.m.a();
            this.n.a();
            Activity currentActivity = this.b.getCurrentActivity();
            Object[] objArr2 = {currentActivity};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6971ce650511af1043156220a615aedd", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6971ce650511af1043156220a615aedd");
            } else if (currentActivity != null && (window = currentActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                try {
                    decorView.getViewTreeObserver().removeOnScrollChangedListener(this.c);
                } catch (Exception unused) {
                }
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f4c9dc6fa2f5af7d003a97ab4df4b5d2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f4c9dc6fa2f5af7d003a97ab4df4b5d2");
            } else if (this.b != null && this.b.getCurrentActivity() != null && this.i != null) {
                this.i.a(this.l.e(), this.l.f(), this.m.e(), this.m.f(), this.n.e(), this.n.f());
            }
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e97ee1ed429343d2dd6a051cf11c97d4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e97ee1ed429343d2dd6a051cf11c97d4");
            } else {
                this.l.c();
                this.m.c();
                this.n.c();
            }
            this.e = false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnScrollChangedListener {
        public static ChangeQuickRedirect a;
        private final Runnable c;

        private a() {
            Object[] objArr = {c.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e5e4bf1ed5c05bdd680c02cc8dba6c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e5e4bf1ed5c05bdd680c02cc8dba6c");
            } else {
                this.c = new Runnable() { // from class: com.meituan.msc.modules.page.render.rn.c.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2833a2fa96ea2ef0302daefc1e819b53", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2833a2fa96ea2ef0302daefc1e819b53");
                            return;
                        }
                        c.this.f = false;
                        c.this.g = true;
                    }
                };
            }
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdf1c418c954abb71852d0951557b407", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdf1c418c954abb71852d0951557b407");
                return;
            }
            c.this.d.removeCallbacks(this.c);
            if (!c.this.f) {
                c.this.f = true;
            }
            c.this.d.postDelayed(this.c, 80L);
        }
    }
}
