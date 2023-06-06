package com.meituan.msc.modules.page;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.meituan.msc.common.utils.am;
import com.meituan.msc.common.utils.ax;
import com.meituan.msc.common.utils.ay;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.container.u;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.modules.engine.MSCHornRollbackConfig;
import com.meituan.msc.modules.page.reload.d;
import com.meituan.msc.modules.page.transition.d;
import com.meituan.msc.modules.page.widget.LoadingDialog;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class m {
    public static ChangeQuickRedirect a;
    protected final com.meituan.msc.modules.engine.h b;
    protected final com.meituan.msc.modules.container.p c;
    protected final com.meituan.msc.common.framework.interfaces.b d;
    protected final Activity e;
    protected final com.meituan.msc.modules.page.transition.d f;
    protected boolean g;
    protected d.a h;
    protected com.meituan.msc.modules.container.fusion.b i;
    public volatile com.meituan.msc.modules.page.a j;
    public volatile boolean k;
    LoadingDialog l;
    private volatile Runnable m;

    public m(com.meituan.msc.modules.container.p pVar, com.meituan.msc.modules.engine.h hVar) {
        Object[] objArr = {pVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80de1d46dbf47cb7629f74bfe7276491", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80de1d46dbf47cb7629f74bfe7276491");
            return;
        }
        this.i = MSCEnvHelper.getFusionPageManager();
        this.c = pVar;
        this.e = this.c.C();
        this.b = hVar;
        com.meituan.msc.modules.page.transition.d dVar = new com.meituan.msc.modules.page.transition.d(this.e);
        dVar.b = new d.a() { // from class: com.meituan.msc.modules.page.m.1
            public static ChangeQuickRedirect a;
            public final ViewTreeObserver.OnGlobalLayoutListener b = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.meituan.msc.modules.page.m.1.1
                public static ChangeQuickRedirect a;
                private int c = 0;
                private int d = 0;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dce10d4ac9e85bf86f1e0b1e1a8ff467", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dce10d4ac9e85bf86f1e0b1e1a8ff467");
                        return;
                    }
                    int height = m.this.f.getHeight();
                    int width = m.this.f.getWidth();
                    l h = m.this.h();
                    if (this.c != 0 && this.d != 0 && h != null) {
                        if (this.c != height || this.d != width) {
                            h.d();
                        }
                        if (this.c + 100 < height) {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = l.h;
                            if (PatchProxy.isSupport(objArr3, h, changeQuickRedirect3, false, "88cbd1387e1f1696a6313c8246c6722b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, h, changeQuickRedirect3, false, "88cbd1387e1f1696a6313c8246c6722b");
                            } else {
                                h.getContentScroller().a();
                            }
                        }
                    }
                    this.c = height;
                    this.d = width;
                }
            };

            @Override // com.meituan.msc.modules.page.transition.d.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68b1a6d29f449282c8510aa9452d173e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68b1a6d29f449282c8510aa9452d173e");
                } else {
                    m.this.f.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
                }
            }

            @Override // com.meituan.msc.modules.page.transition.d.a
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "825bb6e2492c5c3946e66ab84ba2e130", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "825bb6e2492c5c3946e66ab84ba2e130");
                } else {
                    m.this.f.getViewTreeObserver().addOnGlobalLayoutListener(this.b);
                }
            }
        };
        this.f = dVar;
        this.d = this.c.e();
        this.h = new d.a() { // from class: com.meituan.msc.modules.page.m.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.page.reload.d.a
            public final void a(com.meituan.msc.modules.page.reload.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ec1a841589a1ed53dc591d20390ab11", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ec1a841589a1ed53dc591d20390ab11");
                } else {
                    m.this.a(aVar);
                }
            }
        };
    }

    @MainThread
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce68d1282af7a9b2ebef31a259c65148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce68d1282af7a9b2ebef31a259c65148");
            return;
        }
        for (int i = 0; i < g(); i++) {
            View childAt = this.f.getChildAt(i);
            if (childAt instanceof com.meituan.msc.modules.page.a) {
                ((com.meituan.msc.modules.page.a) childAt).a();
            }
        }
    }

    public final void a(final com.meituan.msc.modules.page.reload.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a0ea12f82b5e0ddcbe5a469c91a19d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a0ea12f82b5e0ddcbe5a469c91a19d");
            return;
        }
        final String str = aVar.a;
        g(str);
        a(str, new Runnable() { // from class: com.meituan.msc.modules.page.m.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6ce3e05822e0ee088b7dd1c8e90b749", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6ce3e05822e0ee088b7dd1c8e90b749");
                    return;
                }
                l h = m.this.h();
                l a2 = m.this.a(str, aVar);
                a2.d(str);
                if (h != null) {
                    a2.h();
                    m.this.f.removeView(h);
                }
            }
        });
    }

    private void a(String str, Runnable runnable) {
        Object[] objArr = {str, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56e43d9be363ae1a06e2d224146fcd01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56e43d9be363ae1a06e2d224146fcd01");
            return;
        }
        h(str);
        ((com.meituan.msc.modules.apploader.a) this.b.c(com.meituan.msc.modules.apploader.a.class)).a(str, new a("startPageByRoute", this.c, this, runnable));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends com.meituan.msc.modules.apploader.launchtasks.o {
        public static ChangeQuickRedirect f;
        m g;
        Runnable h;

        public a(String str, com.meituan.msc.modules.container.p pVar, m mVar, Runnable runnable) {
            super(str, pVar);
            Object[] objArr = {str, pVar, mVar, runnable};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73478fc94b9aadd54f5e44f43b30e50a", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73478fc94b9aadd54f5e44f43b30e50a");
                return;
            }
            this.g = mVar;
            this.h = runnable;
        }

        @Override // com.meituan.msc.modules.apploader.launchtasks.o
        public final com.meituan.msc.common.support.java.util.concurrent.a<Void> a(@NonNull com.meituan.msc.modules.container.p pVar, com.meituan.msc.common.aov_task.context.a aVar) {
            Object[] objArr = {pVar, aVar};
            ChangeQuickRedirect changeQuickRedirect = f;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a31540037429264a2244f19d53cdb48", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.meituan.msc.common.support.java.util.concurrent.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a31540037429264a2244f19d53cdb48");
            }
            if (this.h == null) {
                com.meituan.msc.modules.reporter.g.d("PageManager", "launchPageByRoute cancel,startPageRunnable is null");
                return com.meituan.msc.common.support.java.util.concurrent.a.c((Object) null);
            } else if (this.g == null) {
                com.meituan.msc.modules.reporter.g.d("PageManager", "launchPageByRoute cancel,mPageContainer is null");
                return com.meituan.msc.common.support.java.util.concurrent.a.c((Object) null);
            } else {
                com.meituan.msc.common.executor.a.c(new Runnable() { // from class: com.meituan.msc.modules.page.m.a.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4c1913bae8f3b1610a6e960a204721a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4c1913bae8f3b1610a6e960a204721a");
                            return;
                        }
                        com.meituan.msc.modules.reporter.g.d("PageManager", "StartPageTaskOfRoute doExecuteTaskAsync at UI Thread");
                        if (a.this.g != null) {
                            a.this.g.k();
                        }
                        if (a.this.h != null) {
                            a.this.h.run();
                        }
                    }
                });
                return com.meituan.msc.common.support.java.util.concurrent.a.c((Object) null);
            }
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "629f4954e76c8856aca3f84a20c81962", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "629f4954e76c8856aca3f84a20c81962");
            return;
        }
        com.meituan.msc.modules.apploader.a aVar = (com.meituan.msc.modules.apploader.a) this.b.c(com.meituan.msc.modules.apploader.a.class);
        if (aVar == null) {
            com.meituan.msc.modules.reporter.g.d("PageManager", "releaseResourceOfStartPageTask appLoader null");
            return;
        }
        List<com.meituan.msc.common.aov_task.task.c> a2 = aVar.a(a.class);
        if (a2 == null) {
            com.meituan.msc.modules.reporter.g.d("PageManager", "releaseResourceOfStartPageTask startPageTasks null");
            return;
        }
        for (com.meituan.msc.common.aov_task.task.c cVar : a2) {
            if (cVar instanceof a) {
                a aVar2 = (a) cVar;
                if (this == aVar2.g) {
                    com.meituan.msc.modules.reporter.g.d("PageManager", "releaseResourceOfStartPageTask", cVar);
                    aVar2.g = null;
                    aVar2.h = null;
                }
            }
        }
    }

    public final FrameLayout c() {
        return this.f;
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b31838d9aba0a26324b77377cb20cb95", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b31838d9aba0a26324b77377cb20cb95")).intValue();
        }
        l h = h();
        if (h != null) {
            return h.getViewId();
        }
        return 0;
    }

    public boolean a(@Nullable com.meituan.msc.modules.page.reload.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e38519a568b205d5f7d0d93ba2e8a139", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e38519a568b205d5f7d0d93ba2e8a139")).booleanValue();
        }
        if (dVar == null || !dVar.a()) {
            return false;
        }
        dVar.a(this.h);
        return true;
    }

    public final e a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e411b74f7ad7d54eaec5dd9ec10857f", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e411b74f7ad7d54eaec5dd9ec10857f");
        }
        if (i == -1) {
            return null;
        }
        int g = g();
        for (int i2 = 0; i2 < g; i2++) {
            com.meituan.msc.modules.page.a aVar = (com.meituan.msc.modules.page.a) this.f.getChildAt(i2);
            if (aVar == null) {
                com.meituan.msc.modules.reporter.g.d("PageManager", "getPageModuleById, page is null getChildAt", Integer.valueOf(i2));
            } else {
                e b = aVar.b(i);
                if (b != null) {
                    return b;
                }
            }
        }
        return null;
    }

    public final e e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "403291148e5634629cef8a5a2b509da5", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "403291148e5634629cef8a5a2b509da5");
        }
        if (h() != null) {
            return h().getCurPageModule();
        }
        return null;
    }

    public final e f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8737ab1a589db6685e4371be8f5c3e31", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8737ab1a589db6685e4371be8f5c3e31");
        }
        if (n() != null) {
            return n().getCurPageModule();
        }
        return null;
    }

    public final int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c1a9a5cf5cedec434657694520601b6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c1a9a5cf5cedec434657694520601b6")).intValue() : this.f.getChildCount();
    }

    private l n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a2116642daeab9c602ec8187b0c844f", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a2116642daeab9c602ec8187b0c844f");
        }
        if (g() <= 0) {
            com.meituan.msc.modules.reporter.g.e("PageManager", "container have no pages");
            return null;
        }
        return a(this.f.getChildAt(0));
    }

    public final l h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f47811ec80be6eccf66b5780ef0e9f88", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f47811ec80be6eccf66b5780ef0e9f88");
        }
        int g = g();
        if (g <= 0) {
            com.meituan.msc.modules.reporter.g.e("PageManager", "container have no pages");
            return null;
        }
        return a(this.f.getChildAt(g - 1));
    }

    private l a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b5fe60bd3579b41806c6d31852882c9", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b5fe60bd3579b41806c6d31852882c9");
        }
        if (view instanceof r) {
            return ((r) view).getCurPage();
        }
        if (view instanceof l) {
            return (l) view;
        }
        return null;
    }

    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfa7c05e9026558b65b5b88c5d445d8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfa7c05e9026558b65b5b88c5d445d8e");
            return;
        }
        l h = h();
        if (h != null) {
            h.b();
            com.meituan.msc.modules.reporter.d dVar = this.b.n;
            String pagePath = h.getPagePath();
            String valueOf = String.valueOf(h.getId());
            Object[] objArr2 = {pagePath, valueOf};
            ChangeQuickRedirect changeQuickRedirect2 = com.meituan.msc.modules.reporter.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "5757c6068b229b33ff422c38c15f383c", RobustBitConfig.DEFAULT_VALUE)) {
                com.meituan.msc.modules.reporter.d dVar2 = (com.meituan.msc.modules.reporter.d) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "5757c6068b229b33ff422c38c15f383c");
            } else {
                dVar.a(dVar.b.search(new com.meituan.msc.modules.reporter.l(valueOf, pagePath)) - 1);
            }
        }
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae7b6e49caf48f1489586bf47e420798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae7b6e49caf48f1489586bf47e420798");
            return;
        }
        l h = h();
        if (h != null) {
            h.a(i);
        }
    }

    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8116a829b0e9f852892e686a4c604140", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8116a829b0e9f852892e686a4c604140")).booleanValue();
        }
        e(g());
        this.c.m();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee3a103923a57f48a6877978ed957b06", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee3a103923a57f48a6877978ed957b06")).booleanValue();
        }
        int g = g();
        int min = g - Math.min(g, i);
        for (int i2 = g - 1; i2 >= min; i2--) {
            com.meituan.msc.modules.page.a aVar = (com.meituan.msc.modules.page.a) this.f.getChildAt(i2);
            aVar.a(2);
            this.f.removeViewAt(i2);
            this.b.n.b(aVar.getRoutePath(), String.valueOf(aVar.getViewId()));
        }
        return true;
    }

    private boolean f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d7debb93a3a969f22482e5c5ae60d36", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d7debb93a3a969f22482e5c5ae60d36")).booleanValue();
        }
        int g = g();
        if (g <= 1) {
            this.f.a();
            return false;
        }
        if (i >= g) {
            i = g - 1;
        }
        if (i <= 0) {
            i = 1;
        }
        e(i);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l a(String str, @Nullable com.meituan.msc.modules.page.reload.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f5c50d4efd2cc3bd93b1d6158873e5", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f5c50d4efd2cc3bd93b1d6158873e5") : b(str, aVar, (Boolean) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l b(String str, @Nullable com.meituan.msc.modules.page.reload.a aVar, Boolean bool) {
        Object[] objArr = {str, aVar, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "febf3883878ff57074bbc6e942641aa6", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "febf3883878ff57074bbc6e942641aa6");
        }
        if (this.b.r.n(str)) {
            this.f.a();
            j();
        } else if (g() == 0) {
            this.f.a();
        } else {
            this.f.c = true;
        }
        com.meituan.msc.modules.page.a c = c(str, aVar, bool);
        a(c);
        c.b();
        return c.getPage();
    }

    private com.meituan.msc.modules.page.a c(String str, com.meituan.msc.modules.page.reload.a aVar, Boolean bool) {
        com.meituan.msc.modules.page.a aVar2;
        Object[] objArr = {str, aVar, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87b8aa3185fa93dd3ca2dbb52d3bae1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87b8aa3185fa93dd3ca2dbb52d3bae1b");
        }
        if (this.j != null) {
            aVar2 = TextUtils.equals(this.j.getRoutePath(), str) ? this.j : null;
            this.j = null;
        } else {
            aVar2 = null;
        }
        return aVar2 == null ? a(str, aVar, bool) : aVar2;
    }

    public com.meituan.msc.modules.page.a a(String str, com.meituan.msc.modules.page.reload.a aVar, Boolean bool) {
        boolean booleanValue;
        boolean booleanValue2;
        Object[] objArr = {str, aVar, bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a76f3cfbb4227dc45763f152c6ba817", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.page.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a76f3cfbb4227dc45763f152c6ba817");
        }
        if (this.b.r.n(str) && (!this.c.A() || DebugHelper.j)) {
            com.meituan.msc.modules.engine.h hVar = this.b;
            com.meituan.msc.modules.container.p pVar = this.c;
            com.meituan.msc.common.framework.interfaces.b bVar = this.d;
            if (bool == null) {
                booleanValue2 = g() == 0;
            } else {
                booleanValue2 = bool.booleanValue();
            }
            return new r(hVar, pVar, bVar, str, aVar, booleanValue2);
        }
        com.meituan.msc.modules.engine.h hVar2 = this.b;
        com.meituan.msc.modules.container.p pVar2 = this.c;
        com.meituan.msc.common.framework.interfaces.b bVar2 = this.d;
        int a2 = com.meituan.msc.modules.page.reload.a.a(aVar);
        if (bool == null) {
            booleanValue = g() == 0;
        } else {
            booleanValue = bool.booleanValue();
        }
        return new l(hVar2, pVar2, bVar2, str, null, a2, booleanValue);
    }

    public final void a(String str) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f64ba6ec27cb87c798a3e24235c6e7e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f64ba6ec27cb87c798a3e24235c6e7e5");
            return;
        }
        int g = g() - 1;
        for (int i = g; i >= 0; i--) {
            if (TextUtils.equals(((com.meituan.msc.modules.page.a) this.f.getChildAt(i)).getRoutePath(), str)) {
                if (i == g) {
                    return;
                }
                c(g - i);
                return;
            }
        }
        a(str, (Integer) null);
    }

    private void a(com.meituan.msc.modules.page.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0143110ad9764b4b7527e92da18cfd09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0143110ad9764b4b7527e92da18cfd09");
            return;
        }
        this.f.addView(ax.a(aVar), new FrameLayout.LayoutParams(-1, -1));
        this.b.n.a(aVar.getRoutePath(), String.valueOf(aVar.getViewId()));
        this.b.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.meituan.msc.modules.container.n o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2675e688d480ea9e972186b8efc2a920", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.msc.modules.container.n) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2675e688d480ea9e972186b8efc2a920");
        }
        if (this.c instanceof com.meituan.msc.modules.container.b) {
            return ((com.meituan.msc.modules.container.b) this.c).N();
        }
        return null;
    }

    public void a(String str, Integer num, boolean z) {
        Object[] objArr = {str, num, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0538754471be1cd44ff7a2da06e8ded4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0538754471be1cd44ff7a2da06e8ded4");
        } else if (TextUtils.isEmpty(str)) {
            com.meituan.msc.modules.reporter.g.e("PageManager", "navigateHomePage failed, url is null");
        } else {
            j();
            b(str, num, z);
        }
    }

    private void b(String str, Integer num, boolean z) {
        Object[] objArr = {str, num, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "957e50c09a7c190d09e973a832b4f256", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "957e50c09a7c190d09e973a832b4f256");
            return;
        }
        this.b.o.a("create_view");
        l a2 = a(str, (com.meituan.msc.modules.page.reload.a) null);
        a2.setContainerReporter(o());
        this.b.o.b("create_view");
        if (z) {
            a2.b(str);
        } else if (this.b.r.n(str)) {
            a2.c(str);
        } else {
            u uVar = new u(str, "navigateTo");
            uVar.c = num;
            a2.a(uVar);
        }
    }

    public final void a(String str, Integer num) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str, num};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a97bf2fcd7a14857948016f7d785c75b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a97bf2fcd7a14857948016f7d785c75b");
            return;
        }
        PerfTrace.instant("navigateToPage");
        b("navigateTo", str);
        u uVar = new u();
        uVar.a = str;
        uVar.c = num;
        a(uVar);
    }

    private void g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26e44c6d0d0aee682048fc273f9c4646", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26e44c6d0d0aee682048fc273f9c4646");
        } else {
            this.b.f().a(this.b.b().c(), str, 1001);
        }
    }

    private void a(final u uVar) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {uVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa03b8b1010f333d852821fa184ca28c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa03b8b1010f333d852821fa184ca28c");
            return;
        }
        final String str = uVar.a;
        i(str);
        if (this.b.r.n(str)) {
            throw new com.meituan.msc.modules.api.b("can not navigateTo tab page");
        }
        g(str);
        a(str, new Runnable() { // from class: com.meituan.msc.modules.page.m.4
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0cab963b814643c1e6e558e82cb8248", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0cab963b814643c1e6e558e82cb8248");
                    return;
                }
                l h = m.this.h();
                if (h != null) {
                    h.a(1);
                }
                m.this.a(str, (com.meituan.msc.modules.page.reload.a) null).a(uVar);
            }
        });
    }

    private void h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7db566f5664e0704666e295d34b6033b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7db566f5664e0704666e295d34b6033b");
        } else if (this.b.r.v(str)) {
            com.meituan.msc.modules.reporter.g.d("PageManager", "showLoading path package is loaded", str);
        } else {
            if (this.m == null) {
                this.m = new Runnable() { // from class: com.meituan.msc.modules.page.m.5
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff5750ebacdc05b16def698c68a18416", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff5750ebacdc05b16def698c68a18416");
                            return;
                        }
                        com.meituan.msc.modules.container.p e = m.this.b.b().e();
                        if (e == null) {
                            return;
                        }
                        Activity C = e.C();
                        if (m.this.l == null) {
                            m.this.l = new LoadingDialog(C);
                        }
                        m.this.l.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meituan.msc.modules.page.m.5.1
                            @Override // android.content.DialogInterface.OnCancelListener
                            public final void onCancel(DialogInterface dialogInterface) {
                            }
                        });
                        LoadingDialog loadingDialog = m.this.l;
                        String string = C.getString(R.string.msc_load_package);
                        Object[] objArr3 = {string};
                        ChangeQuickRedirect changeQuickRedirect3 = LoadingDialog.a;
                        if (PatchProxy.isSupport(objArr3, loadingDialog, changeQuickRedirect3, false, "650e62df7e7f680359b090e4c3526a36", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, loadingDialog, changeQuickRedirect3, false, "650e62df7e7f680359b090e4c3526a36");
                            return;
                        }
                        loadingDialog.show();
                        if (loadingDialog.b != null) {
                            if (TextUtils.isEmpty(string)) {
                                loadingDialog.b.setText("");
                                loadingDialog.b.setVisibility(8);
                                return;
                            }
                            loadingDialog.b.setText(string);
                            loadingDialog.b.setVisibility(0);
                            return;
                        }
                        com.meituan.msc.modules.reporter.g.a("LoadingDialog", "mTextView is null");
                    }
                };
            }
            com.meituan.msc.common.executor.a.b(this.m, 1000L);
        }
    }

    public final void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1af79c5d1f61098d45f400333175d0d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1af79c5d1f61098d45f400333175d0d3");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("PageManager", "dismissLoading");
        if (this.m != null) {
            com.meituan.msc.common.executor.a.f(this.m);
        }
        if (this.l != null) {
            this.l.dismiss();
            this.l = null;
        }
    }

    public final Stack<com.meituan.msc.modules.page.reload.a> l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88fa1232e5501b5182b07327e400b4ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Stack) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88fa1232e5501b5182b07327e400b4ff");
        }
        Stack<com.meituan.msc.modules.page.reload.a> stack = new Stack<>();
        for (int i = 0; i < g(); i++) {
            stack.add(((com.meituan.msc.modules.page.a) this.f.getChildAt(i)).getSavedPageInfo());
        }
        return stack;
    }

    public final void b(final String str) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b0c498ba07e48f9b4e11d061df18b41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b0c498ba07e48f9b4e11d061df18b41");
            return;
        }
        b("redirectTo", str);
        i(str);
        if (this.b.r.n(str)) {
            throw new com.meituan.msc.modules.api.b("can not redirectTo tab page");
        }
        g(str);
        a(str, new Runnable() { // from class: com.meituan.msc.modules.page.m.6
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a97eddf83d5e51fa52c31753a16a1ae1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a97eddf83d5e51fa52c31753a16a1ae1");
                    return;
                }
                boolean z = m.this.g() - 1 == 0;
                m.this.f.a();
                m.this.e(1);
                l b = m.this.b(str, (com.meituan.msc.modules.page.reload.a) null, Boolean.valueOf(z));
                m.this.f.c = true;
                b.e(str);
            }
        });
    }

    public final void c(String str) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf95a9e977ed35c2a441c5dd3aba9980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf95a9e977ed35c2a441c5dd3aba9980");
            return;
        }
        b("switchTab", str);
        i(str);
        if (!this.b.r.n(str)) {
            throw new com.meituan.msc.modules.api.b("can't switchTab to single page");
        }
        e f = f();
        if (f != null && !f.g()) {
            if (this.i == null || !this.i.b(this.e, this.b.r.j(), str, this.c.H())) {
                throw new com.meituan.msc.modules.api.b("can not switchTab in fusionMode while tab is not bottom of stack");
            }
            return;
        }
        d(str);
    }

    public final void d(String str) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "489703caaed8cc3f6b1e6c66ab70c383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "489703caaed8cc3f6b1e6c66ab70c383");
            return;
        }
        i(str);
        if (!this.b.r.n(str)) {
            throw new com.meituan.msc.modules.api.b("can't switchTab to single page");
        }
        String b = am.b(str);
        if (g() > 1) {
            f(Integer.MAX_VALUE);
        }
        l h = h();
        if (h == null || !h.c()) {
            j();
            h = a(b, (com.meituan.msc.modules.page.reload.a) null);
        } else {
            h.b();
        }
        if (h.getTabPage() != null) {
            h.getTabPage().a(b);
        }
    }

    public final void e(String str) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "592e40671d419697864f68f2f9808559", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "592e40671d419697864f68f2f9808559");
        } else if (a(str, this.c.H())) {
        } else {
            b("reLaunch", str);
            a(str, false);
        }
    }

    public final boolean a(String str, Intent intent) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str, intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05be7ca501cf96164fd328e4f79232be", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05be7ca501cf96164fd328e4f79232be")).booleanValue();
        }
        i(str);
        if (this.c.D() || com.meituan.msc.modules.container.fusion.c.b(this.b.r.j()) > 1) {
            if (this.i == null || !this.i.a(this.e, this.b.r.j(), str, intent)) {
                throw new com.meituan.msc.modules.api.b("can't relaunch in fusionMode");
            }
            return true;
        }
        return false;
    }

    public final void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bde1352567230c570c2fd0dc0194d0ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bde1352567230c570c2fd0dc0194d0ed");
        } else {
            a(str, true);
        }
    }

    private void a(final String str, final boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e537cf1495486982a2bca1395fb013b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e537cf1495486982a2bca1395fb013b");
            return;
        }
        com.meituan.msc.modules.reporter.b.a().c();
        g(str);
        a(str, new Runnable() { // from class: com.meituan.msc.modules.page.m.7
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f069c5dbbbcf0c42254f24734f920c85", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f069c5dbbbcf0c42254f24734f920c85");
                    return;
                }
                m.this.f.a();
                m.this.j();
                l b = m.this.b(str, (com.meituan.msc.modules.page.reload.a) null, Boolean.TRUE);
                if (z) {
                    b.setContainerReporter(m.this.o());
                }
                b.c(str);
            }
        });
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f705b3af2e5886284230a336042ce10c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f705b3af2e5886284230a336042ce10c");
            return;
        }
        b("onPageNotFound", str);
        this.g = true;
        j();
        l b = b(str, (com.meituan.msc.modules.page.reload.a) null, Boolean.TRUE);
        if (MSCHornRollbackConfig.g() || ay.a(this.b.r.n(), "1.8.0") < 0) {
            m();
            return;
        }
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = l.h;
        if (PatchProxy.isSupport(objArr2, b, changeQuickRedirect2, false, "508729fbf1a379f00c11308439e83d9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, b, changeQuickRedirect2, false, "508729fbf1a379f00c11308439e83d9b");
            return;
        }
        com.meituan.msc.modules.reporter.g.d("Page", String.format("view@%s onPageNotFound(%s)", Integer.valueOf(b.getViewId()), str));
        b.a(str2, str, b.getViewId());
    }

    public final void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3599a16a12976c195f291bddcc53f34a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3599a16a12976c195f291bddcc53f34a");
            return;
        }
        l h = h();
        if (!this.g || h == null) {
            return;
        }
        h.l();
    }

    private void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a52ab90d965786d442aaa13bac777507", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a52ab90d965786d442aaa13bac777507");
            return;
        }
        int d = d();
        l h = h();
        q.a(this.b).a(str, d, str2, h != null ? h.getPagePath() : "", this.c.A());
    }

    public final boolean c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49b5665e7c8fcdea473c66750882bc55", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49b5665e7c8fcdea473c66750882bc55")).booleanValue();
        }
        b("navigateBack", "");
        if (!f(i)) {
            com.meituan.msc.modules.reporter.g.d("PageManager", "PageManager navigateBackPage");
            this.c.b("navigateBack");
            return true;
        }
        com.meituan.msc.modules.reporter.b.b();
        l h = h();
        if (h != null) {
            h.b();
            h.h();
        }
        return true;
    }

    public final void d(int i) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3340513bfd79be02215ad2310ca832a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3340513bfd79be02215ad2310ca832a");
        } else if (!c(i)) {
            throw new com.meituan.msc.modules.api.b("cannot navigate back at first page");
        }
    }

    private void i(String str) throws com.meituan.msc.modules.api.b {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e2688974657d21e87aba6d36fe616d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e2688974657d21e87aba6d36fe616d5");
        } else if (TextUtils.isEmpty(str)) {
            throw new com.meituan.msc.modules.api.b("url is empty");
        } else {
            if (!this.b.r.m(str)) {
                throw new com.meituan.msc.modules.api.b(String.format("page %s is not found", str));
            }
            this.g = false;
        }
    }
}
