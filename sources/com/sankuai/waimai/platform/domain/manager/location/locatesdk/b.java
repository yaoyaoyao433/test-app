package com.sankuai.waimai.platform.domain.manager.location.locatesdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.location.model.MtLocationConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b {
    public static ChangeQuickRedirect c;

    public MtLocationConfig a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78b7fb41c4f204b16962933505045358", RobustBitConfig.DEFAULT_VALUE) ? (MtLocationConfig) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78b7fb41c4f204b16962933505045358") : g.a((MtLocationConfig) null);
    }
}
