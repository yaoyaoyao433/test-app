package com.sankuai.waimai.business.search.common.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m extends a.AbstractC1040a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.platform.capacity.log.a.AbstractC1040a
    public final String a() {
        return "waimai_search";
    }

    public static com.sankuai.waimai.platform.capacity.log.a a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "75a4e089ca2d740afe04df93670b00c8", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.platform.capacity.log.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "75a4e089ca2d740afe04df93670b00c8") : new m().a(str).c(str2).b();
    }
}
