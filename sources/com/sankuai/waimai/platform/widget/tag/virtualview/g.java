package com.sankuai.waimai.platform.widget.tag.virtualview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.NonNull;
import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.widget.tag.virtualview.CanvasView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends f<List<com.sankuai.waimai.platform.widget.tag.virtualview.render.c<?>>> {
    public static ChangeQuickRedirect c;
    private static Pools.Pool<g> g = new Pools.SynchronizedPool(64);
    private List<f<?>> h;

    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.f
    public final /* synthetic */ void a(Canvas canvas, Paint paint, @NonNull List<com.sankuai.waimai.platform.widget.tag.virtualview.render.c<?>> list, Path path) {
        List<com.sankuai.waimai.platform.widget.tag.virtualview.render.c<?>> list2 = list;
        char c2 = 0;
        Object[] objArr = {canvas, paint, list2, path};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0af60bac1a6619f9eae1b4fa6449068", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0af60bac1a6619f9eae1b4fa6449068");
            return;
        }
        if (!list2.isEmpty() && (this.h == null || this.h.isEmpty())) {
            for (com.sankuai.waimai.platform.widget.tag.virtualview.render.c<?> cVar : list2) {
                f<?> c3 = c(this.e, cVar);
                if (c3 != null) {
                    Object[] objArr2 = new Object[1];
                    objArr2[c2] = c3;
                    ChangeQuickRedirect changeQuickRedirect2 = c;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1b1cf0e58ce4794290ef4bff73196c30", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1b1cf0e58ce4794290ef4bff73196c30");
                    } else {
                        if (this.h == null) {
                            this.h = new ArrayList();
                        }
                        if (c3 != null && !this.h.contains(c3)) {
                            this.h.add(c3);
                        }
                    }
                }
                c2 = 0;
            }
        }
        if (this.h == null || this.h.isEmpty()) {
            return;
        }
        for (f<?> fVar : this.h) {
            fVar.a(canvas, paint, path);
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.f, com.sankuai.waimai.platform.widget.tag.b
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89d8f49846af78deb5e88ba0e246621e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89d8f49846af78deb5e88ba0e246621e");
            return;
        }
        if (this.h != null) {
            for (f<?> fVar : this.h) {
                fVar.c();
            }
            this.h.clear();
        }
        super.a();
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4e48e3f94e3bac7ed0343df44f73dbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4e48e3f94e3bac7ed0343df44f73dbf");
        } else {
            g.release(this);
        }
    }

    public static g a(@NonNull CanvasView.b bVar, com.sankuai.waimai.platform.widget.tag.virtualview.render.c<List<com.sankuai.waimai.platform.widget.tag.virtualview.render.c<?>>> cVar) {
        Object[] objArr = {bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "346dad3db816d9d8e803da920506f0c0", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "346dad3db816d9d8e803da920506f0c0");
        }
        g acquire = g.acquire();
        if (acquire == null) {
            acquire = new g();
        }
        acquire.b(bVar, cVar);
        acquire.b = false;
        return acquire;
    }
}
