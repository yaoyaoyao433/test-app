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
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends f<com.sankuai.waimai.platform.widget.tag.virtualview.render.e> {
    public static ChangeQuickRedirect c;
    private static final Pools.Pool<d> g = new Pools.SynchronizedPool(128);

    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.f
    public final /* synthetic */ void a(Canvas canvas, Paint paint, @NonNull com.sankuai.waimai.platform.widget.tag.virtualview.render.e eVar, Path path) {
        com.sankuai.waimai.platform.widget.tag.virtualview.render.e eVar2 = eVar;
        Object[] objArr = {canvas, paint, eVar2, path};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "788900de78d2c20c5878c1949d3f2eb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "788900de78d2c20c5878c1949d3f2eb1");
        } else if (eVar2.m != null) {
            canvas.save();
            canvas.translate(eVar2.i, eVar2.l + (((this.f.e.f - (eVar2.l * 2)) - eVar2.m.getHeight()) * 0.5f));
            eVar2.m.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b20a9d672159ef0b3aab69c87ee21d08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b20a9d672159ef0b3aab69c87ee21d08");
        } else {
            g.release(this);
        }
    }

    public static d a(@NonNull CanvasView.b bVar, com.sankuai.waimai.platform.widget.tag.virtualview.render.c<com.sankuai.waimai.platform.widget.tag.virtualview.render.e> cVar) {
        Object[] objArr = {bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28a4edf7c19075f1e28ef878a7db0d9b", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28a4edf7c19075f1e28ef878a7db0d9b");
        }
        d acquire = g.acquire();
        if (acquire == null) {
            acquire = new d();
        }
        acquire.b(bVar, cVar);
        acquire.b = false;
        return acquire;
    }
}
