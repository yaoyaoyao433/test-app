package com.meituan.mmp.lib;

import android.app.Activity;
import android.arch.lifecycle.d;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.mmp.lib.engine.AppPage;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.mmp.lib.engine.MMPHornPreloadConfig;
import com.meituan.mmp.lib.engine.f;
import com.meituan.mmp.lib.page.view.CustomNavigationBar;
import com.meituan.mmp.lib.service.IServiceEngine;
import com.meituan.mmp.lib.trace.b;
import com.meituan.mmp.lib.update.MMPAppProp;
import com.meituan.mmp.lib.update.MMPPackageInfo;
import com.meituan.mmp.lib.update.PackageManageUtil;
import com.meituan.mmp.lib.utils.ac;
import com.meituan.mmp.lib.utils.aj;
import com.meituan.mmp.lib.utils.am;
import com.meituan.mmp.lib.utils.az;
import com.meituan.mmp.lib.utils.bb;
import com.meituan.mmp.lib.utils.bd;
import com.meituan.mmp.lib.widget.ModalDialog;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.msc.modules.api.msi.api.PageBeforeUnloadParam;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.privacy.permission.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.RequestCreator;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a implements com.meituan.mmp.lib.api.input.f, com.meituan.mmp.lib.interfaces.d {
    public static ChangeQuickRedirect a;
    public static volatile boolean c;
    static final Handler d = new Handler(Looper.getMainLooper());
    protected String A;
    protected String B;
    protected String C;
    protected String D;
    protected int E;
    protected boolean F;
    public final List<com.meituan.mmp.lib.api.input.f> G;
    protected boolean H;
    protected boolean I;
    @Nullable
    com.meituan.mmp.lib.resume.d J;
    public String K;
    public int L;
    public boolean M;
    public boolean N;
    boolean O;
    protected volatile boolean P;
    boolean Q;
    boolean R;
    private com.meituan.mmp.lib.api.h S;
    private FrameLayout T;
    private FrameLayout U;
    @Nullable
    private LinearLayout V;
    @Nullable
    private TextView W;
    @Nullable
    private ImageView X;
    private volatile boolean Y;
    private volatile boolean Z;
    private volatile boolean aa;
    private long ab;
    private HashMap<String, Object> ac;
    private com.meituan.mmp.lib.api.input.g ad;
    private Runnable ae;
    private String af;
    private String ag;
    private Runnable ah;
    private boolean ai;
    private f.b aj;
    private boolean ak;
    private boolean al;
    private final Runnable am;
    private boolean an;
    private String ao;
    private String ap;
    private final List<Runnable> aq;
    private volatile boolean ar;
    private volatile boolean as;
    private final List<Map<String, Object>> at;
    private final com.meituan.mmp.lib.engine.c au;
    private final BroadcastReceiver av;
    private final b aw;
    volatile String b;
    public o e;
    public Activity f;
    protected com.meituan.mmp.lib.engine.m g;
    protected com.meituan.mmp.lib.engine.b h;
    protected com.meituan.mmp.lib.config.a i;
    protected com.meituan.mmp.lib.engine.e j;
    protected ab k;
    @Nullable
    protected com.meituan.mmp.lib.devtools.g l;
    protected com.meituan.mmp.lib.trace.h m;
    MMPAppProp n;
    protected long o;
    protected long p;
    protected boolean q;
    protected volatile boolean r;
    protected boolean s;
    protected boolean t;
    protected volatile boolean u;
    protected volatile boolean v;
    protected volatile boolean w;
    protected String x;
    protected String y;
    protected String z;

    private boolean I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9430fd7444d505841fb347dd4b2d515c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9430fd7444d505841fb347dd4b2d515c")).booleanValue();
        }
        return false;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "991aa5ed1c044c6e017ad8ec07ffab89", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "991aa5ed1c044c6e017ad8ec07ffab89");
            return;
        }
        this.q = false;
        this.r = false;
        this.v = false;
        this.G = new ArrayList();
        this.ae = null;
        this.af = null;
        this.M = false;
        this.ak = true;
        this.N = false;
        this.al = true;
        this.O = false;
        this.am = com.meituan.mmp.lib.b.a(this);
        this.aq = new LinkedList();
        this.at = new CopyOnWriteArrayList();
        this.au = new AnonymousClass12();
        this.av = new BroadcastReceiver() { // from class: com.meituan.mmp.lib.ContainerController$9
            public static ChangeQuickRedirect a;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                String a2;
                com.meituan.mmp.lib.page.e e;
                com.meituan.mmp.lib.page.e e2;
                Object[] objArr2 = {context, intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc3ab69a90136f80a93fa229dc451e6d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc3ab69a90136f80a93fa229dc451e6d");
                } else if (!intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS") || (a2 = com.sankuai.waimai.platform.utils.f.a(intent, "reason")) == null) {
                } else {
                    if (a2.equals("homekey") && (e2 = a.this.k.e()) != null) {
                        e2.d("homekey");
                    }
                    if (!a2.equals("recentapps") || (e = a.this.k.e()) == null) {
                        return;
                    }
                    e.d("recentapps");
                }
            }
        };
        this.aw = new b();
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.Z = true;
        return true;
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        aVar.Y = true;
        return true;
    }

    public static /* synthetic */ int[] g(a aVar) {
        int i;
        int i2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "7af85def1cac5a0c2563d9905c42c823", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "7af85def1cac5a0c2563d9905c42c823");
        }
        if (aVar.a()) {
            i2 = aVar.T != null ? aVar.T.getWidth() : 0;
            i = aVar.T != null ? aVar.T.getHeight() : 0;
        } else {
            if (aVar.k != null) {
                com.meituan.mmp.lib.page.e e = aVar.k.e();
                if (e != null && e.getTabBar() != null && e.getTabBar().getTopBarHeight() > 0) {
                    i = e.getPageAreaHeight();
                } else {
                    Rect rect = new Rect();
                    aVar.f.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    int i3 = rect.bottom - rect.top;
                    i = (e == null || aVar.i == null || !aVar.i.m(e.getPagePath())) ? i3 : i3 - CustomNavigationBar.getFixedHeight();
                }
            } else {
                i = 0;
            }
            i2 = 0;
        }
        return new int[]{i2, i};
    }

    public static /* synthetic */ void j(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "cc6ecde86be9fc32b21ded9df2d97e80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "cc6ecde86be9fc32b21ded9df2d97e80");
        } else if (com.meituan.mmp.lib.devtools.automator.a.a() != null) {
            String b2 = com.meituan.mmp.lib.utils.z.b(aVar.d(), "automatorServer");
            String b3 = com.meituan.mmp.lib.utils.z.b(aVar.d(), "automatorUrl");
            if (b2 == null || b3 == null) {
                com.meituan.mmp.lib.trace.b.d("ContainerController", "automatorServer or automatorUrl is null");
            }
        } else {
            com.meituan.mmp.lib.trace.b.d("ContainerController", "automatorManager is null");
        }
    }

    public static /* synthetic */ void l(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "c4d8d01e9f3cfb14d6d9e6a96a377ac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "c4d8d01e9f3cfb14d6d9e6a96a377ac0");
        } else if (aVar.U != null) {
            aVar.U.setVisibility(8);
        }
    }

    public static /* synthetic */ void p(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "3b4e266085afe20a230a267ccff5f7ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "3b4e266085afe20a230a267ccff5f7ba");
        } else if (aVar.ad == null) {
            aVar.ad = new com.meituan.mmp.lib.api.input.g(aVar.f);
            aVar.ad.c = aVar;
            aVar.T.post(c.a(aVar));
        }
    }

    public static /* synthetic */ void u(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "1014f72f0bafc7228f116e7714bf26bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "1014f72f0bafc7228f116e7714bf26bb");
        } else if (aVar.m != null) {
            Map<String, Object> b2 = aVar.h.i().b();
            aVar.m.a("needDownloadPackages", b2.get("needDownloadPackages"));
            aVar.m.a("checkUpdateMode", b2.get("checkUpdateMode"));
            aVar.m.a("isFusion", b2.get("isFusion"));
        }
    }

    public final void a(o oVar) {
        Object[] objArr = {oVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4871406eea87bc3a798d053eb8c967cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4871406eea87bc3a798d053eb8c967cb");
            return;
        }
        this.e = oVar;
        this.f = oVar.e();
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8eac7b0fe328f2c9a3e33c2c6e57f96", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8eac7b0fe328f2c9a3e33c2c6e57f96")).booleanValue() : !G();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39de3644c29b18876ce1ab1331707b4c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39de3644c29b18876ce1ab1331707b4c")).booleanValue() : G() && (this.e instanceof AppBrandHeraActivity);
    }

    public final com.meituan.mmp.lib.engine.m c() {
        return this.g;
    }

    public final Intent d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae8908fdbe9e39dbdf604dcd47806fa3", RobustBitConfig.DEFAULT_VALUE) ? (Intent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae8908fdbe9e39dbdf604dcd47806fa3") : this.e.getIntent();
    }

    public final d.b e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0297fe005c6c70e0e1be407b630930f8", RobustBitConfig.DEFAULT_VALUE) ? (d.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0297fe005c6c70e0e1be407b630930f8") : this.e.getLifecycle().a();
    }

    public final boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cea42b1b63a545a76e86e8867843dbb7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cea42b1b63a545a76e86e8867843dbb7")).booleanValue() : e().a(d.b.RESUMED);
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "132d2b69cd635dd3039494a64a10c6c8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "132d2b69cd635dd3039494a64a10c6c8")).booleanValue() : !e().a(d.b.CREATED);
    }

    public final void a(String str) {
        this.x = str;
    }

    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97048dcdeb1487df6ac053a717793079", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97048dcdeb1487df6ac053a717793079");
        }
        String b2 = b("appId");
        return TextUtils.isEmpty(b2) ? MMPEnvHelper.getDefaultAppID() : b2;
    }

    private String H() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f63773efaf5f09432c011fb5e137d6f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f63773efaf5f09432c011fb5e137d6f") : this.e.l();
    }

    public final String j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d4c1a3a398dfe925411e56034116fdf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d4c1a3a398dfe925411e56034116fdf") : b("targetPath");
    }

    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "767ab60c1ef5dfe330281c0f21b51b57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "767ab60c1ef5dfe330281c0f21b51b57");
            return;
        }
        if (bundle != null) {
            this.af = bundle.getString("__mmp_stack_save");
            if (a()) {
                this.F = true;
            }
        }
        b(this.F);
        com.meituan.mmp.lib.trace.a.a().a();
        com.meituan.mmp.lib.trace.a.a().a("1.1207.210.1");
        if (bundle == null) {
            this.L = hashCode() + ((int) SystemClock.elapsedRealtime());
        } else {
            this.L = bundle.getInt("containerId");
        }
        com.meituan.mmp.lib.utils.p.a(this.f);
    }

    public final void a(final Configuration configuration) {
        Object[] objArr = {configuration};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6bce0662e562bb3b97e2ad4e1965e0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6bce0662e562bb3b97e2ad4e1965e0b");
            return;
        }
        com.meituan.mmp.lib.trace.b.a("ContainerController@" + this.L, "onConfigurationChanged", configuration);
        com.meituan.mmp.lib.utils.p.a(this.f);
        com.meituan.mmp.lib.executor.a.b(new Runnable() { // from class: com.meituan.mmp.lib.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8c287fe9cd6e621f633f2e2c69ee4bfa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8c287fe9cd6e621f633f2e2c69ee4bfa");
                } else if (a.this.f == null || a.this.f.getWindow() == null) {
                } else {
                    Rect rect = new Rect();
                    a.this.f.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    int[] g = a.g(a.this);
                    com.meituan.mmp.lib.trace.b.a("ContainerController@" + a.this.L, "onConfigurationChanged rect1", rect);
                    a.this.a("onWindowResize", com.meituan.mmp.lib.utils.ac.b(com.meituan.mmp.lib.utils.v.a(DMKeys.KEY_GRADIENT_COLOR_INFO_ORIENTATION, configuration.orientation == 2 ? "landscape" : "portrait", JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, com.meituan.mmp.lib.utils.v.a("windowHeight", Integer.valueOf(g[1] != 0 ? com.meituan.mmp.lib.utils.p.c(g[1]) : configuration.screenHeightDp), "windowWidth", Integer.valueOf(g[0] != 0 ? com.meituan.mmp.lib.utils.p.c(g[0]) : configuration.screenWidthDp), "screenHeight", Integer.valueOf(com.meituan.mmp.lib.utils.p.c(rect.height() + com.meituan.mmp.lib.utils.p.d())), "screenWidth", Integer.valueOf(com.meituan.mmp.lib.utils.p.c(rect.width()))))), a.this.k != null ? a.this.k.b() : -1);
                    if (a.this.S != null) {
                        a.this.S.a(configuration);
                    }
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(@android.support.annotation.Nullable android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 1722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.a.b(android.os.Bundle):void");
    }

    public static /* synthetic */ void f(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2cb7ae6cc83736d4ddbb0dc4b75b5f2e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2cb7ae6cc83736d4ddbb0dc4b75b5f2e");
        } else {
            aVar.m.c("mmp.launch.point.first.main.thread.idle");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d739dbf0df06e692441b8f2ade42009c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d739dbf0df06e692441b8f2ade42009c");
        } else if (a()) {
            K();
        } else if (this.g.w) {
            ah();
            X();
        } else {
            this.t = true;
            K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2c217b674d76237821ad8a5a3fce7ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2c217b674d76237821ad8a5a3fce7ce");
        } else if (this.aa) {
        } else {
            this.aa = true;
            if (!a()) {
                this.g.w = true;
            }
            if (ah()) {
                if (MMPHornPreloadConfig.g()) {
                    L();
                }
                W();
                return;
            }
            q qVar = q.PAGE_NOT_FOUND;
            g("appLaunch");
        }
    }

    private void L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddfc45db791b129315024ca9a8ad1037", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddfc45db791b129315024ca9a8ad1037");
            return;
        }
        MMPPackageInfo subPackageByPath = this.i.l.getSubPackageByPath(MMPEnvHelper.getContext(), this.C);
        if (subPackageByPath == null || subPackageByPath.u) {
            AppPage a2 = this.g.i.a(this.C);
            com.meituan.mmp.lib.trace.b.b("ContainerController", "preload App Page in ContainerController OnCreate");
            if (a2 == null) {
                this.g.i.a(this.f).b(this.C);
                this.m.a("preloadUrlMatched", Boolean.FALSE);
            } else if (!a2.e()) {
                a2.b(this.C);
                this.m.a("preloadUrlMatched", Boolean.FALSE);
            } else {
                this.m.a("preloadUrlMatched", Boolean.TRUE);
            }
        }
    }

    public final void a(boolean z) {
        this.F = z;
    }

    public final boolean k() {
        return this.F;
    }

    private void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8af39bec001cdc576dfa744d3d062e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8af39bec001cdc576dfa744d3d062e9");
            return;
        }
        this.y = b("srcAppId");
        this.A = b("srcAppId");
        if (!TextUtils.isEmpty(this.y)) {
            this.z = b("extraData");
            this.E = 1037;
            return;
        }
        this.E = com.meituan.mmp.lib.utils.z.a(d(), KnbConstants.PARAMS_SCENE, 1001);
    }

    private void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fd0f80147619a87c48ae0e867f6524a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fd0f80147619a87c48ae0e867f6524a");
            return;
        }
        this.q = false;
        this.P = false;
        this.aa = false;
        this.ac = null;
        this.ab = 0L;
        if (!z) {
            this.o = com.sankuai.waimai.platform.utils.f.a(d(), "launchStartTime", SystemClock.elapsedRealtime());
            com.meituan.mmp.lib.trace.b.b("ContainerController", "initStatus: " + (SystemClock.elapsedRealtime() - this.o) + "ms since launchStart");
            if (this.m != null) {
                this.m.a("mmp.router.duration.init", SystemClock.elapsedRealtime() - this.o, (Map<String, Object>) null);
            }
            this.p = com.sankuai.waimai.platform.utils.f.a(d(), "launchStartTimeCurrentTimeMillis", System.currentTimeMillis());
            return;
        }
        com.meituan.mmp.lib.trace.b.c("ContainerController", "recreating, reset launch start time");
        this.o = SystemClock.elapsedRealtime();
        this.p = System.currentTimeMillis();
    }

    public static void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47b6f32939ac0b66d1feba8c341f3a37", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47b6f32939ac0b66d1feba8c341f3a37");
        } else if (c) {
        } else {
            c = true;
            com.meituan.mmp.lib.executor.a.a(new ac());
            com.meituan.mmp.lib.executor.a.b(f.a(activity));
        }
    }

    public static /* synthetic */ void b(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f5d1d1ae0353a351d196b078aba76cdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f5d1d1ae0353a351d196b078aba76cdb");
        } else {
            com.meituan.mmp.lib.utils.l.b(activity, true);
        }
    }

    private <T extends View> T b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f0388a103a7a24c5db7bc4be71a7cbf", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f0388a103a7a24c5db7bc4be71a7cbf") : (T) this.e.findViewById(i);
    }

    public final String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52bda0dbc3fdc6abc50a8f747e7193c2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52bda0dbc3fdc6abc50a8f747e7193c2") : com.meituan.mmp.lib.utils.z.b(d(), str);
    }

    public final void a(MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d82c1f7cea8d5b0aaaff3f6ed871c5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d82c1f7cea8d5b0aaaff3f6ed871c5f");
        } else if (this.e.f()) {
            ((HeraActivity) this.e).a(mMPAppProp);
        } else {
            b(mMPAppProp);
        }
    }

    public final void b(MMPAppProp mMPAppProp) {
        Object[] objArr = {mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df26cbb5fc2bf9ebb826549b2c73ceee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df26cbb5fc2bf9ebb826549b2c73ceee");
        } else if (this.n != mMPAppProp) {
            this.n = mMPAppProp;
            this.b = this.n.getVersion();
            if (!this.s) {
                this.g.f.h().a(this.f, this.B, this.E);
            }
            com.meituan.mmp.lib.executor.a.c(g.a(this, mMPAppProp));
        }
    }

    public static /* synthetic */ void a(a aVar, MMPAppProp mMPAppProp) {
        Object[] objArr = {aVar, mMPAppProp};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e0580e52dc83eb8d3210c5ad0555f6c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e0580e52dc83eb8d3210c5ad0555f6c9");
            return;
        }
        Trace.beginSection("updateAppProp");
        aVar.N();
        if (aVar.e instanceof AppBrandHeraActivity) {
            ((AppBrandHeraActivity) aVar.e).a(mMPAppProp.appName, mMPAppProp.iconPath);
        }
        Trace.endSection();
    }

    private void N() {
        String b2;
        String b3;
        RequestCreator c2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdfbd1731919e6fb5e0f10bd5f5ffc19", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdfbd1731919e6fb5e0f10bd5f5ffc19");
        } else if (!I() || this.V == null) {
        } else {
            if (this.n != null) {
                b2 = this.n.appName;
                b3 = this.n.iconPath;
            } else {
                b2 = b("appName");
                b3 = b("appIcon");
            }
            if (!TextUtils.isEmpty(b2)) {
                this.W.setText(b2);
            } else {
                this.W.setText("加载中");
            }
            if (TextUtils.isEmpty(b3) || (c2 = com.meituan.mmp.lib.utils.s.c(MMPEnvHelper.getContext(), b3, this.i)) == null) {
                return;
            }
            c2.a(this.X);
        }
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3af88ee98de7f688c76e54c777ef148a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3af88ee98de7f688c76e54c777ef148a");
        } else if (V()) {
            HashMap a2 = com.meituan.mmp.lib.utils.v.a("isBackPress", Boolean.FALSE, "message", str, "state", "fail");
            if (this.m != null) {
                this.m.a("mmp.launch.point.full.first.render", (Map<String, Object>) a2);
            }
        }
    }

    public static /* synthetic */ void e(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5f98b2d895411c99ffb01118b08e633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5f98b2d895411c99ffb01118b08e633");
            return;
        }
        if (aVar.f()) {
            com.meituan.mmp.main.y.a().a(aVar.x, aVar.d());
        }
        com.meituan.mmp.lib.trace.b.b("ContainerController", "onLaunchError");
        if (aVar.e.f()) {
            ((Activity) aVar.e).finish();
        }
        if (aVar.m != null) {
            aVar.m.b.a();
        }
    }

    public final void d(final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dc517cff79c80ebf0d7dae8887f54e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dc517cff79c80ebf0d7dae8887f54e9");
        } else {
            com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.a.8
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4804ab662b4d6b9f4bc12df65cc5eb12", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4804ab662b4d6b9f4bc12df65cc5eb12");
                        return;
                    }
                    a.this.aa();
                    a.l(a.this);
                    if (a.this.a()) {
                        o unused = a.this.e;
                        q qVar = q.LAUNCH_ERROR;
                        a.this.aj();
                    } else {
                        a aVar = a.this;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "3e406801485fd049605106dfba356e68", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "3e406801485fd049605106dfba356e68");
                        } else {
                            bb.a("加载小程序失败", new Object[0]);
                            Handler handler = a.d;
                            Object[] objArr4 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect4 = h.a;
                            handler.postDelayed(PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "2b5a58a51baee3a1cedbf721daf6ee98", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "2b5a58a51baee3a1cedbf721daf6ee98") : new h(aVar), 1500L);
                        }
                    }
                    a.this.c(str);
                }
            });
        }
    }

    public final void a(String str, Throwable th) {
        Object[] objArr = {str, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "225136a4d527644ec59e63667b82f8fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "225136a4d527644ec59e63667b82f8fb");
            return;
        }
        b.a.c("mmp.launch.point.failed " + str + StringUtil.SPACE + th);
        if (th != null) {
            com.meituan.mmp.lib.trace.b.a("ContainerController", th);
        }
        if (aj.a(d(), this.f)) {
            return;
        }
        d(str);
    }

    public final void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b5b6a1c2e0fff53a663b99703d341a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b5b6a1c2e0fff53a663b99703d341a8");
        } else {
            this.e.startActivityForResult(intent, -1, null);
        }
    }

    public final void a(Intent intent, int i) {
        Object[] objArr = {intent, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3617b7c7d888614174e6d434da7315d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3617b7c7d888614174e6d434da7315d");
        } else {
            this.e.startActivityForResult(intent, i, null);
        }
    }

    public static Intent a(@NonNull String str, @Nullable Bundle bundle) {
        Object[] objArr = {str, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5a39b201b54a8f9c86944d55826dc34", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5a39b201b54a8f9c86944d55826dc34");
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(MMPEnvHelper.getContext(), RouterCenterActivity.class));
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("appId", str);
        return intent;
    }

    public final boolean b(Intent intent) {
        boolean z;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a45db07f75b5327fbb33a2d44aca4318", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a45db07f75b5327fbb33a2d44aca4318")).booleanValue();
        }
        if (!f()) {
            this.N = true;
        }
        if (this.i == null) {
            com.meituan.mmp.lib.trace.b.b("HeraActivity", "onNewIntent-mAppConfig-null");
            return false;
        }
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c87c82262d3a03e3c8482b15a044a99", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c87c82262d3a03e3c8482b15a044a99")).booleanValue();
        } else {
            if (intent != null) {
                String action = intent.getAction();
                Set<String> categories = intent.getCategories();
                if ("android.intent.action.MAIN".equals(action) && categories != null && categories.contains("android.intent.category.LAUNCHER")) {
                    z = true;
                }
            }
            z = false;
        }
        if (z) {
            com.meituan.mmp.lib.trace.b.b("ContainerController", "onNewIntent ignore because launched by home");
            return false;
        }
        String b2 = com.meituan.mmp.lib.utils.z.b(intent, "targetPath");
        if (!this.i.c(b2)) {
            b2 = this.i.i();
        }
        this.D = b2;
        boolean a2 = com.meituan.mmp.lib.utils.z.a(intent, "isLivePIPStarted", false);
        if (a2 && this.S != null) {
            com.meituan.mmp.lib.api.h hVar = this.S;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.api.h.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "dce5ae934e301dcdffd9dbdaf47ec7ee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "dce5ae934e301dcdffd9dbdaf47ec7ee");
            } else if (hVar.g != null && hVar.g.size() > 0) {
                for (com.meituan.mmp.lib.api.k kVar : hVar.g) {
                    kVar.e();
                }
            }
        }
        try {
            if (com.meituan.mmp.lib.utils.z.a(intent, "relaunch", false)) {
                com.meituan.mmp.lib.trace.b.b("ContainerController", "onNewIntent relaunch by intent extra");
                c(intent);
                return true;
            }
            if (this.i.o(b2)) {
                if (a2) {
                    com.meituan.mmp.lib.trace.b.b("ContainerController", "onNewIntent switchTabAction for pip");
                    this.k.c(b2);
                } else if (com.meituan.mmp.lib.utils.z.a(intent, "isFusionApiStarted", false)) {
                    com.meituan.mmp.lib.trace.b.b("ContainerController", "onNewIntent switchTabPage for fusion mode");
                    this.k.d(b2);
                } else {
                    c(intent);
                }
            } else if (a2) {
                com.meituan.mmp.lib.trace.b.b("ContainerController", "onNewIntent navigateBackToPipPage");
                this.k.a(b2);
            } else if (this.e instanceof AppBrandHeraActivity) {
                com.meituan.mmp.lib.trace.b.b("ContainerController", "onNewIntent relaunch for multi app brand mode");
                c(intent);
            } else {
                com.meituan.mmp.lib.trace.b.b("ContainerController", "onNewIntent navigateToPage");
                this.k.b(b2);
            }
            return true;
        } catch (com.meituan.mmp.lib.api.d e) {
            com.meituan.mmp.lib.trace.b.a("ContainerController", e, "reLaunch failed");
            bb.a("页面跳转异常", new Object[0]);
            return false;
        }
    }

    private void c(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e6346de8721c75ccc8d195b9ebb75a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e6346de8721c75ccc8d195b9ebb75a0");
            return;
        }
        this.m.b.a(true);
        if (this.e instanceof Activity) {
            ((Activity) this.e).setIntent(intent);
        }
        b(false);
        this.m.a(this.o);
        this.m.b(this.p);
        this.m.a(JsBridgeResult.ARG_KEY_LOCATION_MODE, (Object) "reLaunch");
        this.m.a(intent, false);
        com.meituan.mmp.lib.trace.b.c("onNewIntent relaunch, appId = " + b("appId") + ", targetPath = " + b("targetPath"));
        this.B = H();
        boolean ah = ah();
        if (com.meituan.mmp.lib.utils.z.a(intent, "startFromMinProgram", false)) {
            M();
        } else {
            this.E = 1001;
        }
        this.m.a("mmp.launch.point.app.native.init", (Map<String, Object>) null);
        if (this.w) {
            this.r = true;
            if (this.u) {
                r();
            }
        }
        if (ah) {
            try {
                this.k.b(this.C, this.m);
            } catch (com.meituan.mmp.lib.api.d e) {
                com.meituan.mmp.lib.trace.b.a("ContainerController", e, "onNewIntentRelaunch");
            }
            bb.b("relaunch existing HeraActivity", new Object[0]);
        } else if (this.i == null || this.i.l == null) {
            d("onNewIntentRelaunch AppConfig or AppProp is null");
        } else {
            q qVar = q.PAGE_NOT_FOUND;
            g("reLaunch");
        }
    }

    public final void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "948c64e4bc2c80cb074f34657eb2e58b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "948c64e4bc2c80cb074f34657eb2e58b");
            return;
        }
        if (this.e.f() && this.i != null && this.i.e()) {
            String O = O();
            bundle.putString("__mmp_stack_save", O);
            com.meituan.mmp.lib.resume.c.a().a(this.J, this.k, O);
        }
        bundle.putString("backFromExternalNativeUrl", this.ag);
        bundle.putInt("containerId", this.L);
    }

    private String O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccd502d387037a364ae0970d78034044", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccd502d387037a364ae0970d78034044");
        }
        if (this.af != null) {
            return this.af;
        }
        return d().getDataString() + "@" + hashCode();
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aafeb52ef8057dea251d05c926614db2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aafeb52ef8057dea251d05c926614db2");
            return;
        }
        this.M = false;
        this.m.b.b("hera.activity.resume");
        z.a(this);
        if (this.h == null) {
            b.a.c("ContainerController", "onResume mAppLoader is null");
            if (a()) {
                return;
            }
            this.f.finish();
            return;
        }
        com.meituan.mmp.lib.pip.e.b();
        this.g.f.a(this);
        if (this.e.f() && this.i.e()) {
            com.meituan.mmp.lib.resume.c.a().a(O());
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56baf9ce60fd9e8d221e4e7c584438f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56baf9ce60fd9e8d221e4e7c584438f0");
        } else {
            P();
            if (this.ah == null) {
                this.ah = new Runnable() { // from class: com.meituan.mmp.lib.a.9
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e2ae3d609560d6ae11114f27aa61e0c6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e2ae3d609560d6ae11114f27aa61e0c6");
                            return;
                        }
                        Activity activity = a.this.f;
                        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
                            return;
                        }
                        com.meituan.mmp.lib.utils.e.a(a.this.f, a.this.av);
                        com.meituan.mmp.lib.trace.b.b("ContainerController", "listenSystemDialogAndKeyBoardHeight registerReceiver");
                        activity.registerReceiver(a.this.av, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                        a.p(a.this);
                    }
                };
            }
            d.post(this.ah);
        }
        MMPEnvHelper.getLogger().mgePageView(this.x, "c_group_ynsk9teh", null);
        t.a(this.i.c());
        w.a().b.a(this.x, com.meituan.mmp.lib.utils.b.c(this.f));
        r();
        if (this.ae != null) {
            this.ae.run();
            this.ae = null;
        }
        if (!this.N) {
            if (this.k.e() != null) {
                com.meituan.mmp.lib.trace.a.a(this.k.e().getPagePath(), this.x, "onResumed");
            }
        } else {
            this.N = false;
        }
        if (this.al) {
            this.al = false;
            w.a().e.a("native_init_end");
        }
        this.m.b.a("hera.activity.resume");
    }

    private void P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30d59d47c9117ff732d6cdbeaa56e100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30d59d47c9117ff732d6cdbeaa56e100");
        } else if (this.ah != null) {
            d.removeCallbacks(this.ah);
        }
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9207f077e93f40b0a45f20b933351ebb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9207f077e93f40b0a45f20b933351ebb");
            return;
        }
        this.M = true;
        MMPEnvHelper.getLogger().disableAutoPageDisappear(this);
        z.b(this);
        if (this.e.f() && this.f.isFinishing()) {
            R();
        }
        t();
        MMPEnvHelper.getLogger().mgePageDisappear(this.x, "c_group_ynsk9teh", null);
        com.meituan.mmp.lib.utils.e.a(this.f, this.av);
        if (this.k.e() != null) {
            com.meituan.mmp.lib.trace.a.b();
        }
        w.a().b.b(this.x, com.meituan.mmp.lib.utils.b.c(this.f));
        if (!"com.sankuai.youxuan".equalsIgnoreCase(this.f.getPackageName()) && this.f.isFinishing()) {
            S();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0be38a935efaf2b788125de8089ddad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0be38a935efaf2b788125de8089ddad");
        } else if (com.meituan.mmp.lib.config.b.U()) {
            com.meituan.mmp.lib.trace.b.b("ContainerController", "disablePreSendOnPageRecycleEvent");
        } else if (!this.f.isFinishing() || this.k.e() == null) {
        } else {
            com.meituan.mmp.lib.page.e e = this.k.e();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.page.e.a;
            if (PatchProxy.isSupport(objArr3, e, changeQuickRedirect3, false, "a5463439bce4674e6f0078f0d29c4248", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, e, changeQuickRedirect3, false, "a5463439bce4674e6f0078f0d29c4248");
                return;
            }
            Iterator<AppPage> it = e.f.iterator();
            while (it.hasNext()) {
                AppPage next = it.next();
                if (next != null) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = AppPage.a;
                    if (PatchProxy.isSupport(objArr4, next, changeQuickRedirect4, false, "d511941d5e78ffe5d08448c69a8f3337", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, next, changeQuickRedirect4, false, "d511941d5e78ffe5d08448c69a8f3337");
                    } else {
                        com.meituan.mmp.lib.trace.b.b("AppPage", "preSendOnPageRecycleEvent");
                        next.n = true;
                        next.a("onPageRecycle", (String) null);
                    }
                }
            }
        }
    }

    private void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee36227fb5649483f4c9c7cc6efbcac6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee36227fb5649483f4c9c7cc6efbcac6");
        } else if (V()) {
            HashMap a2 = com.meituan.mmp.lib.utils.v.a("isBackPress", Boolean.valueOf(z), "state", "cancel");
            if (SystemClock.elapsedRealtime() - this.o > MetricsAnrManager.ANR_THRESHOLD) {
                a2.put("isFirstRenderTimeout", Boolean.TRUE);
            }
            if (this.m != null) {
                this.m.a("mmp.launch.point.full.first.render", (Map<String, Object>) a2);
                this.m.b.a();
                return;
            }
            com.meituan.mmp.lib.trace.b.d("ContainerController", "reportLaunchCancel mReporter is null");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0104, code lost:
        if (r2 != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.a.n():boolean");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0393a {
        BACK,
        CLOSE;
        
        public static ChangeQuickRedirect a;

        EnumC0393a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62e1d170881ec54f7477e38b2c7bc5de", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62e1d170881ec54f7477e38b2c7bc5de");
            }
        }

        public static EnumC0393a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f0e1c649e1c1055f24201761294dc28", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0393a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f0e1c649e1c1055f24201761294dc28") : (EnumC0393a) Enum.valueOf(EnumC0393a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0393a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3ce60ace99f860744bfd9377e3b8452", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0393a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3ce60ace99f860744bfd9377e3b8452") : (EnumC0393a[]) values().clone();
        }
    }

    private boolean a(EnumC0393a enumC0393a) {
        com.meituan.mmp.lib.page.e e;
        Object[] objArr = {enumC0393a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9571dfcbd396da9a5cb182e4d70b4e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9571dfcbd396da9a5cb182e4d70b4e9")).booleanValue();
        }
        if (this.k == null || this.i == null || (e = this.k.e()) == null || !this.i.a()) {
            return false;
        }
        boolean z = e.o;
        if (this.q && z) {
            HashMap hashMap = new HashMap();
            int b2 = this.k.b();
            hashMap.put("pageId", Integer.valueOf(b2));
            hashMap.put("navigationType", (enumC0393a == EnumC0393a.CLOSE || Q()) ? PageBeforeUnloadParam.NAVIGATION_TYPE_EXITMINIPROGRAM : "navigateBack");
            a(PageBeforeUnloadParam.NAVIGATION_ONPAGE_BEFORE_UNLOAD, com.meituan.mmp.lib.utils.ac.a(hashMap).toString(), b2);
            return true;
        }
        return false;
    }

    private boolean Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3f1a74c07c9c1bb47281de9d50d94a2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3f1a74c07c9c1bb47281de9d50d94a2")).booleanValue() : this.k.c() <= 1 && this.g.a();
    }

    private void R() {
        com.meituan.mmp.lib.page.e d2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ac89c607c0cf77be7a7ceef9e7409d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ac89c607c0cf77be7a7ceef9e7409d5");
        } else if (this.I) {
        } else {
            this.I = true;
            if (!a()) {
                int i = ((HeraActivity) this.e).i();
                boolean a2 = com.meituan.mmp.main.fusion.c.a(i);
                com.meituan.mmp.main.fusion.c.b(i);
                if (a2) {
                    return;
                }
            }
            if (this.k == null || (d2 = this.k.d()) == null) {
                return;
            }
            d2.k();
            if (this.m != null) {
                this.m.c(d2.getRoutePath(), String.valueOf(d2.getViewId()));
            }
        }
    }

    public final void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f4eea8f1ae01502c8f7fc4f69d7dcc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f4eea8f1ae01502c8f7fc4f69d7dcc2");
        } else if (this.q && a(EnumC0393a.CLOSE)) {
        } else {
            p();
        }
    }

    public final void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6801a9959d1327023d7f2f955b4cc490", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6801a9959d1327023d7f2f955b4cc490");
            return;
        }
        com.meituan.mmp.main.y.a().a(this.x, d());
        com.meituan.mmp.lib.trace.b.b("ContainerController", "handleCloseApp");
        if (this.e.f()) {
            ((HeraActivity) this.e).c();
        } else {
            com.meituan.mmp.lib.trace.b.c("ContainerController", "cannot close app in widget");
        }
    }

    public final void a(int i, int i2, Intent intent) {
        Uri parse;
        Bundle extras;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e2269d8d5d5d30058634ff84c276d72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e2269d8d5d5d30058634ff84c276d72");
            return;
        }
        com.meituan.mmp.lib.trace.b.a("ContainerController", "onActivityResult: " + i + StringUtil.SPACE + i2);
        if (i == 96 && i2 == -1) {
            this.y = com.sankuai.waimai.platform.utils.f.a(intent, "srcAppId");
            if (TextUtils.isEmpty(this.y)) {
                return;
            }
            this.z = com.sankuai.waimai.platform.utils.f.a(intent, "extraData");
            this.E = 1038;
        } else if (i == 98 && i2 == -1 && this.i.a()) {
            if (intent == null || (extras = intent.getExtras()) == null) {
                return;
            }
            this.z = com.meituan.mmp.lib.utils.ac.a(extras).toString();
        } else if (i == 97 || i == 113) {
            this.ae = i.a(this, i, i2, intent);
        } else if (i != 99 || intent == null) {
        } else {
            Object[] objArr2 = {intent};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c73ef94f06c0dc9351b5a6072165537", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c73ef94f06c0dc9351b5a6072165537");
                return;
            }
            String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "result_url");
            boolean isProdEnv = MMPEnvHelper.getEnvInfo().isProdEnv();
            if (a2 == null || isProdEnv || (parse = Uri.parse(a2)) == null) {
                return;
            }
            this.g.f.a(parse.getQueryParameter("debugProxyServer"), this.f, com.meituan.mmp.lib.utils.z.a(d(), "killWhenSuspend", false));
            b bVar = this.aw;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "e82e9348816e0c90edd7376d0a59ef5e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "e82e9348816e0c90edd7376d0a59ef5e");
            }
        }
    }

    public static /* synthetic */ void a(a aVar, int i, int i2, Intent intent) {
        Object[] objArr = {aVar, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97af119451bbda322499e510846e49e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97af119451bbda322499e510846e49e5");
        } else {
            aVar.S.a(i, i2, intent);
        }
    }

    public final void a(@NonNull String[] strArr, String str, a.InterfaceC0498a interfaceC0498a) {
        Object[] objArr = {strArr, str, interfaceC0498a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75eeda14d5fbc50d977f0f098ade30f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75eeda14d5fbc50d977f0f098ade30f4");
        } else if (this.f == null || this.f.isFinishing() || this.f.isDestroyed()) {
            interfaceC0498a.onResult(str, strArr, null, "activity is null");
        } else {
            com.meituan.mmp.lib.api.h hVar = this.S;
            Object[] objArr2 = {strArr, str, interfaceC0498a};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.api.h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "8f77173b6606e9456b537790feea2b56", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "8f77173b6606e9456b537790feea2b56");
            } else if (hVar.e != null && hVar.h) {
                hVar.e.a(strArr, str, interfaceC0498a);
            } else {
                hVar.f.a(strArr, str, interfaceC0498a);
            }
        }
    }

    public final void a(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c36b0defa0a40ae9fea03b2a94c3b97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c36b0defa0a40ae9fea03b2a94c3b97");
            return;
        }
        com.meituan.mmp.lib.api.h hVar = this.S;
        Object[] objArr2 = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.api.h.a;
        if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "2be4c77b550a87f25b67e30d71b29a68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "2be4c77b550a87f25b67e30d71b29a68");
        } else if (i == 107) {
            if (hVar.f != null) {
                com.meituan.mmp.lib.api.n nVar = hVar.f;
                Object[] objArr3 = {Integer.valueOf(i), strArr, iArr};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.api.n.a;
                if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "d1674d1a29fb27f6b78476f5e3adf399", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "d1674d1a29fb27f6b78476f5e3adf399");
                } else if (i == 107) {
                    nVar.e.a(i, strArr, iArr);
                }
            }
        } else if (hVar.e != null) {
            com.meituan.mmp.lib.msi.o oVar = hVar.e;
            Object[] objArr4 = {Integer.valueOf(i), strArr, iArr};
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.mmp.lib.msi.o.a;
            if (PatchProxy.isSupport(objArr4, oVar, changeQuickRedirect4, false, "02b4852536c8a8fd4d6cb3928dc5ca9d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, oVar, changeQuickRedirect4, false, "02b4852536c8a8fd4d6cb3928dc5ca9d");
            } else if (oVar.c != null) {
                oVar.c.a(i, strArr, iArr);
            }
        }
    }

    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50a99dd64453e124aa0a63df4a07f1d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50a99dd64453e124aa0a63df4a07f1d0");
        } else {
            S();
        }
    }

    @MainThread
    private void S() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63ab54fcf8ae26dd3cadcc8e56baa574", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63ab54fcf8ae26dd3cadcc8e56baa574");
        } else if (this.H) {
        } else {
            this.H = true;
            P();
            z.c(this);
            if (this.e.f() && this.f.isFinishing()) {
                R();
                if (this.i.e()) {
                    com.meituan.mmp.lib.resume.c.a().a(this.af);
                }
                HeraActivity heraActivity = (HeraActivity) this.e;
                com.meituan.mmp.main.fusion.c.a(heraActivity, heraActivity.i());
            }
            if (a()) {
                R();
                com.meituan.mmp.lib.resume.c.a().a(this.af);
            }
            MMPEnvHelper.applicationStateDispatcher.b(this.f, this.i.c(), null);
            if (this.ad != null) {
                this.ad.a();
            }
            if (this.h != null) {
                this.h.c(this.au);
            }
            this.g.f.c(this);
            c(false);
            com.meituan.mmp.lib.trace.a.a().b(this.x);
        }
    }

    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43ddd32c01797ee75e640ad963c7be1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43ddd32c01797ee75e640ad963c7be1c");
        } else if (this.e.f()) {
            ((HeraActivity) this.e).m();
        } else {
            s();
        }
    }

    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da9793a0d2f95ed1c5c8353bf60b40dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da9793a0d2f95ed1c5c8353bf60b40dc");
            return;
        }
        if (this.w) {
            this.S.d();
            Map<String, Object> hashMap = new HashMap<>();
            if (this.r) {
                hashMap.put("openType", "reLaunch");
            } else if (this.s && !this.t && !this.q && !this.F) {
                if (!this.i.o(this.C)) {
                    hashMap = T();
                }
                hashMap.put("openType", this.i.o(this.C) ? "reLaunch" : "navigateTo");
            } else if (this.y != null) {
                if (this.E == 1038) {
                    hashMap = T();
                    hashMap.put("openType", "navigateBack");
                    if (this.v) {
                        this.y = null;
                        this.z = null;
                    }
                } else {
                    hashMap.put("openType", "appLaunch");
                }
            } else {
                hashMap = T();
            }
            if (a() || this.r || (!this.q && !this.F)) {
                hashMap.put("path", this.C);
            }
            if (this.D != null) {
                hashMap.put("path", this.D);
                this.D = null;
            }
            hashMap.put(KnbConstants.PARAMS_SCENE, Integer.valueOf(this.E));
            JSONObject a2 = com.meituan.mmp.lib.utils.ac.a(hashMap);
            String jSONObject = a2.toString();
            String str = G() ? "onAppEnterForeground" : "onWidgetEnterForeground";
            if (!this.g.x || a()) {
                this.g.x = true;
                com.meituan.mmp.lib.trace.b.b("ContainerController", str + ", openType: " + jSONObject);
                a(str, jSONObject, this.k.b());
                this.aw.c(a2);
            }
        }
        if (!this.r) {
            com.meituan.mmp.lib.page.e e = this.k.e();
            if (e != null) {
                e.j();
                e.o();
                if (this.m != null) {
                    this.m.d(e.getRoutePath(), String.valueOf(e.getViewId()));
                }
            }
            this.u = true;
        }
        this.r = false;
    }

    private Map<String, Object> T() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41928cc98402bf602ec9ac1512d17c3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41928cc98402bf602ec9ac1512d17c3b");
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("appId", this.y);
        if (this.ag != null) {
            hashMap2.put("url", this.ag);
            this.ag = null;
        }
        if (this.z != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.z);
                Object opt = jSONObject.opt("extraData");
                if (opt != null) {
                    jSONObject = opt;
                }
                hashMap2.put("extraData", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.z = null;
        }
        hashMap.put("referrerInfo", hashMap2);
        return hashMap;
    }

    private void U() {
        this.O = false;
        this.u = false;
    }

    public final boolean u() {
        return this.q;
    }

    @Override // com.meituan.mmp.lib.interfaces.d
    public final synchronized void a(String str, HashMap<String, Object> hashMap) {
        int i;
        String a2;
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05d40dd0efa98fb2736fba15f2fb0b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05d40dd0efa98fb2736fba15f2fb0b9d");
            return;
        }
        com.meituan.mmp.main.ab.d("TotalLaunchTime");
        if (!this.q) {
            this.q = true;
            Object[] objArr2 = {hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7f714be2144ce9f7545a27ad111503b4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7f714be2144ce9f7545a27ad111503b4");
            } else {
                Object[] objArr3 = {hashMap};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3af10d331f8610ed8b701bde93e3730e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3af10d331f8610ed8b701bde93e3730e");
                } else if (V()) {
                    this.m.b.a(PackageLoadReporter.Source.LAUNCH);
                    if (this.l != null && this.l.a()) {
                        this.m.l = this.l;
                    }
                    this.m.a("mmp.launch.duration.route.render", hashMap);
                    Map<String, Object> c2 = this.m.c();
                    if (c2 != null) {
                        if (c2.get("useCompileTimeTemplate") != null && ((Boolean) c2.get("useCompileTimeTemplate")).booleanValue()) {
                            c2.put("renderType", "compileCacheTemplate");
                        } else if (c2.get("useSnapshotTemplate") != null && ((Boolean) c2.get("useSnapshotTemplate")).booleanValue()) {
                            c2.put("renderType", "renderCacheTemplate");
                        } else if (c2.get("useInitialData") != null && ((Boolean) c2.get("useInitialData")).booleanValue()) {
                            c2.put("renderType", "renderCache");
                        } else {
                            c2.put("renderType", "normal");
                        }
                        Intent d2 = d();
                        if (d2 != null) {
                            c2.put("startByApplyUpdate", Boolean.valueOf(com.sankuai.waimai.platform.utils.f.a(d2, "startByApplyUpdate", false)));
                        }
                    }
                    com.meituan.mmp.lib.trace.h hVar = this.m;
                    Long valueOf = Long.valueOf(System.currentTimeMillis());
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "be3526668136e6f41e3710851c0c9acc", RobustBitConfig.DEFAULT_VALUE)) {
                        i = ((Integer) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "be3526668136e6f41e3710851c0c9acc")).intValue();
                    } else if (this.n == null) {
                        com.meituan.mmp.lib.trace.b.d("ContainerController", "getLoadType mAppProp is null");
                        i = -1;
                    } else {
                        i = this.n.loadType;
                    }
                    hVar.a("mmp.launch.point.full.first.render", com.meituan.mmp.lib.utils.v.a((Map) com.meituan.mmp.lib.utils.v.a("endTime", valueOf, "loadType", Integer.valueOf(i), "launchEvents", this.m.b.b(), "state", "success"), (Map) hashMap));
                    this.m.a("mmp.launch.full.first.render", (Map<String, Object>) hashMap);
                    if (this.ac == null) {
                        this.ac = hashMap;
                        if (this.ab != 0 && this.ac != null) {
                            this.m.a("mmp.launch.point.full.first.render.v2", Math.max(this.ab, ((Long) this.ac.get("firstRenderTime")).longValue()) - this.o, this.ac);
                        }
                    }
                    w.a().c.a(this.x, this.C, hashMap);
                    this.m.b.a();
                    com.meituan.mmp.lib.trace.h hVar2 = this.m;
                    Object[] objArr5 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.mmp.lib.trace.h.a;
                    if (PatchProxy.isSupport(objArr5, hVar2, changeQuickRedirect5, false, "76554a89e189db816401a52be76c09fe", RobustBitConfig.DEFAULT_VALUE)) {
                        com.meituan.mmp.lib.trace.h hVar3 = (com.meituan.mmp.lib.trace.h) PatchProxy.accessDispatch(objArr5, hVar2, changeQuickRedirect5, false, "76554a89e189db816401a52be76c09fe");
                    } else {
                        hVar2.c.remove("launchData");
                        hVar2.c.remove("launchExtras");
                        hVar2.c.remove("launchStartFromApplicationStart");
                        hVar2.c.remove("lastStatusEventWhenLaunch");
                        hVar2.c.remove("preloadHomePageStarted");
                        hVar2.c.remove("preloadUrlMatched");
                    }
                }
                com.meituan.mmp.lib.executor.a.c(new Runnable() { // from class: com.meituan.mmp.lib.a.10
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4e71bd94423b2bfa135f6a181842df06", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4e71bd94423b2bfa135f6a181842df06");
                            return;
                        }
                        a.this.aa();
                        a.l(a.this);
                        if (DebugHelper.b()) {
                            if (a.this.n.mainPackage.t) {
                                bb.a("使用内置包", 0);
                            }
                            a.this.C();
                        }
                    }
                });
                com.meituan.mmp.main.f fVar = MMPEnvHelper.applicationStateDispatcher;
                Activity activity = this.f;
                String c3 = this.i.c();
                MMPPackageInfo mMPPackageInfo = this.n.mainPackage;
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = MMPPackageInfo.a;
                if (PatchProxy.isSupport(objArr6, mMPPackageInfo, changeQuickRedirect6, false, "840190738cc0072dfd040e8b1787c9fd", RobustBitConfig.DEFAULT_VALUE)) {
                    a2 = (String) PatchProxy.accessDispatch(objArr6, mMPPackageInfo, changeQuickRedirect6, false, "840190738cc0072dfd040e8b1787c9fd");
                } else {
                    a2 = mMPPackageInfo.t ? PackageLoadReporter.LoadType.INNER : MMPPackageInfo.a(mMPPackageInfo.j);
                }
                fVar.c(activity, c3, com.meituan.mmp.lib.utils.v.a("pkgSource", a2));
                String str2 = this.x;
                Object[] objArr7 = {str2};
                ChangeQuickRedirect changeQuickRedirect7 = com.meituan.mmp.lib.engine.s.a;
                if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "934fb3ecc51a6523607422421cef9eca", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "934fb3ecc51a6523607422421cef9eca");
                } else {
                    MMPEnvHelper.getSharedPreferences("mmp_recent_app").edit().putString("mmp_recent_app_appid", str2).apply();
                }
                b bVar = this.aw;
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = b.a;
                if (PatchProxy.isSupport(objArr8, bVar, changeQuickRedirect8, false, "16df13f68d7c88eb1f971ea8eed89aa4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, bVar, changeQuickRedirect8, false, "16df13f68d7c88eb1f971ea8eed89aa4");
                }
            }
        }
        com.meituan.mmp.lib.executor.a.d(j.a(this, str), 4000L);
    }

    public static /* synthetic */ void b(a aVar, String str) {
        boolean z;
        ArrayList arrayList;
        MMPPackageInfo packageByName;
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "00dd4c35f0eb091f94daaba73e26b024", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "00dd4c35f0eb091f94daaba73e26b024");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("ContainerController", "prefetch sub package after first render");
        com.meituan.mmp.lib.update.k a2 = com.meituan.mmp.lib.update.k.a();
        com.meituan.mmp.lib.config.a aVar2 = aVar.i;
        com.meituan.mmp.lib.update.a aVar3 = new com.meituan.mmp.lib.update.a(aVar.m);
        Object[] objArr2 = {aVar2, str, null, aVar3};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.update.k.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "77cc85da1588c8bb03ba243b5d98df2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "77cc85da1588c8bb03ba243b5d98df2d");
        } else if (aVar2 == null || aVar2.l == null || aVar2.m == null || TextUtils.isEmpty(str)) {
        } else {
            MMPAppProp mMPAppProp = aVar2.l;
            com.meituan.mmp.lib.config.d dVar = aVar2.m.get(com.meituan.mmp.lib.config.a.p(str));
            if (dVar == null || com.meituan.mmp.lib.utils.h.a((List) dVar.c)) {
                return;
            }
            Context context = MMPEnvHelper.getContext();
            Object[] objArr3 = {context, dVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.mmp.lib.config.d.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "725b8acb6f13d5fa2840ac122606f33c", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "725b8acb6f13d5fa2840ac122606f33c")).booleanValue();
            } else if (context == null || dVar == null) {
                z = false;
            } else {
                z = TextUtils.equals("all", dVar.b) ? true : am.b(context);
            }
            if (z) {
                Context context2 = MMPEnvHelper.getContext();
                Object[] objArr4 = {context2, mMPAppProp, dVar};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.mmp.lib.config.d.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "8dfbf783797f1350fde90f972a6420f1", RobustBitConfig.DEFAULT_VALUE)) {
                    arrayList = (List) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "8dfbf783797f1350fde90f972a6420f1");
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it = dVar.c.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (!TextUtils.isEmpty(next) && (packageByName = mMPAppProp.getPackageByName(next)) != null && !packageByName.c(context2)) {
                            arrayList2.add(packageByName);
                        }
                    }
                    arrayList = arrayList2;
                }
                if (arrayList.size() != 0) {
                    a2.a(mMPAppProp, str, arrayList, (com.meituan.mmp.lib.update.i) null, aVar3);
                }
            }
        }
    }

    private boolean V() {
        if (this.P) {
            return false;
        }
        this.P = true;
        return true;
    }

    private void W() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2374b4f536d121391e0b382938b60c77", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2374b4f536d121391e0b382938b60c77");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("ContainerController", "launchHomePage");
        if (this.l != null && this.l.a()) {
            this.m.l = this.l;
        }
        if (G() || !(this.k instanceof af)) {
            this.m.a("mmp.launch.duration.page.native.init");
            this.k.a(this.C, this.m);
            this.m.b("mmp.launch.duration.page.native.init");
            this.m.c("mmp.launch.point.page.native.appear");
            return;
        }
        ((af) this.k).a(this.C, this.m, this.F);
    }

    private void X() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61c3fe7d75b0835ee654b6682efaef97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61c3fe7d75b0835ee654b6682efaef97");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("ContainerController", "navigateFusionHomePage");
        if (this.J != null) {
            aa();
            if (this.J.a()) {
                this.J.a(this.k.j);
                return;
            }
        }
        if (MMPEnvHelper.getFusionPageManager() == null && this.g.f.d() > 1 && this.i.o(this.C)) {
            bb.a("该Tab页面不支持当前启动方式", new Object[0]);
            com.meituan.mmp.lib.trace.b.b("ContainerController", "HeraActivity navigateFusionHomePage");
            p();
            return;
        }
        d.post(k.a(this));
    }

    public static /* synthetic */ void d(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65c98b62ba2c71a11bdb1bc2579a0afa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65c98b62ba2c71a11bdb1bc2579a0afa");
            return;
        }
        Integer valueOf = aVar.d().hasExtra("openSeq") ? Integer.valueOf(com.sankuai.waimai.platform.utils.f.a(aVar.d(), "openSeq", 0)) : null;
        com.meituan.mmp.main.ab.a("navigateFusionHomePage");
        ab abVar = aVar.k;
        String str = aVar.C;
        com.meituan.mmp.lib.trace.h hVar = aVar.m;
        Object[] objArr2 = {str, valueOf, hVar};
        ChangeQuickRedirect changeQuickRedirect2 = ab.a;
        if (PatchProxy.isSupport(objArr2, abVar, changeQuickRedirect2, false, "1b5108d8f7d280216f2ddd2f73837f01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, abVar, changeQuickRedirect2, false, "1b5108d8f7d280216f2ddd2f73837f01");
        } else {
            abVar.a(str, valueOf, hVar, false);
        }
        com.meituan.mmp.main.ab.a();
    }

    public static /* synthetic */ void c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3344f3dcafeb3f47e95ff092cb83186d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3344f3dcafeb3f47e95ff092cb83186d");
        } else if (aVar.g()) {
        } else {
            aVar.Z();
        }
    }

    private void Y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "626e70d41b7257c950eb91abb255958a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "626e70d41b7257c950eb91abb255958a");
        } else if (this.V == null) {
            this.V = (LinearLayout) ((ViewStub) b(R.id.mmp_loading)).inflate();
            this.W = (TextView) this.V.findViewById(R.id.mmp_title);
            this.X = (ImageView) this.V.findViewById(R.id.mmp_icon);
        }
    }

    private void Z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12bf11ec1ff429a5774889411b5d4b53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12bf11ec1ff429a5774889411b5d4b53");
            return;
        }
        com.meituan.mmp.lib.trace.b.b("ContainerController", "show loading view");
        Y();
        this.V.setVisibility(0);
        N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d10559838fd5d87b6849acd311220d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d10559838fd5d87b6849acd311220d6");
            return;
        }
        d.removeCallbacks(this.am);
        if (this.V != null) {
            this.V.setVisibility(8);
        }
    }

    private void ab() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e6090631ca803758d10205c2c3e186b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e6090631ca803758d10205c2c3e186b");
        } else {
            c(-1);
        }
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c07ccf7998906fa3d365479c71d2da55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c07ccf7998906fa3d365479c71d2da55");
        } else if (this.U != null) {
            this.U.setBackgroundColor(i);
            this.U.setVisibility(0);
        }
    }

    public final void v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fafe8e60bd4f454422c45ed7fbd11d55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fafe8e60bd4f454422c45ed7fbd11d55");
        } else if (this.an) {
        } else {
            this.an = true;
            this.m.b("mmp.launch.duration.route.to.initial.data");
        }
    }

    @Override // com.meituan.mmp.lib.interfaces.c
    public final void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5640ff24db0d3103c21c7a9db84286f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5640ff24db0d3103c21c7a9db84286f0");
        } else if (this.j == null) {
            com.meituan.mmp.lib.trace.b.a("notifyServiceSubscribeHandler when service is null", str, str2, Integer.valueOf(i));
        } else {
            this.j.a(str, str2, i);
        }
    }

    @Override // com.meituan.mmp.lib.interfaces.c
    public final void a(String str, JSONObject jSONObject, int i) {
        Object[] objArr = {str, jSONObject, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a2e4ae3f8260c88abf0c809d28ef247", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a2e4ae3f8260c88abf0c809d28ef247");
            return;
        }
        if (i == 0) {
            try {
                i = this.k.b();
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put("data", jSONObject);
        a("custom_event_UI", jSONObject2.toString(), i);
    }

    @Override // com.meituan.mmp.lib.interfaces.c
    public final void a(String str, String str2, int[] iArr) {
        Object[] objArr = {str, str2, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2295d27a4124df5a99a4605fab4e13ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2295d27a4124df5a99a4605fab4e13ea");
            return;
        }
        v();
        this.k.a(str, str2, iArr);
    }

    @Override // com.meituan.mmp.lib.interfaces.d
    @MainThread
    public final void a(aa aaVar, int i, int i2, String str) {
        int i3;
        Uri data;
        Object[] objArr = {aaVar, Integer.valueOf(i), Integer.valueOf(i2), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ae9f2c7aef8d7abd075393093f0103d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ae9f2c7aef8d7abd075393093f0103d");
            return;
        }
        com.meituan.mmp.main.ab.a("onAppRoute");
        this.v = true;
        String str2 = aaVar.c;
        String str3 = aaVar.b;
        Map<String, Object> hashMap = new HashMap<>();
        if (this.y != null) {
            hashMap = T();
            hashMap.put(KnbConstants.PARAMS_SCENE, Integer.valueOf(this.E));
            this.y = null;
            this.z = null;
        }
        if (aaVar.e != null) {
            hashMap.putAll(aaVar.e);
        }
        if ("navigateBackUtil".equals(str2)) {
            hashMap.put("lastRemovedPageId", Integer.valueOf(i));
            str2 = "navigateBack";
        } else if (str3 != null && !this.i.c(str3)) {
            hashMap.put("pageNotFound", Boolean.TRUE);
        }
        hashMap.put("path", str3);
        if (aaVar.d != null) {
            hashMap.put("openSeq", aaVar.d);
        }
        this.ap = "webview";
        hashMap.put("engineType", this.ap);
        hashMap.put("pageFrameId", "page_" + i);
        hashMap.put("originUrl", aaVar.f);
        hashMap.put("isTab", Boolean.valueOf(aaVar.g));
        if (!"reload".equals(str2) || (i3 = i2) == -1) {
            i3 = i;
        } else {
            hashMap.put("newPageId", Integer.valueOf(i));
        }
        if (a() && "reload".equals(str2)) {
            str2 = "widgetReload";
        }
        hashMap.put("openType", str2);
        hashMap.put("isNativeLaunch", Boolean.valueOf(!this.q));
        if (!this.q) {
            hashMap.put("nativeLaunchMode", ac());
        }
        if (a()) {
            MMPWidgetFragment mMPWidgetFragment = (MMPWidgetFragment) this.e;
            hashMap.put("widgetProperties", mMPWidgetFragment.h());
            if (mMPWidgetFragment.j() != null) {
                hashMap.put("registerWidgetEvents", mMPWidgetFragment.i());
            }
        }
        JSONObject a2 = com.meituan.mmp.lib.utils.ac.a(hashMap);
        String jSONObject = a2.toString();
        com.meituan.mmp.lib.trace.b.b("ContainerController", "onAppRoute " + str2 + ", to " + jSONObject + " with render cache " + com.meituan.mmp.lib.utils.r.a(str));
        if (!TextUtils.isEmpty(str)) {
            com.meituan.mmp.main.ab.a("onAppRoute.processRenderCache");
            try {
                jSONObject = new ac.a(jSONObject).a("initialRenderingData", str, false).a();
            } catch (JSONException e) {
                com.meituan.mmp.lib.trace.b.a(e);
            }
            com.meituan.mmp.main.ab.a();
        }
        if (!this.q) {
            this.j.a("reLaunch".equals(str2) ? "__appReLaunchStartTime" : "__appLaunchStartTime", String.valueOf(this.p));
        }
        this.ao = str3;
        b(jSONObject, i3);
        this.aw.a(a2);
        this.m.b(hashMap.get("pageNotFound") != null ? "mmp.page.count.page.notfound" : "mmp.page.count.page.view", (Map<String, Object>) com.meituan.mmp.lib.utils.v.a("page.path", str3));
        if (!MMPEnvHelper.getEnvInfo().isProdEnv()) {
            com.meituan.mmp.lib.trace.h hVar = this.m;
            Intent d2 = d();
            String str4 = this.x;
            Object[] objArr2 = {hVar, d2, str4, "ContainerController", str3};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.engine.t.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "072e682acf6eeedc1467809424216ad8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "072e682acf6eeedc1467809424216ad8");
            } else if (d2 != null && (data = d2.getData()) != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("URLScheme", new Uri.Builder().scheme(data.getScheme()).authority(data.getAuthority()).appendPath(ContainerInfo.ENV_MMP).appendQueryParameter("appId", str4).appendQueryParameter("targetPath", str3).build().toString());
                hashMap2.put("page", "com.meituan.mmp.ContainerController");
                hVar.b("urlscheme", (Map<String, Object>) hashMap2);
            }
        }
        com.meituan.mmp.main.ab.a();
    }

    @LaunchMode
    private String ac() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25636738c8d9631f61b0575748308fb3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25636738c8d9631f61b0575748308fb3");
        }
        if (this.s) {
            return LaunchMode.LAUNCH_MODE_REUSE;
        }
        switch (this.aj) {
            case PRELOAD_WEBVIEW:
                return LaunchMode.LAUNCH_MODE_PRELOAD_WEBVIEW;
            case PRELOAD:
                return LaunchMode.LAUNCH_MODE_PRELOAD;
            case PRELOAD_FOR_LAUNCH:
            case INITIAL:
                return LaunchMode.LAUNCH_MODE_COLD_LAUNCH;
            default:
                return LaunchMode.LAUNCH_MODE_COLD_LAUNCH;
        }
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5eb7bbfcfed0dc73d7e0f4207c5e57c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5eb7bbfcfed0dc73d7e0f4207c5e57c");
            return;
        }
        if (!this.q) {
            this.m.a("mmp.launch.duration.route.render");
            this.m.a("mmp.launch.duration.route.to.initial.data");
            this.m.a("mmp.launch.duration.service.ready.to.app.route", com.meituan.mmp.lib.utils.v.a("isSubPackagePrepared", Boolean.valueOf(this.h.n())));
            this.m.a("mmp.launch.duration.app.route.to.service.ready");
            this.m.c("mmp.launch.point.app.route");
        }
        this.m.a("mmp.launch.duration.route.render");
        a("onAppRoute", str, i);
        if (this.as) {
            return;
        }
        this.as = true;
        ag();
    }

    private boolean ad() {
        return this.Y && this.w && this.Z;
    }

    @MainThread
    private synchronized void b(final String str, final int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f4b31c4798cd7f8c2e2ba005252ae34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f4b31c4798cd7f8c2e2ba005252ae34");
            return;
        }
        this.aq.add(new Runnable() { // from class: com.meituan.mmp.lib.a.11
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9bc8bb9b853ca6b6652e714ee0b4565", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9bc8bb9b853ca6b6652e714ee0b4565");
                } else {
                    a.this.a(str, i);
                }
            }
        });
        if (ad()) {
            ae();
            return;
        }
        com.meituan.mmp.lib.trace.b.b("ContainerController", "onAppRoute cached, allPackageReady: " + this.Y + ", serviceReady: " + this.w + ", subPackageReady: " + this.Z);
    }

    @MainThread
    private synchronized void ae() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d5dc452c6c1c2b6b331415fcb24f734", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d5dc452c6c1c2b6b331415fcb24f734");
            return;
        }
        if (!this.ar) {
            com.meituan.mmp.lib.trace.b.b("ContainerController", "will sendPendingOnAppRoutes");
            this.ar = true;
        }
        for (Runnable runnable : this.aq) {
            runnable.run();
        }
        this.aq.clear();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4737f7a9cbf7e40a7e4f35cf2d6b697c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4737f7a9cbf7e40a7e4f35cf2d6b697c");
            return;
        }
        if (!this.N && !f() && !this.q && this.M && !com.meituan.mmp.main.fusion.c.c(this.x)) {
            com.meituan.mmp.lib.trace.b.a("ContainerController", "dealBackgroundStateAfterOnAppRoute", Boolean.valueOf(this.N), Boolean.valueOf(f()), Boolean.valueOf(this.M));
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void af() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f5eec45274331b29e03642e4d54cc12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f5eec45274331b29e03642e4d54cc12");
        } else if (ad()) {
            com.meituan.mmp.lib.executor.a.c(l.a(this));
        } else {
            com.meituan.mmp.lib.trace.b.b("ContainerController", "sendPendingOnAppRoutes but not ready: isAllPackageReady " + this.Y + " isServiceReady " + this.w + " isSubPackageLoaded " + this.Z);
        }
    }

    public static /* synthetic */ void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99fb0979154fb1ece81837befc9b00e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99fb0979154fb1ece81837befc9b00e7");
            return;
        }
        aVar.ae();
        az.b(MMPEnvHelper.getContext());
    }

    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d40ac442d011057666b76e019a936c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d40ac442d011057666b76e019a936c4");
        } else if (this.as) {
            b(map);
        } else {
            this.at.add(map);
        }
    }

    private void ag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e84394e500dc9d2c7faf08f7a41709b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e84394e500dc9d2c7faf08f7a41709b5");
            return;
        }
        for (Map<String, Object> map : this.at) {
            b(map);
        }
        this.at.clear();
    }

    private void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0aa0e9ea5ae0412282af8138de6c00d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0aa0e9ea5ae0412282af8138de6c00d4");
        } else {
            this.j.a("onWidgetDataChange", com.meituan.mmp.lib.utils.ac.b(com.meituan.mmp.lib.utils.v.a("widgetProperties", map)), this.k.b());
        }
    }

    @Override // com.meituan.mmp.lib.interfaces.c
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efbf372cbb8be49bee28612b6f63d9da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efbf372cbb8be49bee28612b6f63d9da");
            return;
        }
        com.meituan.mmp.lib.page.e e = this.k.e();
        com.meituan.mmp.lib.engine.t.a(this.m, str, str2, e != null ? e.getPagePath() : null);
        if (str2.equals("fatal")) {
            if (a()) {
                aj();
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e0a1b3e9796d8581f809451b0164017", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e0a1b3e9796d8581f809451b0164017");
                return;
            }
            String string = this.f.getString(R.string.mmp_fatal_error_msg);
            String string2 = this.f.getString(R.string.mmp_fatal_error_exit);
            String string3 = this.f.getString(R.string.mmp_fatal_error_retry);
            ModalDialog modalDialog = new ModalDialog(this.f);
            modalDialog.setCancelable(false);
            modalDialog.setCanceledOnTouchOutside(false);
            modalDialog.a((CharSequence) string);
            modalDialog.a(DiagnoseLog.COLOR_ERROR);
            modalDialog.a(string2, new View.OnClickListener() { // from class: com.meituan.mmp.lib.a.2
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2e986f617a3f3bf0f41f916b400df828", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2e986f617a3f3bf0f41f916b400df828");
                        return;
                    }
                    a.this.m.b("mmp.preload.point.fail", (Map<String, Object>) null);
                    a.this.h.b();
                    PackageManageUtil.a(a.this.g.c, a.this.x, null);
                    com.meituan.mmp.main.fusion.b.b(a.this.x, a.this.d());
                }
            });
            modalDialog.b("#FFC300");
            modalDialog.b(string3, new View.OnClickListener() { // from class: com.meituan.mmp.lib.a.3
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "10c799507d9ce1b2c7e00ea458cb483a", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "10c799507d9ce1b2c7e00ea458cb483a");
                        return;
                    }
                    a.this.m.b("mmp.stability.fatal.error.retry", (Map<String, Object>) null);
                    if (a.this.n != null) {
                        final Intent intent = a.this.f.getIntent();
                        intent.putExtra("disableReuseAny", true);
                        intent.removeExtra("reuseEngineId");
                        a.this.h.b();
                        PackageManageUtil.a(a.this.g.c, a.this.x, new PackageManageUtil.a() { // from class: com.meituan.mmp.lib.a.3.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.mmp.lib.update.PackageManageUtil.a
                            public final void a() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e8994b3f2fd8154c7babac3b30bdf769", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e8994b3f2fd8154c7babac3b30bdf769");
                                } else {
                                    a.this.f.startActivity(intent);
                                }
                            }
                        });
                    }
                    com.meituan.mmp.main.fusion.b.b(a.this.x, a.this.d());
                }
            });
            this.m.b("mmp.stability.fatal.error.notify", (Map<String, Object>) null);
            modalDialog.show();
        }
    }

    @Override // com.meituan.mmp.lib.interfaces.d
    public final void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8055594783bdd54ccd7cd0110bfe0f55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8055594783bdd54ccd7cd0110bfe0f55");
        } else {
            this.aw.a(str, str2, str3);
        }
    }

    public final void w() {
        com.meituan.mmp.lib.page.e e;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d4b686495ebfdbfe6a57a0e04efc81f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d4b686495ebfdbfe6a57a0e04efc81f");
            return;
        }
        if (this.k != null && (e = this.k.e()) != null) {
            e.d(0);
        }
        Activity activity = this.f;
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.utils.y.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "594d12572a0a28a6089cca180f59155f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "594d12572a0a28a6089cca180f59155f");
        } else if (activity != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getApplication().getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus instanceof EditText) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    @Override // com.meituan.mmp.lib.api.input.f
    public final void a(int i, int i2) {
        int i3;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d82340c7edc9d4af8ed86150d9e387e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d82340c7edc9d4af8ed86150d9e387e6");
            return;
        }
        for (com.meituan.mmp.lib.api.input.f fVar : this.G) {
            fVar.a(i, i2);
        }
        Activity activity = this.f;
        if (i != 0) {
            int a2 = az.a(activity);
            i3 = (a2 != 0 || Build.VERSION.SDK_INT < 23 || activity == null || activity.getWindow() == null) ? a2 : activity.getWindow().getDecorView().getRootWindowInsets().getSystemWindowInsetBottom();
        } else {
            i3 = 0;
        }
        a("onGlobalKeyboardHeightChange", com.meituan.mmp.lib.utils.ac.a("height", Integer.valueOf(com.meituan.mmp.lib.utils.p.b(i - i3))).toString(), 0);
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fd800476098b4bcd20bee61254a2215", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fd800476098b4bcd20bee61254a2215");
            return;
        }
        com.meituan.mmp.lib.api.input.g gVar = aVar.ad;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.api.input.g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "a2dd53a6391c40ce26366e04e751cd9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "a2dd53a6391c40ce26366e04e751cd9b");
        } else if (gVar.isShowing() || gVar.d.getWindowToken() == null || gVar.b == null || gVar.b.isFinishing()) {
        } else {
            gVar.setBackgroundDrawable(new ColorDrawable(0));
            try {
                com.sankuai.waimai.platform.utils.p.a(gVar, gVar.d, 0, 0, 0);
            } catch (Exception e) {
                com.meituan.mmp.lib.trace.b.a("KeyboardHeightProvider", e);
            }
            Rect rect = new Rect();
            gVar.d.getWindowVisibleDisplayFrame(rect);
            gVar.e = rect.height();
        }
    }

    public final void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbb9d39881274b6d618637af4ce71af3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbb9d39881274b6d618637af4ce71af3");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.y = str;
            this.z = str2;
            this.E = 1038;
        }
    }

    public final String x() {
        return this.A;
    }

    public final ab y() {
        return this.k;
    }

    public final com.meituan.mmp.lib.devtools.g z() {
        return this.l;
    }

    public final String A() {
        return this.x;
    }

    public final boolean B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "659f864d2f941335a06ce63b9a7247bf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "659f864d2f941335a06ce63b9a7247bf")).booleanValue() : this.h != null && this.h.h();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.a$12  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass12 extends com.meituan.mmp.lib.engine.g {
        public static ChangeQuickRedirect a;

        public AnonymousClass12() {
        }

        @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
        public final void a(MMPAppProp mMPAppProp) {
            Object[] objArr = {mMPAppProp};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdcc9aad0730dbfcdbd404280223f61c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdcc9aad0730dbfcdbd404280223f61c");
                return;
            }
            com.meituan.mmp.lib.trace.b.b("ContainerController", "onAppPropUpdated");
            a.this.m.a("isFusion", a.this.h.i().b().get("isFusion"));
            a.this.a(mMPAppProp);
        }

        @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
        public final void a(List<MMPPackageInfo> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6ef2c2218975375b3ba2516e6c1fcb2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6ef2c2218975375b3ba2516e6c1fcb2");
                return;
            }
            com.meituan.mmp.lib.trace.b.b("ContainerController", "onAllPackagePrepared");
            Map<String, Object> b = a.this.h.i().b();
            a.this.m.a("needDownloadPackages", b.get("needDownloadPackages"));
            a.this.m.a("checkUpdateMode", b.get("checkUpdateMode"));
            a.this.m.c("mmp.launch.point.prepare.files");
            com.meituan.mmp.lib.engine.t.a(a.this.m, a.this.n, list);
            com.meituan.mmp.lib.executor.a.d(m.a(this, list));
        }

        public static /* synthetic */ void a(AnonymousClass12 anonymousClass12, List list) {
            boolean z = false;
            Object[] objArr = {anonymousClass12, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dc4b9ab0ce14101c5181fd6c8564f6a9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dc4b9ab0ce14101c5181fd6c8564f6a9");
                return;
            }
            com.meituan.mmp.lib.trace.b.c("ContainerController", "onAllPackagePrepared run");
            Trace.beginSection("onAllPackagePrepared");
            a.b(a.this, true);
            if (com.meituan.mmp.lib.utils.h.a(list) || list.get(0) == null) {
                a.a(a.this, true);
            }
            a aVar = a.this;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0a11c5128ce1807fe98a8844db8451ef", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0a11c5128ce1807fe98a8844db8451ef")).booleanValue();
            } else if (aVar.n != null) {
                z = aVar.n.isDebug();
            }
            if ((z || DebugHelper.b()) && com.meituan.mmp.lib.devtools.j.a() != null) {
                a.this.l = com.meituan.mmp.lib.devtools.j.a().a();
                a.this.g.n = a.this.l;
            }
            if (a.this.ai && a.this.w) {
                a.this.J();
            }
            a.this.af();
            if (!a.this.s) {
                a.this.K();
            }
            if (a.this.n != null) {
                com.meituan.mmp.lib.trace.a.a().b(a.this.n.appid, a.this.n.version);
            }
            Trace.endSection();
        }

        @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "231554829f11b8d31565facdc3788e1e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "231554829f11b8d31565facdc3788e1e");
                return;
            }
            a.this.m.a("mmp.launch.duration.service.ready.to.app.route");
            if (a.this.Y && a.this.Z) {
                a.this.m.b("mmp.launch.duration.load.service");
            }
            com.meituan.mmp.lib.executor.a.c(n.a(this));
        }

        public static /* synthetic */ void a(AnonymousClass12 anonymousClass12) {
            Object[] objArr = {anonymousClass12};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0b9b330eeb55368e71caad5f51f9c5de", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0b9b330eeb55368e71caad5f51f9c5de");
                return;
            }
            com.meituan.mmp.lib.trace.b.b("ContainerController", "onServiceReady() run");
            a.this.w = true;
            if (a.this.ai && a.this.Y) {
                a.this.J();
            }
            if (a.this.u) {
                a.this.aw.b(com.meituan.mmp.lib.utils.ac.a("appServiceId", "as_" + a.this.j.hashCode()));
                a.this.r();
            } else {
                a.this.t();
            }
            a.this.af();
        }

        @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
        public final void a(MMPPackageInfo mMPPackageInfo, boolean z) {
            Object[] objArr = {mMPPackageInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3df89bb68cee1b1ed72799d5d1d874fb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3df89bb68cee1b1ed72799d5d1d874fb");
                return;
            }
            com.meituan.mmp.lib.trace.b.c("ContainerController", "onPackageLoadSuccess: " + mMPPackageInfo.g);
            if (mMPPackageInfo.f() && z && !a.this.Z) {
                a.a(a.this, true);
                if (a.this.Z && a.this.Y && a.this.w) {
                    a.this.m.b("mmp.launch.duration.load.service");
                }
                a.this.af();
            }
        }

        @Override // com.meituan.mmp.lib.engine.g, com.meituan.mmp.lib.engine.c
        public final void a(String str, Exception exc) {
            Object[] objArr = {str, exc};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2b8787816c0d889c85f0e75ec0d1d7d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2b8787816c0d889c85f0e75ec0d1d7d");
                return;
            }
            a.u(a.this);
            if (a.this.a()) {
                a.this.d(str);
                return;
            }
            a aVar = a.this;
            Object[] objArr2 = {str, exc};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a15341b7a5a9b5af98a078153ae87e42", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a15341b7a5a9b5af98a078153ae87e42");
            } else if (aVar.e.f()) {
                ((HeraActivity) aVar.e).a(str, exc);
            } else {
                aVar.a(str, exc);
            }
        }
    }

    private boolean ah() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0be9ffc9276c556367e5c69ef30b725e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0be9ffc9276c556367e5c69ef30b725e")).booleanValue();
        }
        this.C = f(this.B);
        this.m.a("page.path", (Object) this.C);
        return this.i.c(this.C);
    }

    private String f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2590225ab2ac78d7555d2c99786b441", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2590225ab2ac78d7555d2c99786b441");
        }
        if (str == null) {
            str = this.i.i();
        }
        return (this.i.c(str) || ai()) ? str : this.i.i();
    }

    private boolean ai() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "904cb21675dfeb079792ea5511378b52", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "904cb21675dfeb079792ea5511378b52")).booleanValue();
        }
        MMPAppProp mMPAppProp = this.i.l;
        return (mMPAppProp == null || mMPAppProp.isEmpty() || TextUtils.isEmpty(mMPAppProp.mmpSdk.d) || bd.a(mMPAppProp.mmpSdk.d, "5.14") < 0) ? false : true;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13061e26a0978767ba8d2bec2d8af1c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13061e26a0978767ba8d2bec2d8af1c9");
        } else if (i == 5 || i == 10 || i == 15) {
            a("onMemoryWarning", com.meituan.mmp.lib.utils.ac.a("level", Integer.valueOf(i)).toString(), 0);
            if (this.m != null) {
                this.m.b("mmp.stability.count.memory.warning", (Map<String, Object>) com.meituan.mmp.lib.utils.v.a("page.path", this.ao, "engineType", this.ap, "level", Integer.valueOf(i), "isForeground", Boolean.valueOf(f())));
            }
        }
    }

    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd831258a978a8104c1478d17badd53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd831258a978a8104c1478d17badd53");
            return;
        }
        this.ag = str;
        if (this.m != null) {
            this.m.b(str, "native");
        }
    }

    private void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "920499546faa81ea166094fda8605fd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "920499546faa81ea166094fda8605fd1");
        } else {
            this.k.a(this.C, str);
        }
    }

    public final void C() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28ddcc55120584b6ad43f56c04c8a9dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28ddcc55120584b6ad43f56c04c8a9dc");
            return;
        }
        try {
            if (((com.meituan.mmp.lib.devtools.c) Class.forName("com.meituan.mmp.dev.devtools.ui.DebugView").getDeclaredConstructor(Context.class).newInstance(this.f)) != null) {
                com.meituan.mmp.lib.utils.z.b(d(), "checkUpdateUrl");
                com.meituan.mmp.lib.utils.z.b(d(), "description");
                com.meituan.mmp.lib.mp.a e = com.meituan.mmp.lib.mp.a.e();
                StringBuilder sb = new StringBuilder("MMP[");
                sb.append(e == null ? "" : e.g);
                sb.append("]\n业务:");
                sb.append(this.i.g());
                sb.append("\n基础库:");
                sb.append(this.i.l.mmpSdk.d);
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            e2.printStackTrace();
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41e157c749237bc402751807cdbdeef3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41e157c749237bc402751807cdbdeef3");
        }
        String str = "ContainerController{" + Integer.toHexString(hashCode());
        if (a()) {
            return str + " widget in activity: " + this.f + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
        }
        return str + " for activity: " + this.f + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class b {
        public static ChangeQuickRedirect a;
        private JSONObject c;
        private JSONObject d;

        public final void c(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e95173b3ba1db9a235228a189c5213b7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e95173b3ba1db9a235228a189c5213b7");
            }
        }

        private b() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58aece5ac59826ace4ce5f11cb54d74f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58aece5ac59826ace4ce5f11cb54d74f");
            }
        }

        public final void a(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c47c570facc3afbbada8407ceab53b4e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c47c570facc3afbbada8407ceab53b4e");
            } else if (MMPEnvHelper.getEnvInfo().isProdEnv() || a.this.g.m != null) {
            } else {
                this.c = jSONObject;
            }
        }

        public final void b(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f59f6ea14ee7d75724e3464a46f81e1f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f59f6ea14ee7d75724e3464a46f81e1f");
            } else if (MMPEnvHelper.getEnvInfo().isProdEnv()) {
            } else {
                if (a.this.g.m != null) {
                    com.meituan.mmp.lib.engine.e eVar = a.this.j;
                    String format = String.format("document.title = '%s@mmp-service';", a.this.A());
                    Object[] objArr2 = {"devTool", format, null};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.engine.e.a;
                    if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "354647f7a0e48cb7921c2ab123b33c31", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "354647f7a0e48cb7921c2ab123b33c31");
                        return;
                    }
                    IServiceEngine iServiceEngine = eVar.c;
                    iServiceEngine.evaluateJavascript("eval: devTool", format, null);
                    return;
                }
                this.d = jSONObject;
            }
        }

        public final void a(String str, String str2, String str3) {
            Object[] objArr = {str, str2, str3};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0608b4537f59e2fd131db088d95cb28", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0608b4537f59e2fd131db088d95cb28");
            } else if (a.this.g.m != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("method", "MMP.debuggerPageStart");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("path", str2);
                    jSONObject2.put("openType", str);
                    jSONObject2.put("pageFrameId", "page_" + str3);
                    jSONObject.put("params", jSONObject2);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final void D() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea25b390a79c7c65bfd8159b4196c80f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea25b390a79c7c65bfd8159b4196c80f");
        } else if (this.ab == 0) {
            this.ab = SystemClock.elapsedRealtime();
            if (this.ac != null) {
                this.m.a("mmp.launch.point.full.first.render.v2", Math.max(this.ab, ((Long) this.ac.get("firstRenderTime")).longValue()) - this.o, this.ac);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6defd753d0b0378f439071383e2ab7c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6defd753d0b0378f439071383e2ab7c9");
            return;
        }
        TextView textView = (TextView) b(R.id.failTip);
        if (textView != null) {
            textView.setVisibility(0);
            if (!(this.e instanceof MMPWidgetFragment) || ((MMPWidgetFragment) this.e).m() == null) {
                return;
            }
            textView.setBackgroundColor(com.meituan.mmp.lib.utils.i.a("#ffd100"));
            textView.setText("网络不好,重试一下");
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.mmp.lib.a.4
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c41b1f5e6333bbb00b5fb62d02acbb39", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c41b1f5e6333bbb00b5fb62d02acbb39");
                    } else if (a.this.h != null) {
                        a.this.h.w = true;
                        if (a.this.e instanceof MMPWidgetFragment) {
                            ((MMPWidgetFragment) a.this.e).k();
                            com.meituan.mmp.lib.trace.b.a(a.this.toString(), "AppId: %s, widget fail retry ", a.this.A());
                        }
                    }
                }
            });
        }
    }

    private boolean ak() {
        boolean z = this.Q;
        this.Q = false;
        return z;
    }

    public final String F() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "48071082630479ce8cb54cf78fd72afb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "48071082630479ce8cb54cf78fd72afb") : this.e.f() ? "" : ((MMPWidgetFragment) this.e).n();
    }

    private boolean G() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a0b2ee319560321b244ef91d5b1ad7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a0b2ee319560321b244ef91d5b1ad7")).booleanValue() : this.e.f();
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c10ed3cac393a61f571b4e23f7be1bc1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c10ed3cac393a61f571b4e23f7be1bc1")).booleanValue() : this.f.isFinishing();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.mmp.lib.a.a
            java.lang.String r10 = "2570ca5818d52631bc3f53528be0f4f8"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L18
            com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            return
        L18:
            java.lang.String r1 = "gh_84b9766b95bc"
            java.lang.String r2 = r11.x
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            r2 = 1
            if (r1 == 0) goto L43
            android.content.Intent r1 = r11.d()
            java.lang.String r3 = "forbidHide"
            boolean r1 = com.meituan.mmp.lib.utils.z.a(r1, r3, r0)
            if (r1 == 0) goto L3c
            boolean r1 = r11.O
            if (r1 == 0) goto L3c
            boolean r1 = r11.a()
            if (r1 != 0) goto L3c
            goto L44
        L3c:
            boolean r1 = r11.R
            if (r1 == 0) goto L43
            r11.R = r0
            goto L44
        L43:
            r2 = 0
        L44:
            boolean r1 = r11.w
            if (r1 == 0) goto L87
            com.meituan.mmp.lib.api.h r1 = r11.S
            r1.c()
            boolean r1 = r11.G()
            if (r1 == 0) goto L57
            java.lang.String r1 = "onAppEnterBackground"
            goto L5a
        L57:
            java.lang.String r1 = "onWidgetEnterBackground"
        L5a:
            boolean r3 = r11.ak()
            if (r3 != 0) goto L87
            java.lang.String r3 = "ContainerController"
            com.meituan.mmp.lib.trace.b.b(r3, r1)
            com.meituan.mmp.lib.engine.m r3 = r11.g
            r3.x = r0
            java.lang.String r0 = "mode"
            java.lang.String r3 = "hang"
            java.lang.String r4 = "forbidHide"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.util.HashMap r0 = com.meituan.mmp.lib.utils.v.a(r0, r3, r4, r2)
            java.lang.String r0 = com.meituan.mmp.lib.utils.ac.b(r0)
            com.meituan.mmp.lib.ab r2 = r11.k
            int r2 = r2.b()
            r11.a(r1, r0, r2)
        L87:
            com.meituan.mmp.lib.ab r0 = r11.k
            com.meituan.mmp.lib.page.e r0 = r0.e()
            if (r0 == 0) goto L9b
            boolean r1 = r11.O
            if (r1 == 0) goto L96
            r1 = 17
            goto L98
        L96:
            r1 = 16
        L98:
            r0.b(r1)
        L9b:
            r11.U()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.a.t():void");
    }

    public final void E() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d90cc754260f206ff338a0bd136b1fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d90cc754260f206ff338a0bd136b1fb");
            return;
        }
        Activity activity = this.f;
        String str = this.x;
        String str2 = this.K;
        Object[] objArr2 = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = aj.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8b2e66b6266a6a766e1817ccb9bc5535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8b2e66b6266a6a766e1817ccb9bc5535");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("broadcast.action.mmp.destroy");
        if (!TextUtils.isEmpty(str2)) {
            intent.putExtra("navigateBackNativeInfo", str2);
        }
        aj.a(activity, intent, str);
    }

    public static /* synthetic */ void a(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "524bda19a3d4e88a16183c329f723e82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "524bda19a3d4e88a16183c329f723e82");
        } else if (aVar.f.isFinishing() || aVar.g()) {
        } else {
            com.meituan.mmp.lib.executor.a.a(d.a(aVar, str));
            if (aVar.f()) {
                com.meituan.mmp.lib.trace.b.b("ContainerController", "cache one AppPage after first render");
                com.meituan.mmp.lib.engine.d dVar = aVar.g.i;
                Context context = MMPEnvHelper.getContext();
                Object[] objArr2 = {context, str};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.mmp.lib.engine.d.a;
                if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "dab94eea6c0934a0a7c8c4f836ba8de3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "dab94eea6c0934a0a7c8c4f836ba8de3");
                } else if (dVar.f) {
                } else {
                    com.meituan.mmp.lib.trace.b.b("AppPageManager", "cacheAppPageForNextPage, curr: " + str);
                    dVar.a(context, dVar.c.n(str), (com.meituan.mmp.lib.trace.h) null, (com.meituan.mmp.lib.engine.v) null);
                }
            }
        }
    }
}
