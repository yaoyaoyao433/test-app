package com.meituan.msc.modules.reporter.memory;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements com.meituan.msc.common.support.java.util.function.c {
    public static ChangeQuickRedirect a;
    private final e b;

    private h(e eVar) {
        this.b = eVar;
    }

    public static com.meituan.msc.common.support.java.util.function.c a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ca331f0b3653e359751fc57464eb41e7", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.function.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ca331f0b3653e359751fc57464eb41e7") : new h(eVar);
    }

    @Override // com.meituan.msc.common.support.java.util.function.c
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3241b3e5ba41e0c9f778fa041c89f445", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3241b3e5ba41e0c9f778fa041c89f445");
            return;
        }
        e eVar = this.b;
        Integer num = (Integer) obj;
        Object[] objArr2 = {eVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c68195d3332421d2c306cafe2458ceba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c68195d3332421d2c306cafe2458ceba");
        } else {
            eVar.g = num.intValue();
        }
    }
}
