package com.dianping.video.videofilter.renderformat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends e {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.video.videofilter.renderformat.e
    public final void a(com.dianping.video.model.d dVar, int i, int i2) {
        com.dianping.video.model.b[] bVarArr;
        Object[] objArr = {dVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b010ceb87cfd3d7dacb32ad2507a2970", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b010ceb87cfd3d7dacb32ad2507a2970");
            return;
        }
        dVar.b = i;
        dVar.c = i2;
        for (com.dianping.video.model.b bVar : this.e) {
            f.a(bVar.b, bVar.c, dVar, "VideoRenderNomalStrategy.updateCoordinates");
        }
    }
}
