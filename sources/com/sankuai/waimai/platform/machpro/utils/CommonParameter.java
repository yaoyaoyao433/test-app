package com.sankuai.waimai.platform.machpro.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.machpro.module.ICommonParameter;
import com.sankuai.waimai.platform.net.e;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CommonParameter implements ICommonParameter {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.platform.machpro.module.ICommonParameter
    public Map<String, String> commonParameter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "73d9989ac6990b1c7250eaa6a157256b", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "73d9989ac6990b1c7250eaa6a157256b") : e.b();
    }
}
