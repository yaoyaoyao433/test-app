package com.sankuai.waimai.platform.widget.filterbar.domain.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public enum c {
    GLOBAL("GLOBAL"),
    SEARCH_GLOBAL_POI("SEARCH_GLOBAL_POI"),
    SEARCH_GLOBAL_PRODUCT("SEARCH_GLOBAL_PRODUCT"),
    WHOLE_CITY("WHOLE_CITY"),
    SELF_DELIVERY("SELF_DELIVERY");
    
    public static ChangeQuickRedirect a;
    public String g;

    public static c valueOf(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ec288257375080fb14c8804bad9f17f", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ec288257375080fb14c8804bad9f17f") : (c) Enum.valueOf(c.class, str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static c[] valuesCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bb01a3169a361a4df086b042b83b5427", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bb01a3169a361a4df086b042b83b5427") : (c[]) values().clone();
    }

    c(String str) {
        Object[] objArr = {r10, Integer.valueOf(r11), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05b427ca80ccc0cee90ed807be93e5b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05b427ca80ccc0cee90ed807be93e5b8");
        } else {
            this.g = str;
        }
    }
}
