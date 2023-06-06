package com.meituan.mmp.lib;

import android.annotation.SuppressLint;
import android.arch.lifecycle.d;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.titans.utils.Constants;
import com.meituan.mmp.lib.engine.f;
import com.meituan.mmp.lib.executor.a;
import com.meituan.mmp.lib.mp.GlobalEngineMonitor;
import com.meituan.mmp.lib.router.AppBrandMonitor;
import com.meituan.mmp.lib.router.AppBrandRouterCenter;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.mmp.lib.utils.aj;
import com.meituan.mmp.lib.utils.am;
import com.meituan.mmp.lib.utils.ax;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.base.TitansBundle;
import com.squareup.picasso.RequestCreator;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RouterCenterActivity extends MMPBaseActivity {
    public static ChangeQuickRedirect a;
    private boolean A;
    private boolean B;
    private boolean C;
    private List<com.meituan.mmp.lib.mp.a> D;
    private boolean E;
    private final Runnable F;
    private final Runnable G;
    public com.meituan.mmp.lib.engine.c b;
    public boolean c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private String h;
    private String i;
    private volatile ViewGroup j;
    @Nullable
    private LinearLayout k;
    @Nullable
    private TextView m;
    @Nullable
    private ImageView n;
    private boolean o;
    private volatile com.meituan.mmp.lib.config.a p;
    private volatile com.meituan.mmp.lib.engine.f q;
    private volatile boolean r;
    private long s;
    private long t;
    private long u;
    private long v;
    private boolean w;
    private boolean x;
    private volatile boolean y;
    private boolean z;

    public RouterCenterActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fc10b69912e05946195a67a9c47feb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fc10b69912e05946195a67a9c47feb5");
            return;
        }
        this.f = false;
        this.x = true;
        this.z = true;
        this.b = new com.meituan.mmp.lib.engine.g() { // from class: com.meituan.mmp.lib.RouterCenterActivity.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
            public final void a(List<MMPPackageInfo> list) {
            }

            @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
            @WorkerThread
            public final void a(MMPAppProp mMPAppProp) {
                boolean c;
                Object[] objArr2 = {mMPAppProp};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f25a5d9b352156841aac45b044b82967", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f25a5d9b352156841aac45b044b82967");
                    return;
                }
                if (mMPAppProp.isOutdated()) {
                    if (!RouterCenterActivity.this.A) {
                        RouterCenterActivity routerCenterActivity = RouterCenterActivity.this;
                        String str = RouterCenterActivity.this.d;
                        Object[] objArr3 = {str};
                        ChangeQuickRedirect changeQuickRedirect3 = RouterCenterActivity.a;
                        if (PatchProxy.isSupport(objArr3, routerCenterActivity, changeQuickRedirect3, false, "cac112dcd678a4e6b54760186100671b", RobustBitConfig.DEFAULT_VALUE)) {
                            c = ((Boolean) PatchProxy.accessDispatch(objArr3, routerCenterActivity, changeQuickRedirect3, false, "cac112dcd678a4e6b54760186100671b")).booleanValue();
                        } else {
                            List<GlobalEngineMonitor.AppEngineRecord> a2 = GlobalEngineMonitor.a().a(str);
                            c = (a2.isEmpty() || GlobalEngineMonitor.a().a(a2) != null) ? com.meituan.mmp.lib.config.b.c(str) : true;
                        }
                        if (c) {
                            com.meituan.mmp.lib.mp.a a3 = com.meituan.mmp.lib.router.a.a(AppBrandRouterCenter.a(RouterCenterActivity.this.d, mMPAppProp.isFusionModeEnabled(), RouterCenterActivity.this.a(RouterCenterActivity.this.d), false));
                            if (!RouterCenterActivity.this.c().contains(a3)) {
                                RouterCenterActivity.a(RouterCenterActivity.this, true);
                            }
                            com.meituan.mmp.lib.mp.a.a(a3);
                        }
                    }
                    RouterCenterActivity.b(RouterCenterActivity.this, true);
                }
                RouterCenterActivity.this.h = mMPAppProp.appName;
                RouterCenterActivity.this.i = mMPAppProp.iconPath;
                if (mMPAppProp.isMainPackReady(RouterCenterActivity.this)) {
                    try {
                        RouterCenterActivity.this.p.d(RouterCenterActivity.this);
                    } catch (Exception e) {
                        com.meituan.mmp.lib.trace.b.a("RouterCenterActivity", e, "initConfig");
                    }
                    MMPPackageInfo subPackageByPath = mMPAppProp.getSubPackageByPath(RouterCenterActivity.this, RouterCenterActivity.this.e);
                    if (!(subPackageByPath != null ? subPackageByPath.u : true)) {
                        RouterCenterActivity.c(RouterCenterActivity.this, true);
                    }
                }
                if (!mMPAppProp.isOutdated()) {
                    RouterCenterActivity.this.q.c(this);
                    RouterCenterActivity.h(RouterCenterActivity.this);
                    return;
                }
                com.meituan.mmp.lib.trace.b.c("RouterCenterActivity", "received outdated appProp, wait final result");
            }

            @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
            public final void a(String str, Exception exc) {
                Object[] objArr2 = {str, exc};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "309a3f3fa61582b111ba72379eabbf1a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "309a3f3fa61582b111ba72379eabbf1a");
                    return;
                }
                RouterCenterActivity.this.q.c(this);
                RouterCenterActivity.this.a("fail", false, str, exc);
                if (aj.a(RouterCenterActivity.this.getIntent(), RouterCenterActivity.this)) {
                    return;
                }
                RouterCenterActivity.i(RouterCenterActivity.this);
            }
        };
        this.c = false;
        this.F = new Runnable() { // from class: com.meituan.mmp.lib.RouterCenterActivity.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "561d73430ad915541326c1956bd7044b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "561d73430ad915541326c1956bd7044b");
                    return;
                }
                com.meituan.mmp.lib.trace.b.b("RouterCenterActivity", "show view anim as activity enter anim");
                RouterCenterActivity.this.j.startAnimation(AnimationUtils.loadAnimation(RouterCenterActivity.this, R.anim.mmp_slide_in_right));
                RouterCenterActivity.this.v = SystemClock.elapsedRealtime();
                RouterCenterActivity.d(RouterCenterActivity.this, true);
                RouterCenterActivity.l(RouterCenterActivity.this);
                FrameLayout frameLayout = (FrameLayout) RouterCenterActivity.this.findViewById(R.id.mmp_loading_bg);
                if (frameLayout != null) {
                    frameLayout.setVisibility(8);
                }
            }
        };
        this.G = new Runnable() { // from class: com.meituan.mmp.lib.RouterCenterActivity.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d3fedc1f18aa4f865a4ab480777fa73", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d3fedc1f18aa4f865a4ab480777fa73");
                } else if (RouterCenterActivity.this.isFinishing() || RouterCenterActivity.this.isDestroyed()) {
                } else {
                    RouterCenterActivity.l(RouterCenterActivity.this);
                    RouterCenterActivity.p(RouterCenterActivity.this);
                    RouterCenterActivity.q(RouterCenterActivity.this);
                }
            }
        };
    }

    public static /* synthetic */ void a(RouterCenterActivity routerCenterActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, routerCenterActivity, changeQuickRedirect, false, "bb0d394f04861b7eb2c765d4cdb0f0ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, routerCenterActivity, changeQuickRedirect, false, "bb0d394f04861b7eb2c765d4cdb0f0ea");
        } else if (am.a(routerCenterActivity.getApplicationContext())) {
        } else {
            bb.a("无法连接网络，请检查网络设置或稍后重试", new Object[0]);
        }
    }

    public static /* synthetic */ boolean a(RouterCenterActivity routerCenterActivity, boolean z) {
        routerCenterActivity.C = true;
        return true;
    }

    public static /* synthetic */ boolean b(RouterCenterActivity routerCenterActivity, boolean z) {
        routerCenterActivity.A = true;
        return true;
    }

    public static /* synthetic */ boolean c(RouterCenterActivity routerCenterActivity, boolean z) {
        routerCenterActivity.o = true;
        return true;
    }

    public static /* synthetic */ boolean d(RouterCenterActivity routerCenterActivity, boolean z) {
        routerCenterActivity.w = true;
        return true;
    }

    public static /* synthetic */ boolean e(RouterCenterActivity routerCenterActivity, boolean z) {
        routerCenterActivity.y = true;
        return true;
    }

    public static /* synthetic */ void h(RouterCenterActivity routerCenterActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, routerCenterActivity, changeQuickRedirect, false, "f4eb80fa4da3ac3733d2226b17f50f0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, routerCenterActivity, changeQuickRedirect, false, "f4eb80fa4da3ac3733d2226b17f50f0f");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("RouterCenterActivity", "onLoadingFinish");
        Runnable runnable = new Runnable() { // from class: com.meituan.mmp.lib.RouterCenterActivity.5
            public static ChangeQuickRedirect a;
            private volatile boolean c;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "62daea76e2110e302f98d00da2349366", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "62daea76e2110e302f98d00da2349366");
                } else if (this.c) {
                } else {
                    this.c = true;
                    com.meituan.mmp.main.ab.d("waitActivityAnimFinish");
                    com.meituan.mmp.main.ab.d("showLoadingView");
                    com.meituan.mmp.lib.executor.a.a().removeCallbacks(RouterCenterActivity.this.F);
                    if (RouterCenterActivity.this.isFinishing() || RouterCenterActivity.this.isDestroyed()) {
                        return;
                    }
                    com.meituan.mmp.lib.executor.a.a().removeCallbacks(RouterCenterActivity.this.G);
                    if (RouterCenterActivity.this.getLifecycle().a().a(d.b.RESUMED)) {
                        RouterCenterActivity.this.a();
                        return;
                    }
                    RouterCenterActivity.e(RouterCenterActivity.this, true);
                    com.meituan.mmp.lib.trace.b.b("RouterCenterActivity", "ready to launch next activity, but activity not in foreground. waiting resume");
                }
            }
        };
        if (!routerCenterActivity.w) {
            b.a.a("RouterCenterActivity", "load finished fast, skip enter activity anim");
            routerCenterActivity.x = true;
            com.meituan.mmp.lib.executor.a.a().removeCallbacks(routerCenterActivity.F);
            a.c.a(runnable);
        } else if (a.c.b(runnable, routerCenterActivity.v + 200)) {
        } else {
            com.meituan.mmp.main.ab.c("waitActivityAnimFinish");
            a.a(routerCenterActivity);
            System.gc();
        }
    }

    public static /* synthetic */ void i(RouterCenterActivity routerCenterActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, routerCenterActivity, changeQuickRedirect, false, "e84a807f9641edd4d9075c57bfaa9c6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, routerCenterActivity, changeQuickRedirect, false, "e84a807f9641edd4d9075c57bfaa9c6e");
        } else {
            routerCenterActivity.runOnUiThread(new AnonymousClass3());
        }
    }

    public static /* synthetic */ void j(RouterCenterActivity routerCenterActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, routerCenterActivity, changeQuickRedirect, false, "a46ba138e664f98e5f8f838f3b8de762", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, routerCenterActivity, changeQuickRedirect, false, "a46ba138e664f98e5f8f838f3b8de762");
            return;
        }
        routerCenterActivity.o = false;
        com.meituan.mmp.lib.executor.a.a().removeCallbacks(routerCenterActivity.G);
        if (routerCenterActivity.k != null) {
            routerCenterActivity.k.setVisibility(8);
        }
    }

    public static /* synthetic */ void l(RouterCenterActivity routerCenterActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, routerCenterActivity, changeQuickRedirect, false, "ab7b04782f6f827e5afab95f53419918", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, routerCenterActivity, changeQuickRedirect, false, "ab7b04782f6f827e5afab95f53419918");
        } else if (routerCenterActivity.r) {
        } else {
            routerCenterActivity.r = true;
            com.meituan.mmp.lib.trace.b.b("RouterCenterActivity", "show loading view");
            routerCenterActivity.setContentView(R.layout.hera_main_activity);
            ViewStub viewStub = (ViewStub) routerCenterActivity.findViewById(R.id.mmp_loading);
            if (viewStub != null) {
                routerCenterActivity.k = (LinearLayout) viewStub.inflate();
            }
            routerCenterActivity.m = (TextView) routerCenterActivity.findViewById(R.id.mmp_title);
            routerCenterActivity.n = (ImageView) routerCenterActivity.findViewById(R.id.mmp_icon);
            routerCenterActivity.j.setBackgroundResource(17170443);
        }
    }

    public static /* synthetic */ void p(RouterCenterActivity routerCenterActivity) {
        RequestCreator c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, routerCenterActivity, changeQuickRedirect, false, "0d82956063b096effc6862f353ff812f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, routerCenterActivity, changeQuickRedirect, false, "0d82956063b096effc6862f353ff812f");
            return;
        }
        if (routerCenterActivity.m != null) {
            if (!TextUtils.isEmpty(routerCenterActivity.h)) {
                routerCenterActivity.m.setText(routerCenterActivity.h);
            } else {
                routerCenterActivity.m.setText("加载中");
            }
        }
        if (!routerCenterActivity.o || TextUtils.isEmpty(routerCenterActivity.i) || (c = com.meituan.mmp.lib.utils.s.c(routerCenterActivity.getApplicationContext(), routerCenterActivity.i, routerCenterActivity.p)) == null) {
            return;
        }
        c.a(routerCenterActivity.n);
    }

    public static /* synthetic */ void q(RouterCenterActivity routerCenterActivity) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, routerCenterActivity, changeQuickRedirect, false, "be01512220ce73deae6d75a27cf879f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, routerCenterActivity, changeQuickRedirect, false, "be01512220ce73deae6d75a27cf879f4");
            return;
        }
        com.meituan.mmp.main.ab.c("showLoadingView");
        routerCenterActivity.o = true;
        if (routerCenterActivity.k != null) {
            routerCenterActivity.k.setVisibility(0);
        }
    }

    @Override // com.meituan.mmp.lib.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ca29c75677023e5cfeb8eb8855eb63c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ca29c75677023e5cfeb8eb8855eb63c");
            return;
        }
        MMPEnvHelper.onMMPContainerCreate(this);
        MMPEnvHelper.ensureFullInited();
        com.meituan.mmp.main.ab.c("RouterCenterActivity");
        com.meituan.mmp.main.ab.c("TotalLaunchTime");
        super.onCreate(bundle);
        this.s = SystemClock.elapsedRealtime();
        this.t = System.currentTimeMillis();
        this.u = com.meituan.mmp.lib.preformance.a.b();
        if (com.meituan.mmp.lib.utils.b.b(this)) {
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b26822548ac5e3b2980c272235fbd02a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b26822548ac5e3b2980c272235fbd02a");
        } else {
            Intent intent = getIntent();
            this.d = com.meituan.mmp.lib.utils.z.b(intent, "appId");
            this.e = com.meituan.mmp.lib.config.a.p(com.meituan.mmp.lib.utils.z.b(getIntent(), "targetPath"));
            this.f = "WXEntryActivity".equals(com.meituan.mmp.lib.utils.z.b(getIntent(), "from"));
            this.g = com.meituan.mmp.lib.utils.z.a(getIntent(), "_isDspColdStart", false);
            this.h = com.meituan.mmp.lib.utils.z.b(intent, "appName");
            this.i = com.meituan.mmp.lib.utils.z.b(intent, "appIcon");
        }
        if (TextUtils.isEmpty(this.d)) {
            com.meituan.mmp.main.y.a().a(this.d, getIntent());
            finish();
            return;
        }
        b.a.a("RouterCenterActivity", "onCreate, appId: " + this.d + ", coldStart: " + this.g);
        this.q = com.meituan.mmp.lib.engine.j.a(this.d);
        if (this.q == null) {
            com.meituan.mmp.lib.engine.p.a(this.d, getIntent());
            return;
        }
        com.meituan.mmp.lib.trace.h i = this.q.i();
        i.b.b(PackageLoadReporter.Source.LAUNCH);
        i.b.b("router.activity.create");
        if (this.q.j() == f.b.PRELOAD) {
            i.b("mmp.preload.point.consumed", com.meituan.mmp.lib.utils.v.a("sinceApplicationStart", Long.valueOf(this.u)));
            i.a("launchStartFromPreloadStart", Long.valueOf(this.s - i.k));
        }
        if (this.q.l().a(f.c.APP_PROP_UPDATED)) {
            b.a.a("RouterCenterActivity", "use existing app engine, skip loading");
            this.g = false;
            i.a("isColdStart", Boolean.valueOf(this.g));
            i.a(getIntent(), false);
            a();
        }
        if (i != null) {
            i.b.a("router.activity.create");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c7a0a1757c0129e132d74535e5a0d07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c7a0a1757c0129e132d74535e5a0d07");
            return;
        }
        super.onWindowFocusChanged(z);
        if (z) {
            ax.a(this);
            ax.a(this, true);
        }
    }

    @Override // com.meituan.mmp.lib.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8792ab526f14c31cedf41af9fb5c7a05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8792ab526f14c31cedf41af9fb5c7a05");
        } else if (com.meituan.mmp.lib.utils.b.b(this)) {
        } else {
            super.onResume();
            if (this.z) {
                this.z = false;
                this.q = com.meituan.mmp.lib.engine.i.a(this.d, getIntent(), false);
                this.B = true;
                this.q.i().b.b(PackageLoadReporter.Source.LAUNCH);
                this.q.i().b.b("router.activity.resume");
                this.q.i().a("isColdStart", Boolean.valueOf(this.g));
                this.q.i().a(getIntent(), false);
                this.j = (ViewGroup) findViewById(16908290);
                this.p = this.q.i;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "789afc1f290bd36ca332b68dfada274f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "789afc1f290bd36ca332b68dfada274f");
                } else {
                    com.meituan.mmp.lib.trace.b.b("RouterCenterActivity", "startUpdateApp, foreground loading");
                    if (!this.g) {
                        com.meituan.mmp.lib.executor.a.b(this.F, 300L);
                    }
                    this.q.d(this.b);
                    if (this.q.j() == f.b.INITIAL) {
                        this.q.c(this.e);
                        if (this.q instanceof com.meituan.mmp.lib.engine.b) {
                            ((com.meituan.mmp.lib.engine.b) this.q).a().j.b(getApplicationContext());
                        }
                    }
                }
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c2dc4a7d7c09be9fa6caa8a1861f4c68", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c2dc4a7d7c09be9fa6caa8a1861f4c68");
                } else {
                    com.meituan.mmp.lib.executor.a.a().postDelayed(this.G, 500L);
                }
                this.x = false;
                com.meituan.mmp.lib.executor.a.a(new Runnable() { // from class: com.meituan.mmp.lib.RouterCenterActivity.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "04fac8fa5c18ceb6a12e5997b35af081", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "04fac8fa5c18ceb6a12e5997b35af081");
                        } else {
                            RouterCenterActivity.a(RouterCenterActivity.this);
                        }
                    }
                });
            } else if (this.y) {
                this.y = false;
                this.s = SystemClock.elapsedRealtime();
                this.t = System.currentTimeMillis();
                a();
            }
            this.q.i().b.a("router.activity.resume");
        }
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e3c7d8c51f84930665910a506f5a55c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e3c7d8c51f84930665910a506f5a55c");
            return;
        }
        com.meituan.mmp.main.y.a().a(this.d, getIntent());
        a("cancel", true);
        super.onBackPressed();
    }

    private void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1c5dd1198936462f319f24e815284f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1c5dd1198936462f319f24e815284f6");
        } else {
            a(str, z, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z, String str2, Exception exc) {
        com.meituan.mmp.lib.trace.h hVar;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd2a35452374d75d0a9abc88cbc99869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd2a35452374d75d0a9abc88cbc99869");
        } else if (this.E) {
        } else {
            this.E = true;
            HashMap a2 = com.meituan.mmp.lib.utils.v.a("state", str, "fastForward", Boolean.valueOf(this.x), "isColdStart", Boolean.valueOf(this.g), "isBackPress", Boolean.valueOf(z));
            if (str2 != null) {
                a2.put("errorType", str2);
            }
            if (exc != null) {
                a2.put("error", exc.toString());
            }
            if (this.q != null) {
                hVar = this.q.i();
            } else {
                hVar = new com.meituan.mmp.lib.trace.h(this, this.d);
            }
            hVar.a(getIntent(), true).a("mmp.router.point.destroy", SystemClock.elapsedRealtime() - this.s, a2);
            if (this.q instanceof com.meituan.mmp.lib.engine.b) {
                return;
            }
            hVar.b.a();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.RouterCenterActivity$3  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 implements Runnable {
        public static ChangeQuickRedirect a;

        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b5bb9214da929766da4ef0497b687c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b5bb9214da929766da4ef0497b687c7");
            } else if (RouterCenterActivity.this.isFinishing() || RouterCenterActivity.this.isDestroyed()) {
            } else {
                if (RouterCenterActivity.this.getLifecycle().a().a(d.b.RESUMED)) {
                    com.meituan.mmp.main.y.a().a(RouterCenterActivity.this.d, RouterCenterActivity.this.getIntent());
                }
                RouterCenterActivity.j(RouterCenterActivity.this);
                bb.a("加载小程序失败", new Object[0]);
                com.meituan.mmp.lib.executor.a.b(new Runnable() { // from class: com.meituan.mmp.lib.RouterCenterActivity.3.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbef5e1e95aee9d4bf9fa336ecec31c6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbef5e1e95aee9d4bf9fa336ecec31c6");
                            return;
                        }
                        Animation loadAnimation = AnimationUtils.loadAnimation(RouterCenterActivity.this, R.anim.mmp_slide_out_right);
                        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.meituan.mmp.lib.RouterCenterActivity.3.1.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationRepeat(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationStart(Animation animation) {
                            }

                            @Override // android.view.animation.Animation.AnimationListener
                            public final void onAnimationEnd(Animation animation) {
                                Object[] objArr3 = {animation};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cf82d474ca69bad4f73e84e8f5adc59b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cf82d474ca69bad4f73e84e8f5adc59b");
                                    return;
                                }
                                RouterCenterActivity.this.j.setBackground(null);
                                RouterCenterActivity.this.finish();
                            }
                        });
                        RouterCenterActivity.this.j.startAnimation(loadAnimation);
                    }
                }, 1500L);
            }
        }
    }

    @Override // com.meituan.mmp.lib.LifecycleActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee84a17a5e88c291e9b182ddc2eddcd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee84a17a5e88c291e9b182ddc2eddcd1");
            return;
        }
        super.onDestroy();
        if (this.q != null) {
            this.q.c(this.b);
        }
        if (this.d == null) {
            return;
        }
        a("cancel", false);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, @Nullable Bundle bundle) {
        Object[] objArr = {intent, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee73743fd0e6741ad4f66c2acd0395c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee73743fd0e6741ad4f66c2acd0395c3");
            return;
        }
        super.startActivity(intent, bundle);
        this.c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "058cfadff8f5ae51f5992563acfd9ceb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "058cfadff8f5ae51f5992563acfd9ceb");
            return;
        }
        com.meituan.mmp.main.ab.a("launchNextActivity");
        MMPAppProp mMPAppProp = this.q.i.l;
        this.q.i().a("launchStartFromApplicationStart", Long.valueOf(this.u));
        if (mMPAppProp != null) {
            boolean isFusionModeEnabled = mMPAppProp.isFusionModeEnabled();
            Class<? extends HeraActivity> a2 = AppBrandRouterCenter.a(this.d, isFusionModeEnabled, a(this.d), false);
            if (com.meituan.mmp.lib.router.a.b(a2) != com.meituan.mmp.lib.router.a.OTHER) {
                a(a2);
            } else {
                a(isFusionModeEnabled, a2);
            }
            a("success", false);
        } else {
            a("fail", false, "appProp is null", null);
        }
        finish();
        com.meituan.mmp.main.ab.a();
        com.meituan.mmp.main.ab.d("RouterCenterActivity");
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "473c0c99c422304e883691cf0b7f0fed", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "473c0c99c422304e883691cf0b7f0fed")).booleanValue();
        }
        Boolean a2 = com.meituan.mmp.lib.router.c.a(str);
        if (a2 != null) {
            return a2.booleanValue();
        }
        return com.meituan.mmp.lib.utils.z.a(getIntent(), "multi_app_brand", com.meituan.mmp.lib.router.c.c());
    }

    private void a(boolean z, Class<? extends HeraActivity> cls) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "091cdeab9c72422d17ed940d23e48c80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "091cdeab9c72422d17ed940d23e48c80");
            return;
        }
        Intent b = b(cls);
        b.addFlags(33554432);
        b.putExtra("fusion", z);
        com.meituan.mmp.lib.utils.b.a(this, b);
        b();
    }

    @SuppressLint({"NewApi"})
    private void a(Class<? extends HeraActivity> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1c89685dd5078b5aaac105e1877355d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1c89685dd5078b5aaac105e1877355d");
            return;
        }
        boolean z = AppBrandMonitor.e.d(this.d) == cls;
        HeraActivity a2 = AppBrandMonitor.e.a(this.d);
        Class<? extends HeraActivity> cls2 = cls;
        if (a2 instanceof AppBrandHeraActivity) {
            cls2 = ((AppBrandHeraActivity) a2).getClass();
        }
        if (this.f) {
            AppBrandRouterCenter.a((Class<? extends com.meituan.mmp.lib.router.d>) cls2);
            return;
        }
        if (!z) {
            com.meituan.mmp.main.ab.a("cleanTaskForSameAppIdIfNotLaunchingInto");
            AppBrandRouterCenter.a(this.d, cls2);
            com.meituan.mmp.main.ab.a();
        }
        com.meituan.mmp.lib.mp.a a3 = com.meituan.mmp.lib.router.a.a(cls2);
        if (a3 != com.meituan.mmp.lib.mp.a.MAIN && a3 != com.meituan.mmp.lib.mp.a.STANDARD) {
            for (GlobalEngineMonitor.AppEngineRecord appEngineRecord : GlobalEngineMonitor.a().b()) {
                if (appEngineRecord.d == a3 && !TextUtils.equals(appEngineRecord.c, this.d)) {
                    GlobalEngineMonitor.a().c(appEngineRecord.c);
                }
            }
        }
        Intent b = b(cls2);
        if (z) {
            b.putExtra("routeType", "relaunch");
            com.meituan.mmp.lib.trace.b.b("RouterCenterActivity", "relaunch " + cls2.getSimpleName() + " for " + this.d);
        } else {
            b.addFlags(32768);
            com.meituan.mmp.lib.trace.b.b("RouterCenterActivity", "start " + cls2.getSimpleName() + " for app " + this.d);
        }
        com.meituan.mmp.lib.utils.b.a(this, b);
        b();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f70e5ae3ac38c2c9b4a9897f260effdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f70e5ae3ac38c2c9b4a9897f260effdb");
        } else if (!this.x || this.g) {
            overridePendingTransition(0, 0);
            b.a.a("RouterCenterActivity", "addActivityAnimation: set to null");
        } else {
            b.a.a("RouterCenterActivity", "addActivityAnimation: use default anim");
        }
    }

    @SuppressLint({"IntentExtraKey"})
    private Intent b(Class<? extends HeraActivity> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d578571b545fded0e9da0a4425f05347", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d578571b545fded0e9da0a4425f05347");
        }
        Intent intent = new Intent(this, cls);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra(TitansBundle.PARAM_SHOW_LOADING, this.o);
        intent.putExtra("launchStartTime", this.s);
        intent.putExtra("launchStartTimeCurrentTimeMillis", this.t);
        intent.putExtra(Constants.MULTI_PROCESS_PID, Process.myPid());
        intent.putExtra("intentSendTime", SystemClock.elapsedRealtime());
        if (this.q != null) {
            intent.putExtra("reporterInfoMap", com.meituan.mmp.lib.utils.j.b.toJson(this.q.i().c()));
            intent.putExtra("launchTrace", (Serializable) this.q.i().b.c());
        }
        if (this.B && this.q != null) {
            intent.putExtra("reuseEngineId", this.q.g());
        }
        if (!c().contains(com.meituan.mmp.lib.router.a.a(cls))) {
            this.C = true;
        }
        if (this.C) {
            intent.putExtra("isNewProcess", true);
        }
        Uri data = getIntent().getData();
        if (data != null) {
            intent.setData(data);
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<com.meituan.mmp.lib.mp.a> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e328f5bb2488cb53e9795bd0ea108252", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e328f5bb2488cb53e9795bd0ea108252");
        }
        if (this.D == null) {
            this.D = com.meituan.mmp.lib.mp.b.a();
        }
        return this.D;
    }
}
