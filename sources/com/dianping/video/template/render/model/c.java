package com.dianping.video.template.render.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends b {
    public static ChangeQuickRedirect a;
    public com.dianping.video.template.model.tracksegment.c l;
    public boolean m;
    public int n;

    public c(com.dianping.video.template.model.tracksegment.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "210b5dd2929711be83ef8026488a3cb5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "210b5dd2929711be83ef8026488a3cb5");
            return;
        }
        this.l = cVar;
        this.c = cVar.a;
        this.m = cVar.a();
        this.n = cVar.g;
    }

    @Override // com.dianping.video.template.render.model.b
    public final boolean a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "302a234df9dccd94662fb5df2ebee1ce", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "302a234df9dccd94662fb5df2ebee1ce")).booleanValue();
        }
        if (this.m) {
            return this.g == -1;
        } else if (this.j) {
            return false;
        } else {
            long j2 = j - (this.l.c * 1000);
            long c = this.h - (this.l.c() * 1000);
            return j2 != c && Math.abs(j2 - c) > ((1000 / this.i) * 1000) / 2 && c - j2 < 33333;
        }
    }

    @Override // com.dianping.video.template.render.model.b
    public final boolean a() {
        return this.m;
    }

    @Override // com.dianping.video.template.render.model.b
    public final long d(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "628b237002a2cbfc2eea0599246672bd", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "628b237002a2cbfc2eea0599246672bd")).longValue() : (j - (this.l.c * 1000)) + (this.l.c() * 1000);
    }
}
