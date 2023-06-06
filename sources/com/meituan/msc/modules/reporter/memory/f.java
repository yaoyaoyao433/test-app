package com.meituan.msc.modules.reporter.memory;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements com.meituan.msc.common.support.java.util.function.c {
    public static ChangeQuickRedirect a;
    private final e b;

    private f(e eVar) {
        this.b = eVar;
    }

    public static com.meituan.msc.common.support.java.util.function.c a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd2ff1977b89958360e3f7a64e753595", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.msc.common.support.java.util.function.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd2ff1977b89958360e3f7a64e753595") : new f(eVar);
    }

    @Override // com.meituan.msc.common.support.java.util.function.c
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "295364689154475365af33d8b37fff2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "295364689154475365af33d8b37fff2f");
            return;
        }
        e eVar = this.b;
        Integer num = (Integer) obj;
        Object[] objArr2 = {eVar, num};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b02e5c0bec18285c39081a855e092ace", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b02e5c0bec18285c39081a855e092ace");
        } else {
            eVar.f = num.intValue();
        }
    }
}
