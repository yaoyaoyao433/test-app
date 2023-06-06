package com.sankuai.waimai.business.page.kingkong.utils;

import android.app.Activity;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.search.api.RecommendedSearchKeyword;
import com.sankuai.waimai.mach.manager.load.c;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(Activity activity, List<RecommendedSearchKeyword> list, long j, long j2, long j3) {
        Object[] objArr = {activity, list, new Long(j), new Long(j2), new Long(j3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "731cc8a2294a8469f03a56e0dfb2b403", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "731cc8a2294a8469f03a56e0dfb2b403");
            return;
        }
        c.a("waimai", "waimai-search");
        Bundle bundle = new Bundle();
        bundle.putInt("global_search_from", 2);
        if (list != null && list.size() > 0) {
            bundle.putSerializable("recommended_search_keyword", list.get(0));
            if (list.size() > 1) {
                bundle.putSerializable("recommended_search_keywordroll_search_keyword", list.get(1));
            }
            bundle.putBoolean("auto_search", false);
        }
        bundle.putLong("navigate_type", j3);
        bundle.putLong("categorytype", j);
        bundle.putLong("subcategorytype", j2);
        com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.c.G, bundle);
    }

    public static boolean a(long[] jArr, long j) {
        Object[] objArr = {jArr, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9f6f0466ec1679b5d5ed44ff621a4686", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9f6f0466ec1679b5d5ed44ff621a4686")).booleanValue();
        }
        if (jArr == null) {
            return false;
        }
        for (long j2 : jArr) {
            if (j2 == j) {
                return true;
            }
        }
        return false;
    }
}
