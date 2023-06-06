package com.sankuai.waimai.store.drug.home.new_home.util;

import android.support.annotation.NonNull;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(String str, String str2, CategoryInfo categoryInfo, @NonNull SparseArray<CategoryInfo> sparseArray) {
        Object[] objArr = {str, str2, categoryInfo, sparseArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db5efe3da76d42eedabbe2e3ca766b4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db5efe3da76d42eedabbe2e3ca766b4f");
        } else if (sparseArray.size() > 0) {
            a(null, categoryInfo);
            HashMap hashMap = new HashMap();
            for (int i = 0; i < sparseArray.size(); i++) {
                CategoryInfo valueAt = sparseArray.valueAt(i);
                if (valueAt != null) {
                    if (valueAt.tabStayTime > 0) {
                        hashMap.put(valueAt.code, Long.valueOf(valueAt.tabStayTime));
                    }
                    valueAt.tabStayTime = 0L;
                    valueAt.recordStartPoint = -1L;
                }
            }
            if (hashMap.isEmpty()) {
                return;
            }
            StringBuilder sb = new StringBuilder(CommonConstant.Symbol.BIG_BRACKET_LEFT);
            for (Map.Entry entry : hashMap.entrySet()) {
                sb.append(CommonConstant.Symbol.DOUBLE_QUOTES);
                sb.append((String) entry.getKey());
                sb.append("\":");
                sb.append(entry.getValue());
                sb.append(CommonConstant.Symbol.COMMA);
            }
            sb.delete(sb.length() - 1, sb.length());
            sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
            com.sankuai.waimai.store.manager.judas.b.b(str, str2, "b_waimai_jqrahqys_mv").a("stay_time_list", sb.toString()).a();
        }
    }

    public static void a(@NonNull SparseArray<CategoryInfo> sparseArray) {
        Object[] objArr = {sparseArray};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "413186bbf00d35beb29745ee05dbba12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "413186bbf00d35beb29745ee05dbba12");
        } else if (sparseArray.size() > 0) {
            for (int i = 0; i < sparseArray.size(); i++) {
                CategoryInfo valueAt = sparseArray.valueAt(i);
                if (valueAt != null) {
                    valueAt.tabStayTime = 0L;
                    valueAt.recordStartPoint = -1L;
                }
            }
        }
    }

    public static void a(CategoryInfo categoryInfo, CategoryInfo categoryInfo2) {
        Object[] objArr = {categoryInfo, categoryInfo2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06160d061480a998da4a1b1a29c92d3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06160d061480a998da4a1b1a29c92d3d");
            return;
        }
        if (categoryInfo != null) {
            categoryInfo.recordStartPoint = System.currentTimeMillis();
        }
        if (categoryInfo2 != null) {
            categoryInfo2.tabStayTime += Math.max(System.currentTimeMillis() - categoryInfo2.recordStartPoint, 0L);
        }
    }
}
