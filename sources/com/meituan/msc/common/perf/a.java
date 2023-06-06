package com.meituan.msc.common.perf;

import com.meituan.msc.modules.reporter.f;
import com.meituan.msc.util.perf.c;
import com.meituan.msc.util.perf.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements c {
    public static ChangeQuickRedirect a;
    private final f b;

    public a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf514cc8b4c6b8faabe4ea92eaf6424", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf514cc8b4c6b8faabe4ea92eaf6424");
        } else {
            this.b = fVar;
        }
    }

    @Override // com.meituan.msc.util.perf.c
    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "699187fe3d4530fcfc51b92a33ef4972", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "699187fe3d4530fcfc51b92a33ef4972");
            return;
        }
        String str = eVar.e;
        long j = eVar.f;
        if (str == null || j <= 0) {
            return;
        }
        this.b.a(str, false).a(j).a(eVar.a()).b();
    }
}
