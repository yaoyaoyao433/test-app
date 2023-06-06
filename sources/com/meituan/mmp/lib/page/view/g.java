package com.meituan.mmp.lib.page.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.mmp.lib.engine.AppPage;
import com.meituan.mmp.lib.page.view.CustomNavigationBar;
import com.meituan.mmp.lib.utils.ax;
import com.meituan.mmp.lib.utils.bd;
import com.meituan.mmp.lib.utils.p;
import com.meituan.mmp.lib.utils.s;
import com.meituan.mmp.lib.utils.v;
import com.meituan.mmp.lib.w;
import com.meituan.mmp.lib.widget.f;
import com.meituan.mmp.main.ab;
import com.meituan.msi.api.toast.ToastApiParam;
import com.meituan.msi.view.ToastView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.RequestCreator;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g extends FrameLayout implements com.meituan.mmp.lib.web.h {
    public static ChangeQuickRedirect a;
    private boolean A;
    private boolean B;
    private HashMap<String, Object> C;
    private View D;
    public boolean b;
    @Nullable
    public f c;
    public com.meituan.mmp.lib.widget.f d;
    public AppPage e;
    public com.meituan.mmp.lib.web.b f;
    public boolean g;
    public ToastView h;
    public Runnable i;
    public WeakReference<View> j;
    public int k;
    public int l;
    public com.meituan.mmp.lib.page.e m;
    private boolean n;
    private float o;
    private String p;
    private String q;
    private boolean r;
    private int s;
    private int t;
    private Integer u;
    private a v;
    @Nullable
    private View w;
    private com.meituan.mmp.lib.engine.m x;
    private com.meituan.mmp.lib.config.a y;
    private boolean z;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        void a(float f);

        void b(float f);
    }

    public static /* synthetic */ void a(g gVar, View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "cc8c741d4c83850292b398b88f8cacd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "cc8c741d4c83850292b398b88f8cacd5");
        } else if (gVar.getContext() instanceof Activity) {
            FrameLayout frameLayout = new FrameLayout(gVar.getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            frameLayout.addView(view, layoutParams);
            frameLayout.setBackgroundColor(-16777216);
            ((ViewGroup) ((Activity) gVar.getContext()).getWindow().getDecorView()).addView(frameLayout, layoutParams);
            gVar.D = frameLayout;
            p.a(false, gVar.getContext());
        }
    }

    public static /* synthetic */ void a(g gVar, l lVar) {
        Object[] objArr = {lVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, gVar, changeQuickRedirect, false, "6301ceb3f88dbcd78c2aab01b7e27f45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, gVar, changeQuickRedirect, false, "6301ceb3f88dbcd78c2aab01b7e27f45");
        } else if (gVar.D == null || !(gVar.getContext() instanceof Activity)) {
        } else {
            p.a(true, gVar.getContext());
            ((ViewGroup) ((Activity) gVar.getContext()).getWindow().getDecorView()).removeView(gVar.D);
            gVar.D = null;
            lVar.a();
        }
    }

    public static /* synthetic */ boolean a(g gVar, boolean z) {
        gVar.A = true;
        return true;
    }

    public g(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9415eac16c8887008993c146772214ce", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9415eac16c8887008993c146772214ce");
            return;
        }
        this.n = false;
        this.r = false;
        this.s = -16777216;
        this.t = -1;
        this.l = -1;
    }

    public final void a(com.meituan.mmp.lib.engine.m mVar, @NonNull AppPage appPage, String str, boolean z, boolean z2, final f.a aVar) {
        Object[] objArr = {mVar, appPage, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7bdcb02e3d816aeb239b4686bff7deb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7bdcb02e3d816aeb239b4686bff7deb");
            return;
        }
        this.B = true;
        this.x = mVar;
        this.y = this.x.d;
        this.z = z;
        this.g = this.y.m(str);
        int c = p.c();
        Context context = getContext();
        ab.b("new X5SwipeRefreshLayout");
        this.d = new com.meituan.mmp.lib.widget.f(context, new f.a() { // from class: com.meituan.mmp.lib.page.view.g.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.widget.f.a
            public final boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "457e49920871672450da8f9fed0bd951", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "457e49920871672450da8f9fed0bd951")).booleanValue() : aVar.a();
            }
        });
        ab.b();
        setupAppPage(appPage);
        if (z) {
            addView(this.d, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        ab.a("createNavigationBar");
        int fixedHeight = CustomNavigationBar.getFixedHeight();
        this.c = new f(context, z2, this.x, this.g);
        this.c.setUrl(str);
        ab.a();
        if (this.g) {
            addView(this.d, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, fixedHeight);
            layoutParams.topMargin = c;
            addView(this.c, layoutParams);
            return;
        }
        this.w = new View(context);
        addView(this.w, new FrameLayout.LayoutParams(-1, c));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, fixedHeight);
        layoutParams2.topMargin = c;
        addView(this.c, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.topMargin = c + fixedHeight;
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, layoutParams3);
        frameLayout.addView(this.d, -1, -1);
    }

    private void setupAppPage(@NonNull AppPage appPage) {
        Object[] objArr = {appPage};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff2147e6492cbfd6c8c95d5ce7ced014", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff2147e6492cbfd6c8c95d5ce7ced014");
            return;
        }
        this.C = null;
        this.e = appPage;
        if (this.e.c() != null) {
            this.e.c().setOnRenderProcessGoneListener(this);
        }
        String str = appPage.i;
        if (str != null) {
            this.d.setRegionData(str);
        }
        int i = this.k;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = AppPage.a;
        if (PatchProxy.isSupport(objArr2, appPage, changeQuickRedirect2, false, "9477a6765bf452b6868d162b5e2f487c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, appPage, changeQuickRedirect2, false, "9477a6765bf452b6868d162b5e2f487c");
        } else {
            appPage.m = i;
            if (appPage.d != null && appPage.d.l != null && bd.a(appPage.d.l.mmpSdk.d, "5.18.0") < 0) {
                appPage.l = i;
            }
        }
        this.f = appPage.a(getContext());
        AppPage.a aVar = new AppPage.a() { // from class: com.meituan.mmp.lib.page.view.g.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.mmp.lib.engine.AppPage.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "85096af3c8794b19dcfe8adb2de051e5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "85096af3c8794b19dcfe8adb2de051e5");
                    return;
                }
                g.a(g.this, true);
                g.super.setBackgroundColor(g.this.t);
                if (g.this.d == null || !g.this.z || g.this.u == null) {
                    return;
                }
                g.super.setBackgroundColor(g.this.u.intValue());
                g.this.d.setBackgroundColor(g.this.u.intValue());
            }

            @Override // com.meituan.mmp.lib.engine.AppPage.a
            public final void b() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1d9af8d41f4e1650b5e48001c523970f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1d9af8d41f4e1650b5e48001c523970f");
                } else {
                    com.meituan.mmp.lib.executor.a.b(new Runnable() { // from class: com.meituan.mmp.lib.page.view.g.2.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "baf39460c85945ead3e9dd8452002db4", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "baf39460c85945ead3e9dd8452002db4");
                                return;
                            }
                            if (g.this.i != null) {
                                g.this.i.run();
                            }
                            w.a().b.a(g.this.y.c(), g.this.getContentUrl(), g.this);
                        }
                    });
                }
            }

            @Override // com.meituan.mmp.lib.engine.AppPage.a
            public final void a(String str2) {
                Object[] objArr3 = {str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fcfe24d4191da89eb7c9e4eb0b7d7ea8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fcfe24d4191da89eb7c9e4eb0b7d7ea8");
                } else if (TextUtils.isEmpty(str2)) {
                    com.meituan.mmp.lib.trace.b.d("PageViewWrapper", "onSinkModeHotZone params is empty");
                } else if (g.this.getRefreshLayout() == null) {
                    com.meituan.mmp.lib.trace.b.d("PageViewWrapper", "getRefreshLayout is null");
                } else {
                    g.this.getRefreshLayout().setRegionData(str2);
                }
            }
        };
        Object[] objArr3 = {aVar};
        ChangeQuickRedirect changeQuickRedirect3 = AppPage.a;
        if (PatchProxy.isSupport(objArr3, appPage, changeQuickRedirect3, false, "55179e594f17c4d7bd2c5598853429f4", RobustBitConfig.DEFAULT_VALUE)) {
            AppPage appPage2 = (AppPage) PatchProxy.accessDispatch(objArr3, appPage, changeQuickRedirect3, false, "55179e594f17c4d7bd2c5598853429f4");
        } else {
            appPage.h.f = aVar;
        }
        this.d.setContentView(this.f);
    }

    public final int getViewId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32420584dc3608e99371cae3b8bbf22b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32420584dc3608e99371cae3b8bbf22b")).intValue();
        }
        if (this.l != -1) {
            return this.l;
        }
        if (this.e == null) {
            return -1;
        }
        return this.e.j();
    }

    public final void setContentUrl(String str) {
        this.p = str;
    }

    public final void setOpenType(String str) {
        this.q = str;
    }

    public final String getContentUrl() {
        return this.p;
    }

    public final String getOpenType() {
        return this.q;
    }

    public final AppPage getAppPage() {
        return this.e;
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df29b7ceea429756537e3b02cede1e41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df29b7ceea429756537e3b02cede1e41");
        } else {
            this.f.b();
        }
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7d466301215d3e7ef459ced86da22d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7d466301215d3e7ef459ced86da22d2");
        } else {
            this.f.a(i);
        }
    }

    public final int getWebScrollY() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57e33b7ef47509c86d387fd539edca8a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57e33b7ef47509c86d387fd539edca8a")).intValue() : this.f.getWebScrollY();
    }

    public final int getWebPageHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8b8b63ef6b15a80bbf51e837cad7786", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8b8b63ef6b15a80bbf51e837cad7786")).intValue() : this.f.getWebPageHeight();
    }

    public final int getWebViewHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b61520e3bc55dacfc3bd93a873fc7c88", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b61520e3bc55dacfc3bd93a873fc7c88")).intValue() : this.f.getHeight();
    }

    public final b getWebView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c585113cb859701fcb79244064b7342d", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c585113cb859701fcb79244064b7342d") : this.f.getIWebView();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "335b6c54f2d95bf90326534fd54226b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "335b6c54f2d95bf90326534fd54226b0")).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.n = false;
                if (motionEvent.getRawX() > 50.0f || this.v == null) {
                    this.n = false;
                    break;
                } else {
                    ViewParent parent = getParent().getParent();
                    if (parent != null && (parent instanceof com.meituan.mmp.lib.widget.f)) {
                        parent.requestDisallowInterceptTouchEvent(true);
                        ((com.meituan.mmp.lib.widget.f) parent).setEnabled(false);
                    }
                    this.n = true;
                    this.o = motionEvent.getRawX();
                    return true;
                }
                break;
            case 1:
            case 3:
                if (this.n) {
                    this.v.b(motionEvent.getRawX());
                    return true;
                }
                ViewParent parent2 = getParent().getParent();
                if (parent2 != null && (parent2 instanceof com.meituan.mmp.lib.widget.f)) {
                    parent2.requestDisallowInterceptTouchEvent(false);
                    ((com.meituan.mmp.lib.widget.f) parent2).setEnabled(this.b);
                    break;
                }
                break;
            case 2:
                if (this.n) {
                    this.v.a(motionEvent.getRawX() - this.o);
                    this.o = motionEvent.getRawX();
                    return true;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setSwipeListener(a aVar) {
        this.v = aVar;
    }

    public final void setRefreshEnable(boolean z) {
        this.b = z;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dd2aba3d9cbedc8ec190c3f8da9b2b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dd2aba3d9cbedc8ec190c3f8da9b2b5");
            return;
        }
        String h = this.y.h(str);
        String g = this.y.g(str);
        setNavigationBarTextColor(com.meituan.mmp.lib.utils.i.a(h));
        setNavigationBarIconColor(com.meituan.mmp.lib.utils.i.a(h));
        setNavigationBarBackgroundColor(com.meituan.mmp.lib.utils.i.a(g));
        setNavigationBarTitle(this.y.i(str));
    }

    public final void setNavigationBarTitle(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b54741c718eba6018ab4eb5a3866707", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b54741c718eba6018ab4eb5a3866707");
        } else if (this.g || this.c == null) {
        } else {
            this.c.setNavigationBarTitle(str);
        }
    }

    public final void setNavigationBarTextColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "464b286c594b2eab776fd442174653a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "464b286c594b2eab776fd442174653a6");
            return;
        }
        if (!this.g && this.c != null) {
            this.c.setNavigationBarTextColor(i);
        }
        this.s = i;
        k();
    }

    public final void setNavigationBarIconColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af8f2a9c8fc54ad490b1a4bad1a8dbb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af8f2a9c8fc54ad490b1a4bad1a8dbb0");
        } else if (this.c != null) {
            this.c.setNavigationBarIconColor(i);
        }
    }

    public final void setNavigationBarButtonClickListener(CustomNavigationBar.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fa0830b48ceff63205499e78217a8da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fa0830b48ceff63205499e78217a8da");
        } else if (this.c != null) {
            this.c.setNavigationBarButtonClickListener(aVar);
        }
    }

    public final void setNavigationBarBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9421c0fe727c7d06c12b58ad932ccc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9421c0fe727c7d06c12b58ad932ccc4");
        } else if (this.g) {
        } else {
            if (this.c != null) {
                this.c.setBackgroundColor(i);
            }
            if (this.w != null) {
                this.w.setBackgroundColor(i);
            }
        }
    }

    public final int getNavigationBarHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "692fac3fda35bd5019b38bc992c074b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "692fac3fda35bd5019b38bc992c074b2")).intValue();
        }
        if (this.c != null) {
            return this.c.getHeight();
        }
        return 0;
    }

    public final Rect getMenuRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "667e6ac29d965dd4d14859077be6865d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Rect) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "667e6ac29d965dd4d14859077be6865d");
        }
        if (this.c != null) {
            return this.c.getMenuRect();
        }
        return new Rect();
    }

    public final void a(final boolean z, final JSONObject jSONObject, com.meituan.mmp.lib.config.a aVar) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), jSONObject, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e99c34fe3d16d1595427455b89d1229f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e99c34fe3d16d1595427455b89d1229f");
            return;
        }
        String optString = jSONObject.optString("image");
        final ViewGroup viewGroup = (this.z && (getContext() instanceof Activity)) ? (ViewGroup) ((Activity) getContext()).getWindow().getDecorView() : this;
        final ToastView h = h();
        h.setRequestCreator(s.c(getContext(), optString, aVar));
        if (this.e.i()) {
            h.a(viewGroup, z, ToastApiParam.parse(jSONObject));
        } else {
            this.i = new Runnable() { // from class: com.meituan.mmp.lib.page.view.g.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab878354eadf08504b29261f813fb0ea", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab878354eadf08504b29261f813fb0ea");
                    } else {
                        h.a(viewGroup, z, ToastApiParam.parse(jSONObject));
                    }
                }
            };
        }
    }

    @Override // com.meituan.mmp.lib.web.h
    public final void a(HashMap<String, Object> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ff7966d7f431c43b9e334de74178e9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ff7966d7f431c43b9e334de74178e9f");
        } else if (l()) {
            com.meituan.mmp.lib.trace.b.b("PageViewWrapper", "already received render process gone, duplicated callback");
        } else {
            this.C = hashMap;
            if (this.e != null) {
                this.e.g = true;
            }
            this.C.put("reloadType", this.r ? "immediate" : "onNextShow");
            Object[] objArr2 = {hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc1daea72b26affa204f1d35525e8a06", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc1daea72b26affa204f1d35525e8a06");
            } else if (com.meituan.mmp.lib.config.b.V()) {
                com.meituan.mmp.lib.trace.b.b("PageViewWrapper", "disableNotifyRenderProcessGone");
            } else {
                List<com.meituan.msc.common.lib.a> a2 = com.sankuai.meituan.serviceloader.b.a(com.meituan.msc.common.lib.a.class, this.x.b);
                if (a2 == null || a2.isEmpty()) {
                    com.meituan.mmp.lib.trace.b.b("PageViewWrapper", "notifyRenderProcessGone callbacks empty");
                } else {
                    for (com.meituan.msc.common.lib.a aVar : a2) {
                        if (aVar == null) {
                            com.meituan.mmp.lib.trace.b.b("PageViewWrapper", "notifyRenderProcessGone callback is null");
                        } else {
                            Object hashMap2 = new HashMap();
                            if (this.e != null) {
                                hashMap2 = v.a((Map) this.e.r().b(), (Map) hashMap);
                            }
                            com.meituan.mmp.lib.trace.b.a("PageViewWrapper", "notifyRenderProcessGone", hashMap2);
                            com.meituan.msc.common.lib.c cVar = com.meituan.msc.common.lib.c.MMP;
                        }
                    }
                }
            }
            if (this.r) {
                f();
            }
            if (this.e != null) {
                this.e.r().b("mmp.render.process.gone.handled", (Map<String, Object>) this.C);
            }
        }
    }

    private ToastView h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18f5e5e4e085a21cbea24b6b02f5dff0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ToastView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18f5e5e4e085a21cbea24b6b02f5dff0");
        }
        if (this.h == null) {
            this.h = new ToastView(getContext());
            this.h.setVisibility(8);
            addView(this.h, -1, -1);
        }
        return this.h;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85b8fc04ba047d0068d2298cc3d33213", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85b8fc04ba047d0068d2298cc3d33213");
            return;
        }
        if (this.h != null) {
            this.h.b();
        }
        this.i = null;
        this.h = null;
    }

    public final ToastView getToastView() {
        return this.h;
    }

    public final com.meituan.mmp.lib.widget.f getRefreshLayout() {
        return this.d;
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad8232fad95f109892f8de951a469726", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad8232fad95f109892f8de951a469726");
            return;
        }
        this.t = i;
        if (this.A) {
            super.setBackgroundColor(this.t);
        }
    }

    public final void setWidgetBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1901404bbd80b97342f6cc70100c0174", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1901404bbd80b97342f6cc70100c0174");
            return;
        }
        setBackgroundColor(i);
        this.u = Integer.valueOf(i);
        if (this.d == null || !this.z) {
            return;
        }
        this.d.setBackgroundColor(i);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccaa3d02e535d081f36ee18621e30754", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccaa3d02e535d081f36ee18621e30754");
        } else if (this.c != null) {
            this.c.a();
        }
    }

    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "224e3d18dbceee394c460c0beea126dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "224e3d18dbceee394c460c0beea126dc");
        } else {
            this.f.f();
        }
    }

    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be00812ab54677300bbc0f8adca512ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be00812ab54677300bbc0f8adca512ae");
            return;
        }
        if (!this.r) {
            i();
            this.r = true;
        }
        this.e.g();
    }

    public final HashMap<String, Object> f() {
        HashMap<String, Object> hashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83d47223a22dd06873784795cf7a3b9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83d47223a22dd06873784795cf7a3b9c");
        }
        if (this.C != null) {
            hashMap = new HashMap<>();
            hashMap.putAll(this.C);
        } else {
            hashMap = null;
        }
        if (l()) {
            this.k = getAppPage().j();
            m();
            setupAppPage(this.m.a(this.p));
            if (this.e != null) {
                this.e.r().b("mmp.render.process.gone.reload.page", (Map<String, Object>) hashMap);
            }
            e();
            String str = this.p;
            this.p = null;
            this.m.e(str);
        }
        return hashMap;
    }

    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76820d504fadc2e41796b4334a8deb46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76820d504fadc2e41796b4334a8deb46");
            return;
        }
        if (this.r) {
            j();
            this.r = false;
        }
        if (this.e != null) {
            this.e.h();
        }
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b550c32e15d85f45d337082fea6b53eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b550c32e15d85f45d337082fea6b53eb");
            return;
        }
        k();
        this.f.d();
        a(this.f.getIWebView());
    }

    private void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23b393c2c748a492fca09314a6565165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23b393c2c748a492fca09314a6565165");
        } else {
            this.f.e();
        }
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "058a8b63e46073f9f6638f3e559feeda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "058a8b63e46073f9f6638f3e559feeda");
            return;
        }
        Context context = getContext();
        if (context instanceof Activity) {
            ax.a((Activity) context, this.s == -16777216);
        }
    }

    private void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32370003dfd10bebf038398383e7eefe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32370003dfd10bebf038398383e7eefe");
        } else {
            bVar.setOnFullScreenListener(new e() { // from class: com.meituan.mmp.lib.page.view.g.5
                public static ChangeQuickRedirect a;
                public l b;

                @Override // com.meituan.mmp.lib.page.view.e
                public final void a(View view, l lVar) {
                    Object[] objArr2 = {view, lVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2bc67df3382e052723dd188e90549170", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2bc67df3382e052723dd188e90549170");
                    } else if (g.this.D != null) {
                        lVar.a();
                    } else {
                        this.b = lVar;
                        g.a(g.this, view);
                    }
                }

                @Override // com.meituan.mmp.lib.page.view.e
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5c54371cf1808460f042c1e6a4bd9ac0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5c54371cf1808460f042c1e6a4bd9ac0");
                    } else {
                        g.a(g.this, this.b);
                    }
                }
            });
        }
    }

    public final void b(String str) {
        View view;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58e3ed9f95ad457fbf492dd841c6cf99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58e3ed9f95ad457fbf492dd841c6cf99");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.page_not_found_view);
        if (this.d != null) {
            this.d.setVisibility(8);
        }
        a(str);
        if (linearLayout != null || (view = (LinearLayout) inflate(getContext(), R.layout.hera_page_not_found, null)) == null) {
            return;
        }
        int c = p.c();
        int fixedHeight = CustomNavigationBar.getFixedHeight();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = c + fixedHeight;
        addView(view, layoutParams);
        ImageView imageView = (ImageView) findViewById(R.id.page_not_found_img);
        RequestCreator c2 = s.c(getContext(), this.y.f(), this.y);
        if (c2 != null) {
            c2.a(imageView);
        }
        ((TextView) findViewById(R.id.page_not_found_msg)).setText(String.format(getContext().getString(R.string.mmp_page_not_found_message), this.y.d()));
    }

    private boolean l() {
        return this.C != null;
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82f623c57a246c620000fa64939fa538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82f623c57a246c620000fa64939fa538");
            return;
        }
        g();
        this.x.i.b(this.e);
        this.x.i.a();
    }
}
