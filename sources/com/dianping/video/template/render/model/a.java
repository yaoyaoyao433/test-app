package com.dianping.video.template.render.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a extends b {
    public static ChangeQuickRedirect a;
    private com.dianping.video.template.model.tracksegment.b l;

    @Override // com.dianping.video.template.render.model.b
    public final boolean a() {
        return false;
    }

    public a(com.dianping.video.template.model.tracksegment.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0f63ec60f686efb2c18fb0ac169c18c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0f63ec60f686efb2c18fb0ac169c18c");
            return;
        }
        this.l = bVar;
        this.c = this.l.a;
    }

    @Override // com.dianping.video.template.render.model.b
    public final boolean a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bc3fadf366fcf8fd31ebf683aef9acf", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bc3fadf366fcf8fd31ebf683aef9acf")).booleanValue() : j != this.h && !this.j && Math.abs(j - this.h) > ((1000 / this.i) * 1000) / 2 && this.h - j < 33333;
    }
}
