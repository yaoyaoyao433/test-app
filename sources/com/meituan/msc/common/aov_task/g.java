package com.meituan.msc.common.aov_task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements com.meituan.msc.common.support.java.util.function.d {
    public static ChangeQuickRedirect a;
    private final f b;

    public g(f fVar) {
        this.b = fVar;
    }

    @Override // com.meituan.msc.common.support.java.util.function.d
    public final Object a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7f197cb6ef1a9a46979ceeae88dbc3d", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7f197cb6ef1a9a46979ceeae88dbc3d");
        }
        f fVar = this.b;
        Object[] objArr2 = {fVar, obj};
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "bdebe867dd5ce4015e503cac002339ce", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "bdebe867dd5ce4015e503cac002339ce") : fVar;
    }
}
