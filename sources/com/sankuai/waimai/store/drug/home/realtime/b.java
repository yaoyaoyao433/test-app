package com.sankuai.waimai.store.drug.home.realtime;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.store.drug.home.util.c;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static long a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "24d720b45f05010b3fa8cbe8c6e299a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "24d720b45f05010b3fa8cbe8c6e299a9")).longValue();
        }
        if (obj instanceof String) {
            return r.a((String) obj, 0L);
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof Double) {
            return ((Double) obj).longValue();
        }
        return 0L;
    }

    @NonNull
    public static String a(@Nullable Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        StringBuilder sb = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5b958f9d67fdb3cd6091ecce296e81d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5b958f9d67fdb3cd6091ecce296e81d");
        }
        if (map != null) {
            Object obj = map.get("products");
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    if (obj2 instanceof Map) {
                        long a2 = a(((Map) obj2).get("spu_id"));
                        if (a2 > 0) {
                            if (sb == null) {
                                sb = new StringBuilder();
                            } else {
                                sb.append(CommonConstant.Symbol.COMMA);
                            }
                            sb.append(a2);
                        }
                    }
                }
            }
        }
        return sb == null ? "" : sb.toString();
    }

    public static boolean a(@NonNull CategoryInfo categoryInfo, @NonNull BaseModuleDesc baseModuleDesc) {
        Object[] objArr = {categoryInfo, baseModuleDesc};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3c314bc34d6e4c498f031ae611237ec", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3c314bc34d6e4c498f031ae611237ec")).booleanValue() : categoryInfo.categoryCodeType == 1 && (c.a(baseModuleDesc.templateId) || c.b(baseModuleDesc.templateId));
    }
}
