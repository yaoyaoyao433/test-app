package com.meituan.android.neohybrid.neo.loading;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.neohybrid.core.a;
import com.meituan.android.neohybrid.core.config.LoadingConfig;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.g;
import com.meituan.android.neohybrid.neo.loading.b;
import com.meituan.android.neohybrid.neo.n;
import com.meituan.android.neohybrid.util.RecycledHandler;
import com.meituan.android.neohybrid.util.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends com.meituan.android.neohybrid.neo.a {
    public static ChangeQuickRedirect d;

    @Override // com.meituan.android.neohybrid.neo.a
    public final String h() {
        return "neo_show";
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void b() {
        b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f6a416f46f89c331d4ab4616aa252d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f6a416f46f89c331d4ab4616aa252d3");
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
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f0fb2614ee4842b0802899fdedae52df", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f0fb2614ee4842b0802899fdedae52df");
                return;
            }
            int loadingLayoutId = loadingConfig.getLoadingLayoutId();
            View inflate = (loadingLayoutId == 0 || loadingConfig.isLoadingNoView()) ? null : LayoutInflater.from(k2).inflate(loadingLayoutId, (ViewGroup) null);
            b.a b = b.b(k2);
            Object[] objArr3 = {inflate};
            ChangeQuickRedirect changeQuickRedirect3 = b.a.a;
            if (PatchProxy.isSupport(objArr3, b, changeQuickRedirect3, false, "b5228eb75e77c5d1d3913e13951390ea", RobustBitConfig.DEFAULT_VALUE)) {
                b = (b.a) PatchProxy.accessDispatch(objArr3, b, changeQuickRedirect3, false, "b5228eb75e77c5d1d3913e13951390ea");
            } else if (!b.c) {
                b.b.h = inflate;
            }
            boolean isLoadingNoView = loadingConfig.isLoadingNoView();
            Object[] objArr4 = {Byte.valueOf(isLoadingNoView ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect4 = b.a.a;
            if (PatchProxy.isSupport(objArr4, b, changeQuickRedirect4, false, "fab4070d187f98ce01e03e35591caf79", RobustBitConfig.DEFAULT_VALUE)) {
                b = (b.a) PatchProxy.accessDispatch(objArr4, b, changeQuickRedirect4, false, "fab4070d187f98ce01e03e35591caf79");
            } else if (!b.c) {
                b.b.f = isLoadingNoView;
            }
            boolean isLoadingCancelable = loadingConfig.isLoadingCancelable();
            Object[] objArr5 = {Byte.valueOf(isLoadingCancelable ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect5 = b.a.a;
            if (PatchProxy.isSupport(objArr5, b, changeQuickRedirect5, false, "d571d79d41b644f5867b885179462a64", RobustBitConfig.DEFAULT_VALUE)) {
                b = (b.a) PatchProxy.accessDispatch(objArr5, b, changeQuickRedirect5, false, "d571d79d41b644f5867b885179462a64");
            } else if (!b.c) {
                b.b.i = isLoadingCancelable;
            }
            boolean isLoadingCancelOutside = loadingConfig.isLoadingCancelOutside();
            Object[] objArr6 = {Byte.valueOf(isLoadingCancelOutside ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect6 = b.a.a;
            if (PatchProxy.isSupport(objArr6, b, changeQuickRedirect6, false, "f5e9cd5dbbe13d1c0090feac3a1ae222", RobustBitConfig.DEFAULT_VALUE)) {
                b = (b.a) PatchProxy.accessDispatch(objArr6, b, changeQuickRedirect6, false, "f5e9cd5dbbe13d1c0090feac3a1ae222");
            } else if (!b.c) {
                b.b.j = isLoadingCancelOutside;
            }
            Object[] objArr7 = {this};
            ChangeQuickRedirect changeQuickRedirect7 = e.a;
            b.InterfaceC0305b eVar = PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "e284e465078e0dbb6ebe1edd7396daac", RobustBitConfig.DEFAULT_VALUE) ? (b.InterfaceC0305b) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "e284e465078e0dbb6ebe1edd7396daac") : new e(this);
            Object[] objArr8 = {eVar};
            ChangeQuickRedirect changeQuickRedirect8 = b.a.a;
            if (PatchProxy.isSupport(objArr8, b, changeQuickRedirect8, false, "0beacedfcf869d5f17d8fb75e64a1fe9", RobustBitConfig.DEFAULT_VALUE)) {
                b = (b.a) PatchProxy.accessDispatch(objArr8, b, changeQuickRedirect8, false, "0beacedfcf869d5f17d8fb75e64a1fe9");
            } else if (!b.c) {
                b.b.k = eVar;
            }
            Object[] objArr9 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect9 = b.a.a;
            if (PatchProxy.isSupport(objArr9, b, changeQuickRedirect9, false, "bd16db8c51754208120145f1f6fed12b", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (b) PatchProxy.accessDispatch(objArr9, b, changeQuickRedirect9, false, "bd16db8c51754208120145f1f6fed12b");
            } else {
                b.c = true;
                b.b(b.b);
                bVar = b.b;
            }
            Object[] objArr10 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect10 = b.a;
            if (PatchProxy.isSupport(objArr10, bVar, changeQuickRedirect10, false, "f5cb7f48168c85e08c8e41b8160e2c40", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr10, bVar, changeQuickRedirect10, false, "f5cb7f48168c85e08c8e41b8160e2c40");
            } else {
                Object[] objArr11 = {null};
                ChangeQuickRedirect changeQuickRedirect11 = b.a;
                if (PatchProxy.isSupport(objArr11, bVar, changeQuickRedirect11, false, "d061a622456a3b7a42d779d5d04b8fe5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, bVar, changeQuickRedirect11, false, "d061a622456a3b7a42d779d5d04b8fe5");
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
    @Override // com.meituan.android.neohybrid.neo.a
    public final void a(n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "523ed3fc1ee2b81cda635f00845aa048", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "523ed3fc1ee2b81cda635f00845aa048");
            return;
        }
        super.a(nVar);
        if (this.b.j()) {
            switch (nVar) {
                case START:
                    o.a(i().n(), o.a.HIDE);
                    return;
                case VISIBLE_WITH_LOADING:
                    o.a(i().n(), o.a.SHOW);
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
            o.a(i().n(), o.a.SHOW);
            a((String) null);
        }
    }

    @Override // com.meituan.android.neohybrid.neo.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bd4d5ebfd9b01e135c1322635eb14f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bd4d5ebfd9b01e135c1322635eb14f2");
            return;
        }
        super.g();
        a((String) null);
    }

    public static /* synthetic */ void a(d dVar, c cVar, View view, String str) {
        Object[] objArr = {dVar, cVar, view, str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "842899f6b9b2a15c4890a3a007666c81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "842899f6b9b2a15c4890a3a007666c81");
            return;
        }
        try {
            if (cVar == c.SHOW) {
                com.meituan.android.neohybrid.core.a aVar = dVar.b;
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.core.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "0657137d4675a14f76f8b9152e9fea8a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "0657137d4675a14f76f8b9152e9fea8a");
                } else {
                    aVar.d.a(n.START);
                    com.meituan.android.neohybrid.core.listener.a aVar2 = aVar.b;
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = g.a;
                    aVar.a(aVar2, PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "4a5c0f89cf5512c4f0b6135244ac4ac8", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0302a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "4a5c0f89cf5512c4f0b6135244ac4ac8") : new g(view));
                }
                com.meituan.android.neohybrid.neo.report.d.a(dVar.b, "hybrid_loading_show");
                com.meituan.android.neohybrid.neo.report.d.a(dVar.b, "b_pay_hybrid_loading_show_mv", "c_pay_7c9fc4b4", null, null);
            } else if (cVar == c.HIDE) {
                boolean equals = TextUtils.equals(str, "timeout");
                dVar.b.a(view, equals, false);
                com.meituan.android.neohybrid.neo.report.d.a(dVar.b, equals ? "hybrid_loading_force_close" : "hybrid_loading_normal_close");
                com.meituan.android.neohybrid.neo.report.d.b(dVar.b, equals ? "b_pay_hybrid_loading_force_close_mv" : "b_pay_hybrid_loading_normal_close_mv", "c_pay_7c9fc4b4", null);
            } else if (cVar == c.CANCEL) {
                dVar.b.a(view, false, true);
                com.meituan.android.neohybrid.neo.report.d.a(dVar.b, "hybrid_loading_normal_close");
                com.meituan.android.neohybrid.neo.report.d.a(dVar.b, "b_pay_hybrid_loading_normal_close_mv", "c_pay_7c9fc4b4", null, null);
            }
        } catch (Exception e) {
            com.meituan.android.neohybrid.exception.a.a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39475e4de3bd7b2a159a258bda86bb9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39475e4de3bd7b2a159a258bda86bb9e");
        } else {
            b.a(k()).a(str);
        }
    }
}
