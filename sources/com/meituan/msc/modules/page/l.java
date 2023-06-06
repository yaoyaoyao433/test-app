package com.meituan.msc.modules.page;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.meituan.msc.common.lib.IWhiteScreenCheckReporter;
import com.meituan.msc.common.utils.ab;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.common.utils.av;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.common.utils.az;
import com.meituan.msc.common.utils.t;
import com.meituan.msc.common.utils.x;
import com.meituan.msc.devsupport.perf.RenderPerf;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.api.auth.AboutDialog;
import com.meituan.msc.modules.api.legacy.appstate.WidgetListener;
import com.meituan.msc.modules.api.msi.api.PullDownRefreshParam;
import com.meituan.msc.modules.api.report.MSCReportBizTagsManager;
import com.meituan.msc.modules.container.u;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.page.view.CoverViewWrapper;
import com.meituan.msc.modules.page.view.CustomNavigationBar;
import com.meituan.msc.modules.page.view.coverview.CoverViewRootContainer;
import com.meituan.msc.modules.page.view.d;
import com.meituan.msc.modules.page.widget.e;
import com.meituan.msc.util.perf.PerfEventRecorder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class l extends com.meituan.msc.modules.page.a implements com.meituan.msc.modules.api.input.c, com.meituan.msc.modules.api.msi.webview.d, com.meituan.msc.modules.page.transition.a, d.a {
    private static final Handler F = new Handler(Looper.getMainLooper());
    public static ChangeQuickRedirect h;
    private static int x;
    private boolean A;
    private boolean B;
    private int C;
    private long D;
    private com.meituan.msc.modules.page.view.coverview.a E;
    private a G;
    private HashMap<String, Object> H;
    private com.meituan.msc.modules.page.render.a I;
    private boolean J;
    private boolean K;
    private boolean L;
    e i;
    protected com.meituan.msc.modules.page.view.d j;
    public long k;
    protected boolean l;
    public boolean m;
    public com.meituan.msc.modules.api.input.textarea.e n;
    public LayoutTransition o;
    public LayoutTransition p;
    public boolean q;
    public boolean r;
    public CustomNavigationBar.a s;
    private String t;
    private h u;
    private int v;
    private boolean w;
    private final ConcurrentHashMap<String, com.meituan.msc.modules.api.input.textarea.c> y;
    private com.meituan.msc.modules.api.input.a z;

    @Override // com.meituan.msc.modules.page.a
    public final l getPage() {
        return this;
    }

    public static /* synthetic */ int a(l lVar, int i) {
        lVar.C = 0;
        return 0;
    }

    public static /* synthetic */ void a(l lVar, com.meituan.msc.modules.page.view.d dVar, u uVar) {
        Object[] objArr = {dVar, uVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "c119883db9a6069a104e7c5b921696b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "c119883db9a6069a104e7c5b921696b5");
            return;
        }
        Object[] objArr2 = {uVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "1bd0ad42d129bf50b84eb4850ab432dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "1bd0ad42d129bf50b84eb4850ab432dd");
        } else {
            dVar.h.b(uVar);
        }
        String substring = Uri.parse("msc://www.meituan.com/" + uVar.a).getPath().substring(1);
        if (!substring.endsWith(".html")) {
            substring = substring + ".html";
        }
        String substring2 = substring.substring(0, substring.length() - 5);
        com.meituan.msc.modules.reporter.g.d("Page", "Page file path :" + substring);
        dVar.a(substring2);
        dVar.setNavigationBarButtonClickListener(lVar.s);
        boolean i = lVar.c.r.i(substring2);
        dVar.setRefreshEnable(i);
        com.meituan.msc.modules.page.widget.d refreshLayout = dVar.getRefreshLayout();
        if (refreshLayout != null) {
            refreshLayout.setEnabled(i);
        }
    }

    public static /* synthetic */ int d(l lVar) {
        int i = lVar.C + 1;
        lVar.C = i;
        return i;
    }

    public l(com.meituan.msc.modules.engine.h hVar, com.meituan.msc.modules.container.p pVar, com.meituan.msc.common.framework.interfaces.b bVar, String str, h hVar2, @Nullable int i, boolean z) {
        super(hVar, pVar, bVar, z);
        final com.meituan.msc.modules.page.view.d dVar;
        int i2;
        boolean z2;
        int intValue;
        Object[] objArr = {hVar, pVar, bVar, str, hVar2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8900feac72a054eb16478d4cb1bbe52c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8900feac72a054eb16478d4cb1bbe52c");
            return;
        }
        this.w = false;
        this.y = new ConcurrentHashMap<>();
        this.A = false;
        this.C = 0;
        this.q = true;
        this.s = new CustomNavigationBar.a() { // from class: com.meituan.msc.modules.page.l.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.page.view.CustomNavigationBar.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ae1f908e45ce04b74f68850956f9ab5c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ae1f908e45ce04b74f68850956f9ab5c");
                    return;
                }
                int viewId = l.this.j.getViewId();
                JSONObject jSONObject = new JSONObject();
                try {
                    if (l.this.j != null && l.this.j.m != null) {
                        View view = l.this.j.m.get();
                        if (view instanceof com.meituan.msc.modules.api.msi.webview.m) {
                            jSONObject.put("webViewUrl", ((com.meituan.msc.modules.api.msi.webview.m) view).getUrl());
                        }
                    }
                    jSONObject.put("from", "menu");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                ((PageListener) l.this.c.a(PageListener.class)).onShare(jSONObject, viewId);
            }

            @Override // com.meituan.msc.modules.page.view.CustomNavigationBar.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "800535fc36949929adf37a110a9dc255", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "800535fc36949929adf37a110a9dc255");
                    return;
                }
                l.this.k();
                ((Activity) l.this.d).onBackPressed();
            }

            @Override // com.meituan.msc.modules.page.view.CustomNavigationBar.a
            public final void c() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33c6160df66b2ba266d94cf70d8fa4d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33c6160df66b2ba266d94cf70d8fa4d8");
                    return;
                }
                l.this.f();
                l.this.e.q();
                com.meituan.msc.modules.reporter.g.d("Page", "Page clickClose");
            }

            @Override // com.meituan.msc.modules.page.view.CustomNavigationBar.a
            public final void d() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff58df4c039ef7132feb9512515aeb7b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff58df4c039ef7132feb9512515aeb7b");
                    return;
                }
                AboutDialog aboutDialog = new AboutDialog(l.this.getContext(), l.this.c.r);
                aboutDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.meituan.msc.modules.page.l.5.1
                    public static ChangeQuickRedirect a;

                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Object[] objArr3 = {dialogInterface};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "75b1fe62dce40d95a5fb78bf699f8c7c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "75b1fe62dce40d95a5fb78bf699f8c7c");
                        } else {
                            ((com.meituan.msc.modules.api.legacy.appstate.a) l.this.c.c(com.meituan.msc.modules.api.legacy.appstate.a.class)).a((String) null, 0, true ^ l.this.g);
                        }
                    }
                });
                ((com.meituan.msc.modules.api.legacy.appstate.a) l.this.c.c(com.meituan.msc.modules.api.legacy.appstate.a.class)).b("{\"mode\":\"hang\"}", 0, !l.this.g);
                aboutDialog.show();
            }

            @Override // com.meituan.msc.modules.page.view.CustomNavigationBar.a
            public final void e() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "644b228da160fae7c6b2feef1b039f71", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "644b228da160fae7c6b2feef1b039f71");
                    return;
                }
                if (l.this.i.n() != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - l.this.D <= ViewConfiguration.getDoubleTapTimeout()) {
                        l.this.i.n().m();
                    }
                    l.this.D = elapsedRealtime;
                }
                if (MSCEnvHelper.getEnvInfo().isProdEnv() || l.d(l.this) <= 4) {
                    return;
                }
                l.a(l.this, 0);
                String str2 = "小程序版本号:" + l.this.c.r.w() + "\n 基础库版本号：" + l.this.c.r.n();
                Object[] objArr3 = {str2, 0};
                ChangeQuickRedirect changeQuickRedirect3 = aw.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fa8f2bb8e98d86a5cb8ed723dcc891ee", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fa8f2bb8e98d86a5cb8ed723dcc891ee");
                    return;
                }
                aw.a(0, 2, str2);
                com.meituan.msc.modules.reporter.g.b("toastWithDuration", str2);
            }
        };
        this.k = System.currentTimeMillis();
        this.u = hVar2;
        Context context = this.d;
        Object[] objArr2 = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e44986dc8e32123c534196ffc3e7b7d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e44986dc8e32123c534196ffc3e7b7d4");
        } else {
            boolean z3 = this.b;
            Object[] objArr3 = {context, str, (byte) 1, Integer.valueOf(i), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect3 = h;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6f42dff2acc43aee349a7a65de206fce", RobustBitConfig.DEFAULT_VALUE)) {
                dVar = (com.meituan.msc.modules.page.view.d) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6f42dff2acc43aee349a7a65de206fce");
            } else {
                com.meituan.msc.modules.page.view.d dVar2 = new com.meituan.msc.modules.page.view.d(context);
                dVar2.o = i;
                dVar2.p = this;
                dVar2.setTag(str);
                this.j = dVar2;
                Map<String, String> a2 = a(str);
                com.meituan.msc.modules.page.render.d a3 = a(str, z3, a2);
                Object[] objArr4 = {str, a3, dVar2, a2};
                ChangeQuickRedirect changeQuickRedirect4 = h;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "5431492c89e3c7fd590e686662f35c75", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "5431492c89e3c7fd590e686662f35c75");
                    dVar = dVar2;
                } else {
                    com.meituan.msc.modules.engine.h hVar3 = this.c;
                    boolean z4 = this.g;
                    boolean z5 = this.b;
                    final e.c cVar = new e.c() { // from class: com.meituan.msc.modules.page.l.6
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.modules.page.widget.e.c
                        public final boolean a(MotionEvent motionEvent) {
                            Object[] objArr5 = {motionEvent};
                            ChangeQuickRedirect changeQuickRedirect5 = a;
                            return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8b0640645dde4eab79675184781a99e6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8b0640645dde4eab79675184781a99e6")).booleanValue() : l.this.i();
                        }
                    };
                    Object[] objArr5 = {hVar3, a3, str, Byte.valueOf(z4 ? (byte) 1 : (byte) 0), Byte.valueOf(z5 ? (byte) 1 : (byte) 0), cVar};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.page.view.d.a;
                    dVar = dVar2;
                    if (PatchProxy.isSupport(objArr5, dVar2, changeQuickRedirect5, false, "5f8fa6c75c7f1b60dc98ef8fb9b59bb5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect5, false, "5f8fa6c75c7f1b60dc98ef8fb9b59bb5");
                        i2 = -1;
                    } else {
                        dVar.n = true;
                        dVar.i = hVar3;
                        dVar.j = z4;
                        dVar.q = z5;
                        dVar.r = str;
                        dVar.k = hVar3.r.l(str);
                        int c = com.meituan.msc.common.utils.n.c();
                        Context context2 = dVar.getContext();
                        dVar.g = new com.meituan.msc.modules.page.widget.d(context2, new e.c() { // from class: com.meituan.msc.modules.page.view.d.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.msc.modules.page.widget.e.c
                            public final boolean a(MotionEvent motionEvent) {
                                Object[] objArr6 = {motionEvent};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                return PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "b143ef5cf0a0bc0785def5f3347d2029", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "b143ef5cf0a0bc0785def5f3347d2029")).booleanValue() : cVar.a(motionEvent);
                            }
                        });
                        dVar.setupAppPage(a3);
                        if (z4) {
                            i2 = -1;
                            dVar.addView(dVar.g, new FrameLayout.LayoutParams(-1, -1));
                        } else {
                            i2 = -1;
                            if (dVar.k) {
                                dVar.addView(dVar.g, new FrameLayout.LayoutParams(-1, -1));
                            } else {
                                dVar.f = new View(context2);
                                dVar.addView(dVar.f, new FrameLayout.LayoutParams(-1, c));
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                                layoutParams.topMargin = c;
                                FrameLayout frameLayout = new FrameLayout(context2);
                                dVar.addView(frameLayout, layoutParams);
                                frameLayout.addView(dVar.g, -1, -1);
                            }
                        }
                    }
                    com.meituan.msc.modules.page.widget.d refreshLayout = dVar.getRefreshLayout();
                    boolean i3 = this.c.r.i(str);
                    dVar.setRefreshEnable(i3);
                    refreshLayout.setEnabled(i3);
                    com.meituan.msc.modules.update.f fVar = this.c.r;
                    Object[] objArr6 = {str};
                    ChangeQuickRedirect changeQuickRedirect6 = com.meituan.msc.modules.update.f.a;
                    if (PatchProxy.isSupport(objArr6, fVar, changeQuickRedirect6, false, "6615d017cb4203cfc1bcd98eb6ec0c32", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr6, fVar, changeQuickRedirect6, false, "6615d017cb4203cfc1bcd98eb6ec0c32")).booleanValue();
                    } else {
                        com.meituan.msc.modules.update.a aVar = fVar.U_().s;
                        Object[] objArr7 = {str};
                        ChangeQuickRedirect changeQuickRedirect7 = com.meituan.msc.modules.update.a.a;
                        if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "e46698c413f2859e2e8b464b7f583aa6", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "e46698c413f2859e2e8b464b7f583aa6")).booleanValue();
                        } else {
                            z2 = !"light".equals(aVar.b(str, "backgroundTextStyle"));
                        }
                    }
                    refreshLayout.setBackgroundTextStyle(z2);
                    refreshLayout.setOnRefreshListener(new e.a() { // from class: com.meituan.msc.modules.page.l.7
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.modules.page.widget.e.a
                        public final void a() {
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "cde3a9ecfd4b4d30f815e2b0a2de2b05", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "cde3a9ecfd4b4d30f815e2b0a2de2b05");
                                return;
                            }
                            com.meituan.msc.modules.reporter.g.d("Page", "start onPullDownRefresh");
                            l lVar = l.this;
                            PullDownRefreshParam pullDownRefreshParam = new PullDownRefreshParam(l.this.getViewId());
                            Object[] objArr9 = {"onPullDownRefresh", pullDownRefreshParam};
                            ChangeQuickRedirect changeQuickRedirect9 = l.h;
                            if (PatchProxy.isSupport(objArr9, lVar, changeQuickRedirect9, false, "bc7c14b05972ed1f566bdc1074b8f248", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, lVar, changeQuickRedirect9, false, "bc7c14b05972ed1f566bdc1074b8f248");
                            } else {
                                lVar.c.m.a("onPullDownRefresh", pullDownRefreshParam);
                            }
                        }
                    });
                    dVar.setNavigationBarButtonClickListener(this.s);
                    if (!this.b) {
                        dVar.setSwipeListener(this);
                    }
                    com.meituan.msc.modules.update.f fVar2 = this.c.r;
                    Object[] objArr8 = {str};
                    ChangeQuickRedirect changeQuickRedirect8 = com.meituan.msc.modules.update.f.a;
                    if (PatchProxy.isSupport(objArr8, fVar2, changeQuickRedirect8, false, "25dae93e9437cc7e9ed785a28695bd8a", RobustBitConfig.DEFAULT_VALUE)) {
                        intValue = ((Integer) PatchProxy.accessDispatch(objArr8, fVar2, changeQuickRedirect8, false, "25dae93e9437cc7e9ed785a28695bd8a")).intValue();
                    } else {
                        com.meituan.msc.modules.update.a aVar2 = fVar2.U_().s;
                        Object[] objArr9 = {str};
                        ChangeQuickRedirect changeQuickRedirect9 = com.meituan.msc.modules.update.a.a;
                        if (PatchProxy.isSupport(objArr9, aVar2, changeQuickRedirect9, false, "090e4d88ba27a0a7ca1235d012ab2116", RobustBitConfig.DEFAULT_VALUE)) {
                            intValue = ((Integer) PatchProxy.accessDispatch(objArr9, aVar2, changeQuickRedirect9, false, "090e4d88ba27a0a7ca1235d012ab2116")).intValue();
                        } else {
                            String b = aVar2.b(str, "backgroundColor");
                            Object[] objArr10 = {b, Integer.valueOf(i2)};
                            ChangeQuickRedirect changeQuickRedirect10 = com.meituan.msc.common.utils.g.a;
                            intValue = PatchProxy.isSupport(objArr10, null, changeQuickRedirect10, true, "b4207a7272dcdd9ac86154169cc0a78c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr10, null, changeQuickRedirect10, true, "b4207a7272dcdd9ac86154169cc0a78c")).intValue() : com.meituan.msc.common.utils.g.a(b, i2);
                        }
                    }
                    dVar.setBackgroundColor(intValue);
                    o oVar = new o(a3, dVar, this.u, str, this);
                    oVar.f = this.g;
                    oVar.j = new k(this, refreshLayout);
                    oVar.l = a2;
                    this.c.b().a(oVar, e.class);
                    this.i = oVar;
                    addView(dVar, new ViewGroup.LayoutParams(i2, i2));
                    m();
                }
            }
            i2 = -1;
            addView(dVar, new ViewGroup.LayoutParams(i2, i2));
            m();
        }
        this.t = str;
        com.meituan.msc.modules.page.render.d renderer = this.j.getRenderer();
        long j = this.k;
        Object[] objArr11 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect11 = com.meituan.msc.modules.page.render.d.a;
        if (PatchProxy.isSupport(objArr11, renderer, changeQuickRedirect11, false, "64b481f11ddc73feeb871c7f4b0d0d10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr11, renderer, changeQuickRedirect11, false, "64b481f11ddc73feeb871c7f4b0d0d10");
        } else if (!renderer.k.e) {
            renderer.k.h.a = j;
        }
        this.y.clear();
    }

    public final void setContainerReporter(com.meituan.msc.modules.container.n nVar) {
        long j;
        RenderPerf renderPerf;
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f0d5934ffad079232858b129659fdab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f0d5934ffad079232858b129659fdab");
            return;
        }
        com.meituan.msc.modules.page.render.d n = this.i.n();
        Object[] objArr2 = {nVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.render.d.a;
        if (PatchProxy.isSupport(objArr2, n, changeQuickRedirect2, false, "695999318b0748a882350ad245446efc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, n, changeQuickRedirect2, false, "695999318b0748a882350ad245446efc");
            return;
        }
        n.k.d = nVar;
        com.meituan.msc.modules.page.render.a aVar = n.k.j;
        Object[] objArr3 = {(byte) 1, nVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.page.render.a.d;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "6a017af7bfb08f7c2176f9c7644c48bb", RobustBitConfig.DEFAULT_VALUE)) {
            com.meituan.msc.modules.page.render.a aVar2 = (com.meituan.msc.modules.page.render.a) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "6a017af7bfb08f7c2176f9c7644c48bb");
            return;
        }
        aVar.f = true;
        aVar.i = nVar;
        if (!aVar.f || aVar.i == null) {
            j = aVar.j;
        } else {
            j = aVar.i.e;
        }
        aVar.j = j;
        com.meituan.msc.modules.page.render.d dVar = aVar.e.get();
        if (!(dVar instanceof com.meituan.msc.modules.page.render.rn.g) || (renderPerf = ((com.meituan.msc.modules.page.render.rn.g) dVar).getRenderPerf()) == null) {
            return;
        }
        renderPerf.a(aVar.j);
    }

    public final boolean c() {
        return this.u != null;
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1425222cb914100f60aff72984980fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1425222cb914100f60aff72984980fd");
        } else if (this.E != null) {
        } else {
            this.E = new com.meituan.msc.modules.page.view.coverview.a() { // from class: com.meituan.msc.modules.page.l.1
                public static ChangeQuickRedirect a;
                public CoverViewRootContainer b = null;

                private CoverViewRootContainer c() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "372694c3be87d49661ce7ee67bfed2a3", RobustBitConfig.DEFAULT_VALUE)) {
                        return (CoverViewRootContainer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "372694c3be87d49661ce7ee67bfed2a3");
                    }
                    com.meituan.msc.modules.page.widget.d swipeRefreshLayout = l.this.getSwipeRefreshLayout();
                    if (swipeRefreshLayout != null) {
                        return swipeRefreshLayout.getCoverViewContainer();
                    }
                    return null;
                }

                private CoverViewRootContainer d() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "100b8a0ef12bbdfab0290c6a1c653658", RobustBitConfig.DEFAULT_VALUE)) {
                        return (CoverViewRootContainer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "100b8a0ef12bbdfab0290c6a1c653658");
                    }
                    com.meituan.msc.modules.page.widget.d swipeRefreshLayout = l.this.getSwipeRefreshLayout();
                    if (swipeRefreshLayout != null) {
                        return swipeRefreshLayout.getUnderCoverViewContainer();
                    }
                    return null;
                }

                @Override // com.meituan.msc.modules.page.view.coverview.a
                public final boolean a() {
                    boolean z = false;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e235c280895f86c9daa4cfc13ee2ee0", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e235c280895f86c9daa4cfc13ee2ee0")).booleanValue();
                    }
                    CoverViewRootContainer c = c();
                    if (c != null) {
                        if (l.this.l) {
                            CoverViewRootContainer d = d();
                            this.b = d;
                            if (d != null) {
                                z = this.b.b();
                            }
                        }
                        if (z) {
                            return true;
                        }
                        return c.b();
                    }
                    return false;
                }

                @Override // com.meituan.msc.modules.page.view.coverview.a
                public final void a(int i) {
                    Object[] objArr2 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab76cc56d995f8b196734d8230e75db0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab76cc56d995f8b196734d8230e75db0");
                        return;
                    }
                    CoverViewRootContainer c = c();
                    if (c != null) {
                        c.b(i);
                    }
                    if (l.this.l) {
                        CoverViewRootContainer d = d();
                        this.b = d;
                        if (d != null) {
                            this.b.b(i);
                        }
                    }
                }

                @Override // com.meituan.msc.modules.page.view.coverview.a
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d77c526a14fe7665160a91c36fb48d53", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d77c526a14fe7665160a91c36fb48d53");
                        return;
                    }
                    CoverViewRootContainer c = c();
                    if (c != null) {
                        c.c();
                    }
                    if (l.this.l) {
                        CoverViewRootContainer d = d();
                        this.b = d;
                        if (d != null) {
                            this.b.c();
                        }
                    }
                }
            };
        }
    }

    public final com.meituan.msc.modules.page.view.tab.a getTabBar() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "382090d4f9ec1b43049a8d7fdd8a6d5d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.view.tab.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "382090d4f9ec1b43049a8d7fdd8a6d5d");
        }
        if (this.u != null) {
            return this.u.getTabBar();
        }
        return null;
    }

    public final com.meituan.msc.modules.page.render.e getContentScroller() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8710773fb46ed4c8921c599cc040aea", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.page.render.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8710773fb46ed4c8921c599cc040aea") : this.j.getRenderer().o();
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db4bb68515fbeba27a6899f15fe405fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db4bb68515fbeba27a6899f15fe405fa");
        } else if (this.g) {
            com.meituan.msc.modules.reporter.g.d("Page", "onWidgetSizeChanged: " + this.j.getWidth() + " * " + this.j.getHeight());
            ((WidgetListener) this.c.a(WidgetListener.class)).onWidgetSizeChanged(ab.a("width", Float.valueOf(com.meituan.msc.common.utils.n.d((float) this.j.getWidth())), "height", Float.valueOf(com.meituan.msc.common.utils.n.d((float) this.j.getHeight()))).toString(), getViewId());
        }
    }

    public final com.meituan.msc.modules.page.render.d a(String str, boolean z, Map<String, String> map) {
        boolean z2 = false;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), map};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d377bccfbf00c2ec8c0410a5c2c430a0", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.render.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d377bccfbf00c2ec8c0410a5c2c430a0");
        }
        com.meituan.msc.modules.page.render.d a2 = ((com.meituan.msc.modules.engine.c) this.c.c(com.meituan.msc.modules.engine.c.class)).a(str);
        a2.a(this.e);
        if (!z) {
            PerfEventRecorder perfEventRecorder = new PerfEventRecorder();
            perfEventRecorder.c("MSC Perf Log Begin");
            a2.g = perfEventRecorder;
        } else {
            a2.g = this.c.o;
        }
        com.meituan.msc.modules.engine.h hVar = this.c;
        com.meituan.msc.modules.container.p pVar = this.e;
        if (this.b && z) {
            z2 = true;
        }
        com.meituan.msc.modules.page.render.a a3 = com.meituan.msc.modules.page.render.a.a(hVar, pVar, a2, str, Boolean.valueOf(z2), this.g, map);
        a2.a(a3);
        a2.a(this.f);
        a3.a(this.k);
        this.I = a3;
        this.c.d(com.meituan.msc.modules.devtools.d.class);
        return a2;
    }

    @Nullable
    public final Map<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e4cb9c03077a5525c124fa781e49322", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e4cb9c03077a5525c124fa781e49322");
        }
        MSCReportBizTagsManager.BizTagsData a2 = MSCReportBizTagsManager.a().a(this.c.a(), str);
        if (a2 != null) {
            return a2.getBizTagsForPage(str);
        }
        return null;
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e84de3a76591f9337e87cca9368b8dab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e84de3a76591f9337e87cca9368b8dab");
        } else {
            this.k = System.currentTimeMillis();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f3f2e2453f170f2f388707496c3fc8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f3f2e2453f170f2f388707496c3fc8b");
            return;
        }
        super.onAttachedToWindow();
        this.L = false;
        m();
        com.meituan.msc.modules.reporter.g.d("Page", "onAttachedToWindow() view@", Integer.valueOf(getViewId()));
        this.e.a(this);
        int i = x;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.api.input.textarea.e.a;
        this.n = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6398d65840f0b5ddfbba4620a6685715", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.api.input.textarea.e) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6398d65840f0b5ddfbba4620a6685715") : new com.meituan.msc.modules.api.input.textarea.e(i);
        this.c.a(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99802932d0680a0407fdbd9a8ebddbd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99802932d0680a0407fdbd9a8ebddbd7");
            return;
        }
        super.onDetachedFromWindow();
        this.L = true;
        com.meituan.msc.modules.reporter.g.d("Page", String.format("view@%s onDetachedFromWindow()", Integer.valueOf(getViewId())));
        if (!this.g || this.J) {
            n();
        }
        this.c.a(-1);
    }

    @Override // com.meituan.msc.modules.page.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a52f19a104e91f766c1d7c7cebbeea47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a52f19a104e91f766c1d7c7cebbeea47");
            return;
        }
        com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) this.c.c(com.meituan.msc.modules.engine.k.class);
        if (kVar != null) {
            kVar.c(getPagePath());
        }
        this.J = true;
        com.meituan.msc.modules.reporter.g.d("Page", String.format("view@%s markDestroy()", Integer.valueOf(getViewId())));
        if (this.L) {
            n();
        }
    }

    private void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd7feeae81182c5842c02d2450995beb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd7feeae81182c5842c02d2450995beb");
        } else if (this.K) {
        } else {
            this.K = true;
            com.meituan.msc.modules.reporter.g.d("Page", String.format("view@%s handleOnDestroy()", Integer.valueOf(getViewId())));
            x.a(this.d, getWindowToken(), 2);
            if (this.j != null && this.j.m != null) {
                o();
            }
            this.e.b(this);
            if (this.n != null) {
                this.n.a();
            }
            if (this.j != null) {
                this.j.removeAllViews();
                this.j.setTag(null);
                this.j.a();
            }
            removeAllViews();
            if (this.i != null) {
                this.i.o();
            }
            if (this.j != null && this.j.m != null) {
                View view = this.j.m.get();
                this.j.m.clear();
                if (view instanceof com.meituan.msc.modules.api.msi.webview.m) {
                    ((com.meituan.msc.modules.api.msi.webview.m) view).a();
                }
            }
            if (this.G != null) {
                F.removeCallbacks(this.G);
            }
        }
    }

    @Override // com.meituan.msc.modules.api.input.c
    public final void a(int i, int i2) {
        com.meituan.msc.modules.api.input.a a2;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "082a714c53160c05db684399a90d27eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "082a714c53160c05db684399a90d27eb");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("MSCKeyboard", "onKeyboardHeightChanged:", Integer.valueOf(i));
        if (this.A) {
            if (i > 0) {
                this.w = true;
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = h;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01e638b5c3efb8c923a72624a8063f7f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01e638b5c3efb8c923a72624a8063f7f");
                } else {
                    x = System.identityHashCode(this);
                    this.j.setKeyboardHeight(i);
                    com.meituan.msc.modules.page.widget.d swipeRefreshLayout = getSwipeRefreshLayout();
                    if (swipeRefreshLayout != null && swipeRefreshLayout.getCoverViewContainer() != null) {
                        CoverViewRootContainer coverViewContainer = swipeRefreshLayout.getCoverViewContainer();
                        Object[] objArr3 = {(byte) 1, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect3 = CoverViewRootContainer.a;
                        if (PatchProxy.isSupport(objArr3, coverViewContainer, changeQuickRedirect3, false, "6a668b367b67eadfd372e1718d55540e", RobustBitConfig.DEFAULT_VALUE)) {
                            a2 = (com.meituan.msc.modules.api.input.a) PatchProxy.accessDispatch(objArr3, coverViewContainer, changeQuickRedirect3, false, "6a668b367b67eadfd372e1718d55540e");
                        } else {
                            com.meituan.msc.modules.api.input.a a3 = coverViewContainer.c.a(true, i);
                            a2 = (a3 == null || a3.c == -1) ? coverViewContainer.d.a(true, i) : a3;
                        }
                        if (a2.c != -1) {
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject.put("inputId", a2.d);
                                jSONObject2.put("inputId", a2.d);
                                float f = i;
                                jSONObject.put("height", com.meituan.msc.common.utils.n.d(f));
                                jSONObject2.put("height", com.meituan.msc.common.utils.n.d(f));
                                jSONObject.put("value", a2.e);
                            } catch (JSONException unused) {
                            }
                            getViewId();
                            getViewId();
                            this.z = a2;
                            a(a2.d, i);
                        } else if (this.j.m != null && this.j.m.get() != null) {
                            View view = this.j.m.get();
                            if (view instanceof com.meituan.msc.modules.api.msi.webview.m) {
                                com.meituan.msc.modules.api.msi.webview.m mVar = (com.meituan.msc.modules.api.msi.webview.m) view;
                                Object[] objArr4 = {"var fs = (\ndocument.hasFocus() &&\ndocument.activeElement !== document.body &&\ndocument.activeElement !== document.documentElement &&\ndocument.activeElement\n) || null;\nif(fs==null){\n__mmp__plugin_webview.onInputFocusDispatcher(-1,0,0);\n}else{\nvar rect=fs.getBoundingClientRect();\n__mmp__plugin_webview.onInputFocusDispatcher(1,rect.bottom,rect.top);\n}"};
                                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.api.msi.webview.m.a;
                                if (PatchProxy.isSupport(objArr4, mVar, changeQuickRedirect4, false, "b79ead1bdb005e1e20527d73e37cf25b", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, mVar, changeQuickRedirect4, false, "b79ead1bdb005e1e20527d73e37cf25b");
                                } else {
                                    ((com.meituan.msc.modules.api.msi.webview.e) mVar.b).a("var fs = (\ndocument.hasFocus() &&\ndocument.activeElement !== document.body &&\ndocument.activeElement !== document.documentElement &&\ndocument.activeElement\n) || null;\nif(fs==null){\n__mmp__plugin_webview.onInputFocusDispatcher(-1,0,0);\n}else{\nvar rect=fs.getBoundingClientRect();\n__mmp__plugin_webview.onInputFocusDispatcher(1,rect.bottom,rect.top);\n}");
                                }
                            }
                        }
                        f(a2.d);
                    }
                }
            } else {
                this.w = false;
                o();
            }
        }
        if (i <= 0) {
            k();
        }
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d85299279240e813718efe778650244", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d85299279240e813718efe778650244");
        } else if (System.identityHashCode(this) == x) {
            this.j.setKeyboardHeight(0);
            if (this.z != null) {
                com.meituan.msc.modules.page.widget.d swipeRefreshLayout = getSwipeRefreshLayout();
                if (swipeRefreshLayout == null) {
                    return;
                }
                View findFocus = swipeRefreshLayout.getCoverViewContainer().findFocus();
                if (findFocus instanceof com.meituan.msc.modules.api.input.b) {
                    com.meituan.msc.modules.api.input.b bVar = (com.meituan.msc.modules.api.input.b) findFocus;
                    this.z.a = bVar.c();
                    this.z.e = bVar.e();
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("inputId", bVar.b());
                        jSONObject.put("height", com.meituan.msc.common.utils.n.d(0.0f));
                    } catch (JSONException unused) {
                    }
                    getViewId();
                } else {
                    this.z = null;
                    c(0);
                    return;
                }
            } else {
                WeakReference<View> weakReference = this.j.m;
                if (weakReference != null) {
                    View view = weakReference.get();
                    if (view instanceof com.meituan.msc.modules.api.msi.webview.m) {
                        final com.meituan.msc.modules.api.msi.webview.m mVar = (com.meituan.msc.modules.api.msi.webview.m) view;
                        View childAt = ((FrameLayout) ((Activity) this.d).findViewById(16908290)).getChildAt(0);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        if (layoutParams.height != -1) {
                            layoutParams.height = -1;
                            this.v = 0;
                            childAt.requestLayout();
                            mVar.post(new Runnable() { // from class: com.meituan.msc.modules.page.l.8
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c8d8f2e4d654cedefaa84a0c94926e6", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c8d8f2e4d654cedefaa84a0c94926e6");
                                        return;
                                    }
                                    mVar.scrollBy(0, -1);
                                    mVar.scrollBy(0, 1);
                                }
                            });
                        }
                    }
                }
            }
            this.z = null;
            getViewId();
            c(0);
            p();
        }
    }

    public final int getPageAreaHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99c29ffb3824ea1cf85e8ec2837f2ffa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99c29ffb3824ea1cf85e8ec2837f2ffa")).intValue();
        }
        if (this.j == null || !this.j.isLaidOut()) {
            return 0;
        }
        return this.j.getHeight();
    }

    public final int getCurrentWebViewHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a06ff358e69fcaf1091f47c378baa476", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a06ff358e69fcaf1091f47c378baa476")).intValue();
        }
        if (this.j == null || !this.j.isLaidOut()) {
            return 0;
        }
        return this.j.getRendererViewHeight();
    }

    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8efaabec6ab8a7b7407f2bed44ee4a38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8efaabec6ab8a7b7407f2bed44ee4a38");
            return;
        }
        c(0);
        Activity activity = (Activity) this.d;
        Object[] objArr2 = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = x.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "99845081efd6f6f3258f288f89a3299f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "99845081efd6f6f3258f288f89a3299f");
        } else if (activity != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getApplication().getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus instanceof EditText) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4256ce8581bec2acbfe58c00c3aa68f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4256ce8581bec2acbfe58c00c3aa68f")).booleanValue();
        }
        com.meituan.msc.modules.page.view.d dVar = this.j;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.view.d.a;
        return PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "60bfdc56efb1465b700287639334f7d9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "60bfdc56efb1465b700287639334f7d9")).booleanValue() : dVar.l != null && dVar.l.a();
    }

    public final void a(String str, String str2, int i) {
        Object[] objArr = {str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3ddb54f88a9217971e775b382b3c1ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3ddb54f88a9217971e775b382b3c1ab");
        } else if (this.f != null) {
            com.meituan.msc.modules.reporter.g.d("Page", "onAppRoute, openType=", str, "pagePath=", str2, "viewId=", Integer.valueOf(i));
            this.f.a(new u(str2, str), i, -1, "");
        }
    }

    @Override // com.meituan.msc.modules.page.transition.a
    public final LayoutTransition getPopTransition() {
        LayoutTransition b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "666da5457149889f7595884d8d8584de", RobustBitConfig.DEFAULT_VALUE)) {
            return (LayoutTransition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "666da5457149889f7595884d8d8584de");
        }
        if (this.o == null) {
            com.meituan.msc.modules.page.transition.c m = this.i != null ? this.i.m() : null;
            Object[] objArr2 = {m};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.transition.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9c23a99d5b46b738a06a7c8737a05856", RobustBitConfig.DEFAULT_VALUE)) {
                b = (LayoutTransition) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9c23a99d5b46b738a06a7c8737a05856");
            } else if (m != null && m.c == 1) {
                b = com.meituan.msc.modules.page.transition.b.a();
            } else {
                b = com.meituan.msc.modules.page.transition.b.b();
            }
            this.o = b;
        }
        return this.o;
    }

    @Override // com.meituan.msc.modules.page.transition.a
    public final LayoutTransition getPushTransition() {
        LayoutTransition b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8182358457daaa989a3757ee75460623", RobustBitConfig.DEFAULT_VALUE)) {
            return (LayoutTransition) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8182358457daaa989a3757ee75460623");
        }
        if (this.p == null) {
            com.meituan.msc.modules.page.transition.c m = this.i != null ? this.i.m() : null;
            Object[] objArr2 = {m};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.transition.b.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "86ec58bace5188f56cce98bfd885ecde", RobustBitConfig.DEFAULT_VALUE)) {
                b = (LayoutTransition) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "86ec58bace5188f56cce98bfd885ecde");
            } else if (m != null && m.b == 1) {
                b = com.meituan.msc.modules.page.transition.b.a();
            } else {
                b = com.meituan.msc.modules.page.transition.b.b();
            }
            this.p = b;
        }
        return this.p;
    }

    public final e getCurPageModule() {
        return this.i;
    }

    @Override // com.meituan.msc.modules.page.a
    @Nullable
    public final e b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ccd847470f67378b8afeb75aba9f9fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ccd847470f67378b8afeb75aba9f9fc");
        }
        if (i == getViewId()) {
            return this.i;
        }
        return null;
    }

    @Override // com.meituan.msc.modules.page.a
    public final void b() {
        com.meituan.msc.common.lib.d a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfa5ef71693d352b8f22f259763f578e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfa5ef71693d352b8f22f259763f578e");
            return;
        }
        com.meituan.msc.modules.reporter.g.b("Page", "page lifecycle onShow");
        this.j.d();
        this.A = true;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9536e509b00553093b7bf6c08889226b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9536e509b00553093b7bf6c08889226b");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = h;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b02422659d7c43a451635368d15b2573", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b02422659d7c43a451635368d15b2573")).booleanValue() : com.meituan.msc.common.utils.n.a(this.i)) {
            this.H = this.j.c();
        }
        if (this.q) {
            this.q = false;
            if (com.meituan.msc.common.config.b.F()) {
                com.meituan.msc.modules.engine.h hVar = this.c;
                String str = this.t;
                com.meituan.msc.modules.page.view.d dVar = this.j;
                com.meituan.msc.modules.container.p pVar = this.e;
                Activity activity = (Activity) this.d;
                Object[] objArr4 = {hVar, str, dVar, pVar, activity};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.reporter.k.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "cfa7387074a1bafc1f1d3c9e86baf30e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "cfa7387074a1bafc1f1d3c9e86baf30e");
                } else {
                    IWhiteScreenCheckReporter a3 = com.meituan.msc.modules.reporter.k.a();
                    if (a3 != null && hVar != null && pVar != null && (a2 = com.meituan.msc.modules.reporter.k.a(hVar, str, dVar, pVar, activity)) != null) {
                        a3.pageResume(a2);
                    }
                }
            } else {
                com.meituan.msc.modules.page.view.d dVar2 = this.j;
                Object[] objArr5 = {dVar2};
                ChangeQuickRedirect changeQuickRedirect5 = h;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "babc4481a423244f4916a0ff12538468", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "babc4481a423244f4916a0ff12538468");
                } else {
                    if (this.G != null) {
                        F.removeCallbacks(this.G);
                    }
                    this.G = new a(dVar2, this.H);
                    com.meituan.msc.modules.reporter.d dVar3 = this.c.n;
                    Object[] objArr6 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect6 = com.meituan.msc.modules.reporter.d.a;
                    if (PatchProxy.isSupport(objArr6, dVar3, changeQuickRedirect6, false, "080c6a6dfbe37d6b5a7c2660bfa41879", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, dVar3, changeQuickRedirect6, false, "080c6a6dfbe37d6b5a7c2660bfa41879");
                    } else {
                        dVar3.c.clear();
                    }
                    if (!F.postDelayed(this.G, com.meituan.msc.common.config.b.b() * 1000)) {
                        com.meituan.msc.modules.reporter.g.d("Page", "scheduleDetector execute failed");
                        d("scheduleDetector execute failed", "");
                    }
                }
            }
            if (this.E != null) {
                this.E.b();
            } else {
                com.meituan.msc.modules.reporter.g.e("Page", "pageLifecycleInterceptor not found!");
            }
            this.c.a(new com.meituan.msc.modules.manager.f("pageResume", this.i));
            com.meituan.msc.common.framework.c.a().b.a(this.c.r.j(), this.t, getWindowToken());
            com.meituan.msc.modules.page.render.a aVar = this.j.getRenderer().k.j;
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = com.meituan.msc.modules.page.render.a.d;
            if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "16985283bb45cc8e8384ee82eb0b3bf4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "16985283bb45cc8e8384ee82eb0b3bf4");
            } else {
                aVar.b("msc.page.view.count").b();
            }
            com.meituan.msc.modules.page.render.a aVar2 = this.I;
            Object[] objArr8 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect8 = com.meituan.msc.modules.page.render.a.d;
            if (PatchProxy.isSupport(objArr8, aVar2, changeQuickRedirect8, false, "8adac26fca2cdc416de3e7e94c138b72", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, aVar2, changeQuickRedirect8, false, "8adac26fca2cdc416de3e7e94c138b72");
                return;
            }
            com.meituan.msc.modules.reporter.memory.e eVar = aVar2.k;
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = com.meituan.msc.modules.reporter.memory.e.a;
            if (PatchProxy.isSupport(objArr9, eVar, changeQuickRedirect9, false, "ac9180039eec87449c121e911450dc7b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr9, eVar, changeQuickRedirect9, false, "ac9180039eec87449c121e911450dc7b");
                return;
            }
            Object[] objArr10 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect10 = com.meituan.msc.modules.reporter.memory.e.a;
            if (PatchProxy.isSupport(objArr10, eVar, changeQuickRedirect10, false, "f014608cc1e0a35e28d22268424467e0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, eVar, changeQuickRedirect10, false, "f014608cc1e0a35e28d22268424467e0");
            } else if (MSCHornRollbackConfig.l() || eVar.c) {
            } else {
                com.meituan.msc.modules.reporter.memory.d dVar4 = eVar.b;
                Object[] objArr11 = {eVar};
                ChangeQuickRedirect changeQuickRedirect11 = com.meituan.msc.modules.reporter.memory.d.a;
                if (PatchProxy.isSupport(objArr11, dVar4, changeQuickRedirect11, false, "6d6bb0e21341ab2d7a8057ac1db5b4fb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, dVar4, changeQuickRedirect11, false, "6d6bb0e21341ab2d7a8057ac1db5b4fb");
                } else {
                    if (!dVar4.b.contains(eVar)) {
                        dVar4.b.add(eVar);
                    }
                    if (!dVar4.b.isEmpty()) {
                        Object[] objArr12 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect12 = com.meituan.msc.modules.reporter.memory.d.a;
                        if (PatchProxy.isSupport(objArr12, dVar4, changeQuickRedirect12, false, "dd84bcae555961c7f259fb89052786ba", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr12, dVar4, changeQuickRedirect12, false, "dd84bcae555961c7f259fb89052786ba");
                        } else if (!dVar4.c) {
                            dVar4.a((com.meituan.msc.common.support.java.util.concurrent.a<Integer>) null);
                            dVar4.c = true;
                        }
                    }
                }
                eVar.c = true;
            }
        }
    }

    @Override // com.meituan.msc.modules.page.a
    public final void a(int i) {
        com.meituan.msc.common.lib.d a2;
        com.meituan.msc.views.precreate.c cVar;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c2f31271e89b37debca5419422f3154", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c2f31271e89b37debca5419422f3154");
            return;
        }
        com.meituan.msc.modules.reporter.g.b("Page", "page lifecycle onHide");
        this.A = false;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = h;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ee7088b36d7974d33ac7b2156391fe6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ee7088b36d7974d33ac7b2156391fe6");
        } else if (!this.q) {
            this.q = true;
            if (com.meituan.msc.common.config.b.F()) {
                com.meituan.msc.modules.engine.h hVar = this.c;
                String str = this.t;
                com.meituan.msc.modules.page.view.d dVar = this.j;
                com.meituan.msc.modules.container.p pVar = this.e;
                Activity activity = (Activity) this.d;
                Object[] objArr3 = {hVar, str, dVar, pVar, activity};
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.reporter.k.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "86732043fc4d799f94f2a095a1cc0e30", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "86732043fc4d799f94f2a095a1cc0e30");
                } else {
                    IWhiteScreenCheckReporter a3 = com.meituan.msc.modules.reporter.k.a();
                    if (a3 != null && hVar != null && pVar != null && (a2 = com.meituan.msc.modules.reporter.k.a(hVar, str, dVar, pVar, activity)) != null) {
                        a3.pagePause(a2);
                    }
                }
            }
            if (this.E != null) {
                this.E.a(i);
            } else {
                com.meituan.msc.modules.reporter.g.c("pageLifecycleInterceptor not found!");
            }
            this.c.a(new com.meituan.msc.modules.manager.f("pagePause", this.i));
            com.meituan.msc.common.framework.c.a().b.b(this.c.r.j(), this.t, getWindowToken());
            com.meituan.msc.modules.page.render.a aVar = this.I;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.page.render.a.d;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "24da43f02152e0535b0e69bb39073921", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "24da43f02152e0535b0e69bb39073921");
            } else {
                com.meituan.msc.modules.reporter.memory.e eVar = aVar.k;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.reporter.memory.e.a;
                if (PatchProxy.isSupport(objArr5, eVar, changeQuickRedirect5, false, "fb75534c7b2e888669bdc78650837b1d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, eVar, changeQuickRedirect5, false, "fb75534c7b2e888669bdc78650837b1d");
                } else {
                    eVar.c();
                }
            }
        }
        this.j.e();
        if (this.w) {
            this.w = false;
            o();
        }
        com.meituan.msc.modules.engine.k kVar = (com.meituan.msc.modules.engine.k) this.c.c(com.meituan.msc.modules.engine.k.class);
        if (kVar != null) {
            String pagePath = getPagePath();
            Object[] objArr6 = {pagePath};
            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.msc.modules.engine.k.a;
            if (PatchProxy.isSupport(objArr6, kVar, changeQuickRedirect6, false, "4c6b4db8cab404134cb3235a7ec933bf", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, kVar, changeQuickRedirect6, false, "4c6b4db8cab404134cb3235a7ec933bf");
            } else if (!kVar.a(pagePath) || (cVar = kVar.m.get(pagePath)) == null) {
            } else {
                cVar.I = true;
            }
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4732bebe808c92e2d507dee8a2c7625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4732bebe808c92e2d507dee8a2c7625");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("Page", String.format("onLaunchHome(%s) view@%s ", str, Integer.valueOf(getViewId())));
        this.B = true;
        b(str, this.g ? "widgetLaunch" : "appLaunch");
        this.B = false;
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbf1438a27fe0dbaa97b7b2ad520f0f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbf1438a27fe0dbaa97b7b2ad520f0f0");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("Page", String.format("view@%s onReLaunch(%s)", Integer.valueOf(getViewId()), str));
        if (this.b) {
            q();
        }
        b(str, "reLaunch");
    }

    private void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68ad90b1773504969419698ef0321041", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68ad90b1773504969419698ef0321041");
        } else if (this.u != null) {
            this.u.a(str, str2);
        } else {
            c(str, str2);
        }
    }

    public final void a(u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffacc6aea9422ecb85ff4b8a135cfc28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffacc6aea9422ecb85ff4b8a135cfc28");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("Page", String.format("onNavigateTo view@%s, url:%s", Integer.valueOf(getViewId()), uVar.a));
        uVar.b = "navigateTo";
        b(uVar);
    }

    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0fc5860c03a092088d84ed851aa3e40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0fc5860c03a092088d84ed851aa3e40");
        } else {
            b(str, "reload");
        }
    }

    public final void a(com.meituan.msc.modules.page.render.d dVar, String str) {
        Object[] objArr = {dVar, str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddf47760c4bab7536161947f053fe23c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddf47760c4bab7536161947f053fe23c");
            return;
        }
        o oVar = new o(dVar, this.j, this.u, str, this);
        oVar.f = this.g;
        oVar.j = new k(this, this.j.getRefreshLayout());
        this.c.b().a((o) this.i);
        this.c.b().a(oVar, o.class);
        this.i = oVar;
        d(str);
    }

    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "618778fb49e0007c0a09a1e719a12848", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "618778fb49e0007c0a09a1e719a12848");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("Page", String.format("onRedirectTo view@%s, url:%s", Integer.valueOf(getViewId()), str));
        if (this.b) {
            q();
        }
        c(str, "redirectTo");
    }

    public final void setHasLoaded(boolean z) {
        this.r = z;
    }

    public final void a(final String str, final String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccc42cb49de064df4d0fa8f4fdd56738", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccc42cb49de064df4d0fa8f4fdd56738");
        } else if (!this.r) {
            this.r = true;
            c(str, str2);
        } else {
            com.meituan.msc.common.executor.a.b(new Runnable() { // from class: com.meituan.msc.modules.page.l.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0aeecc344b2a8e158dcdd236c54e6ffd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0aeecc344b2a8e158dcdd236c54e6ffd");
                    } else {
                        l.this.a(str2, str, l.this.getViewId());
                    }
                }
            });
        }
    }

    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97513cc3ffa74514fde1caa144f37fc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97513cc3ffa74514fde1caa144f37fc9");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("Page", String.format("onNavigateBack view@%s", Integer.valueOf(getViewId())));
        if (!this.c.r.m(this.t)) {
            l();
        }
        com.meituan.msc.common.executor.a.b(new Runnable() { // from class: com.meituan.msc.modules.page.l.10
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c90c0d9ab9cc2c6148302a5b7c5b58a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c90c0d9ab9cc2c6148302a5b7c5b58a4");
                } else {
                    l.this.a("navigateBack", l.this.j.getContentUrl(), l.this.getViewId());
                }
            }
        });
        com.meituan.msc.modules.reporter.b.a(getPagePath(), this.c.r.j(), "navigateBack", this.g);
    }

    private void c(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "113779f4f39e0af36cbd559734c8eab4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "113779f4f39e0af36cbd559734c8eab4");
        } else {
            b(new u(str, str2, null));
        }
    }

    private void b(final u uVar) {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d6704cc0790870228f6b76caf19887f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d6704cc0790870228f6b76caf19887f");
            return;
        }
        final com.meituan.msc.modules.page.view.d dVar = this.j;
        com.meituan.msc.modules.reporter.b.a(uVar.a, this.c.r.j(), uVar.b, this.g);
        com.meituan.msc.modules.reporter.g.d("Page", String.format("loadUrl(%s, %s) view@%s", uVar.a, uVar.b, Integer.valueOf(getViewId())));
        if (TextUtils.isEmpty(uVar.a) || dVar == null) {
            return;
        }
        dVar.setContentUrl(uVar.a);
        dVar.setOpenType(uVar.b);
        Runnable runnable = new Runnable() { // from class: com.meituan.msc.modules.page.l.11
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c167123c1531921a46ce71b5d7f41455", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c167123c1531921a46ce71b5d7f41455");
                    return;
                }
                if (l.this.g) {
                    uVar.d = t.a("widgetSize", t.a("width", Float.valueOf(com.meituan.msc.common.utils.n.d(dVar.getWidth())), "height", Float.valueOf(com.meituan.msc.common.utils.n.d(dVar.getHeight()))));
                }
                l.a(l.this, dVar, uVar);
            }
        };
        if ((Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) && !this.g) {
            runnable.run();
        } else if (this.B && !this.g) {
            com.meituan.msc.common.executor.a.e(runnable);
        } else {
            com.meituan.msc.common.executor.a.b(runnable);
        }
        if (this.m) {
            return;
        }
        com.meituan.msc.modules.reporter.j.a(uVar.a, uVar.b, this.c, this.e, (Activity) this.d, dVar);
        this.m = true;
    }

    public final com.meituan.msc.modules.page.widget.d getSwipeRefreshLayout() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9e04ddfec50fed3af99937b5745c754", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.modules.page.widget.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9e04ddfec50fed3af99937b5745c754") : this.j.getRefreshLayout();
    }

    @Override // com.meituan.msc.modules.page.a
    public final int getViewId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fc37e9810af2a625e01929dbaa59be3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fc37e9810af2a625e01929dbaa59be3")).intValue();
        }
        if (this.j != null) {
            return this.j.getViewId();
        }
        return 0;
    }

    @Override // com.meituan.msc.modules.page.view.d.a
    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffc8b2ed5a1bca27821e84c6a8039530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffc8b2ed5a1bca27821e84c6a8039530");
        } else {
            scrollBy(-((int) f), 0);
        }
    }

    @Override // com.meituan.msc.modules.page.view.d.a
    public final void b(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c715f3e218d269f0092ff96810c69959", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c715f3e218d269f0092ff96810c69959");
        } else if (f < getWidth() / 2) {
            scrollTo(0, 0);
        } else {
            a(false);
            ((Activity) this.d).onBackPressed();
            if (this.i == null || !this.i.i()) {
                return;
            }
            a(true);
            scrollTo(0, 0);
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4d1f94a1f5feaa4baa6fb0b069aebac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4d1f94a1f5feaa4baa6fb0b069aebac");
            return;
        }
        ViewParent parent = getParent();
        if (parent instanceof com.meituan.msc.modules.page.transition.d) {
            ((com.meituan.msc.modules.page.transition.d) parent).a(z);
        }
    }

    public final CoverViewWrapper b(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c11825de3878873634a4aa6a07f860c", RobustBitConfig.DEFAULT_VALUE)) {
            return (CoverViewWrapper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c11825de3878873634a4aa6a07f860c");
        }
        com.meituan.msc.modules.page.widget.d swipeRefreshLayout = getSwipeRefreshLayout();
        if (swipeRefreshLayout == null) {
            return null;
        }
        synchronized (swipeRefreshLayout) {
            CoverViewWrapper a2 = com.meituan.msc.modules.page.view.e.a(swipeRefreshLayout.getCoverViewContainer(), i);
            if (a2 == null) {
                a2 = com.meituan.msc.modules.page.view.e.a(swipeRefreshLayout.getUnderCoverViewContainer(), i);
            }
            if (a2 == null) {
                return swipeRefreshLayout.a(i, i2);
            }
            return a2;
        }
    }

    public final boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ff4c4090f22044e56d3e2b45764a0d4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ff4c4090f22044e56d3e2b45764a0d4")).booleanValue() : this.j.f();
    }

    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c34ac7f73767d8df04ccfa18350867c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c34ac7f73767d8df04ccfa18350867c")).booleanValue();
        }
        if (this.E == null || !this.E.a()) {
            if (getScrollX() == 0 && i()) {
                View webViewComponent = this.j.getWebViewComponent();
                if (webViewComponent instanceof com.meituan.msc.modules.api.msi.webview.m) {
                    com.meituan.msc.modules.api.msi.webview.m mVar = (com.meituan.msc.modules.api.msi.webview.m) webViewComponent;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.api.msi.webview.m.a;
                    return PatchProxy.isSupport(objArr2, mVar, changeQuickRedirect2, false, "4a2bf8268aad4fa2d63967a729270075", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, mVar, changeQuickRedirect2, false, "4a2bf8268aad4fa2d63967a729270075")).booleanValue() : ((com.meituan.msc.modules.api.msi.webview.c) mVar.b).a();
                }
            }
            return false;
        }
        return true;
    }

    public final String getPagePath() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c3b1321e9ab3fd4094eddaed10845ce", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c3b1321e9ab3fd4094eddaed10845ce") : this.j.getContentUrl();
    }

    @Override // com.meituan.msc.modules.page.a
    public final String getRoutePath() {
        return this.t;
    }

    public final int getPan() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b85875d769462c12436f5de3dceb251", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b85875d769462c12436f5de3dceb251")).intValue() : this.j.getPan();
    }

    private void c(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c4f3d0215550d065c6dc57c9c607b5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c4f3d0215550d065c6dc57c9c607b5a");
        } else {
            this.j.a(0);
        }
    }

    private void a(String str, final int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5bf440a2e91c5cb3be3d41941e329c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5bf440a2e91c5cb3be3d41941e329c3");
            return;
        }
        for (final com.meituan.msc.modules.api.input.textarea.c cVar : this.y.values()) {
            if (cVar.a(str)) {
                post(new Runnable() { // from class: com.meituan.msc.modules.page.l.12
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea690758338b296cbf89ae501f4daf43", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea690758338b296cbf89ae501f4daf43");
                        }
                    }
                });
            }
        }
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c9df7b92950c1662fd79394da09f1ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c9df7b92950c1662fd79394da09f1ce");
            return;
        }
        for (final com.meituan.msc.modules.api.input.textarea.c cVar : this.y.values()) {
            post(new Runnable() { // from class: com.meituan.msc.modules.page.l.13
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eafe0f884d82222d7d1aa6f58adfe67c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eafe0f884d82222d7d1aa6f58adfe67c");
                    }
                }
            });
        }
    }

    public final int getWebPageHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d74227c363b988dbceaca697d7dcc7d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d74227c363b988dbceaca697d7dcc7d")).intValue() : getContentScroller().getContentHeight();
    }

    public final int getWebScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f59b44980035cf59921b5b8eb83f5019", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f59b44980035cf59921b5b8eb83f5019")).intValue() : getContentScroller().getContentScrollY();
    }

    public final int getNavigationBarHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df655e57aaaa608e9a077e8ac2da44e1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df655e57aaaa608e9a077e8ac2da44e1")).intValue() : this.j.getNavigationBarHeight();
    }

    public final Rect getMenuRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16bdeba40913e78c9eddea589148d069", RobustBitConfig.DEFAULT_VALUE) ? (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16bdeba40913e78c9eddea589148d069") : this.j.getMenuRect();
    }

    public final int getKeyboardHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d35dc4b214e88cc6258c4a82ca67effe", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d35dc4b214e88cc6258c4a82ca67effe")).intValue() : this.j.getKeyboardHeight();
    }

    private void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e299d82979106536e48da52c8bfdee0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e299d82979106536e48da52c8bfdee0");
            return;
        }
        for (final com.meituan.msc.modules.api.input.textarea.c cVar : this.y.values()) {
            if (!cVar.a(str)) {
                post(new Runnable() { // from class: com.meituan.msc.modules.page.l.2
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fbc70771e0159a30a202706073ad222", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fbc70771e0159a30a202706073ad222");
                        }
                    }
                });
            }
        }
    }

    private void p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d30abef234ac42f915201b24424ab932", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d30abef234ac42f915201b24424ab932");
            return;
        }
        for (final com.meituan.msc.modules.api.input.textarea.c cVar : this.y.values()) {
            post(new Runnable() { // from class: com.meituan.msc.modules.page.l.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "395e37906f2da903f912d7bc3ee9b1dd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "395e37906f2da903f912d7bc3ee9b1dd");
                    }
                }
            });
        }
    }

    public final com.meituan.msc.modules.api.input.textarea.e getTextAreaOriginPositionManager() {
        return this.n;
    }

    @Override // com.meituan.msc.modules.api.msi.webview.d
    public final void a(int i, float f, float f2) {
        final int i2 = 0;
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "994987141d62eeec2a887f6c1d37a614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "994987141d62eeec2a887f6c1d37a614");
        } else if (i != 1) {
        } else {
            View webViewComponent = this.j.getWebViewComponent();
            if (webViewComponent == null) {
                com.meituan.msc.modules.reporter.g.d("webview not ready");
                return;
            }
            final com.meituan.msc.modules.api.msi.webview.m mVar = (com.meituan.msc.modules.api.msi.webview.m) webViewComponent;
            int e = com.meituan.msc.common.utils.n.e(f);
            int webHeight = mVar.getWebHeight();
            int keyboardHeight = this.j.getKeyboardHeight();
            int i3 = webHeight - keyboardHeight;
            if (i3 > e) {
                return;
            }
            final int i4 = e - i3;
            View childAt = ((FrameLayout) ((Activity) this.d).findViewById(16908290)).getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight();
            int a2 = av.a(this.d);
            if (!av.a()) {
                i2 = a2;
            } else if (av.b(this.d)) {
                i2 = av.c(this.d);
            }
            this.v = keyboardHeight;
            layoutParams.height = ((height + this.v) - keyboardHeight) + i2;
            childAt.requestLayout();
            if (i4 > i2) {
                mVar.postDelayed(new Runnable() { // from class: com.meituan.msc.modules.page.l.4
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e71c34de3be05a6aed6f8a59deccd3a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e71c34de3be05a6aed6f8a59deccd3a");
                            return;
                        }
                        mVar.scrollBy(0, i4 - i2);
                        mVar.invalidate();
                    }
                }, 100L);
            }
        }
    }

    public final h getTabPage() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public static ChangeQuickRedirect a;
        private WeakReference<com.meituan.msc.modules.page.view.d> c;
        private HashMap<String, Object> d;

        public a(com.meituan.msc.modules.page.view.d dVar, HashMap<String, Object> hashMap) {
            Object[] objArr = {l.this, dVar, hashMap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e123307a91462070967ad99064b3a08c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e123307a91462070967ad99064b3a08c");
                return;
            }
            this.c = new WeakReference<>(dVar);
            this.d = hashMap;
            if (l.this.j == null || l.this.j.getRenderer() == null || !(l.this.j.getRenderer() instanceof com.meituan.msc.modules.page.render.webview.e)) {
                return;
            }
            l.this.j.getRenderer();
        }

        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v2, types: [boolean, byte] */
        /* JADX WARN: Type inference failed for: r4v8 */
        @Override // java.lang.Runnable
        public final void run() {
            View view;
            ?? r4;
            int i;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5b19a4338e5a08336dc1b18392d3ea0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5b19a4338e5a08336dc1b18392d3ea0");
            } else if (this.c == null) {
                l.this.d("pageViewWrapper is null", "");
            } else {
                com.meituan.msc.modules.page.view.d dVar = this.c.get();
                if (dVar == null) {
                    l.this.d("view is null", "");
                    return;
                }
                byte b = (l.this.A && dVar == l.this.j) ? (byte) 1 : (byte) 0;
                if (dVar.m == null || (view = dVar.m.get()) == null || !view.isAttachedToWindow()) {
                    view = dVar;
                    r4 = 0;
                } else {
                    r4 = 1;
                }
                com.meituan.msc.modules.page.render.d renderer = dVar.getRenderer();
                if (!view.isAttachedToWindow() || !view.isShown()) {
                    i = 0;
                    com.meituan.msc.modules.reporter.g.d("Page", "detectView is not show");
                    l.this.d("not attached or not show", renderer.k.a);
                } else {
                    String url = view instanceof com.meituan.msc.modules.api.msi.webview.m ? ((com.meituan.msc.modules.api.msi.webview.m) view).getUrl() : "";
                    HashMap<String, Object> hashMap = this.d;
                    Object[] objArr2 = {view, Byte.valueOf(b), Byte.valueOf((byte) r4), url, hashMap};
                    ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.render.d.a;
                    if (PatchProxy.isSupport(objArr2, renderer, changeQuickRedirect2, false, "84b112a2f0f51ff163f54ab8797bad9c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, renderer, changeQuickRedirect2, false, "84b112a2f0f51ff163f54ab8797bad9c");
                    } else if (b != 0) {
                        if (!renderer.k.m) {
                            renderer.a(renderer.f().b("msc.page.white.screen.count"), false, 1, url, hashMap);
                        } else if (com.meituan.msc.common.config.b.a(am.b(renderer.k.a))) {
                            renderer.a(renderer.f().b("msc.page.white.screen.count"), true, renderer.a(r4, view, true) ? 1 : 0, url, hashMap);
                        } else {
                            i = 0;
                            az.a("not need check ", false, renderer.k.a);
                        }
                    } else {
                        i = 0;
                        com.meituan.msc.modules.reporter.g.d(renderer.b, "checkWhiteScreen isVisible is false");
                        az.a("invisible", false, renderer.k.a);
                    }
                    i = 0;
                }
                com.meituan.msc.modules.reporter.d dVar2 = l.this.c.n;
                Object[] objArr3 = new Object[i];
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.reporter.d.a;
                if (PatchProxy.isSupport(objArr3, dVar2, changeQuickRedirect3, false, "41a3e49eaa85ad2b0c9617979045f897", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, dVar2, changeQuickRedirect3, false, "41a3e49eaa85ad2b0c9617979045f897");
                } else {
                    dVar2.c.clear();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d641c8ad1f4209730a4193791689c15c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d641c8ad1f4209730a4193791689c15c");
        } else {
            az.a(str, false, str2);
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6dbc777f61b18014f2bd26fa8c580cd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6dbc777f61b18014f2bd26fa8c580cd2");
        } else if (this.j == null) {
        } else {
            this.j.b(this.t);
            this.j.setNavigationBarButtonClickListener(this.s);
        }
    }

    private void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cde3c3f7de3d0f7ffbaeab2bcc7ed9ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cde3c3f7de3d0f7ffbaeab2bcc7ed9ab");
            return;
        }
        PerfEventRecorder perfEventRecorder = new PerfEventRecorder();
        perfEventRecorder.c("MSC Perf Log Begin");
        if (this.j == null || this.j.getRenderer() == null) {
            return;
        }
        this.j.getRenderer().g = perfEventRecorder;
    }
}
