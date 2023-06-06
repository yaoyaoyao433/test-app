package com.sankuai.waimai.irmo.render.engine;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.irmo.render.bean.layers.IrmoLayerInfo;
import com.sankuai.waimai.irmo.render.i;
import com.sankuai.waimai.irmo.render.monitor.a;
import com.sankuai.waimai.irmo.widget.RayView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends c {
    public static ChangeQuickRedirect a;
    List<RayView> b;

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void c() {
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void d() {
    }

    public d(com.sankuai.waimai.irmo.render.a aVar, i iVar, com.sankuai.waimai.irmo.render.f fVar) {
        super(aVar, iVar, fVar);
        Object[] objArr = {aVar, iVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60babd3e31c9675921da11d27c160f90", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60babd3e31c9675921da11d27c160f90");
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c, com.sankuai.waimai.irmo.render.engine.a
    public final void a(@NonNull IrmoLayerInfo irmoLayerInfo, View view) {
        Object[] objArr = {irmoLayerInfo, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5d8e6a3847bf8a1a91fa9a90d72726a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5d8e6a3847bf8a1a91fa9a90d72726a");
            return;
        }
        super.a(irmoLayerInfo, view);
        RayView rayView = new RayView(com.meituan.android.singleton.b.a);
        rayView.setReporter(this.k);
        rayView.setEventCallback(this.j);
        rayView.a(irmoLayerInfo);
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(rayView);
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f236bc1a3b1dfad0c3e3d172723637d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f236bc1a3b1dfad0c3e3d172723637d5");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(this.b)) {
            for (RayView rayView : this.b) {
                rayView.a();
            }
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    @NonNull
    public final List<? extends View> b() {
        return this.b;
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void a(final g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1da9f7176220ecc153fd217258bf4d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1da9f7176220ecc153fd217258bf4d2");
        } else if (com.sankuai.waimai.foundation.utils.d.a(this.b)) {
            a("views is empty when when starting.", true);
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.irmo.render.engine.d.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88a54dad40ec444ebc345cafd5743741", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88a54dad40ec444ebc345cafd5743741");
                    } else if (com.sankuai.waimai.foundation.utils.d.a(d.this.b)) {
                        d.this.a("views is empty when when starting.", true);
                    } else {
                        for (RayView rayView : d.this.b) {
                            rayView.a(gVar, d.this.j);
                        }
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae7450b0fa2ff36eb83ed01d897b13ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae7450b0fa2ff36eb83ed01d897b13ca");
        } else if (com.sankuai.waimai.foundation.utils.d.a(this.b)) {
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.irmo.render.engine.d.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f0271c2967b689b4186a201ff09ef35", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f0271c2967b689b4186a201ff09ef35");
                        return;
                    }
                    for (RayView rayView : d.this.b) {
                        rayView.setCanceled(true);
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = RayView.a;
                        if (PatchProxy.isSupport(objArr3, rayView, changeQuickRedirect3, false, "23e878fd92c02bcfa886ad6b0e0e9be5", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, rayView, changeQuickRedirect3, false, "23e878fd92c02bcfa886ad6b0e0e9be5");
                        } else {
                            if (rayView.e != null) {
                                ad.b(rayView.e);
                                rayView.e = null;
                            }
                            rayView.d = false;
                            if (rayView.c != null && rayView.c.isRunning()) {
                                rayView.b = false;
                                rayView.c.end();
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67d51d5a3baf7f48d5d04881318853f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67d51d5a3baf7f48d5d04881318853f4");
        } else if (com.sankuai.waimai.foundation.utils.d.a(this.b)) {
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.irmo.render.engine.d.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e43d4a614b27c368869372fe86b2e731", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e43d4a614b27c368869372fe86b2e731");
                        return;
                    }
                    for (RayView rayView : d.this.b) {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = RayView.a;
                        if (PatchProxy.isSupport(objArr3, rayView, changeQuickRedirect3, false, "8966570e6c492a9ef08c93ebed188466", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, rayView, changeQuickRedirect3, false, "8966570e6c492a9ef08c93ebed188466");
                        } else {
                            if (rayView.e != null) {
                                ad.b(rayView.e);
                                rayView.e = null;
                            }
                            if (rayView.c != null) {
                                rayView.b = false;
                                rayView.c.pause();
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.c
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac8580d7794eb8bacc62711dfbdbc3b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac8580d7794eb8bacc62711dfbdbc3b5");
        } else if (com.sankuai.waimai.foundation.utils.d.a(this.b)) {
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.irmo.render.engine.d.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "88b82eb15c7f2f6a0be6f257bba9ecaf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "88b82eb15c7f2f6a0be6f257bba9ecaf");
                        return;
                    }
                    for (RayView rayView : d.this.b) {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = RayView.a;
                        if (PatchProxy.isSupport(objArr3, rayView, changeQuickRedirect3, false, "a4956e957bc3f417c7bc8d09284aa776", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, rayView, changeQuickRedirect3, false, "a4956e957bc3f417c7bc8d09284aa776");
                        } else if (rayView.c != null) {
                            rayView.b = true;
                            rayView.c.resume();
                        }
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.irmo.render.engine.a
    public final void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ac4190d22a15c36318074059e20c80d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ac4190d22a15c36318074059e20c80d");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(this.b)) {
            for (RayView rayView : this.b) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = RayView.a;
                if (PatchProxy.isSupport(objArr2, rayView, changeQuickRedirect2, false, "cc4ce79d1f6fbabd1d120c7fb2191256", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, rayView, changeQuickRedirect2, false, "cc4ce79d1f6fbabd1d120c7fb2191256");
                } else if (rayView.c != null) {
                    if (rayView.c.isRunning()) {
                        rayView.f = true;
                        rayView.c.end();
                    }
                    rayView.c.removeAllUpdateListeners();
                    rayView.c.removeAllListeners();
                    rayView.c = null;
                }
            }
            this.b.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efd3087f5f41838fc62d00ec85dba977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efd3087f5f41838fc62d00ec85dba977");
        } else if (this.k == null || TextUtils.isEmpty(str)) {
        } else {
            this.k.a(new a.C0976a().a(this.m).a(str).a(), z);
            com.sankuai.waimai.foundation.utils.log.a.e("IRMO_RAY", str, new Object[0]);
        }
    }
}
