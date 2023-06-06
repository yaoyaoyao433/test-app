package com.sankuai.meituan.mapsdk.core.widgets;

import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.meituan.mtmap.rendersdk.NativeMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.mapcore.utils.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    protected static final float[] b = {0.0f, 0.0f, 0.0f};
    protected static final float[] c = {1.0f, 1.0f, 1.0f};
    protected static final float[] d = {0.0f, 0.0f, 0.0f};
    protected static final float[] e = {0.0f, 0.0f, 0.0f};
    protected static final float[] f = {1.0f, 1.0f, 1.0f, 1.0f};
    private static final float[] j = {0.0f, 0.0f};
    private static final float[] k = {1.0f, 1.0f};
    com.sankuai.meituan.mapsdk.core.d g;
    public SparseArray<b> h;
    public SparseArray<c> i;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        boolean a(b bVar);
    }

    public d(com.sankuai.meituan.mapsdk.core.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59f4f8e638b384ca75bc31d588657c62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59f4f8e638b384ca75bc31d588657c62");
            return;
        }
        this.g = dVar;
        this.h = new SparseArray<>();
        this.i = new SparseArray<>();
    }

    public final void a(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21d575c1efeae237bc157df2e63df4b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21d575c1efeae237bc157df2e63df4b8");
            return;
        }
        com.sankuai.meituan.mapsdk.core.render.a aVar = this.g.d;
        if (this.g.i || aVar == null || cVar.g == null || cVar.e == null) {
            return;
        }
        aVar.addImage(cVar.e, cVar.g);
        cVar.d = aVar.createOrSetScreenImage(0, NativeMap.getMatrix(cVar.h, cVar.i, cVar.k, cVar.j), cVar.e, j, k, f);
        if (h.a(cVar.d)) {
            this.i.put(cVar.d, cVar);
        }
    }

    public final void b(@NonNull c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3f612a5e08c3f8436c4373333db77fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3f612a5e08c3f8436c4373333db77fd");
            return;
        }
        com.sankuai.meituan.mapsdk.core.render.a aVar = this.g.d;
        if (this.g.i || aVar == null || cVar.g == null || cVar.e == null || !h.a(cVar.d)) {
            return;
        }
        if (cVar.f != null) {
            aVar.addImage(cVar.e, cVar.g);
        }
        aVar.createOrSetScreenImage(cVar.d, NativeMap.getMatrix(cVar.h, cVar.i, cVar.k, cVar.j), cVar.e, j, k, f);
        if (cVar.f != null) {
            aVar.removeImage(cVar.f);
            cVar.f = null;
        }
    }
}
