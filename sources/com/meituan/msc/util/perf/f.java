package com.meituan.msc.util.perf;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f extends i {
    public static ChangeQuickRedirect a;
    private final l c;
    private final j d;

    public f(PerfEventRecorder perfEventRecorder, h hVar, j jVar) {
        super(perfEventRecorder, hVar);
        Object[] objArr = {perfEventRecorder, hVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df71b5878f6f799b849c4cc36d481e26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df71b5878f6f799b849c4cc36d481e26");
            return;
        }
        this.c = new l(new g("dump", "i"), false);
        this.d = jVar;
    }

    @Override // com.meituan.msc.util.perf.i
    public final void a(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56c40208a6c0aff8d6f704fc35c26038", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56c40208a6c0aff8d6f704fc35c26038");
        } else if (this.d.a()) {
            super.a(gVar);
        }
    }

    @Override // com.meituan.msc.util.perf.i
    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bb8ab63a0944946dda069d4933cac18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bb8ab63a0944946dda069d4933cac18");
        } else if (this.d.a()) {
            super.a(cVar);
        }
    }

    @Override // com.meituan.msc.util.perf.i
    public final l a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d511c69e32b7b5f41b1175b07f0a930", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d511c69e32b7b5f41b1175b07f0a930");
        }
        if (!this.d.a()) {
            return this.c;
        }
        return super.a(str);
    }

    @Override // com.meituan.msc.util.perf.i
    public final l b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b59e3941b29e8e7921e0c5b465d99009", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b59e3941b29e8e7921e0c5b465d99009");
        }
        if (!this.d.a()) {
            return this.c;
        }
        return super.b(str);
    }

    @Override // com.meituan.msc.util.perf.i
    public final l a(String str, long j, long j2) {
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d55575db26f308d530ce231da3e2474", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d55575db26f308d530ce231da3e2474");
        }
        if (!this.d.a()) {
            return this.c;
        }
        return super.a(str, j, j2);
    }

    @Override // com.meituan.msc.util.perf.i
    public final l a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f1d225def501401b7ed5c7dca082f5a", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f1d225def501401b7ed5c7dca082f5a");
        }
        if (!this.d.a()) {
            return this.c;
        }
        return super.a(str, j);
    }

    @Override // com.meituan.msc.util.perf.i
    public final l c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f605aac160c5443fab7f5bce9acd6474", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f605aac160c5443fab7f5bce9acd6474");
        }
        if (!this.d.a()) {
            return this.c;
        }
        return super.c(str);
    }

    @Override // com.meituan.msc.util.perf.i
    public final l b(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6d43b72ea7906d1d57c8e1e322fb178", RobustBitConfig.DEFAULT_VALUE)) {
            return (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6d43b72ea7906d1d57c8e1e322fb178");
        }
        if (!this.d.a()) {
            return this.c;
        }
        return super.b(str, j);
    }
}
