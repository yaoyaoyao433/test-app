package com.meituan.android.msc.yoga;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public enum q {
    VISIBLE(0),
    HIDDEN(1),
    SCROLL(2);
    
    public static ChangeQuickRedirect a;
    final int e;

    public static q valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e933a479b9df08cb813c9e8a101129a7", RobustBitConfig.DEFAULT_VALUE) ? (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e933a479b9df08cb813c9e8a101129a7") : (q) Enum.valueOf(q.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static q[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77ca5adafe3671c017bb1ff9e1dd6321", RobustBitConfig.DEFAULT_VALUE) ? (q[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77ca5adafe3671c017bb1ff9e1dd6321") : (q[]) values().clone();
    }

    q(int i) {
        Object[] objArr = {r10, Integer.valueOf(r11), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dbdb7badfd00b106842a8689cab4954", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dbdb7badfd00b106842a8689cab4954");
        } else {
            this.e = i;
        }
    }
}
