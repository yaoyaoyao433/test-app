package com.meituan.msc.modules.page.render;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements com.meituan.msc.common.report.c {
    public static ChangeQuickRedirect a;
    private final a b;

    public b(a aVar) {
        this.b = aVar;
    }

    @Override // com.meituan.msc.common.report.c
    public final void a(com.meituan.msc.common.report.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fedca7640b0051ba16807d2db7577aba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fedca7640b0051ba16807d2db7577aba");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.d;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "7abd409d31e9d31363438edab3d35c93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "7abd409d31e9d31363438edab3d35c93");
        } else {
            aVar.a(dVar, (Map<String, Object>) null);
        }
    }
}
