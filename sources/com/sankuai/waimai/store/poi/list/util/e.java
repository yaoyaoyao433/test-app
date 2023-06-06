package com.sankuai.waimai.store.poi.list.util;

import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.i;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static Map<String, Object> a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b65574bcf8581ffbb4b149441bae4992", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b65574bcf8581ffbb4b149441bae4992");
        }
        if (obj == null) {
            return new HashMap();
        }
        return (Map) i.a(i.a(obj), new TypeToken<HashMap<String, Object>>() { // from class: com.sankuai.waimai.store.poi.list.util.e.1
        }.getType());
    }
}
