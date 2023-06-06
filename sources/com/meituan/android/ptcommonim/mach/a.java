package com.meituan.android.ptcommonim.mach;

import com.meituan.android.common.statistics.Statistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements com.sankuai.waimai.mach.d {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.mach.d
    public final void a(String str, String str2, int i, Map<String, Object> map, com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), map, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9baa63b3f895d054b021e4d649264b06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9baa63b3f895d054b021e4d649264b06");
        } else if (map == null || map.isEmpty()) {
        } else {
            String str3 = (String) map.get("bid");
            String str4 = (String) map.get("cid");
            Map<String, Object> map2 = (Map) map.get("lab");
            if (i == 2) {
                Statistics.getChannel("group").writeModelView("pt_common_im_business_page", str3, map2, str4);
            } else if (i == 1) {
                Statistics.getChannel("group").updateTag("group", (Map) ((Map) map.get("tag")).get("group"));
                Statistics.getChannel("group").writeModelClick("pt_common_im_business_page", str3, map2, str4);
            }
        }
    }
}
