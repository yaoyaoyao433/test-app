package com.sankuai.waimai.store.util.monitor.cache;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ClickBidCache {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String bid;
    private String cid;

    public static ClickBidCache create(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c7f2cdd34a198973ca13c7c59492a238", RobustBitConfig.DEFAULT_VALUE)) {
            return (ClickBidCache) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c7f2cdd34a198973ca13c7c59492a238");
        }
        ClickBidCache clickBidCache = new ClickBidCache();
        clickBidCache.bid = str;
        clickBidCache.cid = str2;
        return clickBidCache;
    }
}
