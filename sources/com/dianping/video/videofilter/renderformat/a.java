package com.dianping.video.videofilter.renderformat;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends e {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.video.videofilter.renderformat.e
    public final void a(com.dianping.video.model.d dVar, int i, int i2) {
        Object[] objArr = {dVar, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "969012a5f3ad62fde22f57c51ffc7c40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "969012a5f3ad62fde22f57c51ffc7c40");
            return;
        }
        StringBuilder sb = new StringBuilder("updateCoordinates; canvasWidth = ");
        sb.append(i);
        sb.append(" & canvasHeight = ");
        sb.append(i2);
        dVar.b = i;
        dVar.c = i2;
        f.a(this.e[0].b, this.e[0].c, this.e[1].b, this.e[1].c, dVar);
    }
}
