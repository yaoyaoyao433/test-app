package com.sankuai.meituan.takeoutnew.util.tool;

import android.support.annotation.CallSuper;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.model.WelcomeAd;
import com.sankuai.meituan.takeoutnew.ui.page.boot.report.c;
import com.sankuai.waimai.platform.utils.l;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a<T> {
    public static ChangeQuickRedirect e;
    public static final Object f = new Object();
    private boolean a;
    protected final String g;
    public final Set<InterfaceC0655a<T>> h;
    public Object i;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.takeoutnew.util.tool.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0655a<T> {
        @MainThread
        void a(T t);
    }

    @MainThread
    public abstract void a(@NonNull InterfaceC0655a<T> interfaceC0655a);

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f43965c1cbc0f26f234ed2e46acdddc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f43965c1cbc0f26f234ed2e46acdddc");
            return;
        }
        this.g = toString();
        this.h = new HashSet();
        this.i = f;
        this.a = false;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        aVar.a = false;
        return false;
    }

    @MainThread
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "286b48428947f6d48e47e045300567c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "286b48428947f6d48e47e045300567c4");
            return;
        }
        l.a("ObservableData.fetch");
        if (f() || this.a) {
            return;
        }
        this.a = true;
        a("start fetching data", new Object[0]);
        a((InterfaceC0655a) new InterfaceC0655a<T>() { // from class: com.sankuai.meituan.takeoutnew.util.tool.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.takeoutnew.util.tool.a.InterfaceC0655a
            public final void a(final T t) {
                Object[] objArr2 = {t};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b5fedc1b0c8c8404e2795c244d361e71", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b5fedc1b0c8c8404e2795c244d361e71");
                } else {
                    l.a(new Runnable() { // from class: com.sankuai.meituan.takeoutnew.util.tool.a.1.1
                        public static ChangeQuickRedirect a;

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6bf4fca408d3cc2aa5391db1b2fcc6c9", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6bf4fca408d3cc2aa5391db1b2fcc6c9");
                                return;
                            }
                            a.this.a("on data fetched: %s", t);
                            a.this.i = t;
                            a.a(a.this, false);
                            if (a.this.a(t) && !c.a().c()) {
                                if (!a.this.h.isEmpty()) {
                                    com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17017, 0, "waimai_splash_all");
                                } else {
                                    com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17019, 0, "waimai_splash_all");
                                }
                            }
                            for (InterfaceC0655a interfaceC0655a : a.this.h) {
                                a.this.a("notify observer: %s", interfaceC0655a);
                                interfaceC0655a.a(t);
                            }
                            a.this.h.clear();
                        }
                    }, true, a.this.g);
                }
            }
        });
    }

    public final boolean f() {
        return this.i != f;
    }

    @CallSuper
    @MainThread
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "801ec6d514e1e57e9f3c2e1a0e0de9af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "801ec6d514e1e57e9f3c2e1a0e0de9af");
            return;
        }
        l.a("ObservableData.clear");
        l.cancel(this.g);
        this.i = f;
    }

    public final void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect, false, "9d9e57c40c41629c81df76cad7273a73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect, false, "9d9e57c40c41629c81df76cad7273a73");
        } else if (com.sankuai.waimai.foundation.utils.log.a.b) {
            com.sankuai.waimai.foundation.utils.log.a.b(getClass().getSimpleName(), str, objArr);
        }
    }

    public boolean a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "601fe0d1d7f42624679d8efbf875e39d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "601fe0d1d7f42624679d8efbf875e39d")).booleanValue();
        }
        if (obj != null && (obj instanceof WelcomeAd)) {
            WelcomeAd welcomeAd = (WelcomeAd) this.i;
            return welcomeAd.isAd() && welcomeAd.adType == 21;
        }
        return false;
    }
}
