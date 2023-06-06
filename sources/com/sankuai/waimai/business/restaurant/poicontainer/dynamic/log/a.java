package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.platform.capacity.log.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends a.AbstractC1040a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.platform.capacity.log.a.AbstractC1040a
    public final String a() {
        return "waimai_restaurant_dynamic_card";
    }

    public a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2256a0f60d0a13a2ac6af7cdca078cc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2256a0f60d0a13a2ac6af7cdca078cc4");
            return;
        }
        b(str2);
        a(str);
    }
}
