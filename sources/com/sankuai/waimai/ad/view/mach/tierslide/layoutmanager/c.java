package com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends RecyclerView.p {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    int d;
    g e;
    private f f;
    private e g;
    private CardLayoutManager h;

    @Override // android.support.v7.widget.RecyclerView.p
    public final void onStart() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52f3cb6d38d037bd458a980c47fe4026", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52f3cb6d38d037bd458a980c47fe4026");
        }
    }

    @Override // android.support.v7.widget.RecyclerView.p
    public final void onStop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6039116e7f8d5494c5df7ab29a346fc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6039116e7f8d5494c5df7ab29a346fc8");
        }
    }

    public c(e eVar, CardLayoutManager cardLayoutManager) {
        Object[] objArr = {eVar, cardLayoutManager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b42ea9746e1038bc8c9a012a11a2d25e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b42ea9746e1038bc8c9a012a11a2d25e");
            return;
        }
        this.g = eVar;
        this.h = cardLayoutManager;
    }

    @Override // android.support.v7.widget.RecyclerView.p
    public final void onSeekTargetStep(int i, int i2, RecyclerView.State state, RecyclerView.p.a aVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), state, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "396248410baa31ab0f0f2997ba3682c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "396248410baa31ab0f0f2997ba3682c7");
        } else if (this.d != 1 || this.f == null) {
        } else {
            aVar.a(-this.f.e, -this.f.f, 100, new AccelerateInterpolator());
        }
    }

    @Override // android.support.v7.widget.RecyclerView.p
    public final void onTargetFound(View view, RecyclerView.State state, RecyclerView.p.a aVar) {
        Object[] objArr = {view, state, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbe0e20845baf583fdb127121cb24cb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbe0e20845baf583fdb127121cb24cb9");
        } else if (this.d == 0) {
            f a2 = this.g.a(view, getTargetPosition());
            a2.a(0, 0);
            a(aVar, a2, true);
        } else if (this.d == 1) {
            if (this.f != null) {
                f fVar = this.f;
                fVar.e = (int) (-view.getTranslationX());
                fVar.f = (int) (-view.getTranslationY());
                a(aVar, this.f, false);
            }
        } else if (this.h == null) {
        } else {
            int i = this.h.e;
            int i2 = this.h.f;
            int targetPosition = getTargetPosition();
            if (i == 0 && i2 == 0) {
                return;
            }
            if (this.g.c(view, targetPosition, i, i2, this.b, this.c)) {
                f a3 = this.g.a(view, targetPosition, i, i2, this.b, this.c);
                a3.a(i, i2);
                a(aVar, a3, true);
                return;
            }
            f b = this.g.b(view, targetPosition, i, i2, this.b, this.c);
            b.a(i, i2);
            a(aVar, b, false);
            if (this.e != null) {
                view.postDelayed(new Runnable() { // from class: com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager.c.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5de9fa5d09fefc2337b983107b80ae5e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5de9fa5d09fefc2337b983107b80ae5e");
                        } else {
                            c.this.e.b();
                        }
                    }
                }, 350L);
            }
        }
    }

    public final void a(int i, g gVar) {
        Object[] objArr = {Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af4e0cf525370da40151bb3bb65b6891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af4e0cf525370da40151bb3bb65b6891");
            return;
        }
        setTargetPosition(i);
        this.d = 0;
        this.e = gVar;
    }

    public final void a(int i, f fVar, g gVar) {
        Object[] objArr = {Integer.valueOf(i), fVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b87a5ac1cc0f52635e3d3b15ae9e01fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b87a5ac1cc0f52635e3d3b15ae9e01fb");
            return;
        }
        setTargetPosition(i);
        this.f = fVar;
        this.d = 1;
        this.e = gVar;
    }

    private void a(RecyclerView.p.a aVar, f fVar, boolean z) {
        Object[] objArr = {aVar, fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f42ebe083cb967775ca6e5c1ecf27e75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f42ebe083cb967775ca6e5c1ecf27e75");
            return;
        }
        aVar.a(-fVar.e, -fVar.f, fVar.c, fVar.d);
        if (this.e != null) {
            if (z) {
                this.e.b(fVar.b);
            } else {
                this.e.a();
            }
        }
    }
}
