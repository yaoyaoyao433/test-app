package com.meituan.msc.modules.container;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.msc.common.config.MSCPreCreateWebViewConfig;
import com.meituan.msc.common.executor.a;
import com.meituan.msc.common.utils.ab;
import com.meituan.msc.common.utils.aj;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.common.utils.av;
import com.meituan.msc.common.utils.aw;
import com.meituan.msc.common.utils.ax;
import com.meituan.msc.common.utils.ay;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.api.legacy.appstate.WidgetListener;
import com.meituan.msc.modules.api.msi.api.KeyboardApi;
import com.meituan.msc.modules.api.msi.api.PageBeforeUnloadParam;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.msi.MSIManagerModule;
import com.meituan.msc.modules.page.reload.d;
import com.meituan.msc.modules.preload.MSCHornPreloadConfig;
import com.meituan.msc.modules.preload.PackageDebugHelper;
import com.meituan.msc.modules.update.PackageLoadReporter;
import com.meituan.msc.modules.update.bean.AppMetaInfoWrapper;
import com.meituan.msc.modules.update.bean.CheckUpdateParams;
import com.meituan.msc.uimanager.NativeViewHierarchyManager;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.msi.bean.NavActivityInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.RequestCreator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends l implements com.meituan.msc.common.framework.interfaces.b, com.meituan.msc.modules.api.input.c {
    private static final Handler M = new Handler(Looper.getMainLooper());
    public static ChangeQuickRedirect a;
    public static volatile boolean d;
    public boolean A;
    boolean B;
    protected volatile boolean C;
    private com.meituan.msc.modules.reporter.d N;
    private MSIManagerModule O;
    private FrameLayout P;
    private FrameLayout Q;
    @Nullable
    private LinearLayout R;
    @Nullable
    private TextView S;
    @Nullable
    private ImageView T;
    @Nullable
    private View U;
    private com.meituan.msc.modules.api.input.d V;
    private final List<com.meituan.msc.modules.api.input.c> W;
    private Runnable X;
    private String Y;
    @Nullable
    private com.meituan.msc.modules.page.reload.d Z;
    private String aa;
    private com.meituan.msc.common.support.java.util.concurrent.a<Void> ab;
    private boolean ac;
    private String ad;
    private boolean ae;
    private boolean af;
    private k ag;
    private boolean ah;
    private final Runnable ai;
    private final List<Runnable> aj;
    private volatile boolean ak;
    private volatile boolean al;
    private final List<Map<String, Object>> am;
    private final com.meituan.msc.modules.manager.q<AppMetaInfoWrapper> an;
    private final com.meituan.msc.modules.manager.q<com.meituan.msc.modules.apploader.events.a> ao;
    protected final String b;
    volatile String c;
    protected com.meituan.msc.modules.engine.e e;
    protected com.meituan.msc.modules.engine.h f;
    protected com.meituan.msc.modules.apploader.a g;
    protected com.meituan.msc.modules.engine.a h;
    protected com.meituan.msc.modules.page.c i;
    @Nullable
    public TextView j;
    protected long k;
    protected boolean l;
    protected volatile boolean m;
    protected boolean n;
    protected boolean o;
    protected volatile boolean p;
    protected volatile boolean q;
    protected String r;
    protected String s;
    protected String t;
    protected String u;
    protected String v;
    protected int w;
    protected boolean x;
    protected boolean y;
    public boolean z;

    private boolean O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0853ecdd1d59d5f00d3f4a2da5d7e84", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0853ecdd1d59d5f00d3f4a2da5d7e84")).booleanValue();
        }
        return true;
    }

    @Override // com.meituan.msc.modules.container.p
    public final void a(long j, int i) {
        Object[] objArr = {new Long(j), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "994bc6804b7e55354f4d8efd27f0114a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "994bc6804b7e55354f4d8efd27f0114a");
        }
    }

    @Override // com.meituan.msc.modules.container.p
    public final com.meituan.msc.common.framework.interfaces.b e() {
        return this;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f823689246d4abaae0a7d7c24c77599f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f823689246d4abaae0a7d7c24c77599f");
            return;
        }
        this.b = "ContainerController@" + Integer.toHexString(hashCode());
        this.l = false;
        this.m = false;
        this.p = false;
        this.q = true;
        this.W = new ArrayList();
        this.X = null;
        this.Y = null;
        this.z = false;
        this.ah = true;
        this.B = false;
        this.ai = c.a(this);
        this.aj = new LinkedList();
        this.am = new CopyOnWriteArrayList();
        this.an = new com.meituan.msc.modules.manager.q() { // from class: com.meituan.msc.modules.container.b.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(com.meituan.msc.modules.manager.f fVar) {
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ba050b8f6f618fbe318d60f9e21cb41", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ba050b8f6f618fbe318d60f9e21cb41");
                    return;
                }
                com.meituan.msc.modules.reporter.g.d(b.this.b, "onAppPropUpdated");
                b.this.f.f().a(b.this.C(), b.this.c(), b.this.w);
                b.this.k();
            }
        };
        this.ao = new com.meituan.msc.modules.manager.q<com.meituan.msc.modules.apploader.events.a>() { // from class: com.meituan.msc.modules.container.b.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(com.meituan.msc.modules.manager.f<com.meituan.msc.modules.apploader.events.a> fVar) {
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fd077b5a808c046d930f3b3296254df1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fd077b5a808c046d930f3b3296254df1");
                    return;
                }
                com.meituan.msc.modules.reporter.g.d(b.this.b, "loadFailSubscriber", fVar);
                com.meituan.msc.modules.apploader.events.a aVar = fVar.c;
                if (aVar.b == 1005) {
                    com.meituan.msc.modules.reporter.g.d(b.this.b, "loadFailSubscriber user exist");
                    return;
                }
                if (b.this.A()) {
                    b.this.a(aVar.getMessage(), aVar.b, aVar);
                } else {
                    b.this.b(aVar.getMessage(), aVar.b, aVar);
                }
                if (b.this.C().isDestroyed() || b.this.C().isFinishing() || b.this.L()) {
                    return;
                }
                n nVar = b.this.F;
                com.meituan.msc.modules.engine.h hVar = b.this.f;
                Object[] objArr3 = {hVar, aVar};
                ChangeQuickRedirect changeQuickRedirect3 = n.d;
                if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "b0dfca6c65e68a25ea221058259c2a57", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "b0dfca6c65e68a25ea221058259c2a57");
                } else if (hVar == null || TextUtils.isEmpty(hVar.a())) {
                } else {
                    com.meituan.msc.modules.page.render.a b = n.b(hVar);
                    if (b != null) {
                        b.a(aVar);
                    } else {
                        new com.meituan.msc.modules.reporter.f(com.meituan.msc.modules.reporter.a.a(hVar)).a("msc.page.load.success.rate").a("errorMessage", aVar != null ? aVar.getMessage() : null).a(0.0d).c();
                    }
                }
            }
        };
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        bVar.ac = true;
        return true;
    }

    public static /* synthetic */ boolean h(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "c810c80cd13f04dcb1a3c2fabcb3d4b0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "c810c80cd13f04dcb1a3c2fabcb3d4b0")).booleanValue();
        }
        if (MSCHornRollbackConfig.d().c().isRollbackPageNotFoundStrategy1) {
            com.meituan.msc.modules.reporter.g.d(bVar.b, "checkPageNotFound isRollbackPageNotFoundStrategy true");
            return false;
        } else if (bVar.w()) {
            return false;
        } else {
            boolean a2 = v.a(bVar.f, bVar.r);
            boolean a3 = v.a(bVar.f, bVar.r, bVar.v, bVar.A(), a2);
            com.meituan.msc.modules.reporter.g.d(bVar.b, "checkPageNotFound", "targetPath:", bVar.v, "canReloadWidget", Boolean.valueOf(a2), "isUserHandled:", Boolean.valueOf(a3));
            if (!a3) {
                bVar.e("appLaunch");
            } else {
                bVar.ai();
                bVar.ak();
            }
            return true;
        }
    }

    public static /* synthetic */ void j(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "f8bcc4a4c70e4e0a6b5e61410e2fd500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "f8bcc4a4c70e4e0a6b5e61410e2fd500");
            return;
        }
        if (!bVar.A()) {
            bVar.e.d = true;
        }
        if (bVar.w()) {
            com.meituan.msc.modules.reporter.g.d(bVar.b, "launchHomePage");
            com.meituan.msc.modules.page.m u = bVar.u();
            String str = bVar.v;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.m.a;
            if (PatchProxy.isSupport(objArr2, u, changeQuickRedirect2, false, "1b0f90c68ebc059e040ba032523600b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, u, changeQuickRedirect2, false, "1b0f90c68ebc059e040ba032523600b9");
                return;
            } else {
                u.a(str, (Integer) null, true);
                return;
            }
        }
        bVar.e("appLaunch");
    }

    public static /* synthetic */ void k(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "fd34149be4539905bab89fe28a6f3fb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "fd34149be4539905bab89fe28a6f3fb7");
            return;
        }
        com.meituan.msc.modules.reporter.g.d(bVar.b, "navigateFusionHomePage");
        if (MSCEnvHelper.getFusionPageManager() == null && bVar.f.g() && bVar.f.r.n(bVar.v)) {
            aw.a("该Tab页面不支持当前启动方式", new Object[0]);
            com.meituan.msc.modules.reporter.g.d(bVar.b, "HeraActivity navigateFusionHomePage");
            bVar.b("navigateFusionHomePage");
            return;
        }
        M.post(i.a(bVar));
    }

    public final com.meituan.msc.modules.engine.h a() {
        return this.f;
    }

    public final com.meituan.msc.modules.engine.e b() {
        return this.e;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce51a8269fa6cd06bdccbfcc30eb5156", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce51a8269fa6cd06bdccbfcc30eb5156");
            return;
        }
        this.r = str;
        com.meituan.msc.modules.engine.l.a(str);
    }

    public static String a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b5f83762705b3dc4c7da7e5e70c3b3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b5f83762705b3dc4c7da7e5e70c3b3e");
        }
        String a2 = com.meituan.msc.common.utils.y.a(intent, "appId");
        return TextUtils.isEmpty(a2) ? MSCEnvHelper.getDefaultAppID() : a2;
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9b6321b6db259477a68a6373334c6c1", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9b6321b6db259477a68a6373334c6c1") : this.E.f();
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee2118431c178808790a6a11f86db47f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee2118431c178808790a6a11f86db47f") : c("targetPath");
    }

    private boolean P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcaca09fed24e4ae0cb695633297d076", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcaca09fed24e4ae0cb695633297d076")).booleanValue() : this.E.e();
    }

    @Override // com.meituan.msc.modules.container.l
    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e390becae32b195856074acb0845becd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e390becae32b195856074acb0845becd");
            return;
        }
        if (bundle != null) {
            this.Y = bundle.getString("__msc_stack_save");
        }
        super.a(bundle);
        String str = this.b;
        Object[] objArr2 = new Object[5];
        objArr2[0] = "onCreate,";
        objArr2[1] = bundle != null ? "recreate" : "first create";
        objArr2[2] = ",appId=";
        objArr2[3] = this.r;
        objArr2[4] = ",targetPath=" + c();
        com.meituan.msc.modules.reporter.g.d(str, objArr2);
        if (H() != null && H().getData() != null) {
            com.meituan.msc.modules.reporter.g.d(this.b, H().getData());
        }
        com.meituan.msc.modules.service.i.b();
        U();
        com.meituan.msc.modules.reporter.b.a().a();
        com.meituan.msc.modules.reporter.b.a().a("1.1208.202");
    }

    @Override // com.meituan.msc.modules.container.l
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b4e08975247a49b0774a76adff094cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b4e08975247a49b0774a76adff094cf");
        } else {
            super.f();
        }
    }

    @Override // com.meituan.msc.modules.container.l
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b47f1da6055b376d50573d31fba11efb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b47f1da6055b376d50573d31fba11efb");
        } else {
            super.g();
        }
    }

    @Override // com.meituan.msc.modules.container.l
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "215b4d560974c3a8972db753bc9fc825", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "215b4d560974c3a8972db753bc9fc825");
            return;
        }
        super.a(z);
        if (this.i != null) {
            com.meituan.msc.modules.page.e b = this.i.b();
            int d2 = b != null ? b.d() : 0;
            com.meituan.msc.modules.api.legacy.appstate.a aVar = (com.meituan.msc.modules.api.legacy.appstate.a) this.f.c(com.meituan.msc.modules.api.legacy.appstate.a.class);
            if (aVar != null) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(d2)};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.api.legacy.appstate.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "db1f847cb0245dc941547b86fe596c6c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "db1f847cb0245dc941547b86fe596c6c");
                } else {
                    aVar.c().onFocusChange(z, d2);
                }
            }
        }
    }

    public final void b(Bundle bundle) {
        com.meituan.msc.modules.engine.h hVar;
        int i;
        n nVar;
        boolean z;
        boolean z2;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1aa196574080442981e6cfddcb8a9faa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1aa196574080442981e6cfddcb8a9faa");
            return;
        }
        NativeViewHierarchyManager.f.set(0L);
        com.meituan.msc.uimanager.j.b.set(0L);
        boolean z3 = !MSCHornRollbackConfig.d().c().isRollbackPendingPreloadBiz;
        if (z3) {
            o.b.a(true);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1d45af08d2834a17a71ed4c868bb0ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1d45af08d2834a17a71ed4c868bb0ce");
        } else if (this.ag == null) {
            this.ag = new k(H());
        }
        final com.meituan.msc.modules.update.metainfo.a a2 = com.meituan.msc.modules.update.metainfo.a.a();
        String str = this.r;
        k kVar = this.ag;
        Object[] objArr3 = {str, kVar};
        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.update.metainfo.a.a;
        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "7e32f98447f1094839cbb394c97af8ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "7e32f98447f1094839cbb394c97af8ec");
        } else if (com.meituan.msc.common.config.b.w()) {
            String a3 = PackageDebugHelper.b.a(str, kVar);
            final CheckUpdateParams checkUpdateParams = new CheckUpdateParams(str, kVar.a() ? 1 : 4);
            if (!TextUtils.isEmpty(a3)) {
                checkUpdateParams.checkUpdateUrl = a3;
            }
            final com.meituan.msc.common.support.java.util.concurrent.a<AppMetaInfoWrapper> aVar = new com.meituan.msc.common.support.java.util.concurrent.a<>();
            a2.b.put(checkUpdateParams, aVar);
            com.meituan.msc.modules.reporter.g.d("bundle", "checkupdate before runtime init " + checkUpdateParams.appId + " from " + checkUpdateParams.checkUpdateUrl + " type: " + checkUpdateParams.getType());
            a2.b(checkUpdateParams, new com.meituan.msc.modules.update.metainfo.c<AppMetaInfoWrapper>() { // from class: com.meituan.msc.modules.update.metainfo.a.7
                public static ChangeQuickRedirect a;

                @Override // com.meituan.msc.modules.update.metainfo.c
                public final /* synthetic */ void a(@NonNull AppMetaInfoWrapper appMetaInfoWrapper) {
                    AppMetaInfoWrapper appMetaInfoWrapper2 = appMetaInfoWrapper;
                    Object[] objArr4 = {appMetaInfoWrapper2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "99e090d0c931056321c1346b70731fff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "99e090d0c931056321c1346b70731fff");
                    } else {
                        aVar.d((com.meituan.msc.common.support.java.util.concurrent.a) appMetaInfoWrapper2);
                    }
                }

                @Override // com.meituan.msc.modules.update.metainfo.c
                public final void a(String str2, Exception exc) {
                    Object[] objArr4 = {str2, exc};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4bc75f8ad5c73992dbc7db6fd851abaf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4bc75f8ad5c73992dbc7db6fd851abaf");
                        return;
                    }
                    aVar.b((Throwable) exc);
                    a.this.b.remove(checkUpdateParams);
                }
            });
        }
        String str2 = this.r;
        String c = c();
        k kVar2 = this.ag;
        Object[] objArr4 = {str2, c, kVar2};
        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.engine.b.a;
        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "0961931ee3ba43cb9801f50bc250ad01", RobustBitConfig.DEFAULT_VALUE)) {
            hVar = (com.meituan.msc.modules.engine.h) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "0961931ee3ba43cb9801f50bc250ad01");
        } else {
            com.meituan.msc.modules.engine.h a4 = com.meituan.msc.modules.engine.q.a(str2, c, kVar2);
            if (!((com.meituan.msc.modules.apploader.a) a4.c(com.meituan.msc.modules.apploader.a.class)).a()) {
                a4.a(str2);
            }
            if (a4.r.j == 1) {
                v.a(a4, c, 2);
            }
            if (kVar2.b) {
                com.meituan.msc.modules.engine.q.a(a4);
            }
            Object[] objArr5 = {kVar2};
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.engine.b.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "d72933fa54c669270009a8f80391371a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "d72933fa54c669270009a8f80391371a");
            } else if (!MSCEnvHelper.getEnvInfo().isProdEnv() && (!TextUtils.isEmpty(kVar2.c) || TextUtils.equals("true", kVar2.f))) {
                DebugHelper.b = true;
            }
            hVar = a4;
        }
        this.f = hVar;
        this.f.J = false;
        this.f.z = com.meituan.msc.modules.update.metainfo.a.e;
        this.f.I = z3;
        if (((com.meituan.msc.modules.apploader.a) this.f.c(com.meituan.msc.modules.apploader.a.class)).l()) {
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = a;
            i = 2;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "c13a2212b2e436b387bd80c1ecc105ce", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "c13a2212b2e436b387bd80c1ecc105ce");
            } else {
                String c2 = c();
                if (com.meituan.msc.modules.engine.requestPrefetch.a.a()) {
                    com.meituan.msc.modules.engine.requestPrefetch.f f = this.f.f();
                    if (com.meituan.msc.modules.engine.requestPrefetch.a.b() || !f.a(c2)) {
                        z2 = true;
                    } else {
                        com.meituan.msc.modules.reporter.g.d(this.b, "exist cached data or isSyncPrefetching");
                        z2 = false;
                    }
                    if (z2) {
                        f.a(C(), c2, this.w);
                    }
                } else {
                    com.meituan.msc.modules.engine.requestPrefetch.f e = this.f.e();
                    if (!e.f) {
                        if (com.meituan.msc.modules.engine.requestPrefetch.a.b() || !e.a(c2)) {
                            z = true;
                        } else {
                            com.meituan.msc.modules.reporter.g.d(this.b, "exist cached data or isSyncPrefetching");
                            z = false;
                        }
                        if (z) {
                            e.c();
                            e.a(C(), c2, this.w);
                        }
                    } else {
                        com.meituan.msc.modules.reporter.o.a("isSyncPrefetching", new Object[0]);
                    }
                    e.f = false;
                }
            }
            if (this.f.i == com.meituan.msc.modules.engine.r.BIZ_PRELOAD) {
                k();
            }
        } else {
            i = 2;
        }
        this.f.a("AppPropUpdated", this.an);
        this.f.a("LoadFailed", this.ao);
        this.e = this.f.d;
        a(this.f.b());
        this.g = (com.meituan.msc.modules.apploader.a) this.f.c(com.meituan.msc.modules.apploader.a.class);
        if (z() != null) {
            z().a(this);
        }
        com.meituan.msc.modules.engine.h hVar2 = this.f;
        boolean A = A();
        Object[] objArr7 = new Object[i];
        objArr7[0] = hVar2;
        objArr7[1] = Byte.valueOf(A ? (byte) 1 : (byte) 0);
        ChangeQuickRedirect changeQuickRedirect7 = n.d;
        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "8c37fcb17004ff85f72b0f60ed684e30", RobustBitConfig.DEFAULT_VALUE)) {
            nVar = (n) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "8c37fcb17004ff85f72b0f60ed684e30");
        } else {
            n nVar2 = new n(com.meituan.msc.modules.reporter.a.a(hVar2));
            nVar2.a("widget", Boolean.valueOf(A));
            nVar = nVar2;
        }
        this.F = nVar;
        if (A()) {
            this.g.a(c());
        }
        n nVar3 = this.F;
        Object[] objArr8 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect8 = n.d;
        if (PatchProxy.isSupport(objArr8, nVar3, changeQuickRedirect8, false, "82450615942b22a3bfd5c19a33363b6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, nVar3, changeQuickRedirect8, false, "82450615942b22a3bfd5c19a33363b6c");
            return;
        }
        nVar3.f = new com.meituan.msc.modules.reporter.memory.e();
        nVar3.f.a();
    }

    private void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "261ebce4ec8a654dfd2821782fb19022", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "261ebce4ec8a654dfd2821782fb19022");
        } else if (MSCPreCreateWebViewConfig.d().c(this.r)) {
            com.meituan.msc.modules.reporter.g.d(this.b, "preCreateWebViewIfNeed", this.r, str);
            final com.meituan.msc.modules.page.render.webview.o oVar = this.f.l;
            final Activity C = C();
            Object[] objArr2 = {C};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.render.webview.o.a;
            if (PatchProxy.isSupport(objArr2, oVar, changeQuickRedirect2, false, "f73459241ccb46dab90ec74fd2c65973", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, oVar, changeQuickRedirect2, false, "f73459241ccb46dab90ec74fd2c65973");
            } else if (oVar.c) {
            } else {
                com.meituan.msc.common.executor.a.c(new Runnable() { // from class: com.meituan.msc.modules.page.render.webview.o.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6a9bf8c7cfba1f5bac1b4f248f793485", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6a9bf8c7cfba1f5bac1b4f248f793485");
                        } else if (!o.this.c && o.this.b == null) {
                            try {
                                o.this.b = o.this.a(C);
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.meituan.msc.modules.container.l
    public final void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ee1201008b03427f130464e19fbe09d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ee1201008b03427f130464e19fbe09d");
            return;
        }
        if (!MSCHornPreloadConfig.o()) {
            b(bundle);
        }
        if (h()) {
            e(bundle);
        } else {
            com.meituan.msc.modules.reporter.g.d(this.b, "disable pre setup runtime:", this.f.i);
        }
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e957ed1b0fb22a5e6fbe642081ebfe0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e957ed1b0fb22a5e6fbe642081ebfe0")).booleanValue();
        }
        if ((A() && !MSCHornRollbackConfig.d().c().isRollbackFixPageManagerNPE) || this.f.i == com.meituan.msc.modules.engine.r.KEEP_ALIVE || this.f.i == com.meituan.msc.modules.engine.r.BIZ_PRELOAD) {
            return false;
        }
        return com.meituan.msc.common.config.b.D();
    }

    @Override // com.meituan.msc.modules.container.l
    public final void d(@Nullable Bundle bundle) {
        boolean z;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672cef34c6b549fa39aa99af5d8ea0ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672cef34c6b549fa39aa99af5d8ea0ce");
            return;
        }
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "762bc1387c9329af79c1b10f275b2152", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "762bc1387c9329af79c1b10f275b2152");
        } else if (bundle != null) {
            this.aa = bundle.getString("backFromExternalNativeUrl");
        }
        Activity activity = this.G;
        Object[] objArr3 = {activity};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "bb9f3c6d22566493ffbe3f2cb1fdc160", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "bb9f3c6d22566493ffbe3f2cb1fdc160");
        } else if (!d) {
            d = true;
            com.meituan.msc.common.executor.a.a(new w());
            com.meituan.msc.common.executor.a.b(d.a(activity));
        }
        S();
        this.N = this.f.n;
        n nVar = this.F;
        com.meituan.msc.modules.engine.h hVar = this.f;
        long j = this.k;
        Object[] objArr4 = {hVar, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect4 = n.d;
        if (PatchProxy.isSupport(objArr4, nVar, changeQuickRedirect4, false, "04301691c36470957838ead354dbd87d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, nVar, changeQuickRedirect4, false, "04301691c36470957838ead354dbd87d");
        } else {
            nVar.e = j;
            nVar.a("launchFromProcessStart", Long.valueOf(com.meituan.msc.modules.reporter.preformance.a.b()));
            if (hVar.u != 0) {
                nVar.a("basePreloadFromProcessStart", Long.valueOf(hVar.u - com.meituan.msc.modules.reporter.preformance.a.a()));
                nVar.a("launchFromBasePreloadStart", Long.valueOf(j - hVar.u));
            }
        }
        com.meituan.msc.modules.reporter.memory.d.c();
        com.meituan.msc.modules.reporter.n.a();
        super.d(bundle);
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "fcad9344f63a4150c3f9a8688c6f9cce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "fcad9344f63a4150c3f9a8688c6f9cce");
        } else {
            this.P = (FrameLayout) b(R.id.container);
            this.Q = (FrameLayout) b(R.id.msc_loading_bg);
            if (A()) {
                View o = ((MSCWidgetFragment) G()).o();
                if (o != null) {
                    aj();
                    this.Q.setBackgroundColor(0);
                    this.Q.addView(ax.a(o));
                } else if (O()) {
                    ah();
                }
                ai();
            } else {
                if (O()) {
                    if (this.L) {
                        aj();
                        ah();
                    } else {
                        ai();
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "12646523ebd5d3ec37b6ad7bec48a1ae", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "12646523ebd5d3ec37b6ad7bec48a1ae");
                        } else {
                            M.postDelayed(this.ai, 500L);
                        }
                    }
                }
                V();
            }
        }
        this.h = (com.meituan.msc.modules.engine.a) this.e.c.c(com.meituan.msc.modules.engine.a.class);
        this.i = t();
        this.O = this.f.m;
        boolean isProdEnv = MSCEnvHelper.getEnvInfo().isProdEnv();
        if (!isProdEnv && !TextUtils.isEmpty(c("debugProxyServer"))) {
            this.f.a(c("debugProxyServer"), C(), com.meituan.msc.common.utils.y.a(H(), "killWhenSuspend", false));
        }
        if (!isProdEnv) {
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = a;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "7126670f5af4c8d8162cfd12c2f44d02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "7126670f5af4c8d8162cfd12c2f44d02");
            } else {
                String a2 = com.meituan.msc.common.utils.y.a(H(), "shareEnv");
                if (!TextUtils.isEmpty(a2)) {
                    this.f.r.f = a2;
                }
            }
        }
        FrameLayout frameLayout = this.P;
        Object[] objArr8 = {frameLayout};
        ChangeQuickRedirect changeQuickRedirect8 = a;
        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "e0684cf015ab45df6eda4d11df57adc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "e0684cf015ab45df6eda4d11df57adc5");
        } else {
            ViewGroup e = t().e();
            Object[] objArr9 = new Object[5];
            objArr9[0] = this;
            objArr9[1] = frameLayout;
            objArr9[2] = this.r;
            objArr9[3] = e;
            objArr9[4] = Boolean.valueOf(e.getParent() == frameLayout);
            com.meituan.msc.modules.reporter.g.d("attachPageManager", objArr9);
            ax.a(e);
            frameLayout.addView(e, new FrameLayout.LayoutParams(-1, -1));
        }
        if (!h()) {
            e(bundle);
        }
        if (B()) {
            if (!this.L && this.af) {
                this.f.F = this.f.i;
                this.f.i = com.meituan.msc.modules.engine.r.COLD_START;
            }
            MSCActivity mSCActivity = (MSCActivity) C();
            String str = this.r;
            int i = this.K;
            Object[] objArr10 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = a;
            if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect9, false, "72cf9a61754bcf7230de0868765c6fd9", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect9, false, "72cf9a61754bcf7230de0868765c6fd9")).booleanValue();
            } else {
                z = this.g != null && this.g.g();
            }
            com.meituan.msc.modules.container.fusion.c.a(mSCActivity, str, i, z);
        }
        Object[] objArr11 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect10 = a;
        if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect10, false, "ad33c6ace31f41cd48529525bd78347c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect10, false, "ad33c6ace31f41cd48529525bd78347c");
            return;
        }
        an();
        com.meituan.msc.modules.page.q.a(this.f).a("appLaunch", -1, this.v, "", !B());
    }

    @Nullable
    public final String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d8b84a9dc0b698cd8ecdf24543430a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d8b84a9dc0b698cd8ecdf24543430a2");
        }
        if (t() == null || t().b() == null) {
            return null;
        }
        return t().b().f();
    }

    private boolean Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52017e4a9b3696cb7fff5ce60dc70841", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52017e4a9b3696cb7fff5ce60dc70841")).booleanValue() : com.meituan.msc.common.utils.y.a(H(), "_isDspColdStart", false);
    }

    @Nullable
    public final Map<String, String> j() {
        com.meituan.msc.modules.page.e b;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c369f6c01d07c851e212cc8bc2bef5f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c369f6c01d07c851e212cc8bc2bef5f8");
        }
        if (this.I == null || (b = this.I.b()) == null) {
            return null;
        }
        com.meituan.msc.modules.reporter.g.c(this.b, "getTopPageBizTags", b.x());
        return b.x();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.container.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0462b extends com.meituan.msc.modules.apploader.launchtasks.o {
        public static ChangeQuickRedirect f;
        public boolean g;
        public boolean h;
        public long i;
        private final String j;

        @Override // com.meituan.msc.modules.apploader.launchtasks.o, com.meituan.msc.common.aov_task.task.b, com.meituan.msc.common.aov_task.task.c
        public final void a(com.meituan.msc.common.aov_task.context.b bVar) {
        }

        public C0462b(l lVar, boolean z, boolean z2) {
            super("StartPageTaskOfLaunch", lVar);
            Object[] objArr = {lVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5da5b6b803e3a51b59d7b193f7623de", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5da5b6b803e3a51b59d7b193f7623de");
                return;
            }
            this.j = "StartPageTaskOfLaunch@" + Integer.toHexString(hashCode());
            this.i = SystemClock.elapsedRealtime();
            this.g = z;
            this.h = z2;
        }

        @Override // com.meituan.msc.modules.apploader.launchtasks.o
        public final com.meituan.msc.common.support.java.util.concurrent.a<Void> a(@NonNull p pVar, com.meituan.msc.common.aov_task.context.a aVar) {
            String basePackageMinVersion;
            Object[] objArr = {pVar, aVar};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "224de630d25b6c630cd7d0120a74b572", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "224de630d25b6c630cd7d0120a74b572");
            }
            super.a(pVar, aVar);
            b bVar = (b) pVar;
            com.meituan.msc.modules.engine.h a = bVar.a();
            if (MSCHornRollbackConfig.f()) {
                com.meituan.msc.modules.reporter.g.d(this.j, "isCloseMinVersionLogic is true");
            } else if (a.r.h == null) {
                return com.meituan.msc.common.support.java.util.concurrent.a.c((Throwable) new com.meituan.msc.modules.apploader.events.a(2005, "metaInfo is null"));
            } else {
                String basePackageMinVersion2 = a.r.h.getBasePackageMinVersion();
                String n = a.r.n();
                if (!TextUtils.isEmpty(basePackageMinVersion2) && ay.b(basePackageMinVersion2, n)) {
                    PackageLoadReporter.a(a).a(basePackageMinVersion2, true, 1);
                    return com.meituan.msc.common.support.java.util.concurrent.a.c((Throwable) new com.meituan.msc.modules.apploader.events.a(1004, "业务指定的最低版本号与MSC组件对应的基础库版本号不匹配"));
                }
            }
            com.meituan.msc.common.support.java.util.concurrent.a<Void> b = bVar.b(this.g);
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dcd150d9b02fdc60eee102f6f9075eb3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dcd150d9b02fdc60eee102f6f9075eb3");
            } else {
                com.meituan.msc.modules.update.f fVar = bVar.a().r;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.update.f.a;
                if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "7618a5a8fb474aa668f8bc52279b5f73", RobustBitConfig.DEFAULT_VALUE)) {
                    basePackageMinVersion = (String) PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "7618a5a8fb474aa668f8bc52279b5f73");
                } else {
                    AppMetaInfoWrapper appMetaInfoWrapper = fVar.h;
                    basePackageMinVersion = appMetaInfoWrapper == null ? "" : appMetaInfoWrapper.getBasePackageMinVersion();
                }
                if (!TextUtils.isEmpty(basePackageMinVersion)) {
                    PackageLoadReporter.a(bVar.a()).a(basePackageMinVersion, false, ay.a(bVar.a().r.n(), basePackageMinVersion, 0) >= 0 ? 0 : 1);
                }
            }
            return b;
        }
    }

    public final boolean e(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56f29f09f0a6b313c37dfa3ae9f0e0b3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56f29f09f0a6b313c37dfa3ae9f0e0b3")).booleanValue();
        }
        if (this.q) {
            this.q = false;
            if (bundle != null) {
                this.Z = com.meituan.msc.modules.page.reload.d.a(this.Y);
            }
            this.n = this.g.c();
            if (R()) {
                return false;
            }
            this.g.c(true);
            an();
            if (!af()) {
                this.g.a(this.v, new C0462b(this, this.n, A()));
            }
            d(this.v);
            return true;
        }
        return false;
    }

    private boolean R() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c37b614fda469acf1c0fd41b3f935b4f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c37b614fda469acf1c0fd41b3f935b4f")).booleanValue();
        }
        com.meituan.msc.modules.reporter.g.d(this.b, "skipMultiStartPageSameTime isReusingEngine：", Boolean.valueOf(this.n));
        if (MSCHornRollbackConfig.d().c().needRollbackSkipMultiStartPageSameTime) {
            com.meituan.msc.modules.reporter.g.b(this.b, "rollbackSkipMultiStartPageSameTime");
            return false;
        } else if (!A() && this.g.c() && this.g.K_()) {
            String str = this.b;
            com.meituan.msc.modules.reporter.g.a(str, "start new page while firstPage is launching,finish current container" + this + c());
            C().finish();
            return true;
        } else {
            return false;
        }
    }

    private void S() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc35334c35389fa6a5d5d399f932cb82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc35334c35389fa6a5d5d399f932cb82");
            return;
        }
        this.s = c("srcAppId");
        if (!TextUtils.isEmpty(this.s)) {
            this.t = c("extraData");
            this.w = 1037;
            T();
            return;
        }
        this.w = com.meituan.msc.common.utils.y.a(H(), KnbConstants.PARAMS_SCENE, 1001);
    }

    private void T() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10c90b4cff211dd44c9e2dbaef3d8373", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10c90b4cff211dd44c9e2dbaef3d8373");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("srcAppId", this.r);
        a(-1, intent);
    }

    private void U() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5848c983e0a0107f41345463e4e48852", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5848c983e0a0107f41345463e4e48852");
            return;
        }
        this.l = false;
        this.C = false;
        this.af = Q();
        if (MSCHornRollbackConfig.d().c().isRollbackPendingPreloadBiz) {
            o.b.a(this.af);
        }
    }

    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2bf06d82393eebf0c2f91d99ded23bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2bf06d82393eebf0c2f91d99ded23bc");
        } else {
            this.k = j;
        }
    }

    public static /* synthetic */ void a(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80ffc3005de26464e111b20b29a95a5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80ffc3005de26464e111b20b29a95a5f");
        } else {
            com.meituan.msc.common.utils.j.a(activity, true);
        }
    }

    private <T extends View> T b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83b3294c56998b8e46c57af524b09ce9", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83b3294c56998b8e46c57af524b09ce9") : (T) this.E.findViewById(i);
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43e1e33ee584c79ec646353b14463ef1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43e1e33ee584c79ec646353b14463ef1");
        } else {
            this.E.l();
        }
    }

    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c0c3eec161d7ae0b8a2a76b7b62fcd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c0c3eec161d7ae0b8a2a76b7b62fcd7");
            return;
        }
        this.c = this.f.r.y();
        com.meituan.msc.common.executor.a.c(e.a(this));
    }

    public static /* synthetic */ void e(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f57fffbbfaaf8387564b44bff24d0dfc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f57fffbbfaaf8387564b44bff24d0dfc");
        } else {
            bVar.V();
        }
    }

    private void V() {
        String c;
        String c2;
        RequestCreator a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0be8115c18e9b6a53cc478c70571ccd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0be8115c18e9b6a53cc478c70571ccd8");
        } else if (O() && this.R != null && P()) {
            if (this.f.r.v()) {
                c = this.f.r.k();
                c2 = this.f.r.l();
            } else {
                c = c("appName");
                c2 = c("appIcon");
            }
            if (!TextUtils.isEmpty(c)) {
                this.S.setText(c);
            } else {
                this.S.setText("加载中");
            }
            this.T.setVisibility(0);
            this.S.setVisibility(0);
            if (TextUtils.isEmpty(c2) || (a2 = com.meituan.msc.common.utils.r.a(MSCEnvHelper.getContext(), c2, this.f.d())) == null) {
                return;
            }
            a2.a(this.T);
        }
    }

    public final void a(String str, int i, Throwable th) {
        Object[] objArr = {str, Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b4a1af746e9e5c0a9ceb7f9323a7a98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b4a1af746e9e5c0a9ceb7f9323a7a98");
            return;
        }
        com.meituan.msc.modules.reporter.g.a("onLaunchError");
        com.meituan.msc.common.executor.a.c(f.a(this, str, i, th));
    }

    public static /* synthetic */ void a(b bVar, String str, int i, Throwable th) {
        String str2;
        String c;
        String c2;
        Object[] objArr = {bVar, str, Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a5ebbd4f8336e35ea20e5e64830e5208", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a5ebbd4f8336e35ea20e5e64830e5208");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("onLaunchError", "hideLoading");
        bVar.ai();
        bVar.ak();
        bVar.ae();
        if (bVar.l) {
            aw.a("加载模块失败, 请重试", new Object[0]);
            return;
        }
        Object[] objArr2 = {str, Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "7722aead984143f47a087581c83f9c17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "7722aead984143f47a087581c83f9c17");
            return;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "b562688e8cff41ef798d796fccd79572", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "b562688e8cff41ef798d796fccd79572");
        } else if (bVar.U == null) {
            ViewStub viewStub = (ViewStub) bVar.b(R.id.msc_error);
            if (viewStub == null) {
                com.meituan.msc.modules.reporter.g.a(bVar.b, "ensureErrorView viewStub is null");
            } else {
                bVar.U = viewStub.inflate();
                bVar.j = (TextView) bVar.U.findViewById(R.id.load_fail_detail_info);
                Button button = (Button) bVar.U.findViewById(R.id.load_fail_retry_button);
                Button button2 = (Button) bVar.U.findViewById(R.id.load_fail_close_button);
                button.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.modules.container.b.3
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3df5dcf651526f5c27b5a82f2e549175", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3df5dcf651526f5c27b5a82f2e549175");
                        } else if (b.this.A()) {
                            if (!(b.this.G() instanceof MSCWidgetFragment) || ((MSCWidgetFragment) b.this.G()).p() == null) {
                                return;
                            }
                            b.this.a().x = true;
                            ((MSCWidgetFragment) b.this.G()).q();
                            com.meituan.msc.modules.reporter.g.d(b.this.b, "AppId: ", b.this.v(), ", widget fail retry ");
                        } else {
                            Intent intent = b.this.C().getIntent();
                            intent.putExtra("disableReuseAny", true);
                            intent.putExtra("relaunchOnError", true);
                            b.this.f.a(false, com.meituan.msc.modules.engine.p.a(com.meituan.msc.modules.engine.p.LOAD_ERROR));
                            com.meituan.msc.modules.container.fusion.b.b(b.this.r, b.this.H());
                            b.this.b(intent);
                        }
                    }
                });
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.meituan.msc.modules.container.b.4
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr4 = {view};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e15d095eb97b5fd178e1171b0f6c7260", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e15d095eb97b5fd178e1171b0f6c7260");
                            return;
                        }
                        b.this.f.a(false, com.meituan.msc.modules.engine.p.a(com.meituan.msc.modules.engine.p.LOAD_ERROR));
                        com.meituan.msc.modules.container.fusion.b.b(b.this.r, b.this.H());
                    }
                });
                boolean a2 = com.sankuai.waimai.platform.utils.f.a(bVar.H(), "relaunchOnError", false);
                if (bVar.A()) {
                    button.setVisibility(((bVar.G() instanceof MSCWidgetFragment) && ((MSCWidgetFragment) bVar.G()).p() == null) || a2 ? 8 : 0);
                } else {
                    button.setVisibility(a2 ? 8 : 0);
                }
                button2.setVisibility(a2 ? 0 : 8);
            }
        }
        if (TextUtils.isEmpty(str) || bVar.j == null || bVar.U == null) {
            return;
        }
        if (i == 1004) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "c0409c82ad20d1b8f8745b872cbec42a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "c0409c82ad20d1b8f8745b872cbec42a");
                return;
            }
            com.meituan.msc.modules.reporter.g.d(bVar.b, "showLaunchFailView startUpgradeAppPage");
            if (bVar.f.r.v()) {
                c = bVar.f.r.k();
                c2 = bVar.f.r.l();
            } else {
                c = bVar.c("appName");
                c2 = bVar.c("appIcon");
            }
            aj.a(bVar.C(), bVar.r, c, c2, bVar.f.r.w());
            return;
        }
        TextView textView = bVar.j;
        Object[] objArr5 = {str, Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect5 = a;
        if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "1aa7c647113c8cbd6d72ad2a95be1d9a", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "1aa7c647113c8cbd6d72ad2a95be1d9a");
        } else {
            str2 = "请检查网络后重试 (" + i + CommonConstant.Symbol.BRACKET_RIGHT;
        }
        textView.setText(str2);
        bVar.U.setVisibility(0);
    }

    public final void b(String str, int i, Throwable th) {
        Object[] objArr = {str, Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e0bf5ca4862b34740fde95b6e8e68b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e0bf5ca4862b34740fde95b6e8e68b5");
        } else if (this.E.d()) {
            ((MSCActivity) this.E).a(str, i, th);
        } else {
            c(str, i, th);
        }
    }

    public final void c(String str, int i, Throwable th) {
        Object[] objArr = {str, Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0fe6f24ca030cdcc30853d49d935094", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0fe6f24ca030cdcc30853d49d935094");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("msc.launch.point.failed " + str + StringUtil.SPACE + th);
        if (th != null) {
            com.meituan.msc.modules.reporter.g.a(this.b, th);
        }
        if (aj.a(H(), C())) {
            return;
        }
        a(str, i, th);
    }

    public final void b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c76ef1757c8542f3c67e3e02e3c4415c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c76ef1757c8542f3c67e3e02e3c4415c");
        } else {
            this.E.startActivityForResult(intent, -1, null);
        }
    }

    @Override // com.meituan.msc.modules.container.p
    public final void a(Intent intent, int i) {
        Object[] objArr = {intent, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a93c5614412ddbb309c0401ddd577644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a93c5614412ddbb309c0401ddd577644");
        } else {
            this.E.startActivityForResult(intent, 0, null);
        }
    }

    @Override // com.meituan.msc.modules.container.p
    public final void a(Intent intent, int i, NavActivityInfo navActivityInfo) {
        Object[] objArr = {intent, Integer.valueOf(i), navActivityInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20fd03b28f9beda641482d910296eeb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20fd03b28f9beda641482d910296eeb8");
            return;
        }
        if (navActivityInfo != null && TextUtils.equals("openLink", navActivityInfo.fromApiName)) {
            String dataString = intent.getDataString();
            Object[] objArr2 = {dataString};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bca2ec1de6cce7b593c0c95e11dc32f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bca2ec1de6cce7b593c0c95e11dc32f9");
            } else {
                this.aa = dataString;
                if (this.N != null) {
                    this.N.a(dataString, "native");
                }
            }
        }
        this.E.startActivityForResult(intent, i, null);
    }

    @Override // com.meituan.msc.modules.container.p
    public final void a(int i, Intent intent) {
        Object[] objArr = {-1, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d9ae000fde5793a0010f65474a610c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d9ae000fde5793a0010f65474a610c2");
        } else if (C() != null) {
            C().setResult(-1, intent);
        }
    }

    public static Intent a(@NonNull String str, @Nullable Bundle bundle) {
        Object[] objArr = {str, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7eaee65472234c35c94d42e27dd1aa5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Intent) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7eaee65472234c35c94d42e27dd1aa5a");
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(MSCEnvHelper.getContext(), MSCActivity.class));
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("appId", str);
        return intent;
    }

    public final boolean c(Intent intent) {
        boolean z;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d266d383a6b300ed7fb746ea36f74b7e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d266d383a6b300ed7fb746ea36f74b7e")).booleanValue();
        }
        if (!K()) {
            this.z = true;
        }
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67f6d63b08a122c941e896465ea4fc20", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67f6d63b08a122c941e896465ea4fc20")).booleanValue();
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
            com.meituan.msc.modules.reporter.g.d(this.b, "onNewIntent ignore because launched by home");
            return false;
        } else if (this.f == null) {
            com.meituan.msc.modules.reporter.g.e(this.b, Integer.valueOf(this.K), "onNewIntent ignore because mRuntime is null", this.f);
            return false;
        } else {
            String a2 = com.meituan.msc.common.utils.y.a(intent, "targetPath");
            if (!this.f.s.f()) {
                com.meituan.msc.modules.reporter.g.e(this.b, "onNewIntent ignore because mRuntime config is null", a2);
                this.f.p.b("msc.launch.new.intent.error").b();
                return false;
            }
            if (!this.f.r.m(a2)) {
                a2 = this.f.r.f();
            }
            try {
                boolean a3 = com.meituan.msc.common.utils.y.a(intent, "isLivePIPStarted", false);
                if (com.meituan.msc.common.utils.y.a(intent, "relaunch", false)) {
                    com.meituan.msc.modules.reporter.g.d(this.b, "onNewIntent relaunch by intent extra");
                    d(intent);
                    return true;
                }
                if (this.f.r.n(a2)) {
                    if (a3) {
                        com.meituan.msc.modules.reporter.g.d(this.b, "onNewIntent switchTabAction for pip");
                        u().c(a2);
                    } else if (com.meituan.msc.common.utils.y.a(intent, "isFusionApiStarted", false)) {
                        com.meituan.msc.modules.reporter.g.d(this.b, "onNewIntent switchTabPage for fusion mode");
                        u().d(a2);
                    } else {
                        d(intent);
                    }
                } else if (a3) {
                    com.meituan.msc.modules.reporter.g.d(this.b, "onNewIntent navigateBackToPipPage");
                    u().a(a2);
                } else if (G() instanceof AppBrandMSCActivity) {
                    com.meituan.msc.modules.reporter.g.d(this.b, "onNewIntent relaunch for multi app brand mode");
                    d(intent);
                } else {
                    com.meituan.msc.modules.reporter.g.d(this.b, "onNewIntent navigateToPage");
                    u().a(a2, (Integer) null);
                }
                return true;
            } catch (com.meituan.msc.modules.api.b e) {
                com.meituan.msc.modules.reporter.g.b(this.b, e, "reLaunch failed");
                aw.a("页面跳转异常", new Object[0]);
                return false;
            }
        }
    }

    private void d(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a55bbc2a3986b29caa2c58422ebfd52c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a55bbc2a3986b29caa2c58422ebfd52c");
            return;
        }
        if (this.E instanceof Activity) {
            ((Activity) this.E).setIntent(intent);
        }
        U();
        a(System.currentTimeMillis());
        com.meituan.msc.modules.reporter.g.b("onNewIntent relaunch, appId = " + c("appId") + ", targetPath = " + c("targetPath"));
        boolean w = w();
        if (com.meituan.msc.common.utils.y.a(intent, "startFromMinProgram", false)) {
            S();
        } else {
            this.w = 1001;
        }
        if (this.g.e()) {
            this.m = true;
            if (this.e.a()) {
                ab();
            }
        }
        if (w) {
            u().f(this.v);
            aw.b("relaunch existing HeraActivity", new Object[0]);
            return;
        }
        e("reLaunch");
    }

    @Override // com.meituan.msc.modules.container.l
    public final void f(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2266b6b5133333cda72e6a552341bdae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2266b6b5133333cda72e6a552341bdae");
            return;
        }
        String W = W();
        bundle.putString("__msc_stack_save", W);
        com.meituan.msc.modules.page.reload.c.a().a(this.Z, this.r, u(), W);
        bundle.putString("backFromExternalNativeUrl", this.aa);
        super.f(bundle);
    }

    public final void g(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1aaf5a4020d50bd404dc5c770c02dad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1aaf5a4020d50bd404dc5c770c02dad");
        } else {
            b(bundle);
        }
    }

    private String W() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6741f1aaa4d593d207b3280baf981e7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6741f1aaa4d593d207b3280baf981e7e");
        }
        if (this.Y != null) {
            return this.Y;
        }
        return H().getDataString() + "@" + hashCode();
    }

    @Override // com.meituan.msc.modules.container.p
    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3e8d4f6e3e392f236f460341cf263c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3e8d4f6e3e392f236f460341cf263c7");
        } else if (this.Z != null) {
            com.meituan.msc.modules.page.reload.d dVar = this.Z;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.reload.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "00d7a1ceb12f9c41debacb51ac7373f9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "00d7a1ceb12f9c41debacb51ac7373f9");
            } else if (dVar.b != null) {
                while (!dVar.b.empty()) {
                    dVar.b.pop();
                }
            }
        }
    }

    @Override // com.meituan.msc.modules.container.l
    public final void n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58d6e17afb0959e580e54c9d238aee59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58d6e17afb0959e580e54c9d238aee59");
            return;
        }
        super.n();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e0bcfbddf2f83b637c126a637c80608", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e0bcfbddf2f83b637c126a637c80608");
            return;
        }
        com.meituan.msc.modules.page.reload.c.a().a(W());
        com.meituan.msc.common.framework.d.a(this.r);
        com.meituan.msc.common.framework.c.a().b.a(this.r, com.meituan.msc.common.utils.b.c(C()));
        ab();
        if (this.X != null) {
            this.X.run();
            this.X = null;
        }
        if (!this.z) {
            if (this.i.b() != null) {
                com.meituan.msc.modules.reporter.b.a(this.i.b().f(), this.r, "onResumed", A());
            }
        } else {
            this.z = false;
        }
        if (this.ah) {
            this.ah = false;
            com.meituan.msc.common.framework.c.a().e.a("native_init_end");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "90a9d48df7252ac683015e20c3c08ad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "90a9d48df7252ac683015e20c3c08ad9");
        } else if (MSCHornPreloadConfig.n() && this.f.g.b && this.f.s.f()) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (!(PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "248310684c7627929b4d8efff750e1f1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "248310684c7627929b4d8efff750e1f1")).booleanValue() : ((com.meituan.msc.modules.apploader.a) this.f.c(com.meituan.msc.modules.apploader.a.class)).k()) || this.ae) {
                return;
            }
            com.meituan.msc.modules.reporter.g.d(this.b, "preCreatePage");
            w();
            com.meituan.msc.modules.page.m u = u();
            String str = this.v;
            Object[] objArr5 = {str, null};
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.page.m.a;
            if (PatchProxy.isSupport(objArr5, u, changeQuickRedirect5, false, "7aec05d39178ec0e21ef40ed41b7b1eb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, u, changeQuickRedirect5, false, "7aec05d39178ec0e21ef40ed41b7b1eb");
            } else if (u.k || u.j != null) {
            } else {
                u.k = true;
                u.j = u.a(str, (com.meituan.msc.modules.page.reload.a) null, (Boolean) null);
            }
        }
    }

    @Override // com.meituan.msc.modules.container.l
    public final void o() {
        b bVar;
        int d2;
        String f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28de30ef0e22c34cba356cd4b8707584", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28de30ef0e22c34cba356cd4b8707584");
            return;
        }
        super.o();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e72708662e5cf143a39b36caea98f506", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e72708662e5cf143a39b36caea98f506");
            return;
        }
        if (this.E.d() && C().isFinishing()) {
            X();
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5a68a947b8610bd38e1d8fde9c10a82f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5a68a947b8610bd38e1d8fde9c10a82f");
            bVar = this;
        } else {
            if (this.g.e()) {
                this.O.d();
                int h = this.i.h();
                com.meituan.msc.modules.api.legacy.appstate.a aVar = (com.meituan.msc.modules.api.legacy.appstate.a) this.f.c(com.meituan.msc.modules.api.legacy.appstate.a.class);
                if (aVar != null) {
                    if (!"navigateBack".equals(this.ad)) {
                        boolean z = !B();
                        Object[] objArr4 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                        ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.api.legacy.appstate.a.a;
                        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "20ff671ac5f7dab266ce9b3d9e7c0f3f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "20ff671ac5f7dab266ce9b3d9e7c0f3f");
                        } else {
                            Object[] objArr5 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.api.legacy.appstate.a.a;
                            if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "9fa0d71e05ca27a5709aba04d5380ad5", RobustBitConfig.DEFAULT_VALUE)) {
                                d2 = ((Integer) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "9fa0d71e05ca27a5709aba04d5380ad5")).intValue();
                            } else {
                                com.meituan.msc.modules.page.e g = aVar.U_().b().g();
                                d2 = g == null ? -1 : g.d();
                            }
                            com.meituan.msc.modules.page.q a2 = com.meituan.msc.modules.page.q.a(aVar.U_());
                            Object[] objArr6 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect6 = com.meituan.msc.modules.api.legacy.appstate.a.a;
                            if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "090dda355699e05ec6a3e3fc942402fe", RobustBitConfig.DEFAULT_VALUE)) {
                                f = (String) PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "090dda355699e05ec6a3e3fc942402fe");
                            } else {
                                com.meituan.msc.modules.page.e g2 = aVar.U_().b().g();
                                f = g2 == null ? "" : g2.f();
                            }
                            a2.a("navigateBack", d2, "", f, z);
                        }
                    }
                    aVar.b("{\"mode\":\"hang\"}", h, B());
                }
            }
            bVar = this;
            if (bVar.i != null) {
                bVar.i.d(bVar.B ? 17 : 16);
                bVar.B = false;
            }
        }
        if (bVar.i.b() != null) {
            com.meituan.msc.modules.reporter.b.b();
        }
        com.meituan.msc.common.framework.c.a().b.b(bVar.r, com.meituan.msc.common.utils.b.c(C()));
        if ("com.sankuai.youxuan".equalsIgnoreCase(C().getPackageName()) || !C().isFinishing()) {
            return;
        }
        Y();
    }

    public final boolean p() {
        boolean z;
        boolean z2;
        com.meituan.msc.modules.page.l h;
        com.meituan.msc.modules.core.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc7c0d663fedb43a309ffb429a98beb1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc7c0d663fedb43a309ffb429a98beb1")).booleanValue();
        }
        com.meituan.msc.modules.reporter.g.d(this.b, "onBackPressed");
        if (this.U != null && this.U.getVisibility() == 0) {
            com.meituan.msc.modules.reporter.g.d(this.b, "加载异常，onBackPressed 系统默认实现");
            return false;
        } else if (com.meituan.msc.common.utils.n.b(t().b()) && (aVar = (com.meituan.msc.modules.core.a) this.f.c(com.meituan.msc.modules.core.a.class)) != null && this.l) {
            aVar.a();
            return true;
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "098f98cc318528fc7fbc6ae4f66f1f4b", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "098f98cc318528fc7fbc6ae4f66f1f4b")).booleanValue();
            } else {
                if (a(a.BACK)) {
                    com.meituan.msc.modules.reporter.g.d(this.b, "onBackPressed intercepted");
                } else {
                    if (this.i != null) {
                        com.meituan.msc.modules.page.m u = u();
                        com.meituan.msc.modules.page.reload.d dVar = this.Z;
                        Object[] objArr3 = {dVar};
                        ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.page.m.a;
                        if (PatchProxy.isSupport(objArr3, u, changeQuickRedirect3, false, "0dcb4207f62fbeecc34199a81c690198", RobustBitConfig.DEFAULT_VALUE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, u, changeQuickRedirect3, false, "0dcb4207f62fbeecc34199a81c690198")).booleanValue();
                        } else if (u.g() <= 0) {
                            z2 = false;
                        } else {
                            com.meituan.msc.modules.page.l h2 = u.h();
                            if (h2 != null && h2.j()) {
                                z2 = true;
                            } else if (u.g() == 1) {
                                z2 = u.a(dVar);
                            } else {
                                boolean c = u.c(1);
                                if (c && (h = u.h()) != null) {
                                    h.b();
                                }
                                z2 = c;
                            }
                        }
                        if (z2) {
                            com.meituan.msc.modules.reporter.g.d(this.b, "onBackPressed handled by page back");
                        }
                    }
                    if (this.i != null && this.i.d() > 1) {
                        com.meituan.msc.modules.reporter.b.b();
                    }
                    z = false;
                }
                z = true;
            }
            if (z || this.E.a()) {
                return true;
            }
            com.meituan.msc.modules.reporter.g.d(this.b, "onBackPressed 系统默认实现");
            return false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        BACK,
        CLOSE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0acae09d584195a7ac0ea51f383796d2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0acae09d584195a7ac0ea51f383796d2");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "deb956818493f0c899cdf4793bc108e8", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "deb956818493f0c899cdf4793bc108e8") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "54a1ce4d0c021f0610b4f69228686ab0", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "54a1ce4d0c021f0610b4f69228686ab0") : (a[]) values().clone();
        }
    }

    private boolean a(a aVar) {
        com.meituan.msc.modules.page.e b;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7584ae42943368700a565bde1e3fbafb", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7584ae42943368700a565bde1e3fbafb")).booleanValue();
        }
        if (this.i == null || (b = this.i.b()) == null) {
            return false;
        }
        boolean i = b.i();
        if (this.l && i) {
            PageBeforeUnloadParam.sendOnPageBeforeUnload(b, aVar, this.i, this.f);
            return true;
        }
        return false;
    }

    private void X() {
        com.meituan.msc.modules.page.e c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "931f8e583f448427cae93454c87778b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "931f8e583f448427cae93454c87778b8");
        } else if (this.y) {
        } else {
            this.y = true;
            boolean a2 = com.meituan.msc.modules.container.fusion.c.a(this.K);
            com.meituan.msc.modules.container.fusion.c.b(this.K);
            if (a2 || this.i == null || (c = this.i.c()) == null) {
                return;
            }
            a(new u(c.f(), A() ? "widgetDestroy" : "navigateBackUtil"), c.d(), -1, (String) null);
            this.A = true;
            if (this.N != null) {
                this.N.b(c.f(), String.valueOf(c.d()));
            }
        }
    }

    @Override // com.meituan.msc.modules.container.p
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbb9c23e6f8be503991fbdabd7c2b3d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbb9c23e6f8be503991fbdabd7c2b3d6");
        } else if (this.l && a(a.CLOSE)) {
        } else {
            b("navigationBarClickClose");
        }
    }

    @Override // com.meituan.msc.modules.container.p
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c7ac65cb976b0df50d7224ff2cc7f58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c7ac65cb976b0df50d7224ff2cc7f58");
            return;
        }
        com.meituan.msc.extern.i.a().a(this.r, H());
        com.meituan.msc.modules.reporter.g.d(this.b, "handleCloseApp");
        this.ad = str;
        if (this.E.d()) {
            ((MSCActivity) this.E).b();
        } else {
            com.meituan.msc.modules.reporter.g.e(this.b, "cannot close app in widget");
        }
    }

    public final void a(int i, int i2, Intent intent) {
        Uri parse;
        Bundle extras;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb5f59f213da155feb7cdef02bac42dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb5f59f213da155feb7cdef02bac42dc");
            return;
        }
        com.meituan.msc.modules.reporter.g.a(this.b, "onActivityResult: ", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 96 && i2 == -1) {
            this.s = com.sankuai.waimai.platform.utils.f.a(intent, "srcAppId");
            if (!TextUtils.isEmpty(this.s)) {
                this.t = com.sankuai.waimai.platform.utils.f.a(intent, "extraData");
                this.w = 1038;
            }
        } else if (this.aa == null || i2 != -1) {
            if (i == 99 && intent != null) {
                Object[] objArr2 = {intent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7774d0a217f83ffba5829905a61bd92", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7774d0a217f83ffba5829905a61bd92");
                } else {
                    String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "result_url");
                    boolean isProdEnv = MSCEnvHelper.getEnvInfo().isProdEnv();
                    if (a2 != null && !isProdEnv && (parse = Uri.parse(a2)) != null) {
                        this.f.a(parse.getQueryParameter("debugProxyServer"), C(), com.meituan.msc.common.utils.y.a(H(), "killWhenSuspend", false));
                    }
                }
            }
        } else if (intent != null && (extras = intent.getExtras()) != null) {
            this.t = ab.a(extras).toString();
        }
        this.X = g.a(this, i, i2, intent);
    }

    public static /* synthetic */ void a(b bVar, int i, int i2, Intent intent) {
        Object[] objArr = {bVar, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72ebf1e434fb4b7480d086456cd0d5f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72ebf1e434fb4b7480d086456cd0d5f5");
        } else if (bVar.f == null || bVar.f.c(s.class) == null) {
        } else {
            ((s) bVar.f.c(s.class)).a(bVar, i, i2, intent);
        }
    }

    public final void a(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        Object[] objArr = {Integer.valueOf(i), strArr, iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c7e676bb93cf49b0ee84ecd2047f8f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c7e676bb93cf49b0ee84ecd2047f8f6");
        } else {
            this.O.a(i, strArr, iArr);
        }
    }

    @Override // com.meituan.msc.modules.container.l
    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a23ed7ccd1277804f51799ee2f7c685", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a23ed7ccd1277804f51799ee2f7c685");
            return;
        }
        Y();
        super.r();
    }

    @MainThread
    private void Y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0defb4fc9ee0d53ec094fc4ed45e628a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0defb4fc9ee0d53ec094fc4ed45e628a");
        } else if (this.x) {
        } else {
            this.x = true;
            Z();
            if (this.E.d() && C().isFinishing()) {
                if (!MSCHornRollbackConfig.d().c().isRollbackNotSendNavigateBackAtHWMultiWindowMode && com.meituan.msc.common.utils.l.a(C()) && this.f.b().i() > 1) {
                    com.meituan.msc.modules.reporter.g.d(this.b, "disable sendNavigateBackWhenActivityClosed at huawei magic mode");
                } else {
                    X();
                }
                com.meituan.msc.modules.page.reload.c.a().a(this.Y);
                com.meituan.msc.modules.container.fusion.c.a((MSCActivity) this.E, this.K);
            }
            if (A()) {
                X();
                com.meituan.msc.modules.page.reload.c.a().a(this.Y);
            }
            if (u() != null) {
                u().a();
            }
            if (this.V != null) {
                this.V.a();
            }
            com.meituan.msc.modules.reporter.b.a().b(this.r);
            if (this.f != null) {
                this.f.a(this.an);
                this.f.a(this.ao);
            }
            ad();
            aa();
            com.meituan.msc.modules.page.q.a(this.f).b();
        }
    }

    private void Z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78c995dd7d6d9c291c64994a0b98899b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78c995dd7d6d9c291c64994a0b98899b");
            return;
        }
        com.meituan.msc.modules.page.m u = u();
        if (u != null) {
            u.b();
        } else {
            com.meituan.msc.modules.reporter.g.d(this.b, "releaseReleaseOfStartPageTask pageManager null");
        }
    }

    private void aa() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b4e2fa748b61e5dbe07cf9fd1ee8311", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b4e2fa748b61e5dbe07cf9fd1ee8311");
        } else if (this.f != null) {
            if (this.ac || !this.l) {
                this.f.p.a("msc.page.exit.success.rate").a("errorCode", !this.l ? "7001" : "9000").a(0.0d).c();
            }
        }
    }

    private void ab() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffd46f7ddba72df98dabd0aab1380ff8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffd46f7ddba72df98dabd0aab1380ff8");
        } else if (this.E.d()) {
            ((MSCActivity) this.E).o();
        } else {
            s();
        }
    }

    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed79d5ace4a4bcf8d5dc5be48f5ea3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed79d5ace4a4bcf8d5dc5be48f5ea3c");
            return;
        }
        if (this.g.e()) {
            this.O.e();
            Map<String, Object> hashMap = new HashMap<>();
            if (this.m) {
                hashMap.put("openType", "reLaunch");
            } else if (this.n && !this.o && !this.l && !this.L) {
                if (!this.f.r.n(this.v)) {
                    hashMap = ac();
                }
                hashMap.put("openType", this.f.r.n(this.v) ? "reLaunch" : "navigateTo");
            } else if (this.s != null) {
                if (this.w == 1038) {
                    hashMap = ac();
                    hashMap.put("openType", "navigateBack");
                    if (this.p) {
                        this.s = null;
                        this.t = null;
                    }
                } else {
                    hashMap.put("openType", "appLaunch");
                }
            } else {
                hashMap = ac();
            }
            if (A() || this.m || (!this.l && !this.L)) {
                hashMap.put("path", this.v);
            }
            hashMap.put(KnbConstants.PARAMS_SCENE, Integer.valueOf(this.w));
            String jSONObject = ab.a(hashMap).toString();
            com.meituan.msc.modules.page.e b = this.i.b();
            int d2 = b != null ? b.d() : 0;
            com.meituan.msc.modules.api.legacy.appstate.a aVar = (com.meituan.msc.modules.api.legacy.appstate.a) this.f.c(com.meituan.msc.modules.api.legacy.appstate.a.class);
            if (aVar != null) {
                aVar.a(jSONObject, d2, B());
            }
        }
        if (!this.m) {
            t().f();
        }
        this.m = false;
    }

    private Map<String, Object> ac() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a1a4dae5973a2e9ad23afb892d854e5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a1a4dae5973a2e9ad23afb892d854e5");
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("appId", this.s);
        if (this.aa != null) {
            hashMap2.put("url", this.aa);
            this.aa = null;
        }
        if (this.t != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.t);
                Object opt = jSONObject.opt("extraData");
                if (opt != null) {
                    jSONObject = opt;
                }
                hashMap2.put("extraData", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.t = null;
        }
        hashMap.put("referrerInfo", hashMap2);
        return hashMap;
    }

    @Override // com.meituan.msc.common.framework.interfaces.b
    public final synchronized void a(String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ced9f6a7763ac326e90afecc89b59ef4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ced9f6a7763ac326e90afecc89b59ef4");
            return;
        }
        com.meituan.msc.modules.reporter.g.d(this.b, "onPageFirstRender", this.r, str);
        ad();
        if (!this.l) {
            this.l = true;
            o.b.a(false);
            Object[] objArr2 = {hashMap};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "69903ee173a7fe90f07d27208dd6d629", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "69903ee173a7fe90f07d27208dd6d629");
            } else {
                com.meituan.msc.modules.reporter.g.d("Launch", "onActivityFirstRender");
                M.post(h.a(this));
                com.meituan.msc.common.executor.a.c(new Runnable() { // from class: com.meituan.msc.modules.container.b.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cf8714dc7fcd40c15af25e410ee9c97b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cf8714dc7fcd40c15af25e410ee9c97b");
                            return;
                        }
                        b.this.ai();
                        b.this.ak();
                    }
                });
                com.meituan.msc.modules.engine.l.a(this.r);
            }
            final com.meituan.msc.modules.preload.d a2 = com.meituan.msc.modules.preload.d.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.msc.modules.preload.d.a;
            if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "590d494bb407b0d65dd9c069f8dc52e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "590d494bb407b0d65dd9c069f8dc52e9");
            } else if (MSCHornRollbackConfig.d().c().isRollbackPendingPreloadBiz) {
                com.meituan.msc.modules.reporter.g.d("PendingBizPreloadTasksManager", "isRollbackPendingPreloadBiz is true");
            } else {
                com.meituan.msc.common.executor.a.a(new a.c.C0433a(new Runnable() { // from class: com.meituan.msc.modules.preload.d.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6fbc1e20f684ae1eb82818a07d8b79c5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6fbc1e20f684ae1eb82818a07d8b79c5");
                            return;
                        }
                        com.meituan.msc.modules.reporter.g.d("PendingBizPreloadTasksManager", "startPreloadPendingBizs");
                        d.a(a2, (a) a2.b.poll());
                    }
                }, MSCHornPreloadConfig.d().c().startPendingPreloadBizTaskAfterFP * 1000));
            }
            com.meituan.msc.modules.preload.g gVar = com.meituan.msc.modules.preload.g.b;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.meituan.msc.modules.preload.g.a;
            if (PatchProxy.isSupport(objArr4, gVar, changeQuickRedirect4, false, "e3e434fc2c52cdcf06c9fe8e535a804e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, gVar, changeQuickRedirect4, false, "e3e434fc2c52cdcf06c9fe8e535a804e");
            } else {
                com.meituan.msc.modules.reporter.g.d("PreloadTasksManager", "preloadBasePackageAgainAfterFP");
                gVar.a(MSCHornPreloadConfig.d().c().startPreloadBaseTaskAfterFP * 1000);
            }
            final com.meituan.msc.modules.update.metainfo.a a3 = com.meituan.msc.modules.update.metainfo.a.a();
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = com.meituan.msc.modules.update.metainfo.a.a;
            if (PatchProxy.isSupport(objArr5, a3, changeQuickRedirect5, false, "eb0c18eea49d43591185a4875f95f836", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, a3, changeQuickRedirect5, false, "eb0c18eea49d43591185a4875f95f836");
            } else if (MSCHornRollbackConfig.d().c().isRollbackBatchCheckUpdateAtColdStart) {
                com.meituan.msc.modules.reporter.g.d("bundle", "rollback batchCheckUpdateAgain");
            } else if (com.meituan.msc.modules.update.metainfo.a.f) {
                com.meituan.msc.common.executor.a.a(new a.c.C0433a(new Runnable() { // from class: com.meituan.msc.modules.update.metainfo.a.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = a;
                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "02fff612e1759c910bc110e7f6c91b81", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "02fff612e1759c910bc110e7f6c91b81");
                        } else {
                            a.a().b();
                        }
                    }
                }, MSCHornPreloadConfig.d().c().batchCheckUpdateDelayAfterFP * 1000));
            }
        }
        com.meituan.msc.common.executor.a.c(new x(this, this.f, str), 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83ef73b1a2cb62b3bb60fd30dcfb155d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83ef73b1a2cb62b3bb60fd30dcfb155d");
            return;
        }
        if (this.ab != null) {
            this.ab.d((com.meituan.msc.common.support.java.util.concurrent.a<Void>) null);
        }
        ae();
    }

    private void ae() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc7673335f9568ead772af330c986a5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc7673335f9568ead772af330c986a5f");
        } else if (u() != null) {
            u().k();
        }
    }

    public static /* synthetic */ void d(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e318197c4736ba1f02166e039039e18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e318197c4736ba1f02166e039039e18");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "e77f01ea04722aa0e46b0302512c67a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "e77f01ea04722aa0e46b0302512c67a9");
        } else if (bVar.V == null) {
            bVar.V = new com.meituan.msc.modules.api.input.d(bVar.C());
            bVar.V.c = bVar;
            bVar.P.post(j.a(bVar));
        }
    }

    @Override // com.meituan.msc.modules.container.p
    public final com.meituan.msc.modules.page.c t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65f15c305e24920009d30ac79c1884c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65f15c305e24920009d30ac79c1884c6");
        }
        if (this.I == null) {
            this.I = new com.meituan.msc.modules.page.n(this, this.f);
        }
        return this.I;
    }

    public static /* synthetic */ void c(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70f6ee856249bf6336d80262309ec6c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70f6ee856249bf6336d80262309ec6c7");
            return;
        }
        Integer valueOf = bVar.H().hasExtra("openSeq") ? Integer.valueOf(com.sankuai.waimai.platform.utils.f.a(bVar.H(), "openSeq", 0)) : null;
        com.meituan.msc.modules.page.m u = bVar.u();
        String str = bVar.v;
        Object[] objArr2 = {str, valueOf};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.m.a;
        if (PatchProxy.isSupport(objArr2, u, changeQuickRedirect2, false, "1d7f4bf9e3e4b2b1ddf2a1b827c93a94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, u, changeQuickRedirect2, false, "1d7f4bf9e3e4b2b1ddf2a1b827c93a94");
        } else {
            u.a(str, valueOf, false);
        }
    }

    private boolean af() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8e4d89634dcf1874246fefeefb2d870", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8e4d89634dcf1874246fefeefb2d870")).booleanValue();
        }
        if (this.n && this.Z != null) {
            ai();
            if (this.Z.a()) {
                this.ae = true;
                this.Z.a(new d.a() { // from class: com.meituan.msc.modules.container.b.2
                    public static ChangeQuickRedirect a;

                    @Override // com.meituan.msc.modules.page.reload.d.a
                    public final void a(com.meituan.msc.modules.page.reload.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b6857afcebed38ca997056613d73dfb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b6857afcebed38ca997056613d73dfb");
                            return;
                        }
                        com.meituan.msc.modules.reporter.g.d(b.this.b, "reloadTopOfStack");
                        b.this.t().a(aVar);
                    }
                });
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void b(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa77ebabcfafef351d5a7c001a649560", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa77ebabcfafef351d5a7c001a649560");
        } else if (bVar.L()) {
        } else {
            bVar.ah();
        }
    }

    private void ag() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2054a576781f6e67ec775fd875b88bf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2054a576781f6e67ec775fd875b88bf5");
        } else if (this.R == null) {
            ViewStub viewStub = (ViewStub) b(R.id.msc_loading);
            if (viewStub != null) {
                this.R = (LinearLayout) viewStub.inflate();
                this.S = (TextView) this.R.findViewById(R.id.msc_title);
                this.T = (ImageView) this.R.findViewById(R.id.msc_icon);
                return;
            }
            com.meituan.msc.modules.reporter.g.a(this.b, "ensureLoadingView viewStub is null");
        }
    }

    private void ah() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eadf1e05e47836b47ccebc3404319fec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eadf1e05e47836b47ccebc3404319fec");
            return;
        }
        ag();
        com.meituan.msc.modules.reporter.g.d(this.b, "showLoadingView:", this.R);
        if (this.R != null) {
            this.R.setVisibility(0);
        }
        V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1673ce9bfc38e890567b97d75e705b59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1673ce9bfc38e890567b97d75e705b59");
            return;
        }
        M.removeCallbacks(this.ai);
        com.meituan.msc.modules.reporter.g.d(this.b, "hideLoadingView:", this.R);
        if (this.R != null) {
            this.R.setVisibility(8);
        }
    }

    private void aj() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d54e6689ec51e1980c839a3231611b62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d54e6689ec51e1980c839a3231611b62");
        } else if (this.Q != null) {
            this.Q.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a8e71b102d4bee11019feac523fb623", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a8e71b102d4bee11019feac523fb623");
        } else if (this.Q != null) {
            this.Q.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01b7  */
    @Override // com.meituan.msc.common.framework.interfaces.b
    @android.support.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.meituan.msc.modules.container.u r19, int r20, int r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.container.b.a(com.meituan.msc.modules.container.u, int, int, java.lang.String):void");
    }

    private void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6e9cbfe5e56259bf04ade7d44aff590", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6e9cbfe5e56259bf04ade7d44aff590");
            return;
        }
        com.meituan.msc.modules.engine.h hVar = this.f;
        com.meituan.msc.modules.update.f fVar = hVar.r;
        if (fVar == null || !fVar.v()) {
            return;
        }
        map.put("appId", hVar.a());
        map.put("appName", fVar.k());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r22, int r23) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.container.b.a(java.lang.String, int):void");
    }

    @MainThread
    private synchronized void b(final String str, final int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b3ba1f801a794433548f970465348a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b3ba1f801a794433548f970465348a2");
            return;
        }
        this.aj.add(new Runnable() { // from class: com.meituan.msc.modules.container.b.5
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84acd0e0c3763f01b3268be48bae4603", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84acd0e0c3763f01b3268be48bae4603");
                } else {
                    b.this.a(str, i);
                }
            }
        });
        if (this.g.e()) {
            al();
        } else {
            com.meituan.msc.modules.reporter.g.d(this.b, "onAppRoute cached, framework not ready");
        }
    }

    @MainThread
    private synchronized void al() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b485dbecd1029558d2ff5fcad2148fa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b485dbecd1029558d2ff5fcad2148fa5");
            return;
        }
        if (!this.ak) {
            com.meituan.msc.modules.reporter.g.d(this.b, "will sendPendingOnAppRoutes");
            this.ak = true;
        }
        for (Runnable runnable : this.aj) {
            runnable.run();
        }
        this.aj.clear();
    }

    public final void a(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0ae2101fc96b8edb367cc8164ca3d58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0ae2101fc96b8edb367cc8164ca3d58");
        } else if (this.al) {
            c(map);
        } else {
            this.am.add(map);
        }
    }

    private void am() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58eb38873f84d6306b553ae26765d63c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58eb38873f84d6306b553ae26765d63c");
            return;
        }
        for (Map<String, Object> map : this.am) {
            c(map);
        }
        this.am.clear();
    }

    private void c(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "325cc49c27687568618af56150117a21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "325cc49c27687568618af56150117a21");
        } else {
            ((WidgetListener) this.f.a(WidgetListener.class)).onWidgetDataChange(ab.b(map), this.i.h());
        }
    }

    @Override // com.meituan.msc.modules.api.input.c
    public final void a(int i, int i2) {
        int i3 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "799408525af70664bd200f3880b3cc94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "799408525af70664bd200f3880b3cc94");
            return;
        }
        for (com.meituan.msc.modules.api.input.c cVar : this.W) {
            cVar.a(i, i2);
        }
        Activity C = C();
        if (i != 0 && (i3 = av.a(C)) == 0 && Build.VERSION.SDK_INT >= 23 && C != null && C.getWindow() != null) {
            i3 = C.getWindow().getDecorView().getRootWindowInsets().getSystemWindowInsetBottom();
        }
        KeyboardApi.OnKeyboardHeightChangeParams onKeyboardHeightChangeParams = new KeyboardApi.OnKeyboardHeightChangeParams();
        onKeyboardHeightChangeParams.height = com.meituan.msc.common.utils.n.a(i - i3);
        this.f.m.a("onGlobalKeyboardHeightChange", onKeyboardHeightChangeParams);
    }

    @Override // com.meituan.msc.modules.container.p
    public final void a(com.meituan.msc.modules.api.input.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "595406753f324d55037b07a54b584fe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "595406753f324d55037b07a54b584fe1");
        } else {
            this.W.add(cVar);
        }
    }

    @Override // com.meituan.msc.modules.container.p
    public final void b(com.meituan.msc.modules.api.input.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "364a4e413ed64631abc646afc243e991", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "364a4e413ed64631abc646afc243e991");
        } else {
            this.W.remove(cVar);
        }
    }

    public static /* synthetic */ void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7676518be4d17a4a91ffa286f4ba13c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7676518be4d17a4a91ffa286f4ba13c0");
            return;
        }
        com.meituan.msc.modules.api.input.d dVar = bVar.V;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.api.input.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "da1e08995618b464e76baa17823e089a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "da1e08995618b464e76baa17823e089a");
        } else if (dVar.isShowing() || dVar.d == null || dVar.d.getWindowToken() == null || dVar.b == null || dVar.b.isFinishing()) {
        } else {
            dVar.setBackgroundDrawable(new ColorDrawable(0));
            try {
                com.sankuai.waimai.platform.utils.p.a(dVar, dVar.d, 0, 0, 0);
            } catch (Exception e) {
                com.meituan.msc.modules.reporter.g.a("KeyboardHeightProvider", e);
            }
            Rect rect = new Rect();
            dVar.d.getWindowVisibleDisplayFrame(rect);
            dVar.e = rect.height();
        }
    }

    @Override // com.meituan.msc.modules.container.p
    @Deprecated
    public final com.meituan.msc.modules.page.m u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c1dbc9a5698ddbcbaed9a3e8366c245", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.m) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c1dbc9a5698ddbcbaed9a3e8366c245");
        }
        if (this.i != null) {
            return this.i.g();
        }
        return null;
    }

    public final String v() {
        return this.r;
    }

    public final com.meituan.msc.common.support.java.util.concurrent.a<Void> b(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdbb3237e776f3fa4e90169ad746ad89", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdbb3237e776f3fa4e90169ad746ad89");
        }
        final String buildEventName = PerfTrace.buildEventName("ContainerController", "startPage", hashCode());
        PerfTrace.begin(buildEventName);
        this.ab = new com.meituan.msc.common.support.java.util.concurrent.a<>();
        Runnable runnable = new Runnable() { // from class: com.meituan.msc.modules.container.b.8
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0538c3247b4916c36f6bc18196e390d9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0538c3247b4916c36f6bc18196e390d9");
                    return;
                }
                String str = buildEventName + "_inner";
                PerfTrace.begin(str);
                com.meituan.msc.modules.reporter.g.d("StartPage post=> ", b.this, Boolean.valueOf(b.this.A()), Boolean.valueOf(z), Boolean.valueOf(b.this.e.d));
                if (b.this.C().isDestroyed() || b.this.C().isFinishing() || b.this.L()) {
                    PerfTrace.end(str).a("error", "pageDestroyed");
                    PerfTrace.end(buildEventName).a("error", "pageDestroyed");
                } else if (b.h(b.this)) {
                    b.a(b.this, true);
                    b.this.ad();
                    PerfTrace.end(str).a("error", "pageNotFound");
                    PerfTrace.end(buildEventName).a("error", "pageNotFound");
                } else {
                    if (b.this.A()) {
                        b.j(b.this);
                    } else if (!z || !b.this.e.d) {
                        b.this.o = true;
                        b.j(b.this);
                    } else {
                        b.this.k();
                        b.this.w();
                        b.k(b.this);
                    }
                    PerfTrace.end(str);
                    PerfTrace.end(buildEventName);
                }
            }
        };
        com.meituan.msc.modules.reporter.g.d("StartPage => ", this, Boolean.valueOf(A()), Boolean.valueOf(z), Boolean.valueOf(this.e.d));
        if (z && !this.e.d) {
            com.meituan.msc.common.executor.a.c(runnable);
        } else {
            com.meituan.msc.common.executor.a.d(runnable);
        }
        return this.ab;
    }

    private void an() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62f71cba7444c2ae8d2cb36b696853a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62f71cba7444c2ae8d2cb36b696853a7");
            return;
        }
        this.u = c();
        this.v = this.u;
        if (this.f.r == null || !this.f.r.v() || !this.f.s.f()) {
            com.meituan.msc.modules.reporter.g.e("checkLaunchPath", "empty metaInfo or config");
        } else if (this.v == null) {
            this.v = this.f.r.f();
        }
    }

    public final boolean w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dff80d45428f74f9778d4865fbe1863", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dff80d45428f74f9778d4865fbe1863")).booleanValue();
        }
        an();
        return this.f.r.m(this.v);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c601cd8274f935723e0e84edc1a9b927", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c601cd8274f935723e0e84edc1a9b927");
        } else if (i == 5 || i == 10 || i == 15) {
            com.meituan.msc.modules.api.legacy.appstate.a aVar = (com.meituan.msc.modules.api.legacy.appstate.a) this.f.c(com.meituan.msc.modules.api.legacy.appstate.a.class);
            if (aVar != null) {
                Object[] objArr2 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.api.legacy.appstate.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ca1a96aedb55c8970cf1c282e0b2f30e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ca1a96aedb55c8970cf1c282e0b2f30e");
                } else {
                    aVar.c().onMemoryWarning(i);
                }
            }
            a(i, "msc.stability.count.memory.warning");
        } else {
            a(i, "msc.stability.count.memory.warning.V2");
        }
    }

    private void a(int i, String str) {
        com.meituan.msc.common.report.a N;
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e913acb6a13a0c26320ccb7d136007", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e913acb6a13a0c26320ccb7d136007");
            return;
        }
        com.meituan.msc.modules.page.e b = t().b();
        if (b == null || (N = b.l()) == null) {
            N = N();
        }
        if (N == null) {
            com.meituan.msc.modules.reporter.g.d(this.b, "reportMemoryWarning reporter is null");
        } else {
            N.b(str).a("level", Integer.valueOf(i)).a("pagePath", am.b(i())).a("isForeground", Boolean.valueOf(K())).c();
        }
    }

    private void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8108a2164a147302f6a14cf885304d0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8108a2164a147302f6a14cf885304d0b");
            return;
        }
        com.meituan.msc.modules.reporter.g.d(this.b, "onPageNotFound");
        ai();
        ak();
        this.i.a(this.v, str);
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c7f1a16cc7cc26e00802a5e4b893dd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c7f1a16cc7cc26e00802a5e4b893dd9");
        }
        String str = "ContainerController{" + Integer.toHexString(hashCode());
        if (A()) {
            return str + " widget in activity: " + C() + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
        }
        return str + " for activity: " + C() + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }

    public final void x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22832a73ad3430f818be2ff5b61e527b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22832a73ad3430f818be2ff5b61e527b");
            return;
        }
        com.meituan.msc.modules.page.e c = t().c();
        if (c != null) {
            Activity C = C();
            com.meituan.msc.modules.page.transition.c m = c.m();
            Object[] objArr2 = {C, m};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.page.transition.c.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d0c4f5be7a5fff7ed7a4fa89a4c659b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d0c4f5be7a5fff7ed7a4fa89a4c659b3");
            } else if (C == null || m == null || !m.d || m.c != 1) {
            } else {
                C.overridePendingTransition(0, R.anim.msc_fade_out);
            }
        }
    }

    public final Map<String, Object> y() {
        com.meituan.msc.modules.page.render.a l;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7986ecfcf605e46e1cd56a2e706b8cd3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7986ecfcf605e46e1cd56a2e706b8cd3");
        }
        com.meituan.msc.modules.page.e b = t().b();
        if (b == null || (l = b.l()) == null) {
            return null;
        }
        return l.e();
    }
}
