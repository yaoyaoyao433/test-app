package com.meituan.metrics.fsp.sampler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FspViewSampleFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static FspViewSamplerImpl getFspViewSampler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e18fd6cff2c48fdd5cc1dc3e15bf6cc", RobustBitConfig.DEFAULT_VALUE) ? (FspViewSamplerImpl) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e18fd6cff2c48fdd5cc1dc3e15bf6cc") : new FspViewAreaSampler();
    }
}
