package com.sankuai.waimai.store.util.monitor.cache;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MachModuleCache {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String success;
    private String templateId;

    public static MachModuleCache create(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "30c0956e6c43057d5195cb92fb65d1be", RobustBitConfig.DEFAULT_VALUE)) {
            return (MachModuleCache) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "30c0956e6c43057d5195cb92fb65d1be");
        }
        MachModuleCache machModuleCache = new MachModuleCache();
        machModuleCache.templateId = str;
        machModuleCache.success = str2;
        return machModuleCache;
    }
}
