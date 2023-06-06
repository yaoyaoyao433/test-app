package com.sankuai.waimai.platform.capacity.abtest;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    public static ChangeQuickRedirect d;

    public static ABStrategy a(String str, ABStrategy aBStrategy) {
        Object[] objArr = {str, null};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffa32ffa79054d36fd0682accefd286b", RobustBitConfig.DEFAULT_VALUE) ? (ABStrategy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffa32ffa79054d36fd0682accefd286b") : ABTestManager.getInstance(com.meituan.android.singleton.b.a).getStrategy(str, null);
    }
}
