package com.sankuai.waimai.store.goods.list;

import com.meituan.msc.modules.api.report.MSCReportBizTagsManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static void a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66cec47edfa4eb0d92573b66fe1ef02e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66cec47edfa4eb0d92573b66fe1ef02e");
        } else {
            MSCReportBizTagsManager.a().a("7122f6e193de47c1", "/pages/store/index", map);
        }
    }
}
