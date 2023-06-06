package com.meituan.metrics.fsp.finder;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FspFinderFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static FspFinderImpl getFmpStableFinder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1fbcdab572176b532585827fa8b2f210", RobustBitConfig.DEFAULT_VALUE) ? (FspFinderImpl) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1fbcdab572176b532585827fa8b2f210") : new FspStableFinder();
    }
}
