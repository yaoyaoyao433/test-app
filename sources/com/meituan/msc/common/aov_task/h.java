package com.meituan.msc.common.aov_task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements com.meituan.msc.common.support.java.util.function.d {
    public static ChangeQuickRedirect a;
    private final f b;

    public h(f fVar) {
        this.b = fVar;
    }

    @Override // com.meituan.msc.common.support.java.util.function.d
    public final Object a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29f071bc6f7a1df312021d826ce13dd2", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29f071bc6f7a1df312021d826ce13dd2");
        }
        f fVar = this.b;
        Object[] objArr2 = {fVar, (Void) obj};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1d2c755dc3e69b0de24fec3105904128", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1d2c755dc3e69b0de24fec3105904128") : fVar;
    }
}
