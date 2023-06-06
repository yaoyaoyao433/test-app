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
public final class a extends f<Object> {
    public static ChangeQuickRedirect c;
    private static final Pools.Pool<a> g = new Pools.SynchronizedPool(128);

    @Override // com.sankuai.waimai.platform.widget.tag.virtualview.f
    public final void a(Canvas canvas, Paint paint, @NonNull Object obj, Path path) {
    }

    @Override // com.sankuai.waimai.platform.widget.tag.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d756c23625094a20f93f339ec8324c49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d756c23625094a20f93f339ec8324c49");
        } else {
            g.release(this);
        }
    }

    public static a a(@NonNull CanvasView.b bVar, com.sankuai.waimai.platform.widget.tag.virtualview.render.c<Object> cVar) {
        Object[] objArr = {bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fcf3be3a024d853991aa95dc67a2e7b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fcf3be3a024d853991aa95dc67a2e7b7");
        }
        a acquire = g.acquire();
        if (acquire == null) {
            acquire = new a();
        }
        acquire.b(bVar, cVar);
        acquire.b = false;
        return acquire;
    }
}
