package com.dianping.video.videofilter.renderformat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends e {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.video.videofilter.renderformat.e
    public final void a(com.dianping.video.model.d dVar, int i, int i2) {
        Object[] objArr = {dVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e02c98276281c23ef1aeb5e7369604d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e02c98276281c23ef1aeb5e7369604d6");
            return;
        }
        StringBuilder sb = new StringBuilder("updateCoordinates; canvasWidth = ");
        sb.append(i);
        sb.append(" & canvasHeight = ");
        sb.append(i2);
        dVar.b = i;
        dVar.c = i2;
        for (com.dianping.video.model.b bVar : this.e) {
            f.a(bVar.c, dVar);
        }
    }
}
