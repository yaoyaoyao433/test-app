package com.meituan.msc.modules.page.render.webview;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.Pair;
import android.webkit.ValueCallback;
import com.meituan.dio.easy.DioFile;
import com.meituan.msc.common.utils.r;
import com.meituan.msc.modules.update.bean.PackageInfoWrapper;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class b extends com.meituan.msc.modules.page.render.j implements h {
    public static ChangeQuickRedirect p;
    public final String q;
    protected final Handler r;
    protected d s;
    protected final Queue<Pair<String, ValueCallback<String>>> t;
    protected final Queue<Pair<String, ValueCallback<String>>> u;
    protected volatile a v;
    protected volatile boolean w;
    protected volatile boolean x;

    @Override // com.meituan.msc.modules.page.render.f
    public final boolean p() {
        return true;
    }

    public abstract boolean x();

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed6f0e68f7bd60884151ece54c689d56", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed6f0e68f7bd60884151ece54c689d56");
            return;
        }
        this.q = "BaseWebViewRenderer@" + j();
        this.r = new Handler(Looper.getMainLooper());
        this.t = new ConcurrentLinkedQueue();
        this.u = new ConcurrentLinkedQueue();
        this.v = a.c;
        this.w = false;
        this.x = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends com.meituan.msc.common.model.a {
        public static final a c = new a("INITIAL");
        public static final a d = new a("HTML_LOADED");
        public static final a e = new a("FIRST_SCRIPT");
        public static final a f = new a("WEB_VIEW_PAGE_FINISHED");
        public static final a g = new a("PAGE_START_SEND");

        private a(@NonNull String str) {
            super(str);
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f3652a5246bc78a1cc008bfc1957d7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f3652a5246bc78a1cc008bfc1957d7d");
            return;
        }
        com.meituan.msc.modules.reporter.g.b(this.q, "raiseLoadStage from ", this.v.b, " to ", aVar.b);
        if (this.v.a(aVar)) {
            return;
        }
        this.v = aVar;
    }

    public final synchronized void a(String str, @Nullable ValueCallback<String> valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5faea957334e1671c45e25614d710cb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5faea957334e1671c45e25614d710cb6");
        } else if (this.x) {
            this.s.a(str, valueCallback);
        } else {
            this.u.add(new Pair<>(str, valueCallback));
        }
    }

    @Override // com.meituan.msc.modules.page.render.webview.h
    public final void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a6fd117dfd93b57c607a62472c28fdf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a6fd117dfd93b57c607a62472c28fdf");
            return;
        }
        com.meituan.msc.modules.reporter.g.b(this.q, "onPageFinished view@", Integer.valueOf(j()), this.k.a, str);
        a(a.f);
        this.x = true;
        PerfTrace.instant("onPageFinished");
        A();
        z();
    }

    private synchronized void A() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1c47b9254a8cebe258cb8465a62115f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1c47b9254a8cebe258cb8465a62115f");
            return;
        }
        if (this.u.size() > 0) {
            for (Pair<String, ValueCallback<String>> pair : this.u) {
                a(pair.first, pair.second);
            }
            this.u.clear();
        }
    }

    public final synchronized void b(String str, @Nullable ValueCallback<String> valueCallback) {
        Object[] objArr = {str, valueCallback};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2d98bfb78c85075d5b8856e86424aed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2d98bfb78c85075d5b8856e86424aed");
        } else {
            a(str, valueCallback);
        }
    }

    public final synchronized void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec371e6e8eb4b437613d125ca83d9f03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec371e6e8eb4b437613d125ca83d9f03");
            return;
        }
        a(a.e);
        this.w = true;
        z();
    }

    @Override // com.meituan.msc.modules.page.render.j
    public boolean w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9204d1d296351f8fa10e76c9b83eac5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9204d1d296351f8fa10e76c9b83eac5")).booleanValue();
        }
        this.o++;
        this.n = true;
        this.t.clear();
        this.u.clear();
        return false;
    }

    public final synchronized void c(String str, @Nullable ValueCallback<String> valueCallback) {
        Pair<String, ValueCallback<String>> poll;
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0972d39e4bab1fedbe68822af571825f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0972d39e4bab1fedbe68822af571825f");
            return;
        }
        if (this.w && B()) {
            if (x()) {
                if (z()) {
                    com.meituan.msc.modules.reporter.g.a(this.q, "pending events for domLoaded not evaluated when domLoaded publish");
                }
                a(str, (ValueCallback<String>) null);
                return;
            } else if (this.t.size() >= 20 && (poll = this.t.poll()) != null) {
                a(poll.first, poll.second);
            }
        }
        this.t.add(new Pair<>(str, null));
    }

    private boolean B() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f53c465b3496a44d4b7f097806410847", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f53c465b3496a44d4b7f097806410847")).booleanValue();
        }
        if (com.meituan.msc.common.config.b.H()) {
            return this.x;
        }
        return true;
    }

    public final synchronized boolean z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "670a95a68f2e554196a4f19e6b9af5a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "670a95a68f2e554196a4f19e6b9af5a0")).booleanValue();
        } else if (!this.t.isEmpty() && this.w && B() && x()) {
            com.meituan.msc.modules.reporter.g.a(this.q, "evaluate pending JS when dom loaded: ", Integer.valueOf(this.t.size()));
            for (Pair<String, ValueCallback<String>> pair : this.t) {
                a(pair.first, pair.second);
            }
            this.t.clear();
            return true;
        } else {
            return false;
        }
    }

    public final void a(PackageInfoWrapper packageInfoWrapper, com.meituan.msc.modules.engine.o oVar) {
        Object[] objArr = {packageInfoWrapper, oVar};
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1f54a4fa15e310c497ee49645add90d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1f54a4fa15e310c497ee49645add90d");
            return;
        }
        DioFile pageBootStrapFile = packageInfoWrapper.getPageBootStrapFile();
        if (!pageBootStrapFile.c()) {
            oVar.a(new RuntimeException("AppPage#loadServicePackage bootStrapFile not exist, " + packageInfoWrapper + ", file: " + pageBootStrapFile.g()));
            return;
        }
        Object[] objArr2 = {pageBootStrapFile, oVar};
        ChangeQuickRedirect changeQuickRedirect2 = p;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ea07f15a82fb0f1a754290ba7f5f8391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ea07f15a82fb0f1a754290ba7f5f8391");
        } else if (pageBootStrapFile == null || !pageBootStrapFile.c()) {
        } else {
            try {
                String a2 = r.a(pageBootStrapFile);
                com.meituan.msc.modules.reporter.g.b(this.q, "evaluateJsFile: ", pageBootStrapFile.e());
                b(a2, oVar);
            } catch (IOException e) {
                com.meituan.msc.modules.reporter.g.a(e);
                if (oVar != null) {
                    oVar.a(new IOException("AppPage#evaluateJsFile readContent failed" + pageBootStrapFile, e));
                }
            }
        }
    }
}
