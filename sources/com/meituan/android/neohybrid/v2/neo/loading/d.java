package com.meituan.android.neohybrid.v2.neo.loading;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.neohybrid.core.config.LoadingConfig;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.neo.n;
import com.meituan.android.neohybrid.util.o;
import com.meituan.android.neohybrid.v2.core.a;
import com.meituan.android.neohybrid.v2.core.g;
import com.meituan.android.neohybrid.v2.neo.loading.b;
import com.meituan.android.neohybrid.v2.util.RecycledHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends com.meituan.android.neohybrid.v2.neo.a {
    public static ChangeQuickRedirect d;

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final String h() {
        return "neo_show";
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void b() {
        b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "539f234b3498519bb25bcfd3a7f45983", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "539f234b3498519bb25bcfd3a7f45983");
            return;
        }
        super.b();
        Activity k = k();
        NeoConfig j = j();
        if (k != null && j != null && j.loadingConfig().isLoadingEnabled()) {
            Activity k2 = k();
            LoadingConfig loadingConfig = j.loadingConfig();
            Object[] objArr2 = {k2, loadingConfig};
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbbe777d758f72417c616339a4d10ddb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbbe777d758f72417c616339a4d10ddb");
                return;
            }
            int loadingLayoutId = loadingConfig.getLoadingLayoutId();
            View inflate = (loadingLayoutId == 0 || loadingConfig.isLoadingNoView()) ? null : LayoutInflater.from(k2).inflate(loadingLayoutId, (ViewGroup) null);
            b.a b = b.b(k2);
            Object[] objArr3 = {inflate};
            ChangeQuickRedirect changeQuickRedirect3 = b.a.a;
            if (PatchProxy.isSupport(objArr3, b, changeQuickRedirect3, false, "23b5ce02429ea1c4c4235bc1e3d7531a", RobustBitConfig.DEFAULT_VALUE)) {
                b = (b.a) PatchProxy.accessDispatch(objArr3, b, changeQuickRedirect3, false, "23b5ce02429ea1c4c4235bc1e3d7531a");
            } else if (!b.c) {
                b.b.h = inflate;
            }
            boolean isLoadingNoView = loadingConfig.isLoadingNoView();
            Object[] objArr4 = {Byte.valueOf(isLoadingNoView ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect4 = b.a.a;
            if (PatchProxy.isSupport(objArr4, b, changeQuickRedirect4, false, "59b64e2a6c36cf22e0acdbae7c737014", RobustBitConfig.DEFAULT_VALUE)) {
                b = (b.a) PatchProxy.accessDispatch(objArr4, b, changeQuickRedirect4, false, "59b64e2a6c36cf22e0acdbae7c737014");
            } else if (!b.c) {
                b.b.f = isLoadingNoView;
            }
            boolean isLoadingCancelable = loadingConfig.isLoadingCancelable();
            Object[] objArr5 = {Byte.valueOf(isLoadingCancelable ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect5 = b.a.a;
            if (PatchProxy.isSupport(objArr5, b, changeQuickRedirect5, false, "0585622cf593640b94ca87f1c0facb0b", RobustBitConfig.DEFAULT_VALUE)) {
                b = (b.a) PatchProxy.accessDispatch(objArr5, b, changeQuickRedirect5, false, "0585622cf593640b94ca87f1c0facb0b");
            } else if (!b.c) {
                b.b.i = isLoadingCancelable;
            }
            boolean isLoadingCancelOutside = loadingConfig.isLoadingCancelOutside();
            Object[] objArr6 = {Byte.valueOf(isLoadingCancelOutside ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect6 = b.a.a;
            if (PatchProxy.isSupport(objArr6, b, changeQuickRedirect6, false, "be6cce88d14018cc29d553df3e10f350", RobustBitConfig.DEFAULT_VALUE)) {
                b = (b.a) PatchProxy.accessDispatch(objArr6, b, changeQuickRedirect6, false, "be6cce88d14018cc29d553df3e10f350");
            } else if (!b.c) {
                b.b.j = isLoadingCancelOutside;
            }
            Object[] objArr7 = {this};
            ChangeQuickRedirect changeQuickRedirect7 = e.a;
            b.InterfaceC0314b eVar = PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "304420de3ba10b0935cd7f44aa63deee", RobustBitConfig.DEFAULT_VALUE) ? (b.InterfaceC0314b) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "304420de3ba10b0935cd7f44aa63deee") : new e(this);
            Object[] objArr8 = {eVar};
            ChangeQuickRedirect changeQuickRedirect8 = b.a.a;
            if (PatchProxy.isSupport(objArr8, b, changeQuickRedirect8, false, "adcf0d077d93f3a230b9875b569e5661", RobustBitConfig.DEFAULT_VALUE)) {
                b = (b.a) PatchProxy.accessDispatch(objArr8, b, changeQuickRedirect8, false, "adcf0d077d93f3a230b9875b569e5661");
            } else if (!b.c) {
                b.b.k = eVar;
            }
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = b.a.a;
            if (PatchProxy.isSupport(objArr9, b, changeQuickRedirect9, false, "56ee265ffe4bbf3588a7609f5300d5c2", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (b) PatchProxy.accessDispatch(objArr9, b, changeQuickRedirect9, false, "56ee265ffe4bbf3588a7609f5300d5c2");
            } else {
                b.c = true;
                b.b(b.b);
                bVar = b.b;
            }
            Object[] objArr10 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect10 = b.a;
            if (PatchProxy.isSupport(objArr10, bVar, changeQuickRedirect10, false, "dbc9392c3f06ecb17ca5e3138c64185f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, bVar, changeQuickRedirect10, false, "dbc9392c3f06ecb17ca5e3138c64185f");
            } else {
                Object[] objArr11 = {null};
                ChangeQuickRedirect changeQuickRedirect11 = b.a;
                if (PatchProxy.isSupport(objArr11, bVar, changeQuickRedirect11, false, "9902809159cf9d79e914aedc7769d3e3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, bVar, changeQuickRedirect11, false, "9902809159cf9d79e914aedc7769d3e3");
                } else {
                    Activity activity = bVar.b.get();
                    if (bVar.d == c.READY && bVar.c != null && activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                        bVar.a(c.SHOW, (String) null);
                        bVar.c.show();
                    }
                }
            }
            RecycledHandler.a(i()).postDelayed(f.a(this), loadingConfig.getLoadingDuration() <= 0 ? 12000L : loadingConfig.getLoadingDuration());
            return;
        }
        this.c = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void a(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b47a4a9501b47e63670b7150833a7da2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b47a4a9501b47e63670b7150833a7da2");
            return;
        }
        super.a(nVar);
        if (this.b.h()) {
            switch (nVar) {
                case START:
                    o.a(i().k(), o.a.HIDE);
                    return;
                case VISIBLE_WITH_LOADING:
                    o.a(i().k(), o.a.SHOW);
                    return;
                case END:
                    this.c = true;
                    break;
                case VISIBLE:
                case FINISHED:
                    break;
                default:
                    return;
            }
            o.a(i().k(), o.a.SHOW);
            a((String) null);
        }
    }

    @Override // com.meituan.android.neohybrid.v2.neo.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "653b329a25a0379b41a815d14954e887", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "653b329a25a0379b41a815d14954e887");
            return;
        }
        super.g();
        a((String) null);
    }

    public static /* synthetic */ void a(d dVar, c cVar, View view, String str) {
        Object[] objArr = {dVar, cVar, view, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "57854f49cd16a7fe2a50786f809f8da5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "57854f49cd16a7fe2a50786f809f8da5");
            return;
        }
        try {
            if (cVar == c.SHOW) {
                com.meituan.android.neohybrid.v2.core.a aVar = dVar.b;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.core.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "ac54a37446467d386d9b5a1925f4e024", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "ac54a37446467d386d9b5a1925f4e024");
                } else {
                    aVar.d.a(n.START);
                    com.meituan.android.neohybrid.core.listener.a aVar2 = aVar.b;
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = g.a;
                    aVar.a(aVar2, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "02d1a2e00f048153aeb29f1fed427efb", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0311a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "02d1a2e00f048153aeb29f1fed427efb") : new g(view));
                }
                com.meituan.android.neohybrid.v2.neo.report.a.a(dVar.b, "hybrid_loading_show");
                com.meituan.android.neohybrid.v2.neo.report.a.a(dVar.b, "b_pay_hybrid_loading_show_mv", "c_pay_7c9fc4b4", null, null);
            } else if (cVar == c.HIDE) {
                boolean equals = TextUtils.equals(str, "timeout");
                dVar.b.a(view, equals, false);
                com.meituan.android.neohybrid.v2.neo.report.a.a(dVar.b, equals ? "hybrid_loading_force_close" : "hybrid_loading_normal_close");
                com.meituan.android.neohybrid.v2.neo.report.a.b(dVar.b, equals ? "b_pay_hybrid_loading_force_close_mv" : "b_pay_hybrid_loading_normal_close_mv", "c_pay_7c9fc4b4", null);
            } else if (cVar == c.CANCEL) {
                dVar.b.a(view, false, true);
                com.meituan.android.neohybrid.v2.neo.report.a.a(dVar.b, "hybrid_loading_normal_close");
                com.meituan.android.neohybrid.v2.neo.report.a.a(dVar.b, "b_pay_hybrid_loading_normal_close_mv", "c_pay_7c9fc4b4", null, null);
            }
        } catch (Exception e) {
            com.meituan.android.neohybrid.exception.a.a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2d4b87ec736364036eb3898b6cd20cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2d4b87ec736364036eb3898b6cd20cc");
        } else {
            b.a(k()).a(str);
        }
    }
}
