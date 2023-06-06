package com.meituan.msc.modules.manager;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class h {
    public static ChangeQuickRedirect a;
    public static h b = new h() { // from class: com.meituan.msc.modules.manager.h.1
        public static ChangeQuickRedirect c;

        @Override // com.meituan.msc.modules.manager.h
        public final void a(Runnable runnable) {
            Object[] objArr = {runnable};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a404da5bb886bce6f1f7dfd5ab64aa8e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a404da5bb886bce6f1f7dfd5ab64aa8e");
            } else {
                com.meituan.msc.common.executor.a.a(runnable);
            }
        }
    };

    public abstract void a(Runnable runnable);

    public static h a(a aVar, k kVar) {
        Object[] objArr = {aVar, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5b6a26a35acc0a416097734be657db4", RobustBitConfig.DEFAULT_VALUE)) {
            return (h) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5b6a26a35acc0a416097734be657db4");
        }
        if (kVar != null && kVar.q() != null) {
            return kVar.q();
        }
        if (aVar != null && aVar.a() != null) {
            return aVar.a();
        }
        return b;
    }
}
