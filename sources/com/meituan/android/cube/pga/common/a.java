package com.meituan.android.cube.pga.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a<InputType, OutType> {
    public static ChangeQuickRedirect a;
    public com.meituan.android.cube.pga.action.c<InputType, OutType> b;

    public final d<OutType> a(InputType inputtype) {
        Object[] objArr = {inputtype};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6661f75c8732465339f99bd233cc541", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6661f75c8732465339f99bd233cc541");
        }
        if (this.b == null) {
            return new d<>(null);
        }
        return new d<>(this.b.a(inputtype));
    }
}
