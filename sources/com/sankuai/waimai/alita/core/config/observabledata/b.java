package com.sankuai.waimai.alita.core.config.observabledata;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends a<Integer> {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.alita.core.config.observabledata.a
    public final /* synthetic */ boolean a(Integer num, Integer num2) {
        Integer num3 = num;
        Integer num4 = num2;
        Object[] objArr = {num3, num4};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afcd38058629a41d79d230ec220a67c2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afcd38058629a41d79d230ec220a67c2")).booleanValue() : a(num3) == a(num4);
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6137d808af1511db6d4bda70a13d1913", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6137d808af1511db6d4bda70a13d1913")).booleanValue();
        }
        Integer a = a();
        return (a == null || a.intValue() == 0) ? false : true;
    }

    private int a(Integer num) {
        Object[] objArr = {num};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15cca197910f78d5ad8c3b667a023813", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15cca197910f78d5ad8c3b667a023813")).intValue();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
