package com.meituan.android.common.statistics.strategy;

import com.meituan.android.common.statistics.cache.ICacheHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DefaultStrategy implements IReportStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ICacheHandler mCacheHandler;

    public DefaultStrategy(ICacheHandler iCacheHandler) {
        Object[] objArr = {iCacheHandler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a01b18bbe0702420f0542af7f043e87a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a01b18bbe0702420f0542af7f043e87a");
        } else {
            this.mCacheHandler = iCacheHandler;
        }
    }

    @Override // com.meituan.android.common.statistics.strategy.IReportStrategy
    public boolean needReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2bf8c6149323751e7780d8b814492cf1", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2bf8c6149323751e7780d8b814492cf1")).booleanValue() : this.mCacheHandler != null && this.mCacheHandler.getCount() >= 30;
    }

    @Override // com.meituan.android.common.statistics.strategy.IReportStrategy
    public boolean needReport(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "255a8330dd1b0c005ad1d4c45cbeccd1", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "255a8330dd1b0c005ad1d4c45cbeccd1")).booleanValue() : this.mCacheHandler != null && this.mCacheHandler.getCount(i) >= 30;
    }
}
